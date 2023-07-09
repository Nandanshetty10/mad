package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;
import android.app.UiAutomation;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;
import static android.speech.tts.TextToSpeech.*;
public class MainActivity extends AppCompatActivity {
    EditText pitchrate,setspeechrate,text;
    TextToSpeech t;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pitchrate=findViewById(R.id.pitch);
        setspeechrate=findViewById(R.id. speechrate);
        text=findViewById(R.id.texttospeak);
        t=new TextToSpeech(this, new OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==SUCCESS)
                {
                    t.setLanguage(Locale.ENGLISH);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "TextToSpeech Initialization Failed",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void speak(View v)
    {
        float pr,sr; String txt;
        if(pitchrate.getText().toString().equals(""))
        {
            pr=1.0f;
        }
        else
        {
            pr=Float.parseFloat(pitchrate.getText().toString());
        }
        if(setspeechrate.getText().toString().equals(""))
        {
            sr=1.0f;
        }
        else
        {
            sr=Float.parseFloat(setspeechrate.getText().toString());
        }
        t.setPitch(pr);
        t.setSpeechRate(sr);
        t.speak(text.getText().toString(),QUEUE_FLUSH,null);
    }
}
