package samuel.example.com.intcore.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;


public class SButton extends Button {
    public SButton(Context context) {
        super(context);
        setFont(context);
    }

    public SButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context);
    }

    public SButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont(context);
    }

    private void setFont(Context context){
        setTypeface(Typeface.createFromAsset(context.getAssets(), "GE_SS_Two_Light.otf"));
    }
}
