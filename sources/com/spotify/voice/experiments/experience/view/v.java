package com.spotify.voice.experiments.experience.view;

import com.spotify.voice.experiments.experience.view.GuessingGameVoiceViews;
import defpackage.u8f;

public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ GuessingGameVoiceViews.b a;
    public final /* synthetic */ u8f.i b;

    public /* synthetic */ v(GuessingGameVoiceViews.b bVar, u8f.i iVar) {
        this.a = bVar;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GuessingGameVoiceViews.h(GuessingGameVoiceViews.this, this.b.l().get());
    }
}
