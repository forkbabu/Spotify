package defpackage;

import com.spotify.ubi.specification.factories.y2;
import kotlin.jvm.internal.h;

/* renamed from: db1  reason: default package */
public final class db1 implements cb1 {
    private final ere a;
    private final y2 b;

    public db1(ere ere, y2 y2Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(y2Var, "mobilePodcastShareInterfaceEventFactory");
        this.a = ere;
        this.b = y2Var;
    }

    @Override // defpackage.cb1
    public void a() {
        this.a.a(this.b.b().a());
    }

    @Override // defpackage.cb1
    public void b(String str) {
        h.e(str, "shareUri");
        this.a.a(this.b.c().c(str).a());
    }

    @Override // defpackage.cb1
    public void c() {
        this.a.a(this.b.c().b());
    }

    @Override // defpackage.cb1
    public void d(String str) {
        h.e(str, "shareUri");
        this.a.a(this.b.c().c(str).b());
    }
}
