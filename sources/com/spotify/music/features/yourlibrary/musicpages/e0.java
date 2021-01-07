package com.spotify.music.features.yourlibrary.musicpages;

public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ MusicPagesLogger a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ e0(MusicPagesLogger musicPagesLogger, boolean z) {
        this.a = musicPagesLogger;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
