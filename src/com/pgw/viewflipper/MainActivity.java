package com.pgw.viewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
	ViewFlipper viewFlipper;
	int[] ids={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewFlipper=(ViewFlipper) findViewById(R.id.viewFlipper);
		for (int i = 0; i < ids.length; i++) {
			ImageView iview=getImageView(ids[i]);
			viewFlipper.addView(iview);
		}
		viewFlipper.setInAnimation(this,R.anim.left_in);
		viewFlipper.setOutAnimation(this,R.anim.left_out);
//		ÉèÖÃ¶àÉÙÃëÇÐ»»
		viewFlipper.setFlipInterval(5000);
		
		viewFlipper.startFlipping();
	}
	private ImageView getImageView(int id) {
		ImageView imageView=new ImageView(this);
		imageView.setBackgroundResource(id);
		
		return imageView;
	}


}
