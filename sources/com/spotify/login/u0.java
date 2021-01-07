package com.spotify.login;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class u0 {

    public static final class a extends u0 {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, boolean z) {
            super(null);
            h.e(str, "identifierToken");
            h.e(str2, "email");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CodeSuccess(identifierToken=");
            V0.append(this.a);
            V0.append(", email=");
            V0.append(this.b);
            V0.append(", emailAlreadyRegistered=");
            return je.P0(V0, this.c, ")");
        }
    }

    public static final class b extends u0 {
        private final int a;
        private final String b;

        public b(int i, String str) {
            super(null);
            this.a = i;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && h.a(this.b, bVar.b);
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

    public static final class c extends u0 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private u0() {
    }

    public u0(f fVar) {
    }
}
