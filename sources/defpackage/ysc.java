package defpackage;

import com.spotify.ubi.specification.factories.a3;
import kotlin.jvm.internal.h;

/* renamed from: ysc  reason: default package */
public final class ysc implements atc {
    private final ere a;
    private final a3 b;

    public ysc(ere ere, a3 a3Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(a3Var, "eventFactory");
        this.a = ere;
        this.b = a3Var;
    }

    @Override // defpackage.atc
    public String a(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        nqe a2 = this.b.b(Integer.valueOf(i), str).d().a();
        this.a.a(a2);
        String b2 = a2.b();
        h.d(b2, "event.id()");
        return b2;
    }

    @Override // defpackage.atc
    public String b(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        nqe c = this.b.b(Integer.valueOf(i), str).c(str);
        this.a.a(c);
        String b2 = c.b();
        h.d(b2, "event.id()");
        return b2;
    }

    @Override // defpackage.atc
    public String c(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        nqe b2 = this.b.b(Integer.valueOf(i), str).b(str);
        this.a.a(b2);
        String b3 = b2.b();
        h.d(b3, "event.id()");
        return b3;
    }
}
