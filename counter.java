package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int i=1;
    Button start,stop;
    TextView counter;
    Handler myhandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        counter=findViewById(R.id.count);
    }
    public void start(View v)
    {
        i=1;
        myhandler.postDelayed(Threadcount,0);
    }
    public void stop(View v)
    {
        myhandler.removeCallbacks(Threadcount);
    }
    public Runnable Threadcount=new Runnable()
    {
        @Override
        public void run()
        { counter.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,0);
        }
    };
}
