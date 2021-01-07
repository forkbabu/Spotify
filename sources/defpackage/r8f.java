package defpackage;

/* renamed from: r8f  reason: default package */
public abstract class r8f {

    /* renamed from: r8f$a */
    public static final class a extends r8f {
        private final String a;
        private final String b;
        private final int c;
        private final s8f d;

        a(String str, String str2, int i, s8f s8f) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = i;
            s8f.getClass();
            this.d = s8f;
        }

        @Override // defpackage.r8f
        public final void b(si0<a> si0, si0<b> si02) {
            si0.accept(this);
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.c != this.c || !aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !aVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return this.d.hashCode() + je.K(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ErrorRetry{title=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", iconRes=");
            V0.append(this.c);
            V0.append(", voiceErrorType=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: r8f$b */
    public static final class b extends r8f {
        private final String a;
        private final String b;
        private final int c;

        b(String str, String str2, int i) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = i;
        }

        @Override // defpackage.r8f
        public final void b(si0<a> si0, si0<b> si02) {
            si02.accept(this);
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.c != this.c || !bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return je.b(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("OfflineError{title=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", iconRes=");
            return je.A0(V0, this.c, '}');
        }
    }

    r8f() {
    }

    public static r8f a(String str, String str2, int i, s8f s8f) {
        return new a(str, str2, i, s8f);
    }

    public static r8f c(String str, String str2, int i) {
        return new b(str, str2, i);
    }

    public abstract void b(si0<a> si0, si0<b> si02);
}
