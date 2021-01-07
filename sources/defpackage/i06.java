package defpackage;

import com.spotify.ubi.specification.factories.m2;
import kotlin.jvm.internal.h;

/* renamed from: i06  reason: default package */
public final class i06 implements h06 {
    private final ere a;
    private final m2 b;

    public i06(ere ere, m2 m2Var) {
        h.e(ere, "eventLogger");
        h.e(m2Var, "eventFactory");
        this.a = ere;
        this.b = m2Var;
    }

    @Override // defpackage.h06
    public void c() {
        this.a.a(this.b.c().a());
    }

    @Override // defpackage.h06
    public void d() {
        this.a.a(this.b.b().a());
    }

    @Override // defpackage.h06
    public String e(String str, int i, String str2) {
        h.e(str, "profileUri");
        h.e(str2, "destinationUri");
        nqe a2 = this.b.d(Integer.valueOf(i), str).a(str2);
        this.a.a(a2);
        String b2 = a2.b();
        h.d(b2, "event.id()");
        return b2;
    }
}
