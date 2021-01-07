package com.spotify.mobile.android.share.menu.preview.api;

import kotlin.jvm.internal.f;

public abstract class h {

    public static final class a extends h {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "shareDestination");
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Failure(shareDestination=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends h {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "shareDestination");
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Success(shareDestination=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private h() {
    }

    public h(f fVar) {
    }
}
