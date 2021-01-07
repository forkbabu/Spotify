package com.spotify.mobile.android.service.media;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.z;
import java.util.Collections;

public class c2 implements b2 {
    private final t8a a;
    private final CollectionStateProvider b;
    private final c c;
    private final p d;
    private final v e;
    private final m f;
    private final f g;
    private final ih0 h;

    public c2(t8a t8a, CollectionStateProvider collectionStateProvider, c cVar, p pVar, v vVar, m mVar, f fVar, ih0 ih0) {
        this.a = t8a;
        this.b = collectionStateProvider;
        this.c = cVar;
        this.d = pVar;
        this.e = vVar;
        this.f = mVar;
        this.g = fVar;
        this.h = ih0;
    }

    private a d(String str, boolean z) {
        if (this.f.c(str) != null) {
            return a.u(new t(this, str, z));
        }
        return this.g.a(str).N0(1).Y(new o(this, str, z));
    }

    private static boolean e(String str) {
        return l0.z(str).q() == LinkType.ARTIST;
    }

    private static boolean f(String str) {
        return l0.z(str).q() == LinkType.PLAYLIST_V2 || l0.z(str).q() == LinkType.PROFILE_PLAYLIST;
    }

    private z<Boolean> g(String str) {
        return this.d.c(Collections.singletonList(str)).A(n.a);
    }

    @Override // com.spotify.mobile.android.service.media.b2
    public a a(String str, String str2) {
        if (f(str)) {
            return g(str).t(new r(this, str));
        }
        boolean z = true;
        if (e(str)) {
            return d(str, true);
        }
        if (l0.z(str).q() != LinkType.SHOW_EPISODE) {
            z = false;
        }
        if (z) {
            return this.h.e(Collections.singletonList(str));
        }
        return a.u(new s(this, str, str2));
    }

    @Override // com.spotify.mobile.android.service.media.b2
    public z<Boolean> b(String str) {
        if (f(str)) {
            return g(str);
        }
        if (!e(str)) {
            return this.b.a(this.c.toString(), str, str).A(new q(str));
        }
        j c2 = this.f.c(str);
        if (c2 != null) {
            return z.z(Boolean.valueOf(c2.g()));
        }
        return this.g.a(str).T().s(new k(this));
    }

    @Override // com.spotify.mobile.android.service.media.b2
    public a c(String str) {
        if (f(str)) {
            return g(str).t(new l(this, str));
        }
        boolean z = false;
        if (e(str)) {
            return d(str, false);
        }
        if (l0.z(str).q() == LinkType.SHOW_EPISODE) {
            z = true;
        }
        if (z) {
            return this.h.c(Collections.singletonList(str));
        }
        return a.u(new u(this, str));
    }

    public /* synthetic */ e h(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return b.a;
        }
        return this.e.c(str);
    }

    public /* synthetic */ void i(String str, String str2) {
        this.a.a(str, (String) MoreObjects.firstNonNull(str2, "unknown_context_in_external_integration_service"), false);
    }

    public void j(String str, boolean z) {
        this.f.e(str, z);
    }

    public void k(j jVar, String str, boolean z) {
        this.f.g(jVar);
        this.f.e(str, z);
    }

    public /* synthetic */ void l(j jVar) {
        this.f.g(jVar);
    }

    public /* synthetic */ void m(String str) {
        this.a.f(str, false);
    }

    public /* synthetic */ e n(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return this.e.d(str);
        }
        return b.a;
    }
}
