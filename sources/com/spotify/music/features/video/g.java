package com.spotify.music.features.video;

import android.content.Context;
import com.google.protobuf.u;
import com.spotify.music.storage.j;
import com.spotify.remoteconfig.z6;
import io.reactivex.z;
import java.io.File;
import java.util.Arrays;
import okhttp3.y;

public final class g implements fjf<x72> {
    private final wlf<Context> a;
    private final wlf<gl0<u>> b;
    private final wlf<y> c;
    private final wlf<j72> d;
    private final wlf<o72> e;
    private final wlf<z<p62>> f;
    private final wlf<j> g;
    private final wlf<io.reactivex.y> h;
    private final wlf<cqe> i;
    private final wlf<com.spotify.mobile.android.util.connectivity.y> j;
    private final wlf<z6> k;

    public g(wlf<Context> wlf, wlf<gl0<u>> wlf2, wlf<y> wlf3, wlf<j72> wlf4, wlf<o72> wlf5, wlf<z<p62>> wlf6, wlf<j> wlf7, wlf<io.reactivex.y> wlf8, wlf<cqe> wlf9, wlf<com.spotify.mobile.android.util.connectivity.y> wlf10, wlf<z6> wlf11) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        gl0<u> gl0 = this.b.get();
        y yVar = this.c.get();
        z<p62> zVar = this.f.get();
        io.reactivex.y yVar2 = this.h.get();
        cqe cqe = this.i.get();
        com.spotify.mobile.android.util.connectivity.y yVar3 = this.j.get();
        ajf a2 = ejf.a(this.k);
        a aVar = new a(yVar, this.d.get(), this.e.get());
        return j82.c().a(context, gl0, yVar, new File(this.g.get().b(), "Videos"), aVar, zVar, Arrays.asList(new h72(), new m72()), yVar2, cqe, yVar3, ((z6) a2.get()).d(), ((z6) a2.get()).b());
    }
}
