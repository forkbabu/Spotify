package defpackage;

import defpackage.lhd;

/* renamed from: khd  reason: default package */
public abstract class khd {
    private final String a;
    private final lhd b;

    /* renamed from: khd$a */
    public static final class a extends khd {
        public static final a c = new a();

        private a() {
            super("email_login", lhd.c.c, null);
        }
    }

    /* renamed from: khd$b */
    public static final class b extends khd {
        public static final b c = new b();

        private b() {
            super("email_reg", lhd.d.c, null);
        }
    }

    /* renamed from: khd$c */
    public static final class c extends khd {
        public static final c c = new c();

        private c() {
            super("facebook_login", lhd.g.c, null);
        }
    }

    /* renamed from: khd$d */
    public static final class d extends khd {
        public static final d c = new d();

        private d() {
            super("facebook_reg", lhd.h.c, null);
        }
    }

    /* renamed from: khd$e */
    public static final class e extends khd {
        public static final e c = new e();

        private e() {
            super("google_login", lhd.g.c, null);
        }
    }

    /* renamed from: khd$f */
    public static final class f extends khd {
        public static final f c = new f();

        private f() {
            super("google_reg", lhd.h.c, null);
        }
    }

    /* renamed from: khd$g */
    public static final class g extends khd {
        public static final g c = new g();

        private g() {
            super("magiclink_login", lhd.i.c, null);
        }
    }

    /* renamed from: khd$h */
    public static final class h extends khd {
        public static final h c = new h();

        private h() {
            super("phone_number_login", lhd.e.c, null);
        }
    }

    /* renamed from: khd$i */
    public static final class i extends khd {
        public static final i c = new i();

        private i() {
            super("phone_number_reg", lhd.f.c, null);
        }
    }

    /* renamed from: khd$j */
    public static final class j extends khd {
        public static final j c = new j();

        private j() {
            super("samsung_login", lhd.g.c, null);
        }
    }

    /* renamed from: khd$k */
    public static final class k extends khd {
        public static final k c = new k();

        private k() {
            super("samsung_reg", lhd.h.c, null);
        }
    }

    /* renamed from: khd$l */
    public static abstract class l extends khd {

        /* renamed from: khd$l$a */
        public static final class a extends l {
            public static final a c = new a();

            private a() {
                super(lhd.a.c, null);
            }
        }

        /* renamed from: khd$l$b */
        public static final class b extends l {
            public static final b c = new b();

            private b() {
                super(lhd.b.c, null);
            }
        }

        public l(lhd lhd, kotlin.jvm.internal.f fVar) {
            super("smartlock_login", lhd, null);
        }
    }

    public khd(String str, lhd lhd, kotlin.jvm.internal.f fVar) {
        this.a = str;
        this.b = lhd;
    }

    public final String a() {
        return this.a;
    }

    public final lhd b() {
        return this.b;
    }
}
