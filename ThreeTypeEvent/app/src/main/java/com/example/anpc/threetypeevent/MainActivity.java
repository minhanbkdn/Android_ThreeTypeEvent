package com.example.anpc.threetypeevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView tvEqual;
    Button btnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edtSo1);
        editText2 = findViewById(R.id.edtSo2);
        tvEqual = findViewById(R.id.tvEqual);
        btnEqual = findViewById(R.id.btnEqual);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int so1 = Integer.parseInt(editText1.getText()+"");
                    int so2 = Integer.parseInt(editText2.getText()+"");
                    tvEqual.setText(so1 + so2 + "");
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập số!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void tinhTong(View v){
        try {
            int so1 = Integer.parseInt(editText1.getText()+"");
            int so2 = Integer.parseInt(editText2.getText()+"");
            tvEqual.setText(so1 + so2 + "");
        }
        catch (Exception e){
            Toast.makeText(this, "Vui lòng nhập số!",Toast.LENGTH_SHORT).show();
        }
    }
}
