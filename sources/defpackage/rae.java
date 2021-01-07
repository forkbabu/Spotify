package defpackage;

import kotlin.jvm.internal.f;

/* renamed from: rae  reason: default package */
public abstract class rae {

    /* renamed from: rae$a */
    public static final class a extends rae {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: rae$b */
    public static final class b extends rae {
        private final int a;
        private final int b;
        private final int c;

        public b(int i, int i2, int i3) {
            super(null);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SelectAge(year=");
            V0.append(this.a);
            V0.append(", monthOfYear=");
            V0.append(this.b);
            V0.append(", dayOfMonth=");
            return je.B0(V0, this.c, ")");
        }
    }

    /* renamed from: rae$c */
    public static final class c extends rae {
        private final int a;
        private final int b;
        private final int c;
        private final boolean d;

        public c(int i, int i2, int i3, boolean z) {
            super(null);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final int d() {
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
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public int hashCode() {
            int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
            boolean z = this.d;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("VerifyAge(year=");
            V0.append(this.a);
            V0.append(", monthOfYear=");
            V0.append(this.b);
            V0.append(", dayOfMonth=");
            V0.append(this.c);
            V0.append(", navigateAfterVerification=");
            return je.P0(V0, this.d, ")");
        }
    }

    private rae() {
    }

    public rae(f fVar) {
    }
}
