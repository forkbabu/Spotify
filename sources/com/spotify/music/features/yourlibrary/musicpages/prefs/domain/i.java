package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;

final class i extends m {
    private final int a;
    private final Optional<String> b;
    private final Optional<PrefsModel> c;
    private final ImmutableList<u3<String, Long>> d;

    i(int i, Optional optional, Optional optional2, ImmutableList immutableList, a aVar) {
        this.a = i;
        this.b = optional;
        this.c = optional2;
        this.d = immutableList;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m
    public int b() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m
    public ImmutableList<u3<String, Long>> c() {
        return this.d;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m
    public Optional<PrefsModel> d() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m
    public m.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a != mVar.b() || !this.b.equals(mVar.f()) || !this.c.equals(mVar.d()) || !this.d.equals(mVar.c())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m
    public Optional<String> f() {
        return this.b;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicPagesPrefsModel{maxEntries=");
        V0.append(this.a);
        V0.append(", username=");
        V0.append(this.b);
        V0.append(", prefsModel=");
        V0.append(this.c);
        V0.append(", pendingPagePrefsAccess=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m.a {
        private Integer a;
        private Optional<String> b = Optional.absent();
        private Optional<PrefsModel> c = Optional.absent();
        private ImmutableList<u3<String, Long>> d;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a
        public m a() {
            String str = this.a == null ? " maxEntries" : "";
            if (this.d == null) {
                str = je.x0(str, " pendingPagePrefsAccess");
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a
        public m.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a
        public m.a c(ImmutableList<u3<String, Long>> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null pendingPagePrefsAccess");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a
        public m.a d(Optional<PrefsModel> optional) {
            this.c = optional;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m.a
        public m.a e(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        b(m mVar, a aVar) {
            this.a = Integer.valueOf(mVar.b());
            this.b = mVar.f();
            this.c = mVar.d();
            this.d = mVar.c();
        }
    }
}
