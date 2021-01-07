package defpackage;

/* renamed from: qx1  reason: default package */
public abstract class qx1 {

    /* renamed from: qx1$a */
    public static final class a extends qx1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: qx1$b */
    public static final class b extends qx1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: qx1$c */
    public static final class c extends qx1 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: qx1$d */
    public static final class d extends qx1 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: qx1$e */
    public static final class e extends qx1 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: qx1$f */
    public static final class f extends qx1 {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: qx1$g */
    public static final class g extends qx1 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: qx1$h */
    public static final class h extends qx1 {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: qx1$i */
    public static final class i extends qx1 {
        private final kx1 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(kx1 kx1) {
            super(null);
            kotlin.jvm.internal.h.e(kx1, "storyInfo");
            this.a = kx1;
        }

        public final kx1 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.h.a(this.a, ((i) obj).a);
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
            StringBuilder V0 = je.V0("NotifyStoryStarted(storyInfo=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: qx1$j */
    public static final class j extends qx1 {
        public static final j a = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: qx1$k */
    public static final class k extends qx1 {
        private final int a;

        public k(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof k) && this.a == ((k) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("PreLoadStory(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: qx1$l */
    public static final class l extends qx1 {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: qx1$m */
    public static final class m extends qx1 {
        private final int a;

        public m(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof m) && this.a == ((m) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("ShareStory(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: qx1$n */
    public static final class n extends qx1 {
        private final int a;

        public n(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && this.a == ((n) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("ShowStory(storyIndex="), this.a, ")");
        }
    }

    /* renamed from: qx1$o */
    public static final class o extends qx1 {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    public qx1(kotlin.jvm.internal.f fVar) {
    }
}
