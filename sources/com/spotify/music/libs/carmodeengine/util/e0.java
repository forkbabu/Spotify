package com.spotify.music.libs.carmodeengine.util;

import android.os.Build;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.libs.carmodeengine.util.b0;
import io.reactivex.disposables.a;
import io.reactivex.s;

public class e0 implements d {
    private final c0 a;
    private final j4a b;
    private final k5a c;
    private final c6a f;
    private final g0 n;
    private final a o = new a();
    private final b0.a p;

    public e0(c0 c0Var, j4a j4a, k5a k5a, c6a c6a, g0 g0Var) {
        b0.a i = b0.a.i();
        this.p = i;
        this.a = c0Var;
        this.b = j4a;
        this.c = k5a;
        this.f = c6a;
        this.n = g0Var;
        i.a(Build.VERSION.SDK_INT);
    }

    public static void a(e0 e0Var, d7a d7a) {
        b0.a aVar = e0Var.p;
        aVar.f(d7a);
        aVar.g(SpotifyLocale.e());
        ((d0) e0Var.a).a(aVar.d());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        a aVar = this.o;
        s<Boolean> b2 = this.b.b();
        b0.a aVar2 = this.p;
        aVar2.getClass();
        s<Boolean> a2 = this.n.a();
        b0.a aVar3 = this.p;
        aVar3.getClass();
        s<Boolean> f2 = this.f.f();
        b0.a aVar4 = this.p;
        aVar4.getClass();
        s<Boolean> e = this.f.e();
        b0.a aVar5 = this.p;
        aVar5.getClass();
        s<y6a> b3 = this.f.b();
        b0.a aVar6 = this.p;
        aVar6.getClass();
        aVar.e(b2.subscribe(new m(aVar2)), a2.subscribe(new n(aVar3)), f2.subscribe(new b(aVar4)), e.subscribe(new a(aVar5)), b3.subscribe(new r(aVar6)), this.c.e().subscribe(new l(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.o.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "CarModeStateLogger";
    }
}
