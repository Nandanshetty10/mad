package com.example.call;

import androidx.appcompat.app.AppCompatActivity; import android.content.Intent;
import android.net.Uri; import android.os.Bundle;
import android.os.VibrationEffect;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.num);
    }
    public void one(View v)
    {
        number.append("1");
    }
    public void two(View v)
    {
        number.append("2");
    }
    public void three(View v)
    {
        number.append("3");
    }
    public void four(View v)
    {
        number.append("4");
    }
    public void five(View v)
    {
        number.append("5");
    }
    public void six(View v)
    {
        number.append("6");
    }
    public void seven(View v)
    {
        number.append("7");
    }
    public void eight(View v)
    {
        number.append("8");
    }
    public void nine(View v)
    {
        number.append("9");
    }
    public void zero(View v)
    {
        number.append("0");
    }
    public void star(View v)
    {
        number.append("*");
    }
    public void hash(View v)
    {
        number.append("#");
    }
    public void delete(View v)
    {
        String n=number.getText().toString(); n=n.substring(0,n.length()-1); number.setText(n);
    }

    public void call(View v)
    {
        String num=number.getText().toString();
        Intent i =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num));
        startActivity(i);
    }
    public void save(View v)
    {
        String num=number.getText().toString();
        Intent i =new Intent(Intent.ACTION_INSERT,
                ContactsContract.Contacts.CONTENT_URI);
        i.putExtra(ContactsContract.Intents.Insert.PHONE,num);
        startActivity(i);
    }
}
