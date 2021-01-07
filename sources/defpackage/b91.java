package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: b91  reason: default package */
public interface b91 extends y81 {

    /* renamed from: b91$a */
    public static abstract class a {
        public abstract a a(List<? extends s81> list);

        public abstract a b(s81... s81Arr);

        public abstract a c(p81 p81);

        public abstract a d(String str, Serializable serializable);

        public abstract a e(List<? extends s81> list);

        public abstract a f(s81... s81Arr);

        public abstract b91 g();

        public abstract a h(p81 p81);

        public abstract a i(String str);

        public abstract a j(s81 s81);

        public abstract a k(String str);

        public abstract a l(s81... s81Arr);

        public abstract a m(String str);
    }

    List<? extends s81> body();

    p81 custom();

    String extension();

    s81 header();

    String id();

    List<? extends s81> overlays();

    String title();

    a toBuilder();
}
