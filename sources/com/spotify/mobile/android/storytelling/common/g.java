package com.spotify.mobile.android.storytelling.common;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class g {

    public static final class a extends g {
        private final hx1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(hx1 hx1) {
            super(null);
            h.e(hx1, "story");
            this.a = hx1;
        }

        public final hx1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            hx1 hx1 = this.a;
            if (hx1 != null) {
                return hx1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded(story=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends g {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private g() {
    }

    public g(f fVar) {
    }
}
