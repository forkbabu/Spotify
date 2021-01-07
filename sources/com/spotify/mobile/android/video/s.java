package com.spotify.mobile.android.video;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.video.events.c0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.tracking.h;
import com.spotify.mobile.android.video.tracking.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.y;

public class s {
    private final Context a;
    private final cqe b;
    private final h c;
    private final o d;
    private final Handler e;
    private final y f;
    private VideoSurfaceView g;
    private l0 h;
    private List<f0> i = new ArrayList();
    private String j;
    private boolean k;
    private u l;
    private List<c72> m = new ArrayList(0);
    private g0 n;
    private BetamaxOfflineManager o;
    private final q72 p;

    public s(Context context, y yVar, q72 q72, cqe cqe, Handler handler, h hVar, o oVar) {
        this.a = context;
        this.f = yVar;
        this.p = q72;
        this.b = cqe;
        this.e = handler;
        this.c = hVar;
        this.d = oVar;
    }

    public r a() {
        boolean z = true;
        MoreObjects.checkState(!MoreObjects.isNullOrEmpty(this.j), "Feature identifier must be specified");
        this.n.getClass();
        this.f.getClass();
        boolean z2 = this.g == null;
        if (this.h != null) {
            z = false;
        }
        MoreObjects.checkState(z2 ^ z, "Either a VideoSurfaceView or a VideoSurfaceManager must be specified");
        l0 l0Var = this.h;
        if (l0Var == null) {
            l0Var = new l0();
            l0Var.e(this.g);
        }
        ArrayList arrayList = new ArrayList(this.i);
        arrayList.add(this.c);
        arrayList.add(this.d);
        return new t(this.a, this.f, new c0(Collections.unmodifiableList(arrayList), this.e, this.b), l0Var, this.j, this.k, this.l, null, this.m, this.p, this.n, this.o);
    }

    public s b(BetamaxOfflineManager betamaxOfflineManager) {
        this.o = betamaxOfflineManager;
        return this;
    }

    public s c(List<f0> list) {
        this.i = new ArrayList(list);
        return this;
    }

    public s d(String str) {
        this.j = str;
        return this;
    }

    public s e(List<c72> list) {
        this.m = new ArrayList(list);
        return this;
    }

    public s f(g0 g0Var) {
        this.n = g0Var;
        return this;
    }

    public s g(boolean z) {
        this.k = z;
        return this;
    }

    public s h(u uVar) {
        this.l = uVar;
        return this;
    }

    public s i(l0 l0Var) {
        this.h = l0Var;
        return this;
    }

    public s j(VideoSurfaceView videoSurfaceView) {
        this.g = videoSurfaceView;
        return this;
    }
}
