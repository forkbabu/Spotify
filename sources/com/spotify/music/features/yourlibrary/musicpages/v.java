package com.spotify.music.features.yourlibrary.musicpages;

public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ MusicPagesLogger a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ v(MusicPagesLogger musicPagesLogger, int i, String str, boolean z, boolean z2) {
        this.a = musicPagesLogger;
        this.b = i;
        this.c = str;
        this.f = z;
        this.n = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.H(this.b, this.c, this.f, this.n);
    }
}
