package com.spotify.voice.results.impl.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;

public final class ResultRowView extends PasteLinearLayout {
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final View r;

    public ResultRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void c(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            this.q.setVisibility(8);
            return;
        }
        this.q.setVisibility(0);
        this.q.setText(charSequence);
        TextLabelUtil.b(getContext(), this.q, z);
    }

    public ImageView getImageView() {
        return this.o;
    }

    public void setIsContainer(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
        Drawable drawable = null;
        if (z) {
            drawable = i2.d(getResources(), C0707R.drawable.container_bg, null);
        }
        setBackground(drawable);
    }

    public void setTitle(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public ResultRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LinearLayout.inflate(context, C0707R.layout.custom_glue_listtile_2_image, this);
        ImageView imageView = (ImageView) findViewById(16908294);
        this.o = imageView;
        TextView textView = (TextView) findViewById(16908308);
        this.p = textView;
        TextView textView2 = (TextView) findViewById(16908309);
        this.q = textView2;
        View findViewById = findViewById(C0707R.id.spotifyIconView);
        this.r = findViewById;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(imageView, findViewById);
        c.a();
    }
}
