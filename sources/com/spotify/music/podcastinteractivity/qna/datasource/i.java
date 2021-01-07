package com.spotify.music.podcastinteractivity.qna.datasource;

public abstract class i {

    public static final class a extends i {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "episodeUri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
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
            return je.I0(je.V0("AllowUserToManageResponse(episodeUri="), this.a, ")");
        }
    }

    public static final class b extends i {
        private final boolean a;

        public b(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.a == ((b) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("Loading(loading="), this.a, ")");
        }
    }

    public static final class c extends i {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends i {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends i {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends i {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends i {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends i {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    private i() {
    }

    public i(kotlin.jvm.internal.f fVar) {
    }
}
