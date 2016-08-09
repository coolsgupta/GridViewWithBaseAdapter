package co.sgupta.gridview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder {

    ImageView imageView;

    public MyViewHolder(View item) {
        imageView = (ImageView) item.findViewById(R.id.imageView);
        }

}
