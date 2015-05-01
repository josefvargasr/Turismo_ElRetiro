package com.josevargas.turismoelretiro;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        if (id == R.id.menu_hoteles) {
            Intent i=new Intent(this,Hoteles.class);

            startActivity(i);
            return true;
        }

        if (id == R.id.menu_bares) {
            Intent i=new Intent(this,Bares.class);

            startActivity(i);
            return true;
        }

        if (id == R.id.menu_sitios_turisticos) {
            Intent i=new Intent(this,Sitios_turisticos.class);

            startActivity(i);
            return true;
        }

        if (id == R.id.menu_demografia) {
            Intent i=new Intent(this,Demografia.class);

            startActivity(i);
            return true;
        }

        if (id == R.id.menu_acercade) {
            Intent i=new Intent(this,Acercade.class);

            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
