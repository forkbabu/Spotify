package com.spotify.mobile.android.share.menu.preview.domain;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class c {

    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {
        private final int a;

        public b(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("FetchPayload(index="), this.a, ")");
        }
    }

    /* renamed from: com.spotify.mobile.android.share.menu.preview.domain.c$c  reason: collision with other inner class name */
    public static final class C0188c extends c {
        private final com.spotify.mobile.android.share.menu.preview.api.a a;
        private final com.spotify.mobile.android.share.menu.preview.api.c b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0188c(com.spotify.mobile.android.share.menu.preview.api.a aVar, com.spotify.mobile.android.share.menu.preview.api.c cVar) {
            super(null);
            h.e(aVar, "shareDestination");
            h.e(cVar, "sharePayload");
            this.a = aVar;
            this.b = cVar;
        }

        public final com.spotify.mobile.android.share.menu.preview.api.a a() {
            return this.a;
        }

        public final com.spotify.mobile.android.share.menu.preview.api.c b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0188c)) {
                return false;
            }
            C0188c cVar = (C0188c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            com.spotify.mobile.android.share.menu.preview.api.a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            com.spotify.mobile.android.share.menu.preview.api.c cVar = this.b;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Share(shareDestination=");
            V0.append(this.a);
            V0.append(", sharePayload=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public c(f fVar) {
    }
}
