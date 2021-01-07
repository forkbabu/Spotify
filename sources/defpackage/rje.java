package defpackage;

import com.spotify.signup.splitflow.h;

/* renamed from: rje  reason: default package */
public abstract class rje {

    /* renamed from: rje$a */
    public static final class a extends rje {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // defpackage.rje
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return (R_) ((lje) ti02).apply(this);
        }

        @Override // defpackage.rje
        public final void c(si0<b> si0, si0<a> si02) {
        }

        public final boolean e() {
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
            if (aVar.a == this.a && aVar.b == this.b && aVar.c == this.c) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.a;
        }

        public final boolean g() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = Boolean.valueOf(this.b).hashCode();
            return je.n(this.c, (hashCode + ((Boolean.valueOf(this.a).hashCode() + 0) * 31)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("KoreanTermsChanged{isRequiredTermsAccepted=");
            V0.append(this.a);
            V0.append(", isThirdPartyDataProvisionAccepted=");
            V0.append(this.b);
            V0.append(", isPersonalInformationTermAccepted=");
            return je.O0(V0, this.c, '}');
        }
    }

    /* renamed from: rje$b */
    public static final class b extends rje {
        private final String a;
        private final boolean b;

        b(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.rje
        public final <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02) {
            return (R_) ((mje) ti0).apply(this);
        }

        @Override // defpackage.rje
        public final void c(si0<b> si0, si0<a> si02) {
            ((h) si0).a.A(this);
        }

        public final boolean e() {
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

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.b, je.Y0(this.a, 0, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("NameChanged{name=");
            V0.append(this.a);
            V0.append(", changedByUser=");
            return je.O0(V0, this.b, '}');
        }
    }

    rje() {
    }

    public static rje a(boolean z, boolean z2, boolean z3) {
        return new a(z, z2, z3);
    }

    public static rje d(String str, boolean z) {
        return new b(str, z);
    }

    public abstract <R_> R_ b(ti0<b, R_> ti0, ti0<a, R_> ti02);

    public abstract void c(si0<b> si0, si0<a> si02);
}
