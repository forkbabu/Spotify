package defpackage;

import com.spotify.signup.splitflow.t;
import com.spotify.signup.splitflow.z0;

/* renamed from: sae  reason: default package */
public abstract class sae {

    /* renamed from: sae$a */
    public static final class a extends sae {
        a() {
        }

        @Override // defpackage.sae
        public final <R_> R_ d(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((pae) ti0).apply(this);
        }

        @Override // defpackage.sae
        public final void e(si0<a> si0, si0<c> si02, si0<b> si03) {
            t tVar = (t) si0;
            tVar.a.v(tVar.b, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "AgeSelected{}";
        }
    }

    /* renamed from: sae$b */
    public static final class b extends sae {
        private final int a;
        private final int b;
        private final int c;
        private final uae d;

        b(int i, int i2, int i3, uae uae) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            uae.getClass();
            this.d = uae;
        }

        @Override // defpackage.sae
        public final <R_> R_ d(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((oae) ti03).apply(this);
        }

        @Override // defpackage.sae
        public final void e(si0<a> si0, si0<c> si02, si0<b> si03) {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a == this.a && bVar.b == this.b && bVar.c == this.c && bVar.d.equals(this.d)) {
                return true;
            }
            return false;
        }

        public final uae f() {
            return this.d;
        }

        public final int g() {
            return this.c;
        }

        public final int h() {
            return this.b;
        }

        public int hashCode() {
            return this.d.hashCode() + je.K(this.c, je.K(this.b, je.K(this.a, 0, 31), 31), 31);
        }

        public final int i() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AgeVerified{year=");
            V0.append(this.a);
            V0.append(", monthOfYear=");
            V0.append(this.b);
            V0.append(", dayOfMonth=");
            V0.append(this.c);
            V0.append(", ageState=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: sae$c */
    public static final class c extends sae {
        private final int a;
        private final int b;
        private final int c;

        c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // defpackage.sae
        public final <R_> R_ d(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((qae) ti02).apply(this);
        }

        @Override // defpackage.sae
        public final void e(si0<a> si0, si0<c> si02, si0<b> si03) {
            ((z0) si02).a.w(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a == this.a && cVar.b == this.b && cVar.c == this.c) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.c;
        }

        public final int g() {
            return this.b;
        }

        public final int h() {
            return this.a;
        }

        public int hashCode() {
            return je.b(this.c, je.K(this.b, je.K(this.a, 0, 31), 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("BirthDayChanged{year=");
            V0.append(this.a);
            V0.append(", monthOfYear=");
            V0.append(this.b);
            V0.append(", dayOfMonth=");
            return je.A0(V0, this.c, '}');
        }
    }

    sae() {
    }

    public static sae a() {
        return new a();
    }

    public static sae b(int i, int i2, int i3, uae uae) {
        return new b(i, i2, i3, uae);
    }

    public static sae c(int i, int i2, int i3) {
        return new c(i, i2, i3);
    }

    public abstract <R_> R_ d(ti0<a, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03);

    public abstract void e(si0<a> si0, si0<c> si02, si0<b> si03);
}
