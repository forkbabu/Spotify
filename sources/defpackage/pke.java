package defpackage;

import android.os.Parcelable;
import defpackage.qke;
import defpackage.yje;

/* renamed from: pke  reason: default package */
public abstract class pke implements Parcelable {
    public static final pke a;

    /* renamed from: pke$a */
    public static abstract class a {
        public abstract pke a();

        public abstract a b(boolean z);

        public abstract a c(qke qke);
    }

    static {
        yje.b bVar = new yje.b();
        bVar.c(new qke.b());
        bVar.b(false);
        a = bVar.a();
    }

    public abstract boolean a();

    public String b() {
        return (String) c().f(kke.a, ake.a, lke.a, zje.a, fke.a, eke.a, bke.a, dke.a, cke.a);
    }

    public abstract qke c();

    public abstract a e();

    public pke f(boolean z) {
        a e = e();
        e.b(z);
        return e.a();
    }
}
