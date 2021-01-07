package com.spotify.music.features.connect.cast;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(o oVar, String str) {
        this.a = oVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.t(this.b);
    }
}
