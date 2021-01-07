package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.r8f;

public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ GuessingGameVoiceViews.b a;
    public final /* synthetic */ r8f.b b;

    public /* synthetic */ d0(GuessingGameVoiceViews.b bVar, r8f.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GuessingGameVoiceViews.b bVar = this.a;
        r8f.b bVar2 = this.b;
        GuessingGameVoiceViews.v(GuessingGameVoiceViews.this, bVar2.f(), bVar2.d(), bVar2.e());
    }
}
