package tw.com.pcschool.dd2018020804;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receiver = new MyReceiver();
    }
    public void click1(View v)
    {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);
        filter.setPriority(500);
        registerReceiver(receiver, filter);
    }
    public void click2(View v)
    {
        unregisterReceiver(receiver);
    }
    public void click3(View v)
    {
        Intent intent = new Intent("myaction");
        sendBroadcast(intent);
    }
}
