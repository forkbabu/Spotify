package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.features.findfriends.p0;
import com.spotify.music.libs.facebook.SocialState;

final class o0 extends p0 {
    private final Optional<SocialState> b;
    private final Optional<FindFriendsModel> c;
    private final Optional<Boolean> d;

    o0(Optional optional, Optional optional2, Optional optional3, a aVar) {
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // com.spotify.music.features.findfriends.p0
    public Optional<FindFriendsModel> a() {
        return this.c;
    }

    @Override // com.spotify.music.features.findfriends.p0
    public Optional<Boolean> b() {
        return this.d;
    }

    @Override // com.spotify.music.features.findfriends.p0
    public Optional<SocialState> c() {
        return this.b;
    }

    @Override // com.spotify.music.features.findfriends.p0
    public p0.a d() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!this.b.equals(p0Var.c()) || !this.c.equals(p0Var.a()) || !this.d.equals(p0Var.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("FindFriendsData{socialState=");
        V0.append(this.b);
        V0.append(", findFriendsModel=");
        V0.append(this.c);
        V0.append(", reconnectRequired=");
        return je.F0(V0, this.d, "}");
    }

    static final class b extends p0.a {
        private Optional<SocialState> a = Optional.absent();
        private Optional<FindFriendsModel> b = Optional.absent();
        private Optional<Boolean> c = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.features.findfriends.p0.a
        public p0 a() {
            return new o0(this.a, this.b, this.c, null);
        }

        @Override // com.spotify.music.features.findfriends.p0.a
        public p0.a b(Optional<FindFriendsModel> optional) {
            this.b = optional;
            return this;
        }

        @Override // com.spotify.music.features.findfriends.p0.a
        public p0.a c(Optional<Boolean> optional) {
            this.c = optional;
            return this;
        }

        @Override // com.spotify.music.features.findfriends.p0.a
        public p0.a d(Optional<SocialState> optional) {
            this.a = optional;
            return this;
        }

        b(p0 p0Var, a aVar) {
            this.a = p0Var.c();
            this.b = p0Var.a();
            this.c = p0Var.b();
        }
    }
}
