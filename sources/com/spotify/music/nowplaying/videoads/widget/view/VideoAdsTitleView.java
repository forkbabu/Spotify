package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.c;
import com.spotify.mobile.android.ui.view.MarqueeTextView;
import com.spotify.music.C0707R;

public class VideoAdsTitleView extends MarqueeTextView implements n7c {
    public VideoAdsTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.n(this, C0707R.style.res_2132083234_textappearance_ads_video_header);
    }

    @Override // defpackage.n7c
    public void setTitle(int i) {
        setText(i);
    }

    public VideoAdsTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
