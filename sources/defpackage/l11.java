package defpackage;

import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;

/* renamed from: l11  reason: default package */
public abstract class l11 {

    /* renamed from: l11$a */
    public static final class a extends l11 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        @Override // defpackage.l11
        public final <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ErrorTypeIdentifier.NO_CONNECTION;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorConnection{}";
        }
    }

    /* renamed from: l11$b */
    public static final class b extends l11 {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        @Override // defpackage.l11
        public final <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ErrorTypeIdentifier.MAGIC_LINK_LOGIN_FAILURE;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorCouldNotLogin{}";
        }
    }

    /* renamed from: l11$c */
    public static final class c extends l11 {
    }

    /* renamed from: l11$d */
    public static final class d extends l11 {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        @Override // defpackage.l11
        public final <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ErrorTypeIdentifier.GENERIC;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorGeneric{}";
        }
    }

    /* renamed from: l11$e */
    public static final class e extends l11 {
        e() {
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        @Override // defpackage.l11
        public final <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ErrorTypeIdentifier.RATE_LIMIT;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorLimited{}";
        }
    }

    /* renamed from: l11$f */
    public static final class f extends l11 {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        @Override // defpackage.l11
        public final <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06) {
            return (R_) ErrorTypeIdentifier.PASSWORD_TOKEN_EXPIRED;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorTokenExpired{}";
        }
    }

    l11() {
    }

    public static l11 a() {
        return new a();
    }

    public static l11 b() {
        return new b();
    }

    public static l11 c() {
        return new d();
    }

    public static l11 d() {
        return new e();
    }

    public static l11 e() {
        return new f();
    }

    public abstract <R_> R_ f(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<d, R_> ti03, ti0<a, R_> ti04, ti0<e, R_> ti05, ti0<f, R_> ti06);
}
