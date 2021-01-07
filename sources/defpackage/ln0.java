package defpackage;

import kotlin.jvm.internal.h;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;

/* renamed from: ln0  reason: default package */
public final class ln0 implements v {
    private final String a;

    public ln0(String str) {
        h.e(str, "token");
        this.a = str;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0.a h = fof.i().h();
        String str = this.a;
        h.a("Authorization", "Bearer " + str);
        return fof.f(h.b());
    }
}
