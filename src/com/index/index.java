package com.index;

import com.GyEmachine.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class index extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        ImageView indexdy =(ImageView) findViewById(R.id.imageView);
        indexdy.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick(View v)
            {
        		ComponentName componentName=new   ComponentName("com.DirectPy","com.DirectPy.DirectPy");  
                Intent intent=new Intent();  
                intent.setComponent(componentName);  
                intent.setAction(Intent.ACTION_VIEW);  
                startActivity(intent);  
            }
    });
//        setContentView(indexdy); 
        
	}
}