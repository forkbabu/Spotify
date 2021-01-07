package com.spotify.music.navigation;

import com.spotify.music.mainactivity.e;

public abstract class f {

    public static final class a extends f {
        a() {
        }

        @Override // com.spotify.music.navigation.f
        public final void a(si0<a> si0, si0<d> si02, si0<b> si03, si0<c> si04) {
            com.spotify.music.mainactivity.d dVar = (com.spotify.music.mainactivity.d) si0;
            dVar.a.b(dVar.b, dVar.c, dVar.d, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Push{}";
        }
    }

    public static final class b extends f {
        b() {
        }

        @Override // com.spotify.music.navigation.f
        public final void a(si0<a> si0, si0<d> si02, si0<b> si03, si0<c> si04) {
            com.spotify.music.mainactivity.f fVar = (com.spotify.music.mainactivity.f) si03;
            fVar.a.d(fVar.b, fVar.c, fVar.d, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ReplaceAll{}";
        }
    }

    public static final class c extends f {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.music.navigation.f
        public final void a(si0<a> si0, si0<d> si02, si0<b> si03, si0<c> si04) {
            e eVar = (e) si04;
            eVar.a.e(eVar.b, eVar.c, eVar.d, this);
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

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ReplaceAllFrom{tag="), this.a, '}');
        }
    }

    public static final class d extends f {
        d() {
        }

        @Override // com.spotify.music.navigation.f
        public final void a(si0<a> si0, si0<d> si02, si0<b> si03, si0<c> si04) {
            com.spotify.music.mainactivity.c cVar = (com.spotify.music.mainactivity.c) si02;
            cVar.a.c(cVar.b, cVar.c, cVar.d, this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ReplaceCurrent{}";
        }
    }

    f() {
    }

    public static f b() {
        return new a();
    }

    public static f c() {
        return new b();
    }

    public static f d(String str) {
        return new c(str);
    }

    public static f e() {
        return new d();
    }

    public abstract void a(si0<a> si0, si0<d> si02, si0<b> si03, si0<c> si04);
}
