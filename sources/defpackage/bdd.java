package defpackage;

import com.google.common.base.Optional;
import defpackage.edd;

/* renamed from: bdd  reason: default package */
final class bdd extends edd {
    private final Optional<com.spotify.music.sociallistening.models.b> b;
    private final Optional<String> c;

    bdd(Optional optional, Optional optional2, a aVar) {
        this.b = optional;
        this.c = optional2;
    }

    @Override // defpackage.edd
    public Optional<com.spotify.music.sociallistening.models.b> a() {
        return this.b;
    }

    @Override // defpackage.edd
    public edd.a b() {
        return new b(this, null);
    }

    @Override // defpackage.edd
    public Optional<String> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edd)) {
            return false;
        }
        edd edd = (edd) obj;
        if (!this.b.equals(edd.a()) || !this.c.equals(edd.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ParticipantListDataModel{socialListeningState=");
        V0.append(this.b);
        V0.append(", username=");
        return je.F0(V0, this.c, "}");
    }

    /* renamed from: bdd$b */
    static final class b extends edd.a {
        private Optional<com.spotify.music.sociallistening.models.b> a = Optional.absent();
        private Optional<String> b = Optional.absent();

        b() {
        }

        @Override // defpackage.edd.a
        public edd a() {
            return new bdd(this.a, this.b, null);
        }

        @Override // defpackage.edd.a
        public edd.a b(Optional<com.spotify.music.sociallistening.models.b> optional) {
            this.a = optional;
            return this;
        }

        @Override // defpackage.edd.a
        public edd.a c(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        b(edd edd, a aVar) {
            this.a = edd.a();
            this.b = edd.c();
        }
    }
}
