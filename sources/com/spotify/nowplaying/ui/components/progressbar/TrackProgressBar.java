package com.spotify.nowplaying.ui.components.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class TrackProgressBar extends ProgressBar implements c, fqd {
    public TrackProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842872);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        getProgressDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // com.spotify.nowplaying.ui.components.progressbar.c
    public void setDuration(int i) {
        setMax(i);
    }

    @Override // com.spotify.nowplaying.ui.components.progressbar.c
    public void setPosition(int i) {
        setProgress(i);
    }

    public TrackProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(0, 0, 0, 0);
    }
}
