package com.nguyeningcode.jnguyen7410.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;
    private static ArrayMap<Integer, String> stringMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringMap = new ArrayMap<>(6);
        stringMap.put(R.id.b1, "This will launch my Spotify Steamer!");
        stringMap.put(R.id.b2, "This will launch my Football Scores App!");
        stringMap.put(R.id.b3, "This will launch my Library App!");
        stringMap.put(R.id.b4, "This will launch my Build It Bigger App!");
        stringMap.put(R.id.b5, "This will launch my XYZ Reader App!");
        stringMap.put(R.id.b6, "This will launch my Capstone App!");

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);

        b1.setOnClickListener(buttonListener);
        b2.setOnClickListener(buttonListener);
        b3.setOnClickListener(buttonListener);
        b4.setOnClickListener(buttonListener);
        b5.setOnClickListener(buttonListener);
        b6.setOnClickListener(buttonListener);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = stringMap.get(v.getId());
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };

}
