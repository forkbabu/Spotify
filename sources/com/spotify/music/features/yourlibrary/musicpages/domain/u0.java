package com.spotify.music.features.yourlibrary.musicpages.domain;

public abstract class u0 {

    public static final class a extends u0 {
        a() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.u0
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti03.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotPlaying{}";
        }
    }

    public static final class b extends u0 {
        private final String a;
        private final String b;
        private final String c;

        b(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.u0
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti02.apply(this);
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b) || !bVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Paused{trackUri=");
            V0.append(this.a);
            V0.append(", trackUid=");
            V0.append(this.b);
            V0.append(", contextUri=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class c extends u0 {
        private final String a;
        private final String b;
        private final String c;

        c(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.u0
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti0.apply(this);
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Playing{trackUri=");
            V0.append(this.a);
            V0.append(", trackUid=");
            V0.append(this.b);
            V0.append(", contextUri=");
            return je.H0(V0, this.c, '}');
        }
    }

    public static final class d extends u0 {
        d() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.domain.u0
        public final <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04) {
            return ti04.apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Unknown{}";
        }
    }

    u0() {
    }

    public static u0 b() {
        return new a();
    }

    public static u0 c(String str, String str2, String str3) {
        return new b(str, str2, str3);
    }

    public static u0 d(String str, String str2, String str3) {
        return new c(str, str2, str3);
    }

    public abstract <R_> R_ a(ti0<c, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<d, R_> ti04);
}
