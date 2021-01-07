package com.spotify.music.libs.mediasession;

import com.google.common.base.Optional;
import com.spotify.music.libs.mediasession.h0;

final class a0 extends h0.a {
    private final Optional<String> a;
    private final Optional<String> b;
    private final boolean c;
    private final Optional<Boolean> d;

    a0(Optional optional, Optional optional2, boolean z, Optional optional3, a aVar) {
        this.a = optional;
        this.b = optional2;
        this.c = z;
        this.d = optional3;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.mediasession.h0.a
    public Optional<String> a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.mediasession.h0.a
    public boolean c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.mediasession.h0.a
    public Optional<Boolean> d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.mediasession.h0.a
    public h0.a.AbstractC0297a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.a)) {
            return false;
        }
        h0.a aVar = (h0.a) obj;
        if (!this.a.equals(aVar.a()) || !this.b.equals(aVar.f()) || this.c != aVar.c() || !this.d.equals(aVar.d())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.mediasession.h0.a
    public Optional<String> f() {
        return this.b;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("MediaSessionExtrasHolder{contextUri=");
        V0.append(this.a);
        V0.append(", trackUri=");
        V0.append(this.b);
        V0.append(", hasOverridePolicy=");
        V0.append(this.c);
        V0.append(", localPlayback=");
        return je.F0(V0, this.d, "}");
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h0.a.AbstractC0297a {
        private Optional<String> a = Optional.absent();
        private Optional<String> b = Optional.absent();
        private Boolean c;
        private Optional<Boolean> d = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.libs.mediasession.h0.a.AbstractC0297a
        public h0.a a() {
            String str = this.c == null ? " hasOverridePolicy" : "";
            if (str.isEmpty()) {
                return new a0(this.a, this.b, this.c.booleanValue(), this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.mediasession.h0.a.AbstractC0297a
        public h0.a.AbstractC0297a b(Optional<String> optional) {
            this.a = optional;
            return this;
        }

        @Override // com.spotify.music.libs.mediasession.h0.a.AbstractC0297a
        public h0.a.AbstractC0297a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.mediasession.h0.a.AbstractC0297a
        public h0.a.AbstractC0297a d(Optional<Boolean> optional) {
            this.d = optional;
            return this;
        }

        @Override // com.spotify.music.libs.mediasession.h0.a.AbstractC0297a
        public h0.a.AbstractC0297a e(Optional<String> optional) {
            this.b = optional;
            return this;
        }

        b(h0.a aVar, a aVar2) {
            this.a = aVar.a();
            this.b = aVar.f();
            this.c = Boolean.valueOf(aVar.c());
            this.d = aVar.d();
        }
    }
}
