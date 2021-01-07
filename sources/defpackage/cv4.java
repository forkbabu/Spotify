package defpackage;

import defpackage.jv4;
import io.reactivex.s;

/* renamed from: cv4  reason: default package */
public class cv4 {
    private final s<jv4> a;
    private final uda b;

    cv4(uda uda) {
        uda.getClass();
        this.b = uda;
        this.a = s.B(new xu4(this, uda)).v0(1).h1();
    }

    public /* synthetic */ jv4 a(Boolean bool) {
        jv4.a a2 = jv4.a();
        a2.b(bool.booleanValue());
        a2.c(this.b.c());
        return a2.build();
    }

    public s<jv4> b() {
        return this.a;
    }
}
