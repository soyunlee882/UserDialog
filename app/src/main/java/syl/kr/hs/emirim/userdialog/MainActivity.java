package syl.kr.hs.emirim.userdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but =(Button)findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        View dlvg=View.inflate(getApplicationContext(),R.layout.dialog,null);
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Input User Information");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setView(dlvg);
        dialog.setPositiveButton("OK",null);
        dialog.setNegativeButton("CANCEL",null);
        dialog.show();


    }
}
