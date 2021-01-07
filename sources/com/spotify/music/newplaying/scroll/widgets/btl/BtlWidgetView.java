package com.spotify.music.newplaying.scroll.widgets.btl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.spotify.music.C0707R;
import com.spotify.music.behindthelyrics.view.BehindTheLyricsCard;

public class BtlWidgetView extends BehindTheLyricsCard implements fqd {
    public BtlWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }

    public BtlWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setGradientCornerRadius(getResources().getDimension(C0707R.dimen.std_8dp));
    }
}
