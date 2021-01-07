package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: g60  reason: default package */
public interface g60 {

    /* renamed from: g60$a */
    public static final class a {
        private final String a;
        private final int b;
        private final int c;

        public a(String str, int i, int i2) {
            h.e(str, "componentId");
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            String str = this.a;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Entry(componentId=");
            V0.append(this.a);
            V0.append(", width=");
            V0.append(this.b);
            V0.append(", height=");
            return je.B0(V0, this.c, ")");
        }
    }

    void a(a aVar);

    a get(String str);
}
