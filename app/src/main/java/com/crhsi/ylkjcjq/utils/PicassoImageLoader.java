package com.crhsi.ylkjcjq.utils;

import android.content.Context;
import android.widget.ImageView;

import com.crhsi.ylkjcjq.R;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by CJQ on 2017/5/15.
 */

public class PicassoImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
         切记不要胡乱强转！
         */
        //Picasso 加载图片简单用法
//        		Picasso.with(context)
//				.load(path.toString())
//				.error(R.mipmap.ic_launcher)
//				.fit()
//				.centerCrop()
//				.into(imageView);
        if(path.toString().equals("01")){
            imageView.setBackgroundResource(R.mipmap.film_banner1);
        }else {
            imageView.setBackgroundResource(R.mipmap.film_banner2);
        }
    }

//    //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//    @Override
//    public ImageView createImageView(Context context) {
//        //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//        ImageView simpleDraweeView = new ImageView(context);
//        return simpleDraweeView;
//    }
}
