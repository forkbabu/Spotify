package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: g2d  reason: default package */
public abstract class g2d<T> {

    /* renamed from: g2d$a */
    public static final class a<T> extends g2d<T> {
        private final String a;
        private final T b = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object obj, int i) {
            super(null);
            int i2 = i & 2;
            h.e(str, "message");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            T t = this.b;
            if (t != null) {
                i = t.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error(message=");
            V0.append(this.a);
            V0.append(", data=");
            return je.G0(V0, this.b, ")");
        }
    }

    /* renamed from: g2d$b */
    public static final class b<T> extends g2d<T> {
        private final T a = null;

        public b() {
            super(null);
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
            return je.G0(je.V0("Loading(data="), this.a, ")");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, int i) {
            super(null);
            int i2 = i & 1;
        }
    }

    /* renamed from: g2d$c */
    public static final class c<T> extends g2d<T> {
        private final T a;

        public c(T t) {
            super(null);
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
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
            return je.G0(je.V0("Success(data="), this.a, ")");
        }
    }

    public g2d(f fVar) {
    }
}
