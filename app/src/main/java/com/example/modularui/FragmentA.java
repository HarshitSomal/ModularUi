package com.example.modularui;

import java.util.zip.Inflater;



import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentA extends Fragment implements OnItemClickListener  {
    Communicator comm;
	ListView list;
	int i;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    if (savedInstanceState != null) {
           
            i= savedInstanceState.getInt("cur", 0);
        }

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.activity_fragment, container,false);
		
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		comm=(Communicator) getActivity();
		list=(ListView)getActivity().findViewById(R.id.listView1);
		ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(), R.array.titles,android.R.layout.simple_list_item_1);
	    list.setAdapter(adapter);
	    list.setOnItemClickListener(this);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	
	outState.putInt("cur", i);
	}

	 
	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
		comm.respond(i);
		
	}


	

	
	}

	

