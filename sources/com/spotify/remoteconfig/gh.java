package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsVoiceProperties;

final class gh extends AndroidLibsVoiceProperties {
    private final AndroidLibsVoiceProperties.VoiceAsrBackend a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final AndroidLibsVoiceProperties.VoiceEndpointBackend m;

    static final class b extends AndroidLibsVoiceProperties.a {
        private AndroidLibsVoiceProperties.VoiceAsrBackend a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private AndroidLibsVoiceProperties.VoiceEndpointBackend m;

        b() {
        }

        public AndroidLibsVoiceProperties a() {
            String str = this.a == null ? " voiceAsrBackend" : "";
            if (this.b == null) {
                str = je.x0(str, " voiceDisableAltSearchResuls");
            }
            if (this.c == null) {
                str = je.x0(str, " voiceEnableFavoritesDialog");
            }
            if (this.d == null) {
                str = je.x0(str, " voiceEnableGuessingGame");
            }
            if (this.e == null) {
                str = je.x0(str, " voiceEnableIntroducerDialog");
            }
            if (this.f == null) {
                str = je.x0(str, " voiceEnablePlaySomething");
            }
            if (this.g == null) {
                str = je.x0(str, " voiceEnableRecommendDialog");
            }
            if (this.h == null) {
                str = je.x0(str, " voiceEnableShowIntent");
            }
            if (this.i == null) {
                str = je.x0(str, " voiceEnableTts");
            }
            if (this.j == null) {
                str = je.x0(str, " voiceEnableUmmDialog");
            }
            if (this.k == null) {
                str = je.x0(str, " voiceEnableUserEducation");
            }
            if (this.l == null) {
                str = je.x0(str, " voiceEnableUserEducationShowMessage");
            }
            if (this.m == null) {
                str = je.x0(str, " voiceEndpointBackend");
            }
            if (str.isEmpty()) {
                return new gh(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsVoiceProperties.a b(AndroidLibsVoiceProperties.VoiceAsrBackend voiceAsrBackend) {
            if (voiceAsrBackend != null) {
                this.a = voiceAsrBackend;
                return this;
            }
            throw new NullPointerException("Null voiceAsrBackend");
        }

        public AndroidLibsVoiceProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a i(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a j(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a k(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a l(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a m(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsVoiceProperties.a n(AndroidLibsVoiceProperties.VoiceEndpointBackend voiceEndpointBackend) {
            if (voiceEndpointBackend != null) {
                this.m = voiceEndpointBackend;
                return this;
            }
            throw new NullPointerException("Null voiceEndpointBackend");
        }
    }

    gh(AndroidLibsVoiceProperties.VoiceAsrBackend voiceAsrBackend, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, AndroidLibsVoiceProperties.VoiceEndpointBackend voiceEndpointBackend, a aVar) {
        this.a = voiceAsrBackend;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = voiceEndpointBackend;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public AndroidLibsVoiceProperties.VoiceAsrBackend a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsVoiceProperties)) {
            return false;
        }
        AndroidLibsVoiceProperties androidLibsVoiceProperties = (AndroidLibsVoiceProperties) obj;
        if (this.a.equals(androidLibsVoiceProperties.a()) && this.b == androidLibsVoiceProperties.b() && this.c == androidLibsVoiceProperties.c() && this.d == androidLibsVoiceProperties.d() && this.e == androidLibsVoiceProperties.e() && this.f == androidLibsVoiceProperties.f() && this.g == androidLibsVoiceProperties.g() && this.h == androidLibsVoiceProperties.h() && this.i == androidLibsVoiceProperties.i() && this.j == androidLibsVoiceProperties.j() && this.k == androidLibsVoiceProperties.k() && this.l == androidLibsVoiceProperties.l() && this.m.equals(androidLibsVoiceProperties.m())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return ((hashCode ^ i2) * 1000003) ^ this.m.hashCode();
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean i() {
        return this.i;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean j() {
        return this.j;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean k() {
        return this.k;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public boolean l() {
        return this.l;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceProperties
    public AndroidLibsVoiceProperties.VoiceEndpointBackend m() {
        return this.m;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsVoiceProperties{voiceAsrBackend=");
        V0.append(this.a);
        V0.append(", voiceDisableAltSearchResuls=");
        V0.append(this.b);
        V0.append(", voiceEnableFavoritesDialog=");
        V0.append(this.c);
        V0.append(", voiceEnableGuessingGame=");
        V0.append(this.d);
        V0.append(", voiceEnableIntroducerDialog=");
        V0.append(this.e);
        V0.append(", voiceEnablePlaySomething=");
        V0.append(this.f);
        V0.append(", voiceEnableRecommendDialog=");
        V0.append(this.g);
        V0.append(", voiceEnableShowIntent=");
        V0.append(this.h);
        V0.append(", voiceEnableTts=");
        V0.append(this.i);
        V0.append(", voiceEnableUmmDialog=");
        V0.append(this.j);
        V0.append(", voiceEnableUserEducation=");
        V0.append(this.k);
        V0.append(", voiceEnableUserEducationShowMessage=");
        V0.append(this.l);
        V0.append(", voiceEndpointBackend=");
        V0.append(this.m);
        V0.append("}");
        return V0.toString();
    }
}
