package defpackage;

import com.spotify.magiclink.setpassword.d;
import com.spotify.magiclink.setpassword.h;
import com.spotify.magiclink.setpassword.k;

/* renamed from: s21  reason: default package */
public abstract class s21 {

    /* renamed from: s21$a */
    public static final class a extends s21 {
        private final String a;

        @Override // defpackage.s21
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((z11) ti02).apply(this);
        }

        @Override // defpackage.s21
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
            ((h) si02).a.m(this);
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Recoverable{errorMessage="), this.a, '}');
        }
    }

    /* renamed from: s21$b */
    public static final class b extends s21 {
        b() {
        }

        @Override // defpackage.s21
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((u11) ti03).apply(this);
        }

        @Override // defpackage.s21
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
            ((k) si03).a.n(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "TokenExpired{}";
        }
    }

    /* renamed from: s21$c */
    public static final class c extends s21 {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.s21
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03) {
            return (R_) ((a21) ti0).apply(this);
        }

        @Override // defpackage.s21
        public final void b(si0<c> si0, si0<a> si02, si0<b> si03) {
            ((d) si0).a.l(this);
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("Unknown{error="), this.a, '}');
        }
    }

    s21() {
    }

    public static s21 c() {
        return new b();
    }

    public static s21 d(String str) {
        return new c(str);
    }

    public abstract <R_> R_ a(ti0<c, R_> ti0, ti0<a, R_> ti02, ti0<b, R_> ti03);

    public abstract void b(si0<c> si0, si0<a> si02, si0<b> si03);
}
