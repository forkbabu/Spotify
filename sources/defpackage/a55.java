package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogActivity;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogLogger;
import com.spotify.music.freetiercommon.models.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.preview.v;
import com.spotify.rxjava2.q;
import defpackage.d42;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: a55  reason: default package */
public class a55 {
    private static final c n = ViewUris.P;
    public static final /* synthetic */ int o = 0;
    private final q a = new q();
    private final b55 b;
    private final FreeTierAllSongsDialogLogger c;
    private final y d;
    private final v e;
    private final CollectionStateProvider f;
    private final s7a g;
    private final t8a h;
    private final String i;
    private final ArrayList<a> j;
    private final String k;
    private final ExplicitContentFacade l;
    private boolean m;

    public a55(b55 b55, FreeTierAllSongsDialogLogger freeTierAllSongsDialogLogger, y yVar, r45 r45, v vVar, CollectionStateProvider collectionStateProvider, s7a s7a, t8a t8a, ExplicitContentFacade explicitContentFacade) {
        this.b = b55;
        this.c = freeTierAllSongsDialogLogger;
        this.d = yVar;
        FreeTierAllSongsDialogActivity freeTierAllSongsDialogActivity = (FreeTierAllSongsDialogActivity) r45;
        this.i = freeTierAllSongsDialogActivity.W0();
        this.j = freeTierAllSongsDialogActivity.a1();
        this.k = freeTierAllSongsDialogActivity.X0();
        this.f = collectionStateProvider;
        this.g = s7a;
        this.h = t8a;
        this.e = vVar;
        this.l = explicitContentFacade;
    }

    private String a() {
        if (!MoreObjects.isNullOrEmpty(this.i)) {
            return this.i;
        }
        return n.toString();
    }

    private void m(a aVar) {
        if (!this.m || !aVar.isExplicit()) {
            String previewId = aVar.getPreviewId();
            if (!MoreObjects.isNullOrEmpty(previewId)) {
                this.e.i(previewId, com.spotify.music.features.followfeed.c.a(aVar));
                return;
            }
            return;
        }
        this.l.e(aVar.getUri(), a());
    }

    public io.reactivex.v b(t45 t45) {
        s<Map<String, CollectionStateProvider.a>> sVar;
        List<a> d2 = t45.d();
        if (d2.isEmpty()) {
            sVar = s.i0(Collections.emptyMap());
        } else {
            int size = d2.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = d2.get(i2).getUri();
            }
            sVar = this.f.b(n.toString(), a(), strArr);
        }
        return sVar.j0(new x45(t45));
    }

    public void c(t45 t45) {
        boolean e2 = t45.e();
        this.m = e2;
        ((FreeTierAllSongsDialogActivity) this.b).n1(e2);
        ((FreeTierAllSongsDialogActivity) this.b).f1(true);
        ((FreeTierAllSongsDialogActivity) this.b).o1(t45.c());
        b55 b55 = this.b;
        List<a> d2 = t45.d();
        ArrayList arrayList = new ArrayList(d2.size());
        HashSet hashSet = new HashSet();
        for (a aVar : d2) {
            if (!hashSet.contains(aVar.getUri())) {
                arrayList.add(aVar);
                hashSet.add(aVar.getUri());
            }
        }
        ((FreeTierAllSongsDialogActivity) b55).d1(arrayList);
        ((FreeTierAllSongsDialogActivity) this.b).b1();
    }

    public void d() {
        this.c.a();
        ((FreeTierAllSongsDialogActivity) this.b).finish();
    }

    public void e() {
        this.c.b();
        ((FreeTierAllSongsDialogActivity) this.b).finish();
    }

    public r3 f(p45 p45, b42 b42) {
        int b2 = p45.b();
        String e2 = p45.e();
        String c2 = p45.c();
        this.c.g(e2, b2);
        if (l0.z(e2).q() == LinkType.TRACK) {
            d42.f w = b42.a(e2, c2, a()).a(n).t(false).g(true).r(true).w(false);
            w.i(false);
            w.l(true);
            w.q(false);
            w.c(false);
            return w.b();
        }
        Assertion.p("Unsupported uri for building context menu. Only track and episode supported. was: " + e2);
        return null;
    }

    public void g() {
        this.a.a(s.m(s.i0(this.j), s.i0(Optional.fromNullable(this.k)), this.l.c(), v45.a).J0(new w45(this)).j0(u45.a).o0(this.d).subscribe(new y45(this), z45.a));
    }

    public void h() {
        this.a.c();
    }

    public void i(a aVar, int i2) {
        boolean m1 = aVar.m1();
        this.c.f(aVar.getUri(), i2, m1);
        if (m1) {
            this.g.b(aVar.getUri(), a(), true);
            return;
        }
        this.g.a(aVar.getUri(), a(), true);
        this.e.e(com.spotify.music.features.followfeed.c.a(aVar));
    }

    public void j(a aVar, int i2) {
        this.c.e(aVar.getUri(), i2);
        m(aVar);
    }

    public void k(a aVar, int i2) {
        boolean N1 = aVar.N1();
        this.c.h(aVar.getUri(), i2, N1);
        if (N1) {
            this.h.f(aVar.getUri(), true);
        } else {
            this.h.a(aVar.getUri(), n.toString(), true);
        }
    }

    public void l(a aVar, int i2) {
        this.c.d(aVar.getUri(), i2);
        m(aVar);
    }
}
