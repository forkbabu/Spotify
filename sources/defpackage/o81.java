package defpackage;

import java.io.Serializable;

/* renamed from: o81  reason: default package */
public interface o81 extends y81 {

    /* renamed from: o81$a */
    public static abstract class a {
        public abstract a a(p81 p81);

        public abstract a b(String str, Serializable serializable);

        public abstract o81 c();

        public abstract a d(p81 p81);

        public abstract a e(String str);
    }

    p81 data();

    String name();

    a toBuilder();
}
