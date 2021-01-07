package com.spotify.music.nowplaying.drivingmode.view.contexttitle;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.header.e;

public class ContextTitle extends LinearLayout implements e {
    private final TextView a;
    private final TextView b;

    public ContextTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void d(String str) {
        this.a.setText(str);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void setListener(e.a aVar) {
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void y() {
        this.b.setVisibility(8);
    }

    @Override // com.spotify.music.nowplaying.common.view.header.e
    public void z(String str) {
        this.b.setVisibility(0);
        this.b.setText(str);
    }

    public ContextTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        c.n(textView, C0707R.style.res_2132083358_textappearance_driving_contexttitle);
        addView(textView);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        c.n(textView2, C0707R.style.res_2132083357_textappearance_driving_contextsubtitle);
        addView(textView2);
    }
}
