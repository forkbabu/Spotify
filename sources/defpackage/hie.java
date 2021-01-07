package defpackage;

import com.spotify.signup.splitflow.b1;

/* renamed from: hie  reason: default package */
public abstract class hie {

    /* renamed from: hie$a */
    public static final class a extends hie {
        private final String a;
        private final String b;

        a(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.hie
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti03.apply(this);
        }

        @Override // defpackage.hie
        public final void c(si0<c> si0, si0<b> si02, si0<a> si03) {
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a.equals(this.a) || !gf0.e(aVar.b, this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.a, 0, 31);
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return Y0 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{email=");
            V0.append(this.a);
            V0.append(", message=");
            return je.H0(V0, this.b, '}');
        }
    }

    /* renamed from: hie$b */
    public static final class b extends hie {
        private final String a;
        private final int b;

        b(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.hie
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti02.apply(this);
        }

        @Override // defpackage.hie
        public final void c(si0<c> si0, si0<b> si02, si0<a> si03) {
            ((b1) si02).a.F(this);
        }

        public final String d() {
            return this.a;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.b != this.b || !bVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.b(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("Invalid{email=");
            V0.append(this.a);
            V0.append(", status=");
            return je.A0(V0, this.b, '}');
        }
    }

    /* renamed from: hie$c */
    public static final class c extends hie {
        private final String a;
        private final String b;

        c(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        @Override // defpackage.hie
        public final <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03) {
            return ti0.apply(this);
        }

        @Override // defpackage.hie
        public final void c(si0<c> si0, si0<b> si02, si0<a> si03) {
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Valid{email=");
            V0.append(this.a);
            V0.append(", nameSuggestion=");
            return je.H0(V0, this.b, '}');
        }
    }

    hie() {
    }

    public static hie a(String str, String str2) {
        return new a(str, null);
    }

    public abstract <R_> R_ b(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03);

    public abstract void c(si0<c> si0, si0<b> si02, si0<a> si03);
}
