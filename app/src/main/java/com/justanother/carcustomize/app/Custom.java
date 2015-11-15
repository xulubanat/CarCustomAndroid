package com.justanother.carcustomize.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class Custom extends ActionBarActivity
{
    private Button nxt;
    private Spinner brndSp;
    private Spinner modelSp;
    private Spinner yearSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        nxt = (Button)findViewById(R.id.next);


            nxt.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    brndSp = (Spinner)findViewById(R.id.Brand);
                    String brndVal = String.valueOf(brndSp.getSelectedItem());

                    modelSp = (Spinner)findViewById(R.id.Model);
                    String modelVal = String.valueOf(modelSp.getSelectedItem());

                    yearSp = (Spinner)findViewById(R.id.Year);
                    String yearVal = String.valueOf(yearSp.getSelectedItem());

                    if((brndVal.equals("Land Rover")&& (modelVal.equals("Range Rover Evoque")) && (yearVal.equals("2014"))))
                    {
                        Intent intentRover = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rules.config.landrover.com/jdxl/en_xi/l538_k16/3aqyi/a-5door_a-pure_a-std_n-vlav/jdxexterior.html"));
                        startActivity(intentRover);

                    }
                    else if((brndVal.equals("Audi")&& (modelVal.equals("A7")) && (yearVal.equals("2014"))))
                    {
                        Intent intentRover = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.audiusa.com/models/audi-a7/configurator"));
                        startActivity(intentRover);

                    }
                    else if((brndVal.equals("Lamborghini")&& (modelVal.equals("Huracan")) && (yearVal.equals("2014"))))
                    {
                        Intent intentRover = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lambocars.com/configurator/"));
                        startActivity(intentRover);

                    }
                    else
                        Toast.makeText(getApplicationContext(), "Please select a model/make/year", Toast.LENGTH_SHORT).show();
                }
            });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom, menu);
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
}
