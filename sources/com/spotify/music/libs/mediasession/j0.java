package com.spotify.music.libs.mediasession;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.rxjava2.q;
import defpackage.yda;

/* access modifiers changed from: package-private */
public class j0 implements n0 {
    private final MediaSessionCompat a;
    private final n6 b;
    private i0 c;
    private final l0 d;
    private final pea e;
    private final e0 f;
    private final q g = new q();
    private final d0 h;
    private final MediaSessionCompat.a i = new a();

    class a extends MediaSessionCompat.a {
        a() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void c(String str, Bundle bundle) {
            Logger.b("Custom action: %s", str);
            j0.i(j0.this, new h(this, str));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void e() {
            j0.i(j0.this, new j(this));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void f() {
            j0.i(j0.this, new d(this));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void k(long j) {
            j0.i(j0.this, new f(this, j));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void o() {
            j0.i(j0.this, new e(this));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void p() {
            j0.i(j0.this, new i(this));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void r() {
            j0.i(j0.this, new g(this));
        }
    }

    public j0(Context context, MediaSessionCompat mediaSessionCompat, l0 l0Var, pea pea, e0 e0Var, d0 d0Var) {
        this.a = mediaSessionCompat;
        this.d = l0Var;
        this.e = pea;
        this.f = e0Var;
        o();
        this.b = n6.f(context);
        this.h = d0Var;
    }

    static void i(j0 j0Var, Runnable runnable) {
        if (j0Var.a.h()) {
            runnable.run();
        } else {
            Assertion.g("Trying to invoke a callback on the non-active MediaSession");
        }
    }

    static yda k(j0 j0Var) {
        j0Var.getClass();
        yda.b bVar = new yda.b("unknown");
        bVar.l("unknown");
        bVar.s("android_media_session");
        bVar.q("media_session");
        bVar.r(j0Var.f.h());
        return bVar.k();
    }

    private void o() {
        i0 i0Var = this.c;
        if (i0Var == null || !i0Var.a()) {
            Logger.b("Setting a callback handler", new Object[0]);
            this.a.l(this.i);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void a() {
        this.b.n(null);
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void b(i0 i0Var) {
        this.c = i0Var;
        Logger.b("New override policy %s", i0Var);
        o();
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void c() {
        this.b.n(this.a);
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public boolean d() {
        return this.a.e() != null;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void e(Bundle bundle) {
        this.a.m(bundle);
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void f(MediaMetadataCompat mediaMetadataCompat) {
        i0 i0Var = this.c;
        if (i0Var == null || !i0Var.c()) {
            if (!this.a.h()) {
                this.a.k(true);
            }
            this.a.o(mediaMetadataCompat);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void g(PlaybackStateCompat playbackStateCompat) {
        i0 i0Var = this.c;
        if (i0Var == null || !i0Var.b()) {
            Logger.b("PlaybackState %s", playbackStateCompat.toString());
            this.a.p(playbackStateCompat);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public MediaSessionCompat.Token getToken() {
        return this.a.f();
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public MediaSessionCompat h() {
        return this.a;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void start() {
        if (!this.a.h()) {
            this.a.k(true);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void stop() {
        this.a.k(false);
        this.g.c();
    }
}
