package com.justanother.carcustomize.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Main extends ActionBarActivity
{

    private Button custm;
    private Button abt;
    private Button hlp;
    private Button ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custm = (Button)findViewById(R.id.custom);
        abt = (Button)findViewById(R.id.about);
        hlp = (Button)findViewById(R.id.help);
        ext = (Button)findViewById(R.id.exit);

        custm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intentCustom = new Intent(getApplicationContext(), Custom.class);
                startActivity(intentCustom);
            }
        });

        abt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intentAbout = new Intent(getApplicationContext(), About.class);
                startActivity(intentAbout);
            }
        });

        hlp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intentHelp = new Intent(getApplicationContext(), Help.class);
                startActivity(intentHelp);
            }
        });

        ext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                finish();
            }
        });
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
}
