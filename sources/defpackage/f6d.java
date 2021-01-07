package defpackage;

import com.google.common.base.Optional;
import defpackage.k6d;

/* renamed from: f6d  reason: default package */
final class f6d extends k6d {
    private final Optional<com.spotify.music.sociallistening.models.b> b;
    private final Optional<Boolean> c;
    private final k6d.b d;

    f6d(Optional optional, Optional optional2, k6d.b bVar, a aVar) {
        this.b = optional;
        this.c = optional2;
        this.d = bVar;
    }

    @Override // defpackage.k6d
    public Optional<Boolean> a() {
        return this.c;
    }

    @Override // defpackage.k6d
    public Optional<com.spotify.music.sociallistening.models.b> b() {
        return this.b;
    }

    @Override // defpackage.k6d
    public k6d.a c() {
        return new b(this, null);
    }

    @Override // defpackage.k6d
    public k6d.b d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6d)) {
            return false;
        }
        k6d k6d = (k6d) obj;
        if (!this.b.equals(k6d.b()) || !this.c.equals(k6d.a()) || !this.d.equals(k6d.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SocialListeningDeviceModel{socialListeningState=");
        V0.append(this.b);
        V0.append(", isOnline=");
        V0.append(this.c);
        V0.append(", uiState=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }

    /* renamed from: f6d$b */
    static final class b extends k6d.a {
        private Optional<com.spotify.music.sociallistening.models.b> a = Optional.absent();
        private Optional<Boolean> b = Optional.absent();
        private k6d.b c;

        b() {
        }

        @Override // defpackage.k6d.a
        public k6d a() {
            String str = this.c == null ? " uiState" : "";
            if (str.isEmpty()) {
                return new f6d(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.k6d.a
        public k6d.a b(Optional<Boolean> optional) {
            this.b = optional;
            return this;
        }

        @Override // defpackage.k6d.a
        public k6d.a c(Optional<com.spotify.music.sociallistening.models.b> optional) {
            this.a = optional;
            return this;
        }

        @Override // defpackage.k6d.a
        public k6d.a d(k6d.b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null uiState");
        }

        b(k6d k6d, a aVar) {
            this.a = k6d.b();
            this.b = k6d.a();
            this.c = k6d.d();
        }
    }
}
