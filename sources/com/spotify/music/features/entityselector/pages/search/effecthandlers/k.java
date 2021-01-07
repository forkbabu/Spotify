package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.preview.v;
import defpackage.tz4;
import io.reactivex.android.schedulers.a;
import io.reactivex.w;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class k {
    public static final w<tz4, uz4> a(v vVar, vz0 vz0, qz0 qz0, nmf<uy4, f> nmf, tg0<View> tg0, cmf<f> cmf, SnackbarManager snackbarManager, dz4 dz4) {
        h.e(vVar, "previewPlayer");
        h.e(vz0, "searchviewEndpoint");
        h.e(qz0, "searchQueryBuilder");
        h.e(nmf, "addTrackAction");
        h.e(tg0, "snackbarViewProducer");
        h.e(cmf, "dismissAction");
        h.e(snackbarManager, "snackbarManager");
        h.e(dz4, "entitySelectorLogger");
        m f = i.f();
        h.e(vz0, "searchviewEndpoint");
        h.e(qz0, "searchQueryBuilder");
        f.h(tz4.c.class, new d(qz0, vz0));
        f.e(tz4.e.class, new f(vVar), a.b());
        f.e(tz4.d.class, new g(vVar), a.b());
        f.d(tz4.a.class, new h(dz4, nmf));
        h.e(tg0, "snackbarViewProducer");
        h.e(snackbarManager, "snackbarManager");
        f.e(tz4.f.class, new e(tg0, snackbarManager), a.b());
        f.b(tz4.b.class, new i(cmf));
        f.e(tz4.g.class, new j(vVar), a.b());
        return f.i();
    }
}
