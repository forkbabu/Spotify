package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.common.collect.Collections2;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.android.glue.patterns.toolbarmenu.w;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.mobile.android.util.x;
import com.spotify.music.promodisclosure.impl.e;
import com.spotify.ubi.specification.factories.s0;
import java.util.List;

/* renamed from: if3  reason: default package */
public class if3 {
    private final com.spotify.music.spotlets.scannables.c a;
    private final h0 b;
    private final lf3 c;
    private final Context d;
    private final com.spotify.music.libs.viewuri.c e;
    private final bre f;
    private final s0 g;

    /* renamed from: if3$a */
    class a implements w {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.w
        public void a() {
            if3.this.c.j(this.a, !this.b);
        }
    }

    /* renamed from: if3$b */
    class b implements w {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.w
        public void a() {
            if3.this.c.f(this.a);
        }
    }

    /* renamed from: if3$c */
    class c implements w {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.w
        public void a() {
            if3.this.c.h(this.a, !this.b);
        }
    }

    public if3(com.spotify.music.libs.viewuri.c cVar, Context context, h0 h0Var, lf3 lf3, com.spotify.music.spotlets.scannables.c cVar2, bre bre) {
        this.e = cVar;
        this.d = context;
        h0Var.getClass();
        this.b = h0Var;
        lf3.getClass();
        this.c = lf3;
        this.a = cVar2;
        this.f = bre;
        this.g = new s0(cVar.toString());
    }

    public /* synthetic */ void b(String str, View view) {
        this.c.i(str);
    }

    public /* synthetic */ void c(String str, boolean z) {
        this.c.l(str, !z);
    }

    public /* synthetic */ void d(List list) {
        this.c.k(list);
    }

    public /* synthetic */ void e(String str) {
        this.c.e(str);
    }

    public /* synthetic */ void f(String str) {
        this.c.c(str);
    }

    public /* synthetic */ void g(String str) {
        e.a(this.d, str, this.f, this.g.c().a(str));
    }

    public /* synthetic */ void h(String str, String str2, String str3, String str4) {
        this.c.b(str, str2, str3, str4);
    }

    public /* synthetic */ void i(String str, String str2, String str3) {
        ShortcutInstallerService.a(this.d, str, str2, str3, this.e);
    }

    public /* synthetic */ void j(String str, String str2) {
        this.c.g(str, Collections2.newArrayList(str2));
    }

    public void k(String str, a0 a0Var, jf3 jf3, of3 of3) {
        String d2 = jf3.d();
        if (d2 == null) {
            d2 = of3.j().name();
        }
        String f2 = jf3.f();
        String str2 = f2 != null ? f2 : str;
        String str3 = (String) x.n(jf3.h(), of3.n());
        String str4 = (String) x.n(jf3.g(), "");
        String str5 = (String) x.n(jf3.c(), "");
        String str6 = (String) x.n(jf3.e(), "");
        List<mab> b2 = jf3.b();
        a0Var.a(this.a.a(d2, str2, true), of3.j(), false, true);
        a0Var.h(str3);
        a0Var.i(str4);
        boolean k = jf3.k();
        a0Var.g(new xe3(this, str5));
        df3 df3 = new df3(this, str, k);
        if (of3.m()) {
            this.b.h(a0Var, k, df3);
            this.b.b(a0Var, k, df3);
        } else {
            this.b.a(a0Var, k, df3);
            this.b.j(a0Var, k, df3);
        }
        if (of3.e()) {
            boolean j = jf3.j();
            this.b.f(a0Var, j, of3.l(), new a(str, j));
        }
        if (of3.f()) {
            if (b2.size() > 1) {
                this.b.g(a0Var, new ff3(this, b2));
            } else if (!str5.isEmpty()) {
                this.b.d(a0Var, new ye3(this, str5));
            }
        }
        if (of3.g()) {
            this.b.m(a0Var, str, new bf3(this, str));
        }
        if (of3.c()) {
            this.b.i(a0Var, new b(str));
        }
        if (of3.i()) {
            boolean i = jf3.i();
            this.b.c(a0Var, i, new c(str, i));
        }
        if (of3.d()) {
            this.b.n(a0Var, new af3(this, str));
        }
        this.b.p(a0Var, new ef3(this, str2, d2, str3, str4));
        if (of3.b()) {
            this.b.e(a0Var, new ze3(this, str, str3, d2));
        }
        if (of3.h() && !TextUtils.isEmpty(str6)) {
            this.b.o(a0Var, new cf3(this, str, str6));
        }
    }
}
