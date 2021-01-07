package com.spotify.music.features.profile.model;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.e;

/* access modifiers changed from: package-private */
public abstract class a extends e {
    private final LoadingState b;
    private final ImmutableList<ProfileListItem> c;

    /* access modifiers changed from: package-private */
    public static final class b extends e.a {
        private LoadingState a;
        private ImmutableList<ProfileListItem> b;

        b() {
        }

        @Override // com.spotify.music.features.profile.model.e.a
        public e a() {
            String str = this.a == null ? " loadingState" : "";
            if (this.b == null) {
                str = je.x0(str, " items");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.profile.model.e.a
        public e.a b(ImmutableList<ProfileListItem> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        @Override // com.spotify.music.features.profile.model.e.a
        public e.a c(LoadingState loadingState) {
            this.a = loadingState;
            return this;
        }

        b(e eVar, C0250a aVar) {
            this.a = eVar.c();
            this.b = eVar.b();
        }
    }

    a(LoadingState loadingState, ImmutableList<ProfileListItem> immutableList) {
        if (loadingState != null) {
            this.b = loadingState;
            if (immutableList != null) {
                this.c = immutableList;
                return;
            }
            throw new NullPointerException("Null items");
        }
        throw new NullPointerException("Null loadingState");
    }

    @Override // com.spotify.music.features.profile.model.e
    public ImmutableList<ProfileListItem> b() {
        return this.c;
    }

    @Override // com.spotify.music.features.profile.model.e
    public LoadingState c() {
        return this.b;
    }

    @Override // com.spotify.music.features.profile.model.e
    public e.a e() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.b.equals(eVar.c()) || !this.c.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ProfileListData{loadingState=");
        V0.append(this.b);
        V0.append(", items=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
