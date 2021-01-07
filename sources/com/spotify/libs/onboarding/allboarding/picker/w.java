package com.spotify.libs.onboarding.allboarding.picker;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class w {
    private final int a;

    public static final class a extends w {
        public static final a b = new a();

        private a() {
            super(-1, null);
        }
    }

    public static final class b extends w {
        public static final b b = new b();

        private b() {
            super(-1, null);
        }
    }

    public static final class c extends w {
        private final String b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(i, null);
            h.e(str, "sectionId");
            this.b = str;
            this.c = i;
        }

        @Override // com.spotify.libs.onboarding.allboarding.picker.w
        public int a() {
            return this.c;
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
            return h.a(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            String str = this.b;
            return ((str != null ? str.hashCode() : 0) * 31) + this.c;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ScrollToPosition(sectionId=");
            V0.append(this.b);
            V0.append(", positionWithinSection=");
            return je.B0(V0, this.c, ")");
        }
    }

    public w(int i, f fVar) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
