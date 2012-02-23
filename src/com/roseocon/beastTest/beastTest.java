package com.roseocon.beastTest;

import com.phonegap.*;
import android.os.Bundle;

public class beastTest extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getResources().getBoolean(R.bool.weinre)) {
			super.loadUrl("file:///android_asset/www/weinre_index.html");
		} else {
			super.loadUrl("file:///android_asset/www/index.html");
		}
    }
}
