package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.mpa;

/* renamed from: kpa  reason: default package */
final class kpa extends mpa {
    private final com.spotify.playlist.models.offline.a a;
    private final LottieAnimationView b;
    private final vqc c;
    private final String d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: kpa$b */
    public static final class b implements mpa.a {
        private com.spotify.playlist.models.offline.a a;
        private LottieAnimationView b;
        private vqc c;
        private String d;
        private String e;

        b() {
        }

        @Override // defpackage.mpa.a
        public mpa.a a(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null episodeName");
        }

        @Override // defpackage.mpa.a
        public mpa.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.mpa.a
        public mpa build() {
            String str = this.a == null ? " offlineState" : "";
            if (this.b == null) {
                str = je.x0(str, " animationView");
            }
            if (this.c == null) {
                str = je.x0(str, " lottieIconStateMachine");
            }
            if (this.d == null) {
                str = je.x0(str, " id");
            }
            if (this.e == null) {
                str = je.x0(str, " episodeName");
            }
            if (str.isEmpty()) {
                return new kpa(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mpa.a
        public mpa.a e(com.spotify.playlist.models.offline.a aVar) {
            if (aVar != null) {
                this.a = aVar;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        @Override // defpackage.mpa.a
        public mpa.a f(vqc vqc) {
            if (vqc != null) {
                this.c = vqc;
                return this;
            }
            throw new NullPointerException("Null lottieIconStateMachine");
        }

        @Override // defpackage.mpa.a
        public mpa.a g(LottieAnimationView lottieAnimationView) {
            if (lottieAnimationView != null) {
                this.b = lottieAnimationView;
                return this;
            }
            throw new NullPointerException("Null animationView");
        }
    }

    kpa(com.spotify.playlist.models.offline.a aVar, LottieAnimationView lottieAnimationView, vqc vqc, String str, String str2, a aVar2) {
        this.a = aVar;
        this.b = lottieAnimationView;
        this.c = vqc;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.mpa
    public LottieAnimationView a() {
        return this.b;
    }

    @Override // defpackage.mpa
    public String c() {
        return this.e;
    }

    @Override // defpackage.mpa
    public String d() {
        return this.d;
    }

    @Override // defpackage.mpa
    public vqc e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpa)) {
            return false;
        }
        mpa mpa = (mpa) obj;
        if (!this.a.equals(mpa.f()) || !this.b.equals(mpa.a()) || !this.c.equals(mpa.e()) || !this.d.equals(mpa.d()) || !this.e.equals(mpa.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mpa
    public com.spotify.playlist.models.offline.a f() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineStateLottieIconBinderModel{offlineState=");
        V0.append(this.a);
        V0.append(", animationView=");
        V0.append(this.b);
        V0.append(", lottieIconStateMachine=");
        V0.append(this.c);
        V0.append(", id=");
        V0.append(this.d);
        V0.append(", episodeName=");
        return je.I0(V0, this.e, "}");
    }
}
