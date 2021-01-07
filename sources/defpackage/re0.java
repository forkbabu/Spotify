package defpackage;

import kotlin.jvm.internal.f;

/* renamed from: re0  reason: default package */
public abstract class re0 {
    private final String a;

    /* renamed from: re0$a */
    public static final class a extends re0 {
        public static final a b = new a();

        private a() {
            super("login_email", null);
        }
    }

    /* renamed from: re0$b */
    public static final class b extends re0 {
        public static final b b = new b();

        private b() {
            super("login_email_remember", null);
        }
    }

    /* renamed from: re0$c */
    public static final class c extends re0 {
        public static final c b = new c();

        private c() {
            super("login_facebook", null);
        }
    }

    /* renamed from: re0$d */
    public static final class d extends re0 {
        public static final d b = new d();

        private d() {
            super("pses_resolution", null);
        }
    }

    /* renamed from: re0$e */
    public static final class e extends re0 {
        public static final e b = new e();

        private e() {
            super("welcome_image", null);
        }
    }

    public re0(String str, f fVar) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
