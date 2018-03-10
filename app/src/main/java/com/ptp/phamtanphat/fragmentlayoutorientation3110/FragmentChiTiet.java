package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 8/3/2018.
 */

public class FragmentChiTiet extends Fragment {
    View view;
    TextView txtten,txtnamsinh,txtdiachi;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentchitiet,container,false);
        txtdiachi = view.findViewById(R.id.textviewdetaildiachi);
        txtnamsinh = view.findViewById(R.id.textviewdetailnamsinh);
        txtten = view.findViewById(R.id.textviewdetailten);

        return view;
    }
    public void SetTextFromData(Sinhvien sinhvien){
        txtten.setText(sinhvien.getTen());
        txtnamsinh.setText(sinhvien.getNamsinh() + "");
        txtdiachi.setText(sinhvien.getDiachi());
    }
}
