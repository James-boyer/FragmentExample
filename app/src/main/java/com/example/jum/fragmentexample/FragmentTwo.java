package com.example.jum.fragmentexample;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    private Drawable cur_img = null;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_two, container, false);
       // ImageView imgv = (ImageView) getView().findViewById(R.id.img1);
        //imgv.setImageDrawable(getResources().getDrawable(R.drawable.rabbit));

        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        cur_img = getResources().getDrawable(R.drawable.rabbit);
        updateImg();
    }
    public void updateImg(){
        ImageView imgv = (ImageView) getView().findViewById(R.id.img2);
        imgv.setImageDrawable(cur_img);
    }

    public void setImg(Drawable drw){
        cur_img = drw;
        updateImg();
    }

    public Drawable getImg(){
        return cur_img;
    }



}
