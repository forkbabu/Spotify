package defpackage;

import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;

/* renamed from: ge0  reason: default package */
public abstract class ge0 {
    private final DialogIdentifier a;

    /* renamed from: ge0$a */
    public static final class a extends ge0 {
        public static final a b = new a();

        private a() {
            super(DialogIdentifier.EMAIL_ALREADY_EXIST, null);
        }
    }

    /* renamed from: ge0$b */
    public static final class b extends ge0 {
        public static final b b = new b();

        private b() {
            super(DialogIdentifier.FACEBOOK_LOGIN_ERROR, null);
        }
    }

    /* renamed from: ge0$c */
    public static final class c extends ge0 {
        public static final c b = new c();

        private c() {
            super(DialogIdentifier.FACEBOOK_REGISTRATION_DISABLED_POPUP, null);
        }
    }

    /* renamed from: ge0$d */
    public static final class d extends ge0 {
        public static final d b = new d();

        private d() {
            super(DialogIdentifier.GOOGLE_LOGIN_ERROR, null);
        }
    }

    /* renamed from: ge0$e */
    public static final class e extends ge0 {
        public static final e b = new e();

        private e() {
            super(DialogIdentifier.GOOGLE_REGISTRATION_DISABLED_POPUP, null);
        }
    }

    /* renamed from: ge0$f */
    public static final class f extends ge0 {
        public static final f b = new f();

        private f() {
            super(DialogIdentifier.NO_NETWORK_ERROR, null);
        }
    }

    /* renamed from: ge0$g */
    public static final class g extends ge0 {
        public static final g b = new g();

        private g() {
            super(DialogIdentifier.RESET_PASSWORD_GET_HELP, null);
        }
    }

    /* renamed from: ge0$h */
    public static final class h extends ge0 {
        public static final h b = new h();

        private h() {
            super(DialogIdentifier.SIGNUP_POLICY, null);
        }
    }

    /* renamed from: ge0$i */
    public static final class i extends ge0 {
        public static final i b = new i();

        private i() {
            super(DialogIdentifier.SIGNUP_TERMS, null);
        }
    }

    /* renamed from: ge0$j */
    public static final class j extends ge0 {
        public static final j b = new j();

        private j() {
            super(DialogIdentifier.SMARTLOCK_NUDGE_POPUP, null);
        }
    }

    /* renamed from: ge0$k */
    public static final class k extends ge0 {
        public static final k b = new k();

        private k() {
            super(DialogIdentifier.NONE, null);
        }
    }

    public ge0(DialogIdentifier dialogIdentifier, kotlin.jvm.internal.f fVar) {
        this.a = dialogIdentifier;
    }

    public final DialogIdentifier a() {
        return this.a;
    }
}
