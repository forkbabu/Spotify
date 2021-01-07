package com.spotify.http.contentaccesstoken;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.contentaccesstoken.proto.ContentAccessRefreshToken;
import com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class k implements h, a {
    private final p a = new p();
    private final PublishSubject<ng0> b;
    private final AtomicReference<Runnable> c;
    private boolean d;
    private final ContentAccessTokenClient e;
    private final c f;
    private final y g;

    public k(ContentAccessTokenClient contentAccessTokenClient, c cVar, y yVar) {
        h.e(contentAccessTokenClient, "contentAccessTokenClient");
        h.e(cVar, "contentAccessRefreshTokenPersistentStorage");
        h.e(yVar, "ioScheduler");
        this.e = contentAccessTokenClient;
        this.f = cVar;
        this.g = yVar;
        PublishSubject<ng0> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.b = h1;
        this.c = new AtomicReference<>();
    }

    private final void g(ContentAccessRefreshToken contentAccessRefreshToken) {
        this.a.b(this.e.setRefreshToken(contentAccessRefreshToken).I0(this.g).subscribe());
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public void a() {
        this.f.c(this);
        String e2 = this.f.e();
        this.d = !(e2 == null || e.n(e2));
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public void b() {
        this.f.d(this);
        this.a.a();
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public d c(int i) {
        s<R> P = this.e.getToken((long) i).j0(new i(this)).O0(this.b).T().E(j.a).P();
        h.d(P, "contentAccessTokenClient…          .toObservable()");
        R d2 = P.d();
        h.d(d2, "token");
        if (d2.isPresent()) {
            return (d) d2.get();
        }
        return null;
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public void cancel() {
        this.b.onNext(ng0.a());
    }

    @Override // com.spotify.http.contentaccesstoken.a
    public void d() {
        this.d = true;
        ContentAccessRefreshToken.b l = ContentAccessRefreshToken.l();
        l.m(this.f.e());
        GeneratedMessageLite build = l.build();
        h.d(build, "ContentAccessRefreshToke…\n                .build()");
        g((ContentAccessRefreshToken) build);
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public void e(Runnable runnable) {
        h.e(runnable, "callback");
        this.c.set(runnable);
    }

    @Override // com.spotify.http.contentaccesstoken.a
    public void f() {
        this.d = false;
        ContentAccessRefreshToken i = ContentAccessRefreshToken.i();
        h.d(i, "ContentAccessRefreshToken.getDefaultInstance()");
        g(i);
    }

    @Override // com.spotify.http.contentaccesstoken.h
    public boolean isEnabled() {
        return this.d;
    }
}
