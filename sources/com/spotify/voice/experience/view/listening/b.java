package com.spotify.voice.experience.view.listening;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ ListeningView a;
    public final /* synthetic */ float b;

    public /* synthetic */ b(ListeningView listeningView, float f) {
        this.a = listeningView;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
