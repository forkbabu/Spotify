package com.spotify.music.libs.mediabrowserservice;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.m;
import dagger.android.a;
import java.util.List;

public class SpotifyMediaBrowserService extends b implements h3 {
    g3 q;
    m r;
    protected f3 s;

    @Override // androidx.media.b
    public b.C0034b e(String str, int i, Bundle bundle) {
        ClientIdentity clientIdentity;
        f3 f3Var = this.s;
        try {
            this.r.getClass();
            clientIdentity = ClientIdentity.b(this, i);
        } catch (ClientIdentity.ValidationException unused) {
            Logger.d("Cannot validate calling identity", new Object[0]);
            clientIdentity = null;
        }
        return f3Var.j(str, i, bundle, clientIdentity);
    }

    @Override // androidx.media.b
    public void f(String str, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        this.s.l(str, Bundle.EMPTY, jVar);
    }

    @Override // androidx.media.b
    public void g(String str, b.j<List<MediaBrowserCompat.MediaItem>> jVar, Bundle bundle) {
        this.s.l(str, bundle, jVar);
    }

    @Override // androidx.media.b
    public void i(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        this.s.m(str, bundle, jVar);
    }

    @Override // androidx.media.b, android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
        f3 b = this.q.b(this);
        this.s = b;
        b.h();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.s.i();
        super.onDestroy();
    }

    @Override // androidx.media.b, com.spotify.music.libs.mediabrowserservice.h3
    public void r(MediaSessionCompat.Token token) {
        if (c() == null && token != null) {
            super.r(token);
        }
    }
}
