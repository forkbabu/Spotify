package com.spotify.music.features.collectionartist;

public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ v(d0 d0Var, String str) {
        this.a = d0Var;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
