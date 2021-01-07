package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.r8f;

public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ GuessingGameVoiceViews.b a;
    public final /* synthetic */ r8f.a b;

    public /* synthetic */ y(GuessingGameVoiceViews.b bVar, r8f.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GuessingGameVoiceViews.b bVar = this.a;
        GuessingGameVoiceViews.w(GuessingGameVoiceViews.this, this.b);
    }
}
