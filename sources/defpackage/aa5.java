package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.C0707R;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Collections;
import java.util.List;

/* renamed from: aa5  reason: default package */
public class aa5 implements lf3 {
    private final CollectionStateProvider a;
    private final s7a b;
    private final t8a c;
    private final uk9 d;
    private final c e;
    private final y f;
    private final ga5 g;
    private final t h;
    private final d i;
    private final jzc j;
    private final jrd k;
    private final lac l;
    private final t9c m;
    private final v9c n;
    private final nsb o;
    private final g<PlayerState> p;
    private final com.spotify.music.libs.viewartistscontextmenu.ui.c q;
    private final q r = new q();
    private final i95 s;
    private final SnackbarManager t;
    private b91 u;
    private SnackbarConfiguration v;
    private boolean w;
    private String x;
    private Uri y;

    public aa5(CollectionStateProvider collectionStateProvider, s7a s7a, t8a t8a, uk9 uk9, c cVar, ga5 ga5, t tVar, d dVar, jzc jzc, y yVar, nsb nsb, jrd jrd, lac lac, t9c t9c, v9c v9c, SnackbarManager snackbarManager, g<PlayerState> gVar, com.spotify.music.libs.viewartistscontextmenu.ui.c cVar2, i95 i95) {
        collectionStateProvider.getClass();
        this.a = collectionStateProvider;
        s7a.getClass();
        this.b = s7a;
        this.c = t8a;
        uk9.getClass();
        this.d = uk9;
        cVar.getClass();
        this.e = cVar;
        this.f = yVar;
        this.g = ga5;
        tVar.getClass();
        this.h = tVar;
        dVar.getClass();
        this.i = dVar;
        jzc.getClass();
        this.j = jzc;
        nsb.getClass();
        this.o = nsb;
        jrd.getClass();
        this.k = jrd;
        this.l = lac;
        t9c.getClass();
        this.m = t9c;
        this.n = v9c;
        snackbarManager.getClass();
        this.t = snackbarManager;
        this.p = gVar;
        this.q = cVar2;
        this.s = i95;
    }

    public /* synthetic */ v a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return this.g.f(str);
        }
        return this.g.e(str);
    }

    @Override // defpackage.lf3
    public void b(String str, String str2, String str3, String str4) {
        this.j.c(pzc.e(str2, str3, str4, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.d.h(str, null);
    }

    @Override // defpackage.lf3
    public void c(String str) {
    }

    public void d(String str, ContextTrack contextTrack) {
        Logger.b("Current PlayerTrack: %s", contextTrack.uri());
        if (contextTrack.uri().equals(str)) {
            this.o.a();
            return;
        }
        this.t.show(this.v);
        this.m.a(this.e.toString());
    }

    @Override // defpackage.lf3
    public void e(String str) {
        this.h.d(str);
    }

    @Override // defpackage.lf3
    public void f(String str) {
        this.i.a(Collections.singletonList(str), this.e.toString(), str);
    }

    @Override // defpackage.lf3
    public /* synthetic */ void g(String str, List list) {
        kf3.b(this, str, list);
    }

    @Override // defpackage.lf3
    public /* synthetic */ void h(String str, boolean z) {
        kf3.a(this, str, z);
    }

    @Override // defpackage.lf3
    public void i(String str) {
    }

    @Override // defpackage.lf3
    public void j(String str, boolean z) {
        if (!z) {
            this.b.b(str, str, true);
        } else {
            this.b.a(str, str, true);
        }
        this.d.a(!z, str, str);
    }

    @Override // defpackage.lf3
    public void k(List<mab> list) {
        this.s.a();
        this.q.j2(list, new v95(this));
    }

    @Override // defpackage.lf3
    public void l(String str, boolean z) {
        if (!z) {
            this.c.f(str, true);
        } else {
            this.c.a(str, str, true);
        }
        this.d.b(!z, str, str);
    }

    public void m(String str, String str2) {
        this.h.d(str);
    }

    public void n(ma5 ma5, mf3 mf3, String str, Uri uri, u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        this.u = f3;
        ((ka5) ma5).f(f3);
        mf3.I0(u3Var.b);
        if (this.w) {
            String str2 = this.x;
            q qVar = this.r;
            lac lac = this.l;
            F f4 = u3Var.a;
            f4.getClass();
            qVar.a(lac.a(f4, str, str2, uri).subscribe(new s95(str), z95.a));
        }
    }

    public void o(ma5 ma5, mf3 mf3, String str, Uri uri, String str2, SnackbarConfiguration snackbarConfiguration) {
        s<R> sVar;
        s<Boolean> sVar2;
        ma5.getClass();
        mf3.getClass();
        str.getClass();
        snackbarConfiguration.getClass();
        this.v = snackbarConfiguration;
        if (this.u == null) {
            ((ka5) ma5).c();
        }
        this.x = str2;
        this.y = uri;
        v9c v9c = this.n;
        v9c.getClass();
        boolean z = !TextUtils.isEmpty(str2) && v9c.c(str2);
        this.w = z;
        if (z) {
            this.n.a();
            q qVar = this.r;
            g<PlayerState> gVar = this.p;
            qVar.a(je.Z(gVar, gVar).Q(hac.a).Q(new jac(this.e.toString())).Q(iac.a).j0(kac.a).Q(aac.a).j0(bac.a).Q(gac.a).N0(1).o0(this.f).subscribe(new r95(this, str), new u95(ma5)));
        }
        q qVar2 = this.r;
        b91 b91 = this.u;
        if (b91 != null) {
            sVar = s.i0(b91);
        } else {
            String str3 = this.x;
            Uri uri2 = this.y;
            if (this.w) {
                sVar2 = this.k.b(str, str3, uri2).P();
            } else {
                sVar2 = s.i0(Boolean.FALSE);
            }
            sVar = sVar2.W(new x95(this, str), false, Integer.MAX_VALUE);
        }
        qVar2.a(s.n(sVar, this.a.b(this.e.toString(), str, str), new w95(str)).o0(this.f).subscribe(new t95(this, ma5, mf3, str, uri), new y95(ma5)));
    }

    public void p() {
        this.n.b();
        this.r.c();
    }
}
