package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements DataSinhVien{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void Recive(Sinhvien sinhvien) {
        FragmentChiTiet fragmentChiTiet = (FragmentChiTiet) getFragmentManager().findFragmentById(R.id.fragmentdetail);
//       Cach 2 : Kiem tra ve huong man hinh
        Configuration configuration = getResources().getConfiguration();
//        configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

        if (fragmentChiTiet != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("BBB","Ton tai");
            fragmentChiTiet.SetTextFromData(sinhvien);
        }else {
            Log.d("BBB","Khong ton tai");
            Intent intent = new Intent(MainActivity.this,ChitietActivity.class);
            intent.putExtra("sinhvien",sinhvien);
            startActivity(intent);
        }

    }
}
