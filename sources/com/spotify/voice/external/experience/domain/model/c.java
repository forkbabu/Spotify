package com.spotify.voice.external.experience.domain.model;

public abstract class c {

    public static final class a extends c {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Error{}";
        }
    }

    public static final class b extends c {
        private final String a;

        b(String str) {
            str.getClass();
            this.a = str;
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

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("FinalResponse{transcript="), this.a, '}');
        }
    }

    /* renamed from: com.spotify.voice.external.experience.domain.model.c$c  reason: collision with other inner class name */
    public static final class C0577c extends c {
        C0577c() {
        }

        public boolean equals(Object obj) {
            return obj instanceof C0577c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Fulfillment{}";
        }
    }

    public static final class d extends c {
        d() {
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Init{}";
        }
    }

    public static final class e extends c {
        private final String a;

        e(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("IntermediateResponse{transcript="), this.a, '}');
        }
    }

    public static final class f extends c {
        f() {
        }

        public boolean equals(Object obj) {
            return obj instanceof f;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Listening{}";
        }
    }

    public static final class g extends c {
        g() {
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "OfflineError{}";
        }
    }

    public static final class h extends c {
        private final String a;

        h(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            return je.H0(je.V0("ResponseError{reason="), this.a, '}');
        }
    }

    public static final class i extends c {
        private final String a;
        private final String b;

        i(String str, String str2) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!iVar.a.equals(this.a) || !iVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + je.Y0(this.a, 0, 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Restrictions{header=");
            V0.append(this.a);
            V0.append(", detail=");
            return je.H0(V0, this.b, '}');
        }
    }

    public static final class j extends c {
        j() {
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "UnsupportedAction{}";
        }
    }

    c() {
    }

    public static c a() {
        return new a();
    }

    public static c b(String str) {
        return new b(str);
    }

    public static c c() {
        return new C0577c();
    }

    public static c d(String str) {
        return new e(str);
    }

    public static c e() {
        return new f();
    }

    public static c f() {
        return new g();
    }

    public static c g(String str) {
        return new h(str);
    }

    public static c h(String str, String str2) {
        return new i(str, str2);
    }

    public static c i() {
        return new j();
    }
}
