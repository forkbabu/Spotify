package com.spotify.music.podcast.entity.adapter.episoderow;

public abstract class c {

    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: com.spotify.music.podcast.entity.adapter.episoderow.c$c  reason: collision with other inner class name */
    public static final class C0324c extends c {
        private final float a;

        public C0324c() {
            super(null);
            this.a = 0.0f;
        }

        public final float a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0324c) && Float.compare(this.a, ((C0324c) obj).a) == 0;
            }
            return true;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Downloading(progress=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }

        public C0324c(float f) {
            super(null);
            this.a = f;
        }
    }

    public static final class d extends c {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends c {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends c {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public c(kotlin.jvm.internal.f fVar) {
    }
}
