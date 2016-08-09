package co.sgupta.gridview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DialogueBox extends Activity {

    ImageView mImageView;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue_box);
        mImageView = (ImageView) findViewById(R.id.imageView2);
        mTextView  = (TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        if(intent==null)
        {
            Toast.makeText(this,"empty intent",Toast.LENGTH_LONG).show();
        }else {
            String name = intent.getStringExtra("memeName");
            int image = intent.getIntExtra("memeImage", R.drawable.meme_1);
            mImageView.setImageResource(image);
            mTextView.setText(name);
        }
    }

    public void closeDialogue(View v){
        finish();
    }
}
