package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText; 
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    EditText number1,number2;
    TextView res;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        res=findViewById(R.id.result);
    }
    public void one(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("1");
        }
        else if(number2.hasFocus())
        {
            number2.append("1");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void two(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("2");
        }
        else if(number2.hasFocus())
        {
            number2.append("2");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void three(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("3");
        }
        else if(number2.hasFocus())
        {
            number2.append("3");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void four(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("4");
        }
        else if(number2.hasFocus())
        {
            number2.append("4");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void five(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("5");
        }
        else if(number2.hasFocus())
        {
            number2.append("5");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void six(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("6");
        }
        else if(number2.hasFocus())
        {
            number2.append("6");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void seven(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("7");
        }
        else if(number2.hasFocus())
        {
            number2.append("7");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void eight(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("8");
        }
        else if(number2.hasFocus())
        {
            number2.append("8");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void nine(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("9");
        }
        else if(number2.hasFocus())
        {
            number2.append("9");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void zero(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("0");
        }
        else if(number2.hasFocus())
        {
            number2.append("0");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void dot(View v)
    {
        if(number1.hasFocus())
        {
            number1.append(".");
        }
        else if(number2.hasFocus())
        {
            number2.append(".");
        }
        else {
            Toast.makeText(this, "Please get the focus of First/Second Number field",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void add(View v)
    {
        op='+';
    }
    public void sub(View v)
    {
        op='-';
    }
    public void multiply(View v)
    {
        op='*';
    }
    public void divide(View v)
    {
        op='/';
    }
    public void compute(View v)
    {
        float n1,n2,r;
        switch(op)
        {
            case '+': n1=Float.parseFloat(number1.getText().toString());
                n2=Float.parseFloat(number2.getText().toString());
                r=n1+n2;
                res.setText(""+n1+"+"+n2+"="+r);
                break;
            case '-': n1=Float.parseFloat(number1.getText().toString());
                n2=Float.parseFloat(number2.getText().toString());
                r=n1-n2;
                res.setText(""+n1+"- "+n2+"="+r);
                break;
            case '*': n1=Float.parseFloat(number1.getText().toString());
                n2=Float.parseFloat(number2.getText().toString());
                r=n1*n2;
                res.setText(""+n1+"*"+n2+"="+r);
                break;
            case '/': n1=Float.parseFloat(number1.getText().toString());
                n2=Float.parseFloat(number2.getText().toString());
                r=n1/n2;
                res.setText(""+n1+"/"+n2+"="+r);
                break;
        }
    }
    public void All_Clear(View v)
    {
        number1.setText("");
        number2.setText("");
        res.setText("");
    }
    public void clear_one_field_completely(View v)
    {
        if(number1.hasFocus())
        {
            number1.setText("");
            ext("");
            res.setText(""
            );
        }
        else if(number2.hasFocus())
        {
            number2.setText("");
            ext("");
            res.setText(""
            );
        }
        else
        {
            Toast.makeText(this, "Please click on Number1/Number2 Field",
                    Toast.LENGTH_LONG).show();
        }
    }

    private void ext(String s) {
    }

    public void clear_one_digit_at_a_time(View v)
    {
        if(number1.hasFocus())
        {
            String n;
            n=number1.getText().toString();
// n=n.substring(0,n.length()-1); /// deletes digits from right to left
            n=n.substring(1,n.length()); // deletes digits from left to right
            number1.setText(n);
        }
        else if(number2.hasFocus())
        {
            String n;
            n=number2.getText().toString();
// n=n.substring(0,n.length()-1);/// deletes digits from right to left
            n=n.substring(1,n.length()); // deletes digits from left to right
            number2.setText(n);
        }
        else
        {
            Toast.makeText(this, "Please click on Number1/Number2 Field",
                    Toast.LENGTH_LONG).show();
        }
    }
}
