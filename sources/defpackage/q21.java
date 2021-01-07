package defpackage;

/* renamed from: q21  reason: default package */
public abstract class q21 {

    /* renamed from: q21$a */
    public static final class a extends q21 {
        private final String a;
        private final String b;

        a(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AttemptSaveSavePassword{password=");
            V0.append(this.a);
            V0.append(", oneTimeResetPasswordToken=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: q21$b */
    public static final class b extends q21 {
        private final String a;
        private final String b;

        b(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
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

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("AttemptsStoreCredentials{username=");
            V0.append(this.a);
            V0.append(", password=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: q21$c */
    public static final class c extends q21 {
        private final boolean a;
        private final String b;

        c(boolean z, String str) {
            this.a = z;
            str.getClass();
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a != this.a || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((Boolean.valueOf(this.a).hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Close{successful=");
            V0.append(this.a);
            V0.append(", reason=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: q21$d */
    public static final class d extends q21 {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ValidatePassword{password="), this.a, '}');
        }
    }

    q21() {
    }
}
