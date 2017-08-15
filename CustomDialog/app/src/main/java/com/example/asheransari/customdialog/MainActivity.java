package com.example.asheransari.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button btn_ok;
    Dialog custom_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_click);
        getCustomDialogPrepaed();
        button.setOnClickListener(this);
    }

    private void getCustomDialogPrepaed(){
        custom_dialog = new Dialog(this);
        custom_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custom_dialog.setContentView(R.layout.custom_dialog);
        btn_ok = (Button)custom_dialog.findViewById(R.id.btn_ok_dialogue);
        btn_ok.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_click:
                Toast.makeText(this, "Clicked Here..!!", Toast.LENGTH_SHORT).show();
                custom_dialog.show();
                break;
            case R.id.btn_ok_dialogue:
                Toast.makeText(this, "Close Dialog..!!", Toast.LENGTH_SHORT).show();
                custom_dialog.dismiss();
                break;
        }
    }
}
