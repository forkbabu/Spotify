package defpackage;

import io.reactivex.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: pyc  reason: default package */
public interface pyc {

    /* renamed from: pyc$a */
    public static abstract class a {

        /* renamed from: pyc$a$a  reason: collision with other inner class name */
        public static final class C0671a extends a {
            public static final C0671a a = new C0671a();

            private C0671a() {
                super(null);
            }
        }

        /* renamed from: pyc$a$b */
        public static final class b extends a {
            private final String a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                h.e(str, "token");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && h.a(this.a, ((b) obj).a);
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
                return je.I0(je.V0("Success(token="), this.a, ")");
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    z<a> a();
}
