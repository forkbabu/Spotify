package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import defpackage.b7c;

public class VideoAdsActionView extends ConstraintLayout implements b7c {
    private Button a;
    private b7c.a b;

    public VideoAdsActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ void C(View view) {
        ((z6c) this.b).d();
    }

    @Override // defpackage.b7c
    public void setCallToActionButtonText(String str) {
        this.a.setText(str);
    }

    @Override // defpackage.b7c
    public void setCallToActionButtonVisibility(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.b7c
    public void setListener(b7c.a aVar) {
        this.b = aVar;
    }

    public VideoAdsActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C0707R.layout.video_ads_action_view, this);
        Button button = (Button) findViewById(C0707R.id.video_ad_call_to_action_button);
        this.a = button;
        button.setOnClickListener(new b(this));
    }
}
