package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.c;
import com.spotify.mobile.android.ui.view.MarqueeTextView;
import com.spotify.music.C0707R;

public class VideoAdsInfoView extends MarqueeTextView implements g7c {
    public VideoAdsInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.n(this, C0707R.style.res_2132083235_textappearance_ads_video_name);
    }

    @Override // defpackage.g7c
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    public VideoAdsInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
