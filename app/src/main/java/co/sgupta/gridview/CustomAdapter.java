package co.sgupta.gridview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<SingleItem> mItems;
    Context mContext;

    public CustomAdapter(Context context) {
        mItems = new ArrayList<SingleItem>();
        mContext = context;
        Resources resources = context.getResources();
        String[] titles = resources.getStringArray(R.array.titles);
        int[] images = {R.drawable.meme_1,R.drawable.meme_2,R.drawable.meme_3,R.drawable.meme_4,R.drawable.meme_5,R.drawable.meme_6
                ,R.drawable.meme_7,R.drawable.meme_8,R.drawable.meme_9,R.drawable.meme_10};

        for(int i=0;i<10;i++)
            mItems.add(new SingleItem(titles[i],images[i]));

    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        MyViewHolder holder = null;
        View item = convertView;

        if(item==null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item = inflater.inflate(R.layout.single_item,viewGroup,false);
            holder = new MyViewHolder(item);

            item.setTag(holder);
        }
        else {
            holder = (MyViewHolder) item.getTag();
        }

        SingleItem singleItem = mItems.get(i);

        holder.imageView.setImageResource(singleItem.image);

        holder.imageView.setTag(singleItem);

        return item;
    }
}
