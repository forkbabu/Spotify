package defpackage;

import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: p11  reason: default package */
public abstract class p11 {

    /* renamed from: p11$a */
    public static final class a extends p11 {
        a() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.MAGICLINK_EMAIL_SENT;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "EmailSent{}";
        }
    }

    /* renamed from: p11$b */
    public static final class b extends p11 {
        b() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.MAGICLINK_EMAIL_USERNAME;
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "EmailUsername{}";
        }
    }

    /* renamed from: p11$c */
    public static final class c extends p11 {
        c() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.MAGICLINK_LOGIN;
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "MagicLink{}";
        }
    }

    /* renamed from: p11$d */
    public static final class d extends p11 {
        d() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.ON_LOGGED_IN;
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OnLoggedIn{}";
        }
    }

    /* renamed from: p11$e */
    public static final class e extends p11 {
        e() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.LOGIN;
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ScreenLogin{}";
        }
    }

    /* renamed from: p11$f */
    public static final class f extends p11 {
        f() {
        }

        @Override // defpackage.p11
        public final <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06) {
            return (R_) ScreenIdentifier.SET_PASSWORD;
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ScreenSetPassword{}";
        }
    }

    p11() {
    }

    public static p11 a() {
        return new a();
    }

    public static p11 b() {
        return new b();
    }

    public static p11 c() {
        return new c();
    }

    public static p11 e() {
        return new d();
    }

    public static p11 f() {
        return new e();
    }

    public static p11 g() {
        return new f();
    }

    public abstract <R_> R_ d(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<f, R_> ti04, ti0<e, R_> ti05, ti0<d, R_> ti06);
}
