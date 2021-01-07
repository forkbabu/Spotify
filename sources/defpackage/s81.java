package defpackage;

import defpackage.o81;
import defpackage.r81;
import defpackage.w81;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: s81  reason: default package */
public interface s81 extends y81 {

    /* renamed from: s81$a */
    public static abstract class a {
        public abstract a a(List<? extends s81> list);

        public abstract a b(s81... s81Arr);

        public abstract a c(p81 p81);

        public abstract a d(String str, Serializable serializable);

        public final a e(String str, o81.a aVar) {
            h.e(str, "eventName");
            h.e(aVar, "commandBuilder");
            return f(str, aVar.c());
        }

        public abstract a f(String str, o81 o81);

        public abstract a g(Map<String, ? extends o81> map);

        public abstract a h(p81 p81);

        public abstract a i(String str, Serializable serializable);

        public abstract a j(p81 p81);

        public abstract a k(String str, Serializable serializable);

        public abstract s81 l();

        public abstract a m(List<? extends s81> list);

        public abstract a n(q81 q81);

        public abstract a o(String str, String str2);

        public abstract a p(p81 p81);

        public abstract a q(Map<String, ? extends o81> map);

        public abstract a r(String str);

        public abstract a s(String str);

        public final a t(r81.a aVar) {
            h.e(aVar, "imagesBuilder");
            return u(aVar.b());
        }

        public abstract a u(r81 r81);

        public abstract a v(p81 p81);

        public abstract a w(p81 p81);

        public abstract a x(a91 a91);

        public final a y(w81.a aVar) {
            h.e(aVar, "textBuilder");
            return z(aVar.build());
        }

        public abstract a z(w81 w81);
    }

    List<? extends s81> childGroup(String str);

    List<? extends s81> children();

    q81 componentId();

    p81 custom();

    Map<String, ? extends o81> events();

    String group();

    String id();

    r81 images();

    p81 logging();

    p81 metadata();

    a91 target();

    w81 text();

    a toBuilder();
}
