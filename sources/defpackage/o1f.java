package defpackage;

/* renamed from: o1f  reason: default package */
public abstract class o1f {

    /* renamed from: o1f$a */
    public static final class a extends o1f {
        private final String a;
        private final String b;
        private final int c;
        private final p1f d;

        a(String str, String str2, int i, p1f p1f) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = i;
            p1f.getClass();
            this.d = p1f;
        }

        @Override // defpackage.o1f
        public final void b(si0<a> si0, si0<c> si02, si0<b> si03, si0<d> si04) {
            ((oze) si0).accept(this);
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
            return this.b;
        }

        public final int g() {
            return this.c;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return this.d.hashCode() + je.K(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31);
        }

        public final p1f i() {
            return this.d;
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

    /* renamed from: o1f$b */
    public static final class b extends o1f {
        private final String a;
        private final String b;

        b(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        @Override // defpackage.o1f
        public final void b(si0<a> si0, si0<c> si02, si0<b> si03, si0<d> si04) {
            ((sze) si03).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("MicPermissionsError{title=");
            V0.append(this.a);
            V0.append(", description=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: o1f$c */
    public static final class c extends o1f {
        private final String a;
        private final String b;
        private final int c;

        c(String str, String str2, int i) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = i;
        }

        @Override // defpackage.o1f
        public final void b(si0<a> si0, si0<c> si02, si0<b> si03, si0<d> si04) {
            ((xze) si02).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.c != this.c || !cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public final int g() {
            return this.c;
        }

        public final String h() {
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

    /* renamed from: o1f$d */
    public static final class d extends o1f {
        private final String a;
        private final String b;

        d(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        @Override // defpackage.o1f
        public final void b(si0<a> si0, si0<c> si02, si0<b> si03, si0<d> si04) {
            ((yze) si04).accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("RestrictionsError{title=");
            V0.append(this.a);
            V0.append(", description=");
            return je.H0(V0, this.b, '}');
        }
    }

    o1f() {
    }

    public static o1f a(String str, String str2, int i, p1f p1f) {
        return new a(str, str2, i, p1f);
    }

    public static o1f c(String str, String str2) {
        return new b(str, str2);
    }

    public static o1f d(String str, String str2, int i) {
        return new c(str, str2, i);
    }

    public static o1f e(String str, String str2) {
        return new d(str, str2);
    }

    public abstract void b(si0<a> si0, si0<c> si02, si0<b> si03, si0<d> si04);
}
