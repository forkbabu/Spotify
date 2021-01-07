package com.spotify.music.nowplaying.ads.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.view.u;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import defpackage.pqb;

public class VoiceAdsView extends RelativeLayout implements pqb {
    private pqb.a a;
    private View b;
    private View c;
    private View f;
    private SpotifyIconView n;
    private ImageView o;
    private final AnimatorSet p;
    private final AnimatorSet q;
    private final AnimatorSet r;

    public VoiceAdsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void a(AnimatorSet animatorSet, View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.9f);
        ofFloat.setDuration(400L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.9f);
        ofFloat2.setDuration(400L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setStartDelay(j);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public void b(View view) {
        pqb.a aVar = this.a;
        if (aVar != null) {
            ((gqb) aVar).g();
        }
    }

    public void c(View view) {
        pqb.a aVar = this.a;
        if (aVar != null) {
            ((gqb) aVar).i();
        }
    }

    public void d(boolean z) {
        int i = 4;
        this.n.setVisibility(z ? 0 : 4);
        this.b.setVisibility(z ? 0 : 4);
        this.c.setVisibility(z ? 0 : 4);
        this.f.setVisibility(z ? 0 : 4);
        ImageView imageView = this.o;
        if (!z) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (z) {
            Logger.b("[VoiceAd] starting animations...", new Object[0]);
            a(this.p, this.b, 0);
            a(this.q, this.c, 100);
            a(this.r, this.f, 200);
            return;
        }
        Logger.b("[VoiceAd] stopping animations...", new Object[0]);
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.r;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C0707R.layout.voice_ads_options;
    }

    @Override // defpackage.pqb
    public void setMicrophoneClickListener(pqb.a aVar) {
        this.a = aVar;
    }

    public VoiceAdsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new AnimatorSet();
        this.q = new AnimatorSet();
        this.r = new AnimatorSet();
        RelativeLayout.inflate(getContext(), getLayoutResource(), this);
        this.b = findViewById(C0707R.id.circle_small);
        this.c = findViewById(C0707R.id.circle_middle);
        this.f = findViewById(C0707R.id.circle_large);
        this.n = (SpotifyIconView) findViewById(C0707R.id.microphone_on);
        this.o = (ImageView) findViewById(C0707R.id.microphone_off);
        View findViewById = findViewById(C0707R.id.microphone_wrapper);
        TextView textView = (TextView) findViewById(C0707R.id.voice_ad_settings);
        int color = getResources().getColor(C0707R.color.voice_ad_mic_background);
        int color2 = getResources().getColor(17170443);
        if (Build.VERSION.SDK_INT >= 17) {
            this.b.setBackground(new u(color2, color2, 0));
            this.c.setBackground(new u(color, color, 0));
            this.f.setBackground(new u(color, color, 0));
        }
        findViewById.setOnClickListener(new e(this));
        textView.setOnClickListener(new d(this));
    }
}
