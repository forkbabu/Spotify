package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.o2;
import com.spotify.music.libs.mediasession.i0;
import com.spotify.music.libs.mediasession.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class h2 implements o2.a {
    private final o2 a;
    private final q2 b;
    private final x2 c;
    private final Set<u1> d;
    private final m0 e;

    public interface a {
        void a();

        void b(n2 n2Var);
    }

    public h2(m0 m0Var, o2 o2Var, q2 q2Var, x2 x2Var, Set<u1> set) {
        this.e = m0Var;
        this.b = q2Var;
        this.a = o2Var;
        this.c = x2Var;
        this.d = set;
    }

    private void i() {
        if (((ArrayList) this.a.f()).isEmpty()) {
            this.e.b(null);
            this.b.v(false);
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry<String, n2> entry : this.a.g()) {
            if (entry.getValue() != null) {
                i0 g = entry.getValue().g();
                z |= g.b();
                z3 |= g.c();
                z2 |= g.a();
            }
        }
        Logger.b("SpotifyMediaBrowserService override policy: playbackState and metadata %b, callbacks %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.e.b(new i3(z, z3, z2));
    }

    private void j() {
        Iterator it = ((ArrayList) this.a.f()).iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n2 n2Var = (n2) it.next();
            boolean b2 = n2Var.g().b();
            if (b2) {
                if (!this.c.a()) {
                    this.c.f(n2Var.j());
                }
                z = b2;
            } else {
                z = b2;
            }
        }
        if (!z && this.c.a()) {
            this.c.g();
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.o2.a
    public void a(MediaSessionCompat mediaSessionCompat) {
        j();
        if (!this.b.u()) {
            mediaSessionCompat.l(this.b);
            this.b.v(true);
        }
        i();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.o2.a
    public void b() {
        j();
        i();
    }

    public void c(v1 v1Var) {
        this.a.b(v1Var, this);
    }

    public void d(String str, MediaSessionCompat mediaSessionCompat, RootHintsParams rootHintsParams) {
        this.a.c(str, mediaSessionCompat, rootHintsParams);
    }

    public void e() {
        this.a.d();
        this.b.t();
    }

    public n2 f() {
        return this.a.h();
    }

    public b.C0034b g(String str) {
        String str2;
        Iterator<u1> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            u1 next = it.next();
            if (next.d(str)) {
                str2 = s1.a(str, next.b());
                break;
            }
        }
        if (str2 == null) {
            return null;
        }
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.p(Boolean.TRUE);
        aVar.f(2);
        aVar.e(1);
        aVar.c(true);
        return new b.C0034b(str2, aVar.b());
    }

    public void h(String str, a aVar) {
        this.a.a(str, aVar);
    }
}
