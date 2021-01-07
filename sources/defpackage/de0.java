package defpackage;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;

/* renamed from: de0  reason: default package */
public abstract class de0 {
    private final EventIdentifier a;

    /* renamed from: de0$a */
    public static final class a extends de0 {
        private final int b;

        public a(int i) {
            super(EventIdentifier.GOOGLE_PLAY_SERVICES_STATUS, null);
            this.b = i;
        }

        public final int b() {
            return this.b;
        }
    }

    /* renamed from: de0$b */
    public static final class b extends de0 {
        public static final b b = new b();

        private b() {
            super(EventIdentifier.SMARTLOCK_DELETE_CREDENTIALS_FAILURE, null);
        }
    }

    /* renamed from: de0$c */
    public static final class c extends de0 {
        public static final c b = new c();

        private c() {
            super(EventIdentifier.SMARTLOCK_DELETE_CREDENTIALS_SUCCESS, null);
        }
    }

    /* renamed from: de0$d */
    public static final class d extends de0 {
        public static final d b = new d();

        private d() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_EMPTY, null);
        }
    }

    /* renamed from: de0$e */
    public static final class e extends de0 {
        public static final e b = new e();

        private e() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_FAILURE, null);
        }
    }

    /* renamed from: de0$f */
    public static final class f extends de0 {
        public static final f b = new f();

        private f() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_RESOLUTION_STARTED, null);
        }
    }

    /* renamed from: de0$g */
    public static final class g extends de0 {
        public static final g b = new g();

        private g() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_RESOLUTION_STOPPED, null);
        }
    }

    /* renamed from: de0$h */
    public static final class h extends de0 {
        public static final h b = new h();

        private h() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_SIGN_IN_REQUIRED, null);
        }
    }

    /* renamed from: de0$i */
    public static final class i extends de0 {
        public static final i b = new i();

        private i() {
            super(EventIdentifier.SMARTLOCK_LOAD_CREDENTIALS_SUCCESS, null);
        }
    }

    /* renamed from: de0$j */
    public static final class j extends de0 {
        public static final j b = new j();

        private j() {
            super(EventIdentifier.SMARTLOCK_LOAD_HINTS_FAILURE, null);
        }
    }

    /* renamed from: de0$k */
    public static final class k extends de0 {
        public static final k b = new k();

        private k() {
            super(EventIdentifier.SMARTLOCK_LOAD_HINTS_STARTED, null);
        }
    }

    /* renamed from: de0$l */
    public static final class l extends de0 {
        public static final l b = new l();

        private l() {
            super(EventIdentifier.SMARTLOCK_LOAD_HINTS_SUCCESS, null);
        }
    }

    /* renamed from: de0$m */
    public static final class m extends de0 {
        public static final m b = new m();

        private m() {
            super(EventIdentifier.SMARTLOCK_MISSING_API_FAILURE, null);
        }
    }

    /* renamed from: de0$n */
    public static final class n extends de0 {
        public static final n b = new n();

        private n() {
            super(EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_ACCEPTED, null);
        }
    }

    /* renamed from: de0$o */
    public static final class o extends de0 {
        public static final o b = new o();

        private o() {
            super(EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_DISMISSED, null);
        }
    }

    /* renamed from: de0$p */
    public static final class p extends de0 {
        public static final p b = new p();

        private p() {
            super(EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_FAILURE, null);
        }
    }

    /* renamed from: de0$q */
    public static final class q extends de0 {
        public static final q b = new q();

        private q() {
            super(EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_RESOLUTION_STARTED, null);
        }
    }

    /* renamed from: de0$r */
    public static final class r extends de0 {
        public static final r b = new r();

        private r() {
            super(EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_SUCCESS, null);
        }
    }

    public de0(EventIdentifier eventIdentifier, kotlin.jvm.internal.f fVar) {
        this.a = eventIdentifier;
    }

    public final EventIdentifier a() {
        return this.a;
    }
}
