package com.spotify.music.superbird.setup;

import com.spotify.music.superbird.setup.domain.Mount;
import com.spotify.music.superbird.setup.domain.f;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class n implements m {
    private final PublishSubject<f> a;

    public n() {
        PublishSubject<f> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<SetupEvent>()");
        this.a = h1;
    }

    @Override // com.spotify.music.superbird.setup.m
    public s<f> a() {
        return this.a;
    }

    @Override // com.spotify.music.superbird.setup.m
    public void b(Mount mount) {
        h.e(mount, "mount");
        this.a.onNext(new f.n(mount));
    }

    @Override // com.spotify.music.superbird.setup.m
    public void c() {
        this.a.onNext(f.o.a);
    }

    @Override // com.spotify.music.superbird.setup.m
    public void d() {
        this.a.onNext(f.l.a);
    }

    @Override // com.spotify.music.superbird.setup.m
    public void e() {
        this.a.onNext(f.b.a);
    }

    @Override // com.spotify.music.superbird.setup.m
    public void f() {
        this.a.onNext(f.v.a);
    }

    @Override // com.spotify.music.superbird.setup.m
    public void g() {
        this.a.onNext(f.C0350f.a);
    }

    @Override // com.spotify.music.superbird.setup.m
    public void h() {
        this.a.onNext(f.g.a);
    }
}
