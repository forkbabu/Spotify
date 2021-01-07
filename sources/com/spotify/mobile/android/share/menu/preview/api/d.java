package com.spotify.mobile.android.share.menu.preview.api;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class d {

    public static final class a extends d {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends d {
        private final c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(null);
            h.e(cVar, "payload");
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(payload=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private d() {
    }

    public d(f fVar) {
    }
}
