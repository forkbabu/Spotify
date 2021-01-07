package com.spotify.music.marquee.optout;

import android.content.Intent;
import androidx.fragment.app.c;
import com.spotify.music.marquee.learnmore.LearnMoreWebActivity;
import defpackage.sjb;

public final /* synthetic */ class b implements sjb.a {
    public final /* synthetic */ MarqueeOptOutMenuFragment a;

    public /* synthetic */ b(MarqueeOptOutMenuFragment marqueeOptOutMenuFragment) {
        this.a = marqueeOptOutMenuFragment;
    }

    @Override // defpackage.sjb.a
    public final void a() {
        MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = this.a;
        int i = MarqueeOptOutMenuFragment.I0;
        c B2 = marqueeOptOutMenuFragment.B2();
        int i2 = LearnMoreWebActivity.H;
        Intent intent = new Intent(B2, LearnMoreWebActivity.class);
        if (marqueeOptOutMenuFragment.B2() != null) {
            marqueeOptOutMenuFragment.B2().startActivity(intent);
        }
    }
}
