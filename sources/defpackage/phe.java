package defpackage;

import android.os.Parcelable;
import defpackage.qhe;
import defpackage.rge;

/* renamed from: phe  reason: default package */
public abstract class phe implements Parcelable {
    public static final phe a;

    /* renamed from: phe$a */
    public static abstract class a {
        public abstract phe a();

        public abstract a b(qhe qhe);

        public abstract a c(boolean z);

        public abstract a d(boolean z);
    }

    static {
        rge.b bVar = new rge.b();
        bVar.b(new qhe.a());
        bVar.c(true);
        bVar.d(false);
        a = bVar.a();
    }

    public String a() {
        return (String) b().c(ghe.a, sge.a, jhe.a, hhe.a, uge.a, khe.a);
    }

    public abstract qhe b();

    public abstract boolean c();

    public abstract a e();

    public abstract boolean f();
}
