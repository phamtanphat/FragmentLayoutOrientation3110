package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChitietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        Intent intent = getIntent();
        Sinhvien sinhvien = (Sinhvien) intent.getSerializableExtra("sinhvien");
        FragmentChiTiet fragmentChiTiet = (FragmentChiTiet) getFragmentManager().findFragmentById(R.id.fragmentchitiet);
        fragmentChiTiet.SetTextFromData(sinhvien);
    }
}
