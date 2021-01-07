package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.g1;
import kotlin.jvm.internal.h;

/* renamed from: cj5  reason: default package */
public final class cj5 implements bj5 {
    private final ere a;
    private final g1 b;

    public cj5(ere ere, g1 g1Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(g1Var, "mobileHomeEventFactory");
        this.a = ere;
        this.b = g1Var;
    }

    @Override // defpackage.bj5
    public void a() {
        this.a.a(this.b.e().c(ViewUris.d.toString(), "").b());
    }

    @Override // defpackage.bj5
    public void b() {
        this.a.a(this.b.e().c(ViewUris.d.toString(), "").a(ViewUris.b.toString()));
    }
}
