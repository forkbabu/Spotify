package com.spotify.login;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class x0 {

    public static final class a extends x0 {
        private final String a;
        private final long b;
        private final String c;
        private final long d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, long j, String str2, long j2) {
            super(null);
            h.e(str, "challengeId");
            h.e(str2, "canonicalPhoneNumber");
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = j2;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final long c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c) && this.d == aVar.d;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + e.a(this.d);
        }

        public String toString() {
            StringBuilder V0 = je.V0("CodeRequired(challengeId=");
            V0.append(this.a);
            V0.append(", codeLength=");
            V0.append(this.b);
            V0.append(", canonicalPhoneNumber=");
            V0.append(this.c);
            V0.append(", expiresIn=");
            return je.E0(V0, this.d, ")");
        }
    }

    public static final class b extends x0 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "identifierToken");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("CodeSuccess(identifierToken="), this.a, ")");
        }
    }

    public static final class c extends x0 {
        private final int a;
        private final String b;

        public c(int i, String str) {
            super(null);
            this.a = i;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Failure(status=");
            V0.append(this.a);
            V0.append(", error=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class d extends x0 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private x0() {
    }

    public x0(f fVar) {
    }
}
