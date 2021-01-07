package defpackage;

import java.io.Serializable;

/* renamed from: x81  reason: default package */
public interface x81 extends y81 {

    /* renamed from: x81$a */
    public static abstract class a {
        public abstract a a(p81 p81);

        public abstract a b(String str, Serializable serializable);

        public abstract x81 c();

        public abstract a d(p81 p81);

        public final a e(Enum<?> r1) {
            return f(r1 != null ? r1.name() : null);
        }

        public abstract a f(String str);

        public abstract a g(String str);
    }

    p81 custom();

    String placeholder();

    a toBuilder();

    String uri();
}
