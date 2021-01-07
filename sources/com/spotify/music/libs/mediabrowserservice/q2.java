package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediasession.e0;
import io.reactivex.disposables.a;
import java.util.List;

public class q2 extends MediaSessionCompat.a {
    private final t2 e;
    private final e0 f;
    private final a g = new a();
    private final List<aja> h;
    private boolean i;

    public q2(t2 t2Var, List<aja> list, e0 e0Var) {
        t2Var.getClass();
        this.e = t2Var;
        this.f = e0Var;
        this.h = list;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void b(String str, Bundle bundle, ResultReceiver resultReceiver) {
        for (aja aja : this.h) {
            if (aja.a(str)) {
                this.g.b(aja.b(bundle).subscribe(new k0(resultReceiver)));
                return;
            }
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void c(String str, Bundle bundle) {
        this.g.b(this.e.c(this.f.h()).subscribe(new o0(str, bundle), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void e() {
        this.g.b(this.e.b(this.f.h(), 2L).subscribe(c.a, m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void f() {
        this.g.b(this.e.b(this.f.h(), 4L).subscribe(b.a, m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void g(String str, Bundle bundle) {
        this.g.b(this.e.b(this.f.h(), 1024L).subscribe(new g0(str, bundle), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void h(String str, Bundle bundle) {
        this.g.b(this.e.b(this.f.h(), 2048L).subscribe(new h0(str, bundle), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void i(Uri uri, Bundle bundle) {
        this.g.b(this.e.b(this.f.h(), 8192L).subscribe(new l0(uri, bundle), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void j(Uri uri, Bundle bundle) {
        this.g.b(this.e.b(this.f.h(), 131072L).subscribe(new d0(uri, bundle), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void k(long j) {
        this.g.b(this.e.b(this.f.h(), 256L).subscribe(new e0(j), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void l(RatingCompat ratingCompat) {
        this.g.b(this.e.b(this.f.h(), 128L).subscribe(new n0(ratingCompat), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void m(int i2) {
        this.g.b(this.e.b(this.f.h(), 262144L).subscribe(new f0(i2), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void n(int i2) {
        this.g.b(this.e.b(this.f.h(), 2097152L).subscribe(new j0(i2), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void o() {
        this.g.b(this.e.b(this.f.h(), 32L).subscribe(e1.a, m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void p() {
        this.g.b(this.e.b(this.f.h(), 16L).subscribe(a.a, m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void q(long j) {
        this.g.b(this.e.b(this.f.h(), 4096L).subscribe(new i0(j), m0.a));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void r() {
        this.g.b(this.e.b(this.f.h(), 1L).subscribe(a0.a, m0.a));
    }

    public void t() {
        this.g.f();
    }

    public boolean u() {
        return this.i;
    }

    public void v(boolean z) {
        this.i = z;
    }
}
