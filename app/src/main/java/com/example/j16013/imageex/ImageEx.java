package com.example.j16013.imageex;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by J16013 on 2017/06/15.
 */

public class ImageEx extends Activity {

    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new ImageView(this));
    }
}
