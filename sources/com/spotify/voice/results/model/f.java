package com.spotify.voice.results.model;

public abstract class f {

    public static final class a extends f {
        private final int a;
        private final String b;

        a(int i, String str) {
            this.a = i;
            str.getClass();
            this.b = str;
        }

        @Override // com.spotify.voice.results.model.f
        public final void b(si0<b> si0, si0<a> si02) {
            ((com.spotify.voiceassistant.voice.results.b) si02).a.d(this);
        }

        public final int d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a != this.a || !aVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.K(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ItemClicked{position=");
            V0.append(this.a);
            V0.append(", uri=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class b extends f {
        b() {
        }

        @Override // com.spotify.voice.results.model.f
        public final void b(si0<b> si0, si0<a> si02) {
            ((com.spotify.voiceassistant.voice.results.a) si0).a.c(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Show{}";
        }
    }

    f() {
    }

    public static f a(int i, String str) {
        return new a(i, str);
    }

    public static f c() {
        return new b();
    }

    public abstract void b(si0<b> si0, si0<a> si02);
}
