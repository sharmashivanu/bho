package org.ironrabbit.bho;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ZoomButton;

public class BhoZoomButton extends ZoomButton {
	Context c;
	Typeface t;
	
	public BhoZoomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.c = context;
		
		if(t == null)
            t = org.ironrabbit.type.CustomTypefaceManager.getCurrentTypeface(context);
		
		//setTypeface(t);
	}

	public BhoZoomButton(Context context) {
		super(context);
		this.c = context;
		
		if(t == null)
            t = org.ironrabbit.type.CustomTypefaceManager.getCurrentTypeface(context);
		
		//setTypeface(t);
	}

}
