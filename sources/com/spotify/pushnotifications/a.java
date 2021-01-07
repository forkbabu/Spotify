package com.spotify.pushnotifications;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ g a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b);
    }
}
