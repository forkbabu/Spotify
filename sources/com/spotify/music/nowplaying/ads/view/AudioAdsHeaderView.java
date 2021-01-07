package com.spotify.music.nowplaying.ads.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.ads.view.tagline.AudioAdsTagLineView;

public class AudioAdsHeaderView extends FrameLayout implements oqb {
    private TextView a;
    private AudioAdsTagLineView b;

    public AudioAdsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(String str, boolean z) {
        if (z) {
            this.b.setTagLine(str);
        } else {
            this.b.setAdvertiserName(str);
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C0707R.layout.audio_ads_header;
    }

    @Override // defpackage.oqb
    public void setTitle(int i) {
        this.a.setText(i);
    }

    public AudioAdsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), getLayoutResource(), this);
        this.a = (TextView) findViewById(C0707R.id.audio_ads_title);
        this.b = (AudioAdsTagLineView) findViewById(C0707R.id.audio_ads_advertiser);
    }
}
