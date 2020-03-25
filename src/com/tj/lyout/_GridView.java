package com.tj.lyout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class _GridView extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.gridview);

        setTitle("GridView");

        GridView gridView = (GridView) findViewById(R.id.gridView);
        // ָ������ؼ���������Ϊ�Զ����ͼƬ������
        gridView.setAdapter(new ImageAdapter(this));
    }
	  // �Զ����ͼƬ������
    public class ImageAdapter extends BaseAdapter {

        private Context mContext;

        public ImageAdapter(Context context) {
            mContext = context;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(48, 48));
                imageView.setAdjustViewBounds(false);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(5, 5, 5, 5);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);

            return imageView;
        }

        // ����ؼ�����ͼƬ���ݵ�����Դ
        private Integer[] mThumbIds = { R.drawable.icon1, R.drawable.icon2,
                R.drawable.icon3, R.drawable.icon4, R.drawable.icon5 };
    }
}
