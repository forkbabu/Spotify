package defpackage;

/* renamed from: lhd  reason: default package */
public abstract class lhd {
    private final String a;
    private final boolean b;

    /* renamed from: lhd$a */
    public static final class a extends lhd {
        public static final a c = new a();

        private a() {
            super("assisted_login", false, null);
        }
    }

    /* renamed from: lhd$b */
    public static final class b extends lhd {
        public static final b c = new b();

        private b() {
            super("auto_login", false, null);
        }
    }

    /* renamed from: lhd$c */
    public static final class c extends lhd {
        public static final c c = new c();

        private c() {
            super("email_login", false, null);
        }
    }

    /* renamed from: lhd$d */
    public static final class d extends lhd {
        public static final d c = new d();

        private d() {
            super("email_reg", true, null);
        }
    }

    /* renamed from: lhd$e */
    public static final class e extends lhd {
        public static final e c = new e();

        private e() {
            super("phone_number_login", false, null);
        }
    }

    /* renamed from: lhd$f */
    public static final class f extends lhd {
        public static final f c = new f();

        private f() {
            super("phone_number_reg", true, null);
        }
    }

    /* renamed from: lhd$g */
    public static final class g extends lhd {
        public static final g c = new g();

        private g() {
            super("third_party_login", false, null);
        }
    }

    /* renamed from: lhd$h */
    public static final class h extends lhd {
        public static final h c = new h();

        private h() {
            super("third_party_reg", true, null);
        }
    }

    /* renamed from: lhd$i */
    public static final class i extends lhd {
        public static final i c = new i();

        private i() {
            super("token_login", false, null);
        }
    }

    public lhd(String str, boolean z, kotlin.jvm.internal.f fVar) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }
}
