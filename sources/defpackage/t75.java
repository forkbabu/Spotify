package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.datasource.a0;
import com.spotify.music.features.freetierartist.datasource.v;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.formatlist.d;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

/* renamed from: t75  reason: default package */
public class t75 implements lf3 {
    private final a0 a;
    private final y b;
    private final i65 c;
    private final uk9 d;
    private final jzc e;
    private final vka f;
    private final d g;
    private final n85 h;
    private final mf3 i;
    private final m75 j;
    private final g k;
    private jf3 l;
    private b m;

    public t75(n85 n85, d dVar, a0 a0Var, y yVar, i65 i65, uk9 uk9, m75 m75, jzc jzc, vka vka, mf3 mf3, g gVar) {
        this.h = n85;
        this.g = dVar;
        a0Var.getClass();
        this.a = a0Var;
        this.b = yVar;
        i65.getClass();
        this.c = i65;
        this.j = m75;
        uk9.getClass();
        this.d = uk9;
        jzc.getClass();
        this.e = jzc;
        this.f = vka;
        this.i = mf3;
        this.k = gVar;
    }

    public static void a(t75 t75, v vVar) {
        t75.h.e(vVar.b());
        t75.l = vVar.a();
        t75.i.I0(vVar.a());
        t75.k.a(vVar.b());
    }

    @Override // defpackage.lf3
    public void b(String str, String str2, String str3, String str4) {
        this.e.c(pzc.b(!TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY, str3, str4, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.d.h(str, null);
    }

    @Override // defpackage.lf3
    public void c(String str) {
        this.g.a(str);
    }

    public /* synthetic */ void d(Throwable th) {
        this.h.d();
    }

    @Override // defpackage.lf3
    public void e(String str) {
    }

    @Override // defpackage.lf3
    public void f(String str) {
    }

    @Override // defpackage.lf3
    public void g(String str, List<String> list) {
        this.f.b(c.a(str), str, list);
    }

    @Override // defpackage.lf3
    public /* synthetic */ void h(String str, boolean z) {
        kf3.a(this, str, z);
    }

    @Override // defpackage.lf3
    public void i(String str) {
        this.j.b(str);
    }

    @Override // defpackage.lf3
    public void j(String str, boolean z) {
        this.a.f(str, z);
        if (z) {
            this.c.a();
        }
        this.d.a(!z, str, str);
    }

    @Override // defpackage.lf3
    public void k(List<mab> list) {
    }

    @Override // defpackage.lf3
    public void l(String str, boolean z) {
        this.a.g(str, z);
        jf3 jf3 = this.l;
        String h2 = jf3 != null ? jf3.h() : "";
        if (z) {
            this.j.c(str);
            this.c.b(h2);
        } else {
            this.j.d(str);
            this.c.c(h2);
        }
        this.d.b(!z, str, str);
    }

    public void m(s<v> sVar) {
        this.m = sVar.o0(this.b).subscribe(new s75(this), new r75(this));
    }

    public void n() {
        b bVar = this.m;
        if (bVar != null && !bVar.d()) {
            this.m.dispose();
            this.m = null;
        }
    }
}
