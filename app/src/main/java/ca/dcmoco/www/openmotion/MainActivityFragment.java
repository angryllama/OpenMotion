package ca.dcmoco.www.openmotion;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_main, container, false);

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        Button b = (Button) v.findViewById(R.id.mainButtonManualControl);
        b.setOnClickListener(this);

        return v;
    }

    //public void startManualControl() {
    //    Intent intent = new Intent(getActivity(), ManualControlFragment.class);
    //    startActivity(intent);
    //}
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mainButtonManualControl:
                Intent intent = new Intent(this, ManualControlFragment.class);
                startActivity(intent);
                break;

        }
