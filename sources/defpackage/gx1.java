package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: gx1  reason: default package */
public abstract class gx1 {

    /* renamed from: gx1$a */
    public static final class a extends gx1 {
        private final int a;

        public a(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("StoriesAvailable(storiesCount="), this.a, ")");
        }
    }

    /* renamed from: gx1$b */
    public static final class b extends gx1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: gx1$c */
    public static final class c extends gx1 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: gx1$d */
    public static final class d extends gx1 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: gx1$e */
    public static final class e extends gx1 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: gx1$f */
    public static final class f extends gx1 {
        private final int a;

        public f(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && this.a == ((f) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("StorySelected(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: gx1$g */
    public static final class g extends gx1 {
        private final kx1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(kx1 kx1) {
            super(null);
            h.e(kx1, "storyInfo");
            this.a = kx1;
        }

        public final kx1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            kx1 kx1 = this.a;
            if (kx1 != null) {
                return kx1.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryStarted(storyInfo=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private gx1() {
    }

    public gx1(kotlin.jvm.internal.f fVar) {
    }
}
