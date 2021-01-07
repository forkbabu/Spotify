package defpackage;

import defpackage.pla;
import java.util.List;
import java.util.UUID;

/* renamed from: sla  reason: default package */
public abstract class sla {

    /* renamed from: sla$a */
    public interface a {
        a a(long j);

        a b(long j);

        sla build();

        a c(long j);
    }

    public static sla f(long j, String str, String str2, List<String> list, String str3) {
        pla.b bVar = new pla.b();
        bVar.d(UUID.randomUUID().toString());
        bVar.c(j);
        bVar.a(0);
        bVar.b(0);
        bVar.h(list);
        bVar.e(str3);
        bVar.f(str);
        bVar.g(str2);
        return bVar.build();
    }

    public abstract String a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract String e();

    public abstract String g();

    public abstract String h();

    public abstract List<String> i();

    public abstract a j();
}
