package defpackage;

import defpackage.iv4;

/* renamed from: jv4  reason: default package */
public abstract class jv4 {

    /* renamed from: jv4$a */
    public interface a {
        a a(boolean z);

        a b(boolean z);

        jv4 build();

        a c(boolean z);
    }

    public static a a() {
        iv4.b bVar = new iv4.b();
        bVar.a(false);
        iv4.b bVar2 = bVar;
        bVar2.b(false);
        iv4.b bVar3 = bVar2;
        bVar3.c(false);
        return bVar3;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract a e();
}
