package com.spotify.wakeword.sensory;

public abstract class y {

    public static final class a extends y {
        private final String a;

        a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.wakeword.sensory.y
        public final void a(si0<d> si0, si0<c> si02, si0<a> si03, si0<b> si04) {
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
            return je.H0(je.V0("Detected{sessionId="), this.a, '}');
        }
    }

    public static final class b extends y {
        private final String a;
        private final x b;

        b(String str, x xVar) {
            str.getClass();
            this.a = str;
            xVar.getClass();
            this.b = xVar;
        }

        @Override // com.spotify.wakeword.sensory.y
        public final void a(si0<d> si0, si0<c> si02, si0<a> si03, si0<b> si04) {
            b0.i(((n) si04).a, this);
        }

        public final x b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a.equals(this.a) || !bVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Error{sessionId=");
            V0.append(this.a);
            V0.append(", sensoryError=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class c extends y {
        private final String a;

        c(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // com.spotify.wakeword.sensory.y
        public final void a(si0<d> si0, si0<c> si02, si0<a> si03, si0<b> si04) {
            ((d) si02).a.k(this);
        }

        public final String b() {
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
            return je.H0(je.V0("Running{sessionId="), this.a, '}');
        }
    }

    public static final class d extends y {
        private final String a;
        private final String b;
        private final String c;

        d(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
        }

        @Override // com.spotify.wakeword.sensory.y
        public final void a(si0<d> si0, si0<c> si02, si0<a> si03, si0<b> si04) {
            ((g) si0).a.j(this);
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b) || !dVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.c.hashCode() + je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Started{sessionId=");
            V0.append(this.a);
            V0.append(", model=");
            V0.append(this.b);
            V0.append(", version=");
            return je.H0(V0, this.c, '}');
        }
    }

    y() {
    }

    public abstract void a(si0<d> si0, si0<c> si02, si0<a> si03, si0<b> si04);
}
