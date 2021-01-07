package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: pxd  reason: default package */
public interface pxd {

    /* renamed from: pxd$a */
    public static abstract class a<T> {

        /* renamed from: pxd$a$a  reason: collision with other inner class name */
        public static final class C0670a extends a {
            private final String a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0670a(String str) {
                super(null);
                h.e(str, "reason");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0670a) && h.a(this.a, ((C0670a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                String str = this.a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return je.I0(je.V0("Failure(reason="), this.a, ")");
            }
        }

        /* renamed from: pxd$a$b */
        public static final class b<T> extends a<T> {
            private final T a;

            public b(T t) {
                super(null);
                this.a = t;
            }

            public final T a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && h.a(this.a, ((b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                T t = this.a;
                if (t != null) {
                    return t.hashCode();
                }
                return 0;
            }

            public String toString() {
                return je.G0(je.V0("Success(value="), this.a, ")");
            }
        }

        public a(f fVar) {
        }
    }

    <T> a<T> a(byte[] bArr, Class<T> cls);

    <T> a<byte[]> b(T t);
}
