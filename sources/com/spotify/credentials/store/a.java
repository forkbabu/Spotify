package com.spotify.credentials.store;

public abstract class a {

    /* renamed from: com.spotify.credentials.store.a$a  reason: collision with other inner class name */
    public static final class C0153a extends a {
        C0153a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof C0153a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Facebook{}";
        }
    }

    public static final class b extends a {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NotFound{}";
        }
    }

    public static final class c extends a {
        private final String a;
        private final String b;
        private final CredentialsSource c;

        c(String str, String str2, CredentialsSource credentialsSource) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = credentialsSource;
        }

        public final String d() {
            return this.b;
        }

        public final CredentialsSource e() {
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
            if (cVar.c != this.c || !cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int i = 0;
            int Y0 = je.Y0(this.b, je.Y0(this.a, 0, 31), 31);
            CredentialsSource credentialsSource = this.c;
            if (credentialsSource != null) {
                i = credentialsSource.hashCode();
            }
            return Y0 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserPassword{username=");
            V0.append(this.a);
            V0.append(", password=");
            V0.append("***");
            V0.append(", source=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    a() {
    }

    public static a a() {
        return new C0153a();
    }

    public static a b() {
        return new b();
    }

    public static a c(String str, String str2, CredentialsSource credentialsSource) {
        return new c(str, str2, credentialsSource);
    }
}
