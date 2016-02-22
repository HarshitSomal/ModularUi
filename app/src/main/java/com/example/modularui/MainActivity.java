package com.example.modularui;

import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	@Override
	public void respond(int i) {
		// TODO Auto-generated method stub
		FragmentManager manager=getFragmentManager();
		FragmentB f2=(FragmentB) manager.findFragmentById(R.id.fragment2);
		f2.changeData(i);
	}


    
}
