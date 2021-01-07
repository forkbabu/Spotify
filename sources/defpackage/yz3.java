package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler;
import com.spotify.music.libs.collection.util.o;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Collections;
import java.util.List;

/* renamed from: yz3  reason: default package */
public class yz3 implements xz3, lf3 {
    private final String a;
    private final y b;
    private final t8a c;
    private final uk9 d;
    private final t e;
    private final d f;
    private final jzc g;
    private final c h;
    private final com.spotify.music.spotlets.radio.formatlist.d i;
    private final o j;
    private final AlbumAutoPlayUrlHandler k;
    private final ny3 l;
    private final mf3 m;
    private final c04 n;
    private final tw3 o;
    private final g p;
    private final qw3 q;
    private final boolean r;
    private final boolean s;
    private final q t = new q();
    private final p u = new p();

    public yz3(boolean z, com.spotify.music.spotlets.radio.formatlist.d dVar, String str, y yVar, t8a t8a, uk9 uk9, t tVar, d dVar2, jzc jzc, o oVar, boolean z2, AlbumAutoPlayUrlHandler albumAutoPlayUrlHandler, c cVar, ny3 ny3, mf3 mf3, c04 c04, tw3 tw3, qw3 qw3, g gVar) {
        this.r = z;
        this.i = dVar;
        str.getClass();
        this.a = str;
        this.b = yVar;
        this.c = t8a;
        uk9.getClass();
        this.d = uk9;
        this.e = tVar;
        dVar2.getClass();
        this.f = dVar2;
        jzc.getClass();
        this.g = jzc;
        this.j = oVar;
        this.s = z2;
        this.k = albumAutoPlayUrlHandler;
        this.h = cVar;
        this.l = ny3;
        this.m = mf3;
        this.n = c04;
        this.o = tw3;
        this.q = qw3;
        this.p = gVar;
    }

    @Override // defpackage.xz3
    public void a() {
        this.t.c();
        this.u.a();
    }

    @Override // defpackage.lf3
    public void b(String str, String str2, String str3, String str4) {
        this.g.c(pzc.b(!TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY, str3, str4, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.d.h(str, null);
    }

    @Override // defpackage.lf3
    public void c(String str) {
        this.i.a(str);
    }

    @Override // defpackage.xz3
    public void d(s<wv3> sVar, g04 g04) {
        this.u.b(sVar.q(this.l).o0(this.b).subscribe(new tz3(this, g04), new uz3(g04)));
    }

    @Override // defpackage.lf3
    public void e(String str) {
        this.e.d(str);
    }

    @Override // defpackage.lf3
    public void f(String str) {
        this.f.a(Collections.singletonList(str), str, str);
    }

    @Override // defpackage.lf3
    public /* synthetic */ void g(String str, List list) {
        kf3.b(this, str, list);
    }

    @Override // defpackage.lf3
    public void h(String str, boolean z) {
        this.t.a(this.j.a(this.a).o0(this.b).subscribe(new vz3(this, z)));
    }

    @Override // defpackage.lf3
    public void i(String str) {
        this.o.c();
    }

    @Override // defpackage.lf3
    public void j(String str, boolean z) {
    }

    @Override // defpackage.lf3
    public void k(List<mab> list) {
        this.q.a();
        this.h.j2(list, new wz3(this));
    }

    @Override // defpackage.lf3
    public void l(String str, boolean z) {
        if (z) {
            this.c.a(str, str, true);
            this.o.a(str);
        } else {
            this.c.f(str, true);
            this.o.b(str);
        }
        this.d.b(!z, str, str);
    }

    public void m(String str, String str2) {
        this.e.d(str);
    }

    public /* synthetic */ void n(boolean z, ImmutableList immutableList) {
        if (z) {
            this.c.c((String[]) immutableList.toArray(new String[0]), this.a, true);
        } else {
            this.c.d((String[]) immutableList.toArray(new String[0]), true);
        }
        String str = this.a;
        this.d.d(!z, str, str);
    }

    public void o(g04 g04, wv3 wv3) {
        d04 d04 = (d04) g04;
        d04.f(wv3.b());
        this.p.a(wv3.b());
        this.m.I0(wv3.a());
        b91 b2 = wv3.b();
        if (this.s && this.r) {
            this.k.c(b2, new sz3(d04));
            this.n.c2();
        }
    }
}
