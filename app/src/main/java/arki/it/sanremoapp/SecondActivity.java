package arki.it.sanremoapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends Activity {

    RecyclerView songRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    SongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        songRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        adapter = new SongAdapter();

        songRecyclerView.setLayoutManager(layoutManager);
        songRecyclerView.setAdapter(adapter);
        fetchSongs();
    }


    private void fetchSongs(){
        ArrayList<Songs> albumSongs = new ArrayList<>();
        Songs s1 = new Songs();
        s1.setNome("Di rose e di spine");
        s1.setArtist("Al Bano");

        Songs s2 = new Songs();
        s2.setNome("Bianca Atzei");
        s2.setArtist("Ora esisti solo tu");

        Songs s3 = new Songs();
        s3.setNome("Alessio Bernabei");
        s3.setArtist("Nel mezzo di un applauso");

        Songs s4 = new Songs();
        s4.setNome("Michele Bravi");
        s4.setArtist("Il diario degli errori");

        Songs s5 = new Songs();
        s5.setNome("Chiara");
        s5.setArtist("Nessun posto è casa mia");

        Songs s6 = new Songs();
        s6.setNome("Clementino");
        s6.setArtist("Ragazzi fuori");

        Songs s7 = new Songs();
        s7.setNome("Lodovica Comello");
        s7.setArtist("Il cielo non mi basta");

        Songs s8 = new Songs();
        s8.setNome("Gigi D'Alessio");
        s8.setArtist("La prima stella");

        Songs s9 = new Songs();
        s9.setNome("Elodie");
        s9.setArtist("Tutta colpa mia");

        Songs s10 = new Songs();
        s10.setNome("Giusy Ferreri");
        s10.setArtist("Fatalmente male");

        Songs s11 = new Songs();
        s11.setNome("Francesco Gabbani");
        s11.setArtist("Occidentali's Karma");

        Songs s12 = new Songs();
        s12.setNome("Fiorella Mannoia");
        s12.setArtist("Che sia benedetta");

        Songs s13 = new Songs();
        s13.setNome("Marco Masini");
        s13.setArtist("Spostato di un secondo");

        Songs s14 = new Songs();
        s14.setNome("Ermal Meta");
        s14.setArtist("Vietato morire");

        Songs s15 = new Songs();
        s15.setNome("Fabrizio Moro");
        s15.setArtist("Portami via");

        Songs s16 = new Songs();
        s16.setNome("Nesli & Alice Paba");
        s16.setArtist("Do retta a te");

        Songs s17 = new Songs();
        s17.setNome("Raige & Giulia Luzi");
        s17.setArtist("Togliamoci la voglia");

        Songs s18 = new Songs();
        s18.setNome("Ron");
        s18.setArtist("L'ottava meraviglia");

        Songs s19 = new Songs();
        s19.setNome("Samuel");
        s19.setArtist("Vedrai");

        Songs s20 = new Songs();
        s20.setNome("Sergio Sylvestre");
        s20.setArtist("Con te");

        Songs s21 = new Songs();
        s21.setNome("Paola Turci");
        s21.setArtist("Fatti bella per te");

        Songs s22 = new Songs();
        s22.setNome("Michele Zarrillo");
        s22.setArtist("Mani nelle mani");

        albumSongs.add(s1);
        albumSongs.add(s2);
        albumSongs.add(s3);
        albumSongs.add(s4);
        albumSongs.add(s5);
        albumSongs.add(s6);
        albumSongs.add(s7);
        albumSongs.add(s8);
        albumSongs.add(s9);
        albumSongs.add(s10);
        albumSongs.add(s11);
        albumSongs.add(s12);
        albumSongs.add(s13);
        albumSongs.add(s14);
        albumSongs.add(s15);
        albumSongs.add(s16);
        albumSongs.add(s17);
        albumSongs.add(s18);
        albumSongs.add(s19);
        albumSongs.add(s20);
        albumSongs.add(s21);
        albumSongs.add(s22);

        adapter.setDataSet(albumSongs);
    }
}
