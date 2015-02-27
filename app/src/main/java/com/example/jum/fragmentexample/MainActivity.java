package com.example.jum.fragmentexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();

        FragmentOne fragone = new FragmentOne();
        FragmentTwo fragtwo = new FragmentTwo();

        transaction.add(R.id.fragView,fragone,"Fragment one");
        transaction.add(R.id.fragView,fragtwo,"Fragment two");

        transaction.commit();
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

    public void swap(View view){

      FragmentOne fragone = (FragmentOne)getFragmentManager().findFragmentByTag("Fragment one");
      FragmentTwo fragtwo = (FragmentTwo)getFragmentManager().findFragmentByTag("Fragment two");
      Drawable f1 = fragone.getImg();
      Drawable f2 = fragtwo.getImg();
      fragone.setImg(f2);
      fragtwo.setImg(f1);

    }
}
