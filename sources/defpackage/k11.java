package defpackage;

import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;

/* renamed from: k11  reason: default package */
public abstract class k11 {

    /* renamed from: k11$a */
    public static final class a extends k11 {
        a() {
        }

        @Override // defpackage.k11
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) DialogIdentifier.MAGIC_LINK_REGION_MISMATCH;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DialogRegionMismatch{}";
        }
    }

    /* renamed from: k11$b */
    public static final class b extends k11 {
        b() {
        }

        @Override // defpackage.k11
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) DialogIdentifier.MAGIC_LINK_TOKEN_EXPIRED;
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DialogTokenExpired{}";
        }
    }

    /* renamed from: k11$c */
    public static final class c extends k11 {
        c() {
        }

        @Override // defpackage.k11
        public final <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03) {
            return (R_) DialogIdentifier.NONE;
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "None{}";
        }
    }

    k11() {
    }

    public static k11 a() {
        return new a();
    }

    public static k11 b() {
        return new b();
    }

    public static k11 d() {
        return new c();
    }

    public abstract <R_> R_ c(ti0<a, R_> ti0, ti0<b, R_> ti02, ti0<c, R_> ti03);
}
