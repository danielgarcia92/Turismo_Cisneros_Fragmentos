package com.example.daniel.practica5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            MyMenu fragment = new MyMenu();
            fragmentTransaction.replace(R.id.frame3, fragment).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            MyMenu fragment = new MyMenu();
            fragmentTransaction.replace(R.id.frame3, fragment).commit();
        }
        //super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mBar) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                Bar fragment = new Bar();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (id == R.id.mHotel) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                hotel fragment = new hotel();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (id == R.id.mTurismo) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                Turismo fragment = new Turismo();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (id == R.id.mDemografia) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                Demografia fragment = new Demografia();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (id == R.id.mMenu) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                MyMenu fragment = new MyMenu();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        if (id == R.id.mAcercade) {

            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                AcercaDe fragment = new AcercaDe();
                fragmentTransaction.replace(R.id.frame3, fragment).commit();
            }

        }

        return super.onOptionsItemSelected(item);
    }
}