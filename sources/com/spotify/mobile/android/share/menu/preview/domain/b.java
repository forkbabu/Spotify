package com.spotify.mobile.android.share.menu.preview.domain;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class b {

    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: com.spotify.mobile.android.share.menu.preview.domain.b$b  reason: collision with other inner class name */
    public static final class C0187b extends b {
        private final com.spotify.mobile.android.share.menu.preview.api.c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0187b(com.spotify.mobile.android.share.menu.preview.api.c cVar) {
            super(null);
            h.e(cVar, "sharePayload");
            this.a = cVar;
        }

        public final com.spotify.mobile.android.share.menu.preview.api.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0187b) && h.a(this.a, ((C0187b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.mobile.android.share.menu.preview.api.c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded(sharePayload=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private b() {
    }

    public b(f fVar) {
    }
}
