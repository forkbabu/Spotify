package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Optional;

public abstract class k {

    public static final class a extends k {
        private final String a;
        private final Long b;

        a(String str, Long l) {
            str.getClass();
            this.a = str;
            l.getClass();
            this.b = l;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return (R_) l.c(((d) ti03).a, this);
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

        public final Long f() {
            return this.b;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PagePrefsAccessed{uri=");
            V0.append(this.a);
            V0.append(", timestamp=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class b extends k {
        private final PrefsModel a;

        b(PrefsModel prefsModel) {
            prefsModel.getClass();
            this.a = prefsModel;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return (R_) l.b(((h) ti02).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final PrefsModel f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PrefsModelLoaded{prefsModel=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends k {
        private final String a;
        private final String b;
        private final Optional<String> c;
        private final Long d;

        c(String str, String str2, Optional<String> optional, Long l) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            optional.getClass();
            this.c = optional;
            l.getClass();
            this.d = l;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((g) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b) || !cVar.c.equals(this.c) || !cVar.d.equals(this.d)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.b;
        }

        public final Long g() {
            return this.d;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
            return this.d.hashCode() + ((this.c.hashCode() + Y0) * 31);
        }

        public final Optional<String> i() {
            return this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetPagePrefsOption{uri=");
            V0.append(this.a);
            V0.append(", key=");
            V0.append(this.b);
            V0.append(", value=");
            V0.append(this.c);
            V0.append(", timestamp=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class d extends k {
        private final String a;

        d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k
        public final <R_> R_ a(ti0<d, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04) {
            return (R_) ((e) ti0).apply(this);
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

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("UsernameLoaded{username="), this.a, '}');
        }
    }

    k() {
    }

    public static k b(String str, Long l) {
        return new a(str, l);
    }

    public static k c(PrefsModel prefsModel) {
        return new b(prefsModel);
    }

    public static k d(String str, String str2, Optional<String> optional, Long l) {
        return new c(str, str2, optional, l);
    }

    public static k e(String str) {
        return new d(str);
    }

    public abstract <R_> R_ a(ti0<d, R_> ti0, ti0<b, R_> ti02, ti0<a, R_> ti03, ti0<c, R_> ti04);
}
