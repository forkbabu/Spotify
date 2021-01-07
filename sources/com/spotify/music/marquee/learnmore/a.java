package com.spotify.music.marquee.learnmore;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ LearnMoreWebFragment a;

    public /* synthetic */ a(LearnMoreWebFragment learnMoreWebFragment) {
        this.a = learnMoreWebFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LearnMoreWebFragment learnMoreWebFragment = this.a;
        if (learnMoreWebFragment.B2() != null) {
            learnMoreWebFragment.B2().finish();
        }
    }
}
