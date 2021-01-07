package com.spotify.music.libs.mediasession;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.mobile.android.util.Assertion;

/* access modifiers changed from: package-private */
public class s0 implements n0 {
    private final n0 a;
    private final Object b = new Object();

    public s0(n0 n0Var) {
        Assertion.e(n0Var);
        this.a = n0Var;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void a() {
        synchronized (this.b) {
            this.a.a();
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void b(i0 i0Var) {
        synchronized (this.b) {
            this.a.b(i0Var);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void c() {
        synchronized (this.b) {
            this.a.c();
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public boolean d() {
        boolean d;
        synchronized (this.b) {
            d = this.a.d();
        }
        return d;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void e(Bundle bundle) {
        synchronized (this.b) {
            this.a.e(bundle);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void f(MediaMetadataCompat mediaMetadataCompat) {
        synchronized (this.b) {
            this.a.f(mediaMetadataCompat);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void g(PlaybackStateCompat playbackStateCompat) {
        synchronized (this.b) {
            this.a.g(playbackStateCompat);
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public MediaSessionCompat.Token getToken() {
        MediaSessionCompat.Token token;
        synchronized (this.b) {
            token = this.a.getToken();
        }
        return token;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public MediaSessionCompat h() {
        MediaSessionCompat h;
        synchronized (this.b) {
            h = this.a.h();
        }
        return h;
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void start() {
        synchronized (this.b) {
            this.a.start();
        }
    }

    @Override // com.spotify.music.libs.mediasession.n0
    public void stop() {
        synchronized (this.b) {
            this.a.stop();
        }
    }
}
