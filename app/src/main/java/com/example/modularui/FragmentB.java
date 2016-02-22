package com.example.modularui;




import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {
	TextView text;
	String[] descripation;
	int i;
	
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
	return inflater.inflate(R.layout.activity_fragment_b, container,false);
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
        text=(TextView)getActivity().findViewById(R.id.textView1);
	}
	
	
	
public void changeData(int i){
	Resources res=getResources();
	String[] descripation=res.getStringArray(R.array.descripation);
	text.setText( descripation[i]);
}

}