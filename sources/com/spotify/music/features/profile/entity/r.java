package com.spotify.music.features.profile.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.profile.entity.toolbar.ProfileToolbarMenuExtensions;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* access modifiers changed from: package-private */
public class r implements s0, d0 {
    private final nr7 a;
    private final qr7 b;
    private final e0 c;
    private final jzc f;
    private final t n;
    private final c.a o;
    private final s<np7> p;
    private MobiusLoop.g<hs7, gs7> q;
    private pr7 r;

    r(s<np7> sVar, nr7 nr7, qr7 qr7, e0 e0Var, jzc jzc, t tVar, c.a aVar) {
        this.p = sVar;
        this.a = nr7;
        this.b = qr7;
        this.c = e0Var;
        this.f = jzc;
        this.n = tVar;
        this.o = aVar;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        MobiusLoop.g<hs7, gs7> gVar = this.q;
        if (gVar != null) {
            hs7 b2 = gVar.b();
            a0Var.a(com.spotify.music.spotlets.scannables.c.b(getViewUri().toString()), SpotifyIconV2.USER, false, true);
            a0Var.h(b2.d());
            if (b2.b()) {
                ProfileToolbarMenuExtensions.a(a0Var, this.n);
            }
            ProfileToolbarMenuExtensions.b(a0Var, b2, com.spotify.share.sharedata.r.h(getViewUri().toString()).build(), this.f);
            if (!b2.c().m().isEmpty()) {
                this.c.i(a0Var, getViewUri(), b2.c().m(), e.a);
            }
        }
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        pr7 pr7 = this.r;
        if (pr7 != null) {
            return pr7.e();
        }
        return null;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.o.getViewUri();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.r = this.b.b(layoutInflater, viewGroup);
        this.q = this.a.a(this.p);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<hs7, gs7> gVar = this.q;
        if (gVar != null) {
            pr7 pr7 = this.r;
            pr7.getClass();
            gVar.c(pr7);
            this.q.start();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<hs7, gs7> gVar = this.q;
        if (gVar != null) {
            gVar.stop();
            this.q.d();
        }
    }
}
