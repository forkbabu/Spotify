package com.spotify.music.features.followfeed.entrypoint;

import com.spotify.music.features.followfeed.persistence.k;
import com.spotify.music.libs.followfeed.entrypoint.a;
import com.spotify.music.libs.followfeed.entrypoint.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import defpackage.t25;
import defpackage.u25;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class FollowFeedButtonManagerImpl implements a {
    private b a;
    private final p b = new p();
    private final y c;
    private final t d;
    private final c25 e;
    private final com.spotify.music.features.followfeed.persistence.a f;
    private final k g;

    public FollowFeedButtonManagerImpl(y yVar, t tVar, c25 c25, com.spotify.music.features.followfeed.persistence.a aVar, k kVar) {
        h.e(yVar, "mainScheduler");
        h.e(tVar, "navigator");
        h.e(c25, "eventLogger");
        h.e(aVar, "cacheManager");
        h.e(kVar, "newItemsStateRepository");
        this.c = yVar;
        this.d = tVar;
        this.e = c25;
        this.f = aVar;
        this.g = kVar;
    }

    public static final void a(FollowFeedButtonManagerImpl followFeedButtonManagerImpl, boolean z) {
        followFeedButtonManagerImpl.e.c(new t25.b(z));
    }

    public static final void b(FollowFeedButtonManagerImpl followFeedButtonManagerImpl, boolean z) {
        b bVar = followFeedButtonManagerImpl.a;
        if (bVar != null) {
            bVar.setBadged(z);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    public void c() {
        String cVar = ViewUris.e.toString();
        h.d(cVar, "ViewUris.FOLLOWFEED.toString()");
        this.e.b(u25.c.a);
        this.d.d(cVar);
    }

    public void d(b bVar) {
        h.e(bVar, "followFeedButtonViewBinder");
        h.d(bVar, "checkNotNull(followFeedButtonViewBinder)");
        this.a = bVar;
        this.f.d();
        this.b.b(this.g.c().o0(this.c).s0(Boolean.FALSE).N(new a(new FollowFeedButtonManagerImpl$onViewAvailable$1(this))).subscribe(new a(new FollowFeedButtonManagerImpl$onViewAvailable$2(this))));
    }

    public void e() {
        this.b.a();
    }
}
