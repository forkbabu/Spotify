package com.spotify.music.superbird.setup;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class g {

    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends g {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends g {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            super(null);
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SetupDone(appVersion=");
            V0.append(this.a);
            V0.append(", osVersion=");
            return je.I0(V0, this.b, ")");
        }
    }

    public static final class d extends g {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private g() {
    }

    public g(f fVar) {
    }
}
