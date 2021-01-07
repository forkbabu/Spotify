package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.yourlibrary.musicpages.pages.v;
import com.spotify.music.libs.viewuri.c;

final class o extends v {
    private final ImmutableList<LinkType> a;
    private final Optional<c> b;
    private final Optional<c.b> c;
    private final com.spotify.instrumentation.a d;
    private final ifd e;

    /* access modifiers changed from: package-private */
    public static final class b extends v.a {
        private ImmutableList<LinkType> a;
        private Optional<c> b = Optional.absent();
        private Optional<c.b> c = Optional.absent();
        private com.spotify.instrumentation.a d;
        private ifd e;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v.a a(ImmutableList<LinkType> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null acceptLinkTypes");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v b() {
            String str = this.a == null ? " acceptLinkTypes" : "";
            if (this.d == null) {
                str = je.x0(str, " pageIdentifier");
            }
            if (this.e == null) {
                str = je.x0(str, " featureIdentifier");
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v.a c(ifd ifd) {
            this.e = ifd;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v.a d(com.spotify.instrumentation.a aVar) {
            this.d = aVar;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v.a e(Optional<c> optional) {
            this.b = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v.a
        public v.a f(Optional<c.b> optional) {
            this.c = optional;
            return this;
        }
    }

    o(ImmutableList immutableList, Optional optional, Optional optional2, com.spotify.instrumentation.a aVar, ifd ifd, a aVar2) {
        this.a = immutableList;
        this.b = optional;
        this.c = optional2;
        this.d = aVar;
        this.e = ifd;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v
    public ImmutableList<LinkType> a() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v
    public ifd c() {
        return this.e;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v
    public com.spotify.instrumentation.a d() {
        return this.d;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v
    public Optional<c> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.a.equals(vVar.a()) || !this.b.equals(vVar.e()) || !this.c.equals(vVar.f()) || !this.d.equals(vVar.d()) || !this.e.equals(vVar.c())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.pages.v
    public Optional<c.b> f() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicPageIdentifiers{acceptLinkTypes=");
        V0.append(this.a);
        V0.append(", viewUri=");
        V0.append(this.b);
        V0.append(", viewUriVerifier=");
        V0.append(this.c);
        V0.append(", pageIdentifier=");
        V0.append(this.d);
        V0.append(", featureIdentifier=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
