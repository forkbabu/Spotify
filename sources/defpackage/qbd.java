package defpackage;

import defpackage.tbd;

/* renamed from: qbd  reason: default package */
final class qbd extends tbd {
    private final com.spotify.music.sociallistening.models.b a;
    private final boolean b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: qbd$b */
    public static final class b extends tbd.a {
        private com.spotify.music.sociallistening.models.b a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.tbd.a
        public tbd a() {
            String str = this.a == null ? " socialListeningState" : "";
            if (this.b == null) {
                str = je.x0(str, " hostEducationShown");
            }
            if (this.c == null) {
                str = je.x0(str, " participantEducationShown");
            }
            if (str.isEmpty()) {
                return new qbd(this.a, this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.tbd.a
        public tbd.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.tbd.a
        public tbd.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.tbd.a
        public tbd.a d(com.spotify.music.sociallistening.models.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null socialListeningState");
        }

        b(tbd tbd, a aVar) {
            this.a = tbd.d();
            this.b = Boolean.valueOf(tbd.b());
            this.c = Boolean.valueOf(tbd.c());
        }
    }

    qbd(com.spotify.music.sociallistening.models.b bVar, boolean z, boolean z2, a aVar) {
        this.a = bVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.tbd
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.tbd
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.tbd
    public com.spotify.music.sociallistening.models.b d() {
        return this.a;
    }

    @Override // defpackage.tbd
    public tbd.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tbd)) {
            return false;
        }
        tbd tbd = (tbd) obj;
        if (this.a.equals(tbd.d()) && this.b == tbd.b() && this.c == tbd.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationsModel{socialListeningState=");
        V0.append(this.a);
        V0.append(", hostEducationShown=");
        V0.append(this.b);
        V0.append(", participantEducationShown=");
        return je.P0(V0, this.c, "}");
    }
}
