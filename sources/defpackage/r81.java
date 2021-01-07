package defpackage;

import defpackage.x81;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: r81  reason: default package */
public interface r81 extends y81 {

    /* renamed from: r81$a */
    public static abstract class a {
        public abstract a a(x81 x81);

        public abstract r81 b();

        public abstract a c(Map<String, ? extends x81> map);

        public final a d(Enum<?> r1) {
            return e(r1 != null ? r1.name() : null);
        }

        public abstract a e(String str);

        public final a f(x81.a aVar) {
            h.e(aVar, "imageBuilder");
            return g(aVar.c());
        }

        public abstract a g(x81 x81);
    }

    x81 background();

    Map<String, ? extends x81> custom();

    String icon();

    x81 main();

    a toBuilder();
}
