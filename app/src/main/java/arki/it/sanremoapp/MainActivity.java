package arki.it.sanremoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView miaImmagine;
    Activity activity = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miaImmagine = (ImageView) findViewById(R.id.img);
        miaImmagine.setImageResource(R.drawable.img);

        miaImmagine.setOnClickListener(imgButton);
    }

    View.OnClickListener imgButton = new View.OnClickListener() {
        public void onClick(View view) {

            Intent intent = new Intent(activity, SecondActivity.class);
            startActivity(intent);
        }
    };

}