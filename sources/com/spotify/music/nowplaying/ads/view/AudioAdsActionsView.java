package com.spotify.music.nowplaying.ads.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.nqb;

public class AudioAdsActionsView extends LinearLayout implements nqb {
    Button a;
    Button b;
    Button c;
    TextView f;
    nqb.a n;

    public AudioAdsActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C0707R.layout.audio_ads_actions;
    }

    @Override // defpackage.nqb
    public void setAcceptOfferButtonText(String str) {
        this.c.setText(str);
    }

    @Override // defpackage.nqb
    public void setAcceptOfferButtonVisible(Boolean bool) {
        this.c.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // defpackage.nqb
    public void setCallToActionButtonText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(C0707R.string.audio_ad_learn_more_button);
        }
        this.a.setText(str);
    }

    @Override // defpackage.nqb
    public void setCallToActionButtonVisible(Boolean bool) {
        this.a.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // defpackage.nqb
    public void setListener(nqb.a aVar) {
        this.n = aVar;
    }

    @Override // defpackage.nqb
    public void setRejectOfferText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(C0707R.string.watch_now_reject_video_ad);
        }
        this.b.setText(str);
    }

    @Override // defpackage.nqb
    public void setRejectOfferTextVisible(Boolean bool) {
        this.b.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // defpackage.nqb
    public void setTitleText(String str) {
        this.f.setText(str);
    }

    @Override // defpackage.nqb
    public void setTitleTextVisible(Boolean bool) {
        this.f.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public AudioAdsActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(getContext(), getLayoutResource(), this);
        this.f = (TextView) findViewById(C0707R.id.audio_ads_title);
        Button button = (Button) findViewById(C0707R.id.ad_call_to_action);
        this.a = button;
        button.setOnClickListener(new a(this));
        Button button2 = (Button) findViewById(C0707R.id.reject_offer_button);
        this.b = button2;
        button2.setOnClickListener(new b(this));
        Button button3 = (Button) findViewById(C0707R.id.accept_offer_button);
        this.c = button3;
        button3.setOnClickListener(new c(this));
    }
}
