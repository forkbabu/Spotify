package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: x25  reason: default package */
public abstract class x25 {

    /* renamed from: x25$a */
    public static final class a extends x25 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: x25$b */
    public static final class b extends x25 {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            h.e(str, "entityUri");
            h.e(str2, "startingTrackUri");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Play(entityUri=");
            V0.append(this.a);
            V0.append(", startingTrackUri=");
            return je.I0(V0, this.b, ")");
        }
    }

    /* renamed from: x25$c */
    public static final class c extends x25 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public x25(f fVar) {
    }
}
