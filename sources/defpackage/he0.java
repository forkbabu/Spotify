package defpackage;

import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;

/* renamed from: he0  reason: default package */
public abstract class he0 {
    private final ErrorTypeIdentifier a;

    /* renamed from: he0$a */
    public static final class a extends he0 {
        public static final a b = new a();

        private a() {
            super(ErrorTypeIdentifier.TOO_OLD_AGE, null);
        }
    }

    /* renamed from: he0$b */
    public static final class b extends he0 {
        public static final b b = new b();

        private b() {
            super(ErrorTypeIdentifier.TOO_YOUNG_AGE, null);
        }
    }

    /* renamed from: he0$c */
    public static final class c extends he0 {
        public static final c b = new c();

        private c() {
            super(ErrorTypeIdentifier.AGE_GENERIC, null);
        }
    }

    /* renamed from: he0$d */
    public static final class d extends he0 {
        public static final d b = new d();

        private d() {
            super(ErrorTypeIdentifier.EMAIL_ALREADY_EXIST, null);
        }
    }

    /* renamed from: he0$e */
    public static final class e extends he0 {
        public static final e b = new e();

        private e() {
            super(ErrorTypeIdentifier.EMAIL_FORMAT_WRONG, null);
        }
    }

    /* renamed from: he0$f */
    public static final class f extends he0 {
        public static final f b = new f();

        private f() {
            super(ErrorTypeIdentifier.FACEBOOK_EMAIL_EXISTS, null);
        }
    }

    /* renamed from: he0$g */
    public static final class g extends he0 {
        public static final g b = new g();

        private g() {
            super(ErrorTypeIdentifier.GENERIC, null);
        }
    }

    /* renamed from: he0$h */
    public static final class h extends he0 {
        public static final h b = new h();

        private h() {
            super(ErrorTypeIdentifier.INVALID_COUNTRY, null);
        }
    }

    /* renamed from: he0$i */
    public static final class i extends he0 {
        public static final i b = new i();

        private i() {
            super(ErrorTypeIdentifier.INVALID_FORM_DATA, null);
        }
    }

    /* renamed from: he0$j */
    public static final class j extends he0 {
        public static final j b = new j();

        private j() {
            super(ErrorTypeIdentifier.INVALID_USERNAME_OR_PASSWORD, null);
        }
    }

    /* renamed from: he0$k */
    public static final class k extends he0 {
        public static final k b = new k();

        private k() {
            super(ErrorTypeIdentifier.LOGIN_WHILE_SESSION_ALREADY_EXISTS, null);
        }
    }

    /* renamed from: he0$l */
    public static final class l extends he0 {
        public static final l b = new l();

        private l() {
            super(ErrorTypeIdentifier.NO_CONNECTION, null);
        }
    }

    /* renamed from: he0$m */
    public static final class m extends he0 {
        public static final m b = new m();

        private m() {
            super(ErrorTypeIdentifier.REGION_MISSMATCH, null);
        }
    }

    /* renamed from: he0$n */
    public static final class n extends he0 {
        public static final n b = new n();

        private n() {
            super(ErrorTypeIdentifier.REQUEST_FROM_DATACENTER, null);
        }
    }

    /* renamed from: he0$o */
    public static final class o extends he0 {
        public static final o b = new o();

        private o() {
            super(ErrorTypeIdentifier.SAMSUNG_EFFORTLESS_LOGIN_FAILURE, null);
        }
    }

    /* renamed from: he0$p */
    public static final class p extends he0 {
        public static final p b = new p();

        private p() {
            super(ErrorTypeIdentifier.SIGNUP_CONFIGURATION_FETCH_FAILED, null);
        }
    }

    /* renamed from: he0$q */
    public static final class q extends he0 {
        public static final q b = new q();

        private q() {
            super(ErrorTypeIdentifier.THIRD_PARTY_AUTH_FAILED, null);
        }
    }

    /* renamed from: he0$r */
    public static final class r extends he0 {
        public static final r b = new r();

        private r() {
            super(ErrorTypeIdentifier.THIRD_PARTY_AUTH_NO_EMAIL, null);
        }
    }

    /* renamed from: he0$s */
    public static final class s extends he0 {
        public static final s b = new s();

        private s() {
            super(ErrorTypeIdentifier.TOO_SHORT_PASSWORD, null);
        }
    }

    /* renamed from: he0$t */
    public static final class t extends he0 {
        public static final t b = new t();

        private t() {
            super(ErrorTypeIdentifier.TOO_WEAK_PASSWORD, null);
        }
    }

    public he0(ErrorTypeIdentifier errorTypeIdentifier, kotlin.jvm.internal.f fVar) {
        this.a = errorTypeIdentifier;
    }

    public final ErrorTypeIdentifier a() {
        return this.a;
    }
}
