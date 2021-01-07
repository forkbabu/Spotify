package defpackage;

import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;

/* renamed from: n11  reason: default package */
public abstract class n11 {

    /* renamed from: n11$a */
    public static final class a extends n11 {
        a() {
        }

        @Override // defpackage.n11
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) InputFieldIdentifier.EMAIL;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InputEmail{}";
        }
    }

    /* renamed from: n11$b */
    public static final class b extends n11 {
        b() {
        }

        @Override // defpackage.n11
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) InputFieldIdentifier.NONE;
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InputNone{}";
        }
    }

    /* renamed from: n11$c */
    public static final class c extends n11 {
        c() {
        }

        @Override // defpackage.n11
        public final <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03) {
            return (R_) InputFieldIdentifier.PASSWORD;
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "InputPassword{}";
        }
    }

    n11() {
    }

    public static n11 a() {
        return new a();
    }

    public static n11 b() {
        return new b();
    }

    public static n11 c() {
        return new c();
    }

    public abstract <R_> R_ d(ti0<b, R_> ti0, ti0<a, R_> ti02, ti0<c, R_> ti03);
}
