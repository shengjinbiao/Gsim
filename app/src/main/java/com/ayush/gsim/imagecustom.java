package com.ayush.gsim;



import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class imagecustom extends ArrayAdapter<String>{
private final Activity context;
private final String[] web;
private final String[] web1;
private final String[] web2;
private final String[] web3;//private final Integer[] imageId;
public imagecustom(Activity context,
String[] web,String[] web1,String[] web2,String[] web3) {
super(context, R.layout.imagelayout, web);
this.context = context;
this.web = web;
this.web1 = web1;
this.web2 = web2;
this.web3 = web3;//this.imageId = imageId;
}
@Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagelayout, null, true);
int color_id[]={Color.CYAN,Color.DKGRAY,Color.WHITE,Color.MAGENTA,Color.YELLOW};
TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);
ImageView iv=(ImageView)rowView.findViewById(R.id.listImage);
int pos=randomWithRange(0,4);
//iv.setBackgroundColor(color_id[pos]);
   iv.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
TextView txtTitle1 = (TextView) rowView.findViewById(R.id.textView2);
//ImageView imageView = (ImageView) rowView.findViewById(R.id.listImage);
TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView3);
TextView txtTitle3 = (TextView) rowView.findViewById(R.id.textView4);
txtTitle.setText(web[position]);
txtTitle1.setText(web1[position]);
txtTitle3.setText(web2[position]);
txtTitle2.setText(web3[position]);
   txtTitle.setTypeface(Typeface
           .createFromAsset(context.getAssets(), "robotothin.ttf"));
   txtTitle1.setTypeface(Typeface
           .createFromAsset(context.getAssets(), "robotothin.ttf"));
   txtTitle2.setTypeface(Typeface
           .createFromAsset(context.getAssets(), "robotothin.ttf"));
   txtTitle3.setTypeface(Typeface
           .createFromAsset(context.getAssets(), "robotothin.ttf"));


   txtTitle.setSelected(true);
//tv.setSelected(true);
txtTitle.setEllipsize(TruncateAt.MARQUEE);
txtTitle.setSingleLine(true);
//txtTitle1.setWidth(.getLayoutParams().width/2);
txtTitle1.setSelected(true);
//tv.setSelected(true);
txtTitle1.setEllipsize(TruncateAt.MARQUEE);
txtTitle1.setSingleLine(true);
txtTitle2.setSelected(true);
//tv.setSelected(true);
txtTitle2.setEllipsize(TruncateAt.MARQUEE);
txtTitle2.setSingleLine(true);txtTitle3.setSelected(true);
//tv.setSelected(true);
txtTitle3.setEllipsize(TruncateAt.MARQUEE);
txtTitle3.setSingleLine(true);//imageView.setImageResource(imageId[0]);
return rowView;
}
int randomWithRange(int min, int max)
{
   int range = (max - min) + 1;     
   return (int)(Math.random() * range) + min;
}
}

