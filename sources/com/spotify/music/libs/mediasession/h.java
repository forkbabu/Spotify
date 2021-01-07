package com.spotify.music.libs.mediasession;

import com.spotify.music.libs.mediasession.j0;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ j0.a a;
    public final /* synthetic */ String b;

    public /* synthetic */ h(j0.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.a aVar = this.a;
        j0.this.g.a(j0.this.h.a(this.b, j0.k(j0.this)).subscribe());
    }
}
