package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.music.share.v2.ShareMenuV2Fragment;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.sa;
import defpackage.ij9;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: nzc  reason: default package */
public class nzc implements jzc {
    private final c2d a;
    private final g<PlayerState> b;
    private final c8e c;
    private final a8e d;
    private final y0d e;
    private final q0d f;
    private final y g;
    private final Map<Integer, b> h = new HashMap();
    private final o0 i;
    private final ij9.b j;
    private final c k;
    private final sa l;
    private final qzc m;
    private final ShareMenuLogger n;
    private final Context o;

    public nzc(c cVar, g<PlayerState> gVar, c8e c8e, a8e a8e, y0d y0d, y yVar, q0d q0d, c2d c2d, o0 o0Var, ij9.b bVar, sa saVar, qzc qzc, ShareMenuLogger shareMenuLogger, Context context) {
        this.k = cVar;
        this.b = gVar;
        this.c = c8e;
        this.d = a8e;
        this.e = y0d;
        this.g = yVar;
        this.f = q0d;
        this.a = c2d;
        this.i = o0Var;
        this.j = bVar;
        this.l = saVar;
        this.m = qzc;
        this.n = shareMenuLogger;
        this.o = context;
    }

    private void d(rzc rzc) {
        b remove = this.h.remove(Integer.valueOf(rzc.hashCode()));
        if (remove != null) {
            remove.dispose();
        }
    }

    @Override // defpackage.jzc
    public void a(pzc pzc, rzc rzc, String str) {
        f(pzc, rzc, Collections.emptyList(), str);
    }

    @Override // defpackage.jzc
    public void b(pzc pzc, rzc rzc, List<Integer> list, int i2) {
        f(pzc, rzc, list, this.o.getString(i2));
    }

    @Override // defpackage.jzc
    public void c(pzc pzc, rzc rzc, int i2) {
        f(pzc, rzc, Collections.emptyList(), this.o.getString(i2));
    }

    public void e(rzc rzc, pzc pzc, List list, String str, u3 u3Var) {
        d(rzc);
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        String str2 = "";
        if (this.l.h()) {
            if (!(pzc.i().isPresent() || pzc.j().isPresent() || pzc.m().isPresent())) {
                fj9 fj9 = (fj9) s2.orNull();
                String d2 = fj9 != null ? fj9.d() : str2;
                fj9 fj92 = (fj9) s2.orNull();
                if (fj92 != null) {
                    str2 = MoreObjects.nullToEmpty(fj92.e());
                }
                qzc qzc = this.m;
                int i2 = ShareMenuV2Fragment.B0;
                h.e(pzc, "shareData");
                h.e(d2, "sourcePageId");
                h.e(str2, "sourcePageUri");
                h.e(rzc, "shareMenuResultListener");
                h.e(list, "excludedShareDestinationIds");
                ShareMenuV2Fragment shareMenuV2Fragment = new ShareMenuV2Fragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("share_data", pzc);
                bundle.putIntArray("excluded_destinations", d.P(list));
                bundle.putString("source_page_id", d2);
                bundle.putString("source_page_uri", str2);
                shareMenuV2Fragment.r4(bundle);
                shareMenuV2Fragment.z0 = rzc;
                shareMenuV2Fragment.A0 = qzc;
                shareMenuV2Fragment.Y4(this.k.v0(), "ShareMenuV2");
                return;
            }
        }
        z7e a2 = this.d.a(pzc.k(), (PlayerState) f3.orNull());
        fj9 fj93 = (fj9) s2.orNull();
        String d3 = fj93 != null ? fj93.d() : str2;
        fj9 fj94 = (fj9) s2.orNull();
        if (fj94 != null) {
            str2 = MoreObjects.nullToEmpty(fj94.e());
        }
        d8e a3 = this.c.a(d3, str2, str);
        l0 z = l0.z(pzc.k().g());
        z<List<o8e>> a4 = this.a.a(str, list, pzc);
        o0 o0Var = this.i;
        y0d y0d = this.e;
        y0d.getClass();
        t0d t0d = new t0d(o0Var, a2, rzc, new o0d(y0d), this.n);
        ContextMenuFragment a5 = this.f.a(this.e.a(a4, t0d, pzc, a2, a3, z, this.m), pzc.k().g());
        if (a5 != null) {
            t0d.d(a5);
            a2.c();
            this.n.a();
            return;
        }
        t0d.b(new Exception("Share ContextMenu can't be created"));
    }

    public void f(pzc pzc, rzc rzc, List<Integer> list, String str) {
        z<R> A = this.b.E().A(yyc.a);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b subscribe = s.n(A.I(1, timeUnit).C(z.z(Optional.absent())).P(), this.j.u0().e().T().A(xyc.a).I(1, timeUnit).C(z.z(Optional.absent())).P(), zyc.a).o0(this.g).subscribe(new wyc(this, rzc, pzc, list, str));
        d(rzc);
        this.h.put(Integer.valueOf(rzc.hashCode()), subscribe);
    }
}
