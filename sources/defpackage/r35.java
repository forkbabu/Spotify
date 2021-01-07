package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.mobius.d;
import com.spotify.music.features.followfeed.mobius.i;
import com.spotify.music.features.followfeed.mobius.k;
import com.spotify.music.features.followfeed.persistence.a;
import com.spotify.pageloader.z0;
import defpackage.a35;
import kotlin.jvm.internal.h;

/* renamed from: r35  reason: default package */
public final class r35 implements z0 {
    private b61 a;
    private MobiusLoop.g<r25, o25> b;
    private u15 c;
    private View f;
    private final Activity n;
    private final w51 o;
    private final d p;
    private final i q;
    private final a r;
    private final b s;
    private final d25 t;
    private final r25 u;
    private final Runnable v;

    public r35(Activity activity, w51 w51, d dVar, i iVar, a aVar, b bVar, d25 d25, r25 r25, Runnable runnable) {
        h.e(activity, "activity");
        h.e(w51, "hubsConfig");
        h.e(dVar, "followFeedLoopFactory");
        h.e(iVar, "followFeedViewDataMapper");
        h.e(aVar, "cacheManager");
        h.e(bVar, "eventDispatcher");
        h.e(d25, "logger");
        h.e(r25, "feedModelWithData");
        h.e(runnable, "closeFragmentAction");
        this.n = activity;
        this.o = w51;
        this.p = dVar;
        this.q = iVar;
        this.r = aVar;
        this.s = bVar;
        this.t = d25;
        this.u = r25;
        this.v = runnable;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        b61 b61 = this.a;
        if (b61 != null) {
            bundle.setClassLoader(b61.class.getClassLoader());
            b61.i(bundle.getParcelable("feed-state"));
            u15 u15 = this.c;
            if (u15 != null) {
                u15.Q();
            } else {
                h.k("followFeedViewBinder");
                throw null;
            }
        } else {
            h.k("hubsPresenter");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        b61 b61 = this.a;
        if (b61 != null) {
            bundle.putParcelable("feed-state", b61.j());
            if (this.r.f()) {
                this.r.d();
                return bundle;
            }
            a aVar = this.r;
            MobiusLoop.g<r25, o25> gVar = this.b;
            if (gVar != null) {
                r25 b2 = gVar.b();
                h.d(b2, "controller.model");
                aVar.a(b2);
                return bundle;
            }
            h.k("controller");
            throw null;
        }
        h.k("hubsPresenter");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        u15 u15 = new u15(this.n, viewGroup, this.v);
        this.c = u15;
        w51 w51 = this.o;
        if (u15 != null) {
            b61 b61 = new b61(w51, u15);
            this.a = b61;
            if (b61 != null) {
                u15 u152 = this.c;
                if (u152 != null) {
                    k kVar = new k(b61, u152, this.s.b());
                    MobiusLoop.g<r25, o25> d = this.p.d(this.u);
                    this.b = d;
                    if (d != null) {
                        d.c(com.spotify.mobius.extras.a.a(this.q, kVar));
                        this.t.a(a35.c.a);
                        u15 u153 = this.c;
                        if (u153 != null) {
                            this.f = u153.b();
                        } else {
                            h.k("followFeedViewBinder");
                            throw null;
                        }
                    } else {
                        h.k("controller");
                        throw null;
                    }
                } else {
                    h.k("followFeedViewBinder");
                    throw null;
                }
            } else {
                h.k("hubsPresenter");
                throw null;
            }
        } else {
            h.k("followFeedViewBinder");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<r25, o25> gVar = this.b;
        if (gVar != null) {
            gVar.start();
            this.t.a(a35.b.a);
            this.r.reset();
            return;
        }
        h.k("controller");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<r25, o25> gVar = this.b;
        if (gVar != null) {
            gVar.stop();
            this.t.a(a35.a.a);
            return;
        }
        h.k("controller");
        throw null;
    }
}
