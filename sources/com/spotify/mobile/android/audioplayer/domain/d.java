package com.spotify.mobile.android.audioplayer.domain;

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
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends d {
        private final g a;
        private final long b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, long j) {
            super(null);
            h.e(gVar, "command");
            this.a = gVar;
            this.b = j;
        }

        public final g a() {
            return this.a;
        }

        public final long b() {
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
            return h.a(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            g gVar = this.a;
            return ((gVar != null ? gVar.hashCode() : 0) * 31) + defpackage.e.a(this.b);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayCommandReceived(command=");
            V0.append(this.a);
            V0.append(", timestamp=");
            return je.E0(V0, this.b, ")");
        }
    }

    /* renamed from: com.spotify.mobile.android.audioplayer.domain.d$d  reason: collision with other inner class name */
    public static final class C0173d extends d {
        public static final C0173d a = new C0173d();

        private C0173d() {
            super(null);
        }
    }

    public static final class e extends d {
        private final long a;

        public e(long j) {
            super(null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.a == ((e) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return defpackage.e.a(this.a);
        }

        public String toString() {
            return je.E0(je.V0("PlayerReady(timestamp="), this.a, ")");
        }
    }

    private d() {
    }

    public d(f fVar) {
    }
}
