package yazdaniscodelab.androidcountdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView timertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerm();
    }

    public void timerm(){

        timertext=(TextView)findViewById(R.id.text_xml);

        final CountDownTimer countDownTimer=new CountDownTimer(60*1000,1000) {
            @Override
            public void onTick(long l) {

                timertext.setText(""+l/1000);

            }
            @Override
            public void onFinish() {
                timertext.setText("0");

            }

        }.start();


    }


}
