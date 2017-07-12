package samuel.example.com.intcore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import samuel.example.com.intcore.custom.STextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);

        String text = "<font color="+getResources().getColor(R.color.head_textColor)+">SAR</font> <font color="+getResources().getColor(R.color.textColor)+"> 6354</font>";
        textView1.setText(Html.fromHtml(text));

        String text2 = "<font color="+getResources().getColor(R.color.head_textColor)+">SAR</font> <font color="+getResources().getColor(R.color.textColor)+"> 20</font>";
        textView2.setText(Html.fromHtml(text2));

    }
}
