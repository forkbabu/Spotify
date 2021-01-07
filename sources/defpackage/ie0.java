package defpackage;

import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;

/* renamed from: ie0  reason: default package */
public abstract class ie0 {
    private final InputFieldIdentifier a;

    /* renamed from: ie0$a */
    public static final class a extends ie0 {
        public static final a b = new a();

        private a() {
            super(InputFieldIdentifier.AGE, null);
        }
    }

    /* renamed from: ie0$b */
    public static final class b extends ie0 {
        public static final b b = new b();

        private b() {
            super(InputFieldIdentifier.DISPLAY_NAME, null);
        }
    }

    /* renamed from: ie0$c */
    public static final class c extends ie0 {
        public static final c b = new c();

        private c() {
            super(InputFieldIdentifier.EMAIL, null);
        }
    }

    /* renamed from: ie0$d */
    public static final class d extends ie0 {
        public static final d b = new d();

        private d() {
            super(InputFieldIdentifier.GENDER, null);
        }
    }

    /* renamed from: ie0$e */
    public static final class e extends ie0 {
        public static final e b = new e();

        private e() {
            super(InputFieldIdentifier.GOOGLE, null);
        }
    }

    /* renamed from: ie0$f */
    public static final class f extends ie0 {
        public static final f b = new f();

        private f() {
            super(InputFieldIdentifier.NONE, null);
        }
    }

    /* renamed from: ie0$g */
    public static final class g extends ie0 {
        public static final g b = new g();

        private g() {
            super(InputFieldIdentifier.PASSWORD, null);
        }
    }

    /* renamed from: ie0$h */
    public static final class h extends ie0 {
        public static final h b = new h();

        private h() {
            super(InputFieldIdentifier.PERSONAL_INFORMATION_POLICY, null);
        }
    }

    /* renamed from: ie0$i */
    public static final class i extends ie0 {
        public static final i b = new i();

        private i() {
            super(InputFieldIdentifier.THIRD_PARTY_POLICY, null);
        }
    }

    /* renamed from: ie0$j */
    public static final class j extends ie0 {
        public static final j b = new j();

        private j() {
            super(InputFieldIdentifier.USERNAME, null);
        }
    }

    public ie0(InputFieldIdentifier inputFieldIdentifier, kotlin.jvm.internal.f fVar) {
        this.a = inputFieldIdentifier;
    }

    public final InputFieldIdentifier a() {
        return this.a;
    }
}
