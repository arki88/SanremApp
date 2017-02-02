package arki.it.sanremoapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private ArrayList<Songs> dataSet = new ArrayList<>();

        @Override
        public SongAdapter.SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, parent, false);
            SongViewHolder holder = new SongViewHolder(v);

            return holder;
        }

        @Override
        public void onBindViewHolder (SongAdapter.SongViewHolder holder,int position){
            Songs currentSong = dataSet.get(position);
            holder.songNameTv.setText(currentSong.getNome());
            holder.artistTv.setText(currentSong.getArtist());

        }


    public void setDataSet(ArrayList<Songs> songs)

    {
        dataSet = songs;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    protected class SongViewHolder extends RecyclerView.ViewHolder {
        public TextView songNameTv;
        public TextView artistTv;


        View.OnClickListener itemClick = new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(activity, SecondActivity.class);
                startActivity(intent);
            }
        };


        public SongViewHolder(final View v) {
            super(v);
            songNameTv = (TextView) v.findViewById(R.id.song_name);
            artistTv = (TextView) v.findViewById(R.id.artist_name);
          }
    }
}
