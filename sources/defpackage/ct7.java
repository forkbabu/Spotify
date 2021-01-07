package defpackage;

import android.os.Parcelable;
import defpackage.ts7;

/* renamed from: ct7  reason: default package */
public abstract class ct7 implements Parcelable {
    public static final ct7 a;

    /* renamed from: ct7$a */
    public static abstract class a {
        public abstract ct7 a();

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a d(boolean z);

        public abstract a e(int i);
    }

    static {
        ts7.b bVar = new ts7.b();
        bVar.d(false);
        bVar.b(false);
        bVar.c(0);
        bVar.e(0);
        a = bVar.a();
    }

    public static a a() {
        return new ts7.b();
    }

    public abstract boolean b();

    public abstract int c();

    public abstract boolean e();

    public abstract int f();

    public abstract a g();
}
