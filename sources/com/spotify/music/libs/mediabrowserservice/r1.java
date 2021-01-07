package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.u2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.w1;
import com.spotify.music.libs.mediasession.i0;
import io.reactivex.disposables.a;
import io.reactivex.disposables.d;
import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class r1 implements n2 {
    public static final List<MediaBrowserCompat.MediaItem> p = Collections.emptyList();
    protected final a a = new a();
    protected final d b = new d();
    private final v1 c;
    private final t2 d;
    private final i0 e;
    private final a2 f;
    protected final String g;
    private final String h;
    private final Set<Long> i;
    private final RootHintsParams j;
    private final j2 k;
    private final d3 l;
    protected final yda m;
    protected final pea n;
    protected final boolean o;

    public r1(String str, String str2, Context context, v1 v1Var, t2 t2Var, a2 a2Var, i0 i0Var, Set<Long> set, RootHintsParams rootHintsParams, j2 j2Var, d3 d3Var, yda yda, pea pea, boolean z) {
        this.l = d3Var;
        this.m = yda;
        this.n = pea;
        Logger.b("MediaBrowserServiceSession created for %s", str);
        this.j = rootHintsParams;
        this.h = str;
        this.g = str2;
        this.c = v1Var;
        this.f = a2Var;
        this.e = i0Var;
        this.d = t2Var;
        ((u2) t2Var).d();
        this.i = set;
        this.k = j2Var;
        this.o = z;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public /* synthetic */ boolean a() {
        return m2.a(this);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void b(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        this.f.x();
        String d2 = s1.d(str);
        if (this.o) {
            this.a.b(this.n.q(this.m, d2).subscribe());
        }
        if ("empty".equals(this.j.e())) {
            Logger.d("Requested to load children with empty root list type", new Object[0]);
            jVar.g(p);
            return;
        }
        w1 T = this.c.T();
        BrowserParams.a d3 = BrowserParams.d(d2, this.h.equals(str));
        d3.b(this.j.e());
        d3.c(this.j.c());
        d3.g(this.g);
        d3.a(this.j.g());
        d3.j(this.j.h());
        z<R> A = T.a(d3.build(), bundle, 0, 30).A(new n(this));
        jVar.getClass();
        this.a.b(A.subscribe(new p(jVar), new o(jVar)));
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public String c() {
        return this.h;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public Set<Long> d() {
        return this.i;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void destroy() {
        Logger.b("MediaBrowserServiceSession %s is destroyed", this.g);
        this.a.f();
        this.b.dispose();
        ((u2) this.d).a();
        this.f.u();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public a2 e() {
        return this.f;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public void f(String str, Bundle bundle, g<List<MediaBrowserCompat.MediaItem>> gVar) {
        this.b.b(this.k.b(str, 10).M(Functions.f(), new m(gVar)).subscribe(gVar, new l(gVar)));
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public i0 g() {
        return this.e;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public boolean h() {
        return true;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public String i() {
        return this.g;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.n2
    public v1 j() {
        return this.c;
    }

    public /* synthetic */ List k(List list) {
        return this.l.a(list, this.g);
    }
}
