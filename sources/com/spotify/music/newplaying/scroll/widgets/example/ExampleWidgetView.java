package com.spotify.music.newplaying.scroll.widgets.example;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.widgets.example.h;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class ExampleWidgetView extends RelativeLayout implements h, fqd {
    private ImageView a;
    private TextView b;
    private TextView c;
    private Picasso f;
    private h.a n;

    public ExampleWidgetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void a(View view) {
        h.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(C0707R.id.cover_image);
        this.b = (TextView) findViewById(C0707R.id.example_title);
        TextView textView = (TextView) findViewById(C0707R.id.example_artist);
        this.c = textView;
        textView.setOnClickListener(new b(this));
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.example.h
    public void setArtistName(String str) {
        this.c.setText(str);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.example.h
    public void setListener(h.a aVar) {
        aVar.getClass();
        this.n = aVar;
    }

    public void setPicasso(Picasso picasso) {
        this.f = picasso;
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.example.h
    public void setTrackCover(String str) {
        z m = this.f.m(str);
        ImageView imageView = this.a;
        m.o(rwd.f(imageView, d.a((float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.cover_art_radius))));
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.example.h
    public void setTrackTitle(String str) {
        this.b.setText(str);
    }

    public ExampleWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
