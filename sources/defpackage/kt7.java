package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: kt7  reason: default package */
public abstract class kt7 {

    /* renamed from: kt7$a */
    public static final class a extends kt7 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: kt7$b */
    public static final class b extends kt7 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "uri");
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
            return je.I0(je.V0("NavigateToUri(uri="), this.a, ")");
        }
    }

    /* renamed from: kt7$c */
    public static final class c extends kt7 {
        private final String a;
        private final boolean b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z) {
            super(null);
            h.e(str, "uri");
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateFollowing(uri=");
            V0.append(this.a);
            V0.append(", following=");
            return je.P0(V0, this.b, ")");
        }
    }

    public kt7(f fVar) {
    }
}
