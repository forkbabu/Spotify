package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Map;

final class s1 extends h2 {
    private final String a;
    private final Optional<Context> b;
    private final Optional<Map<String, String>> c;
    private final Optional<PreparePlayOptions> d;
    private final Optional<PlayOrigin> e;
    private final Optional<LoggingParams> f;
    private final Optional<u1> g;

    /* access modifiers changed from: package-private */
    public static final class b extends h2.a {
        private String a;
        private Optional<Context> b = Optional.absent();
        private Optional<Map<String, String>> c = Optional.absent();
        private Optional<PreparePlayOptions> d = Optional.absent();
        private Optional<PlayOrigin> e = Optional.absent();
        private Optional<LoggingParams> f = Optional.absent();
        private Optional<u1> g = Optional.absent();

        b() {
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a a(u1 u1Var) {
            this.g = Optional.of(u1Var);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2 b() {
            String str = this.a == null ? " uri" : "";
            if (str.isEmpty()) {
                return new s1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a c(Context context) {
            this.b = Optional.of(context);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a d(LoggingParams loggingParams) {
            this.f = Optional.of(loggingParams);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a e(Map<String, String> map) {
            this.c = Optional.of(map);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a f(PlayOrigin playOrigin) {
            this.e = Optional.of(playOrigin);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.h2.a
        public h2.a g(PreparePlayOptions preparePlayOptions) {
            this.d = Optional.of(preparePlayOptions);
            return this;
        }

        /* access modifiers changed from: package-private */
        public h2.a h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    s1(String str, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, a aVar) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
        this.g = optional6;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<u1> a() {
        return this.g;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<Context> d() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<LoggingParams> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        if (!this.a.equals(h2Var.i()) || !this.b.equals(h2Var.d()) || !this.c.equals(h2Var.f()) || !this.d.equals(h2Var.h()) || !this.e.equals(h2Var.g()) || !this.f.equals(h2Var.e()) || !this.g.equals(h2Var.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<Map<String, String>> f() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<PlayOrigin> g() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public Optional<PreparePlayOptions> h() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // com.spotify.mobile.android.service.media.h2
    public String i() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalIntegrationServicePlayCommand{uri=");
        V0.append(this.a);
        V0.append(", context=");
        V0.append(this.b);
        V0.append(", metadata=");
        V0.append(this.c);
        V0.append(", preparePlayOptions=");
        V0.append(this.d);
        V0.append(", playOrigin=");
        V0.append(this.e);
        V0.append(", loggingParams=");
        V0.append(this.f);
        V0.append(", actionCallback=");
        return je.F0(V0, this.g, "}");
    }
}
