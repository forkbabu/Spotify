package com.spotify.music.superbird.setup.domain;

import com.spotify.mobile.android.util.connectivity.e0;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.connection.l;
import com.spotify.music.superbird.setup.m;
import com.spotify.superbird.ota.model.h;
import io.reactivex.g;
import io.reactivex.s;

public final class n implements g {
    private final s<Boolean> a;
    private final l b;
    private final g<h> c;
    private final g<ooe> d;
    private final e0 e;
    private final vne f;
    private final m g;

    public n(s<Boolean> sVar, l lVar, g<h> gVar, g<ooe> gVar2, e0 e0Var, vne vne, m mVar) {
        kotlin.jvm.internal.h.e(sVar, "superbirdConnected");
        kotlin.jvm.internal.h.e(lVar, "connectionState");
        kotlin.jvm.internal.h.e(gVar, "updatableItemFlowable");
        kotlin.jvm.internal.h.e(gVar2, "otaEventFlowable");
        kotlin.jvm.internal.h.e(e0Var, "connectionTypeObservable");
        kotlin.jvm.internal.h.e(vne, "superbirdOtaDownloadManager");
        kotlin.jvm.internal.h.e(mVar, "uiEventDelegate");
        this.a = sVar;
        this.b = lVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = e0Var;
        this.f = vne;
        this.g = mVar;
    }

    public q<f> b() {
        s<R> j0 = this.a.j0(m.a);
        kotlin.jvm.internal.h.d(j0, "superbirdConnected.map {…rdConnected(it)\n        }");
        s<R> j02 = this.b.b().j0(i.a);
        kotlin.jvm.internal.h.d(j02, "connectionState.isOnline…tateChanged(it)\n        }");
        s<R> j03 = this.e.b().j0(j.a);
        kotlin.jvm.internal.h.d(j03, "connectionTypeObservable…TION_TYPE_WLAN)\n        }");
        g<h> gVar = this.c;
        g<ooe> gVar2 = this.d;
        q<f> a2 = i.a(this.g.a(), j0, j02, j03, je.Z(gVar, gVar).j0(new h(this)), je.Z(gVar2, gVar2).Q(k.a).j0(l.a));
        kotlin.jvm.internal.h.d(a2, "RxEventSources.fromObser…    otaEvents()\n        )");
        return a2;
    }
}
