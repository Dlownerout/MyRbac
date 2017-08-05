package app.rbac.jane.myrbac.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.rbac.jane.myrbac.R;

/**
 * Created by Administrator on 5/8/2560.
 */
public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.main_fragment, container, false);
        return  view;
    }
}  //Main Class ...