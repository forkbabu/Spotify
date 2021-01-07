package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.h;

/* renamed from: p81  reason: default package */
public interface p81 extends y81 {

    /* renamed from: p81$a */
    public static abstract class a {
        public a a(p81 p81) {
            h.e(p81, "other");
            a aVar = this;
            for (String str : p81.keySet()) {
                Object obj = p81.get(str);
                if (obj instanceof Serializable) {
                    aVar = aVar.o(str, (Serializable) obj);
                } else if (obj instanceof Parcelable) {
                    aVar = aVar.n(str, (Parcelable) obj);
                } else if (obj != null) {
                    StringBuilder V0 = je.V0("Invalid type ");
                    V0.append(obj.getClass());
                    throw new AssertionError(V0.toString());
                }
            }
            return aVar;
        }

        public abstract a b(String str, boolean z);

        public abstract a c(String str, boolean[] zArr);

        public abstract p81 d();

        public abstract a e(String str, p81 p81);

        public abstract a f(String str, p81[] p81Arr);

        public abstract a g(String str, double[] dArr);

        public abstract a h(String str, double d);

        public abstract a i(String str, float f);

        public abstract a j(String str, int i);

        public abstract a k(String str, int[] iArr);

        public abstract a l(String str, long[] jArr);

        public abstract a m(String str, long j);

        public abstract a n(String str, Parcelable parcelable);

        public abstract a o(String str, Serializable serializable);

        public abstract a p(String str, String str2);

        public abstract a q(String str, String[] strArr);
    }

    Boolean boolValue(String str);

    boolean boolValue(String str, boolean z);

    p81 bundle(String str);

    p81[] bundleArray(String str);

    byte[] byteArray(String str);

    float floatValue(String str, float f);

    Object get(String str);

    int intValue(String str, int i);

    Integer intValue(String str);

    Set<String> keySet();

    long longValue(String str, long j);

    Long longValue(String str);

    String string(String str);

    String string(String str, String str2);

    String[] stringArray(String str);

    a toBuilder();
}
