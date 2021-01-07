package defpackage;

import defpackage.bf0;
import java.util.Date;

/* renamed from: ff0  reason: default package */
public abstract class ff0 {

    /* renamed from: ff0$a */
    public static abstract class a {
        public abstract ff0 a();

        public abstract a b(boolean z);

        public abstract a c(boolean z);

        public abstract a d(int i);

        public abstract a e(Date date);

        public abstract a f(int i);

        public a g(Integer num) {
            if (num != null) {
                f(num.intValue());
            }
            return this;
        }
    }

    public static a a() {
        bf0.b bVar = new bf0.b();
        bVar.f(-1);
        bVar.b(false);
        return bVar;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract Date e();

    public abstract int f();
}
