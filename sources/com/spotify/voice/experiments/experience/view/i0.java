package com.spotify.voice.experiments.experience.view;

import android.view.View;

public final /* synthetic */ class i0 implements View.OnClickListener {
    public final /* synthetic */ GuessingGameVoiceViews a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ i0(GuessingGameVoiceViews guessingGameVoiceViews, da2 da2) {
        this.a = guessingGameVoiceViews;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.A(this.b, view);
    }
}
