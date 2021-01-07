package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.s;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.z1;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.h2;
import com.spotify.music.libs.mediabrowserservice.q1;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

public class f3 {
    private final Context a;
    private final MediaSessionCompat b;
    private final z1 c;
    private final h2 d;
    private final h3 e;
    private final pc1 f;
    private final b g = new b(null);
    private final vja h;
    private final x1 i;
    private final f2 j;
    private Runnable k;
    private boolean l;

    class a implements h2.a {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;
        final /* synthetic */ b.j c;

        a(f3 f3Var, String str, Bundle bundle, b.j jVar) {
            this.a = str;
            this.b = bundle;
            this.c = jVar;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.h2.a
        public void a() {
            this.c.g(r1.p);
        }

        @Override // com.spotify.music.libs.mediabrowserservice.h2.a
        public void b(n2 n2Var) {
            n2Var.b(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: private */
    public final class b implements hg0<v1> {
        b(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(v1 v1Var) {
            v1 v1Var2 = v1Var;
            Logger.l("SpotifyMediaBrowserService.onServiceConnected", new Object[0]);
            if (f3.this.k != null) {
                f3.this.k.run();
                f3.this.k = null;
                return;
            }
            f3.this.d.c(v1Var2);
            f3.this.e.r(f3.this.b.f());
            if (!f3.this.b.h()) {
                f3.this.b.k(true);
                f3.f(f3.this);
            }
            f3.g(f3.this);
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
            Logger.l("SpotifyMediaBrowserService.onServiceDisconnected", new Object[0]);
            f3.this.i();
            f3.this.e.stopSelf();
        }
    }

    public f3(Context context, MediaSessionCompat mediaSessionCompat, z1 z1Var, h2 h2Var, vja vja, pc1 pc1, y1 y1Var, h3 h3Var, f2 f2Var) {
        this.a = context;
        this.b = mediaSessionCompat;
        this.c = z1Var;
        this.d = h2Var;
        this.h = vja;
        this.f = pc1;
        this.e = h3Var;
        this.i = y1Var.b(mediaSessionCompat, h3Var);
        this.j = f2Var;
    }

    static void f(f3 f3Var) {
        f3Var.getClass();
        PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
        bVar.g(8, 0, 0.0f);
        bVar.c(141312);
        f3Var.b.p(bVar.b());
    }

    static void g(f3 f3Var) {
        f3Var.b.w(f3Var.h.a(f3Var.a, ViewUris.d.toString(), null));
    }

    public static void k(f3 f3Var) {
        f3Var.c.j();
        f3Var.c.q(f3Var.g);
    }

    public void h() {
        if (!this.c.l() && !this.c.m()) {
            this.c.p(this.g);
            this.c.i();
            this.i.d();
        }
    }

    public void i() {
        if (!this.l) {
            this.l = true;
            this.i.a();
            this.d.e();
            if (!this.c.l() && !this.c.m()) {
                return;
            }
            if (this.c.m()) {
                this.k = new d1(this);
                return;
            }
            this.c.j();
            this.c.q(this.g);
        }
    }

    public b.C0034b j(String str, int i2, Bundle bundle, ClientIdentity clientIdentity) {
        boolean z = true;
        Logger.b("onGetRoot clientPackageName=%s", str);
        if (this.l) {
            h();
            this.l = false;
        }
        String a2 = this.j.a(str, i2, bundle, clientIdentity);
        if (a2 == null) {
            Logger.d("onGetRoot: IGNORING request from untrusted package %s", str);
            this.f.b(str);
            return null;
        }
        h2 h2Var = this.d;
        MediaSessionCompat mediaSessionCompat = this.b;
        String b2 = bundle != null && bundle.containsKey("android.service.media.extra.SUGGESTED") ? s.b(bundle) : "default";
        String string = bundle != null ? bundle.getString("com.spotify.music.extra.CLIENT_ID", null) : null;
        String string2 = bundle != null ? bundle.getString("com.spotify.music.extra.VERSION", null) : null;
        if (bundle == null || !bundle.containsKey("android.service.media.extra.RECENT")) {
            z = false;
        }
        RootHintsParams.Mode mode = RootHintsParams.Mode.NONE;
        RootHintsParams.Mode mode2 = (bundle != null && bundle.getBoolean("android.media.browse.ASSISTANT_DRIVING_MODE", false)) ? RootHintsParams.Mode.DRIVING : mode;
        q1.b bVar = (q1.b) RootHintsParams.b();
        bVar.c(string);
        bVar.b(b2);
        bVar.f(string2);
        bVar.a(false);
        bVar.d(mode);
        q1.b bVar2 = new q1.b((q1) bVar.build(), null);
        bVar2.e(z);
        bVar2.d(mode2);
        h2Var.d(a2, mediaSessionCompat, bVar2.build());
        return this.d.g(a2);
    }

    public void l(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        jVar.a();
        if (str == null) {
            jVar.g(r1.p);
        } else {
            this.d.h(str, new a(this, str, bundle, jVar));
        }
    }

    public void m(String str, Bundle bundle, b.j<List<MediaBrowserCompat.MediaItem>> jVar) {
        jVar.a();
        n2 f2 = this.d.f();
        if (f2 != null) {
            f2.f(str, bundle, new p(jVar));
        } else {
            jVar.g(null);
        }
    }
}
