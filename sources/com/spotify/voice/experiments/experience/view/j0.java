package com.spotify.voice.experiments.experience.view;

public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ GuessingGameVoiceViews a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ j0(GuessingGameVoiceViews guessingGameVoiceViews, da2 da2) {
        this.a = guessingGameVoiceViews;
        this.b = da2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.z(this.b);
    }
}
