package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

final class ud extends AndroidFeatureHomeProperties {
    private final boolean a;
    private final int b;
    private final AndroidFeatureHomeProperties.HomePageloader c;
    private final boolean d;
    private final AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final AndroidFeatureHomeProperties.VoiceMicPermissionPrompt i;

    static final class b extends AndroidFeatureHomeProperties.a {
        private Boolean a;
        private Integer b;
        private AndroidFeatureHomeProperties.HomePageloader c;
        private Boolean d;
        private AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private AndroidFeatureHomeProperties.VoiceMicPermissionPrompt i;

        b() {
        }

        /* access modifiers changed from: package-private */
        public AndroidFeatureHomeProperties a() {
            String str = this.a == null ? " hideSettingsButton" : "";
            if (this.b == null) {
                str = je.x0(str, " homeInlineOnboarding");
            }
            if (this.c == null) {
                str = je.x0(str, " homePageloader");
            }
            if (this.d == null) {
                str = je.x0(str, " homeUseNewTopBar");
            }
            if (this.e == null) {
                str = je.x0(str, " inlineOnboardingSearchCardPosition");
            }
            if (this.f == null) {
                str = je.x0(str, " listeningHistory");
            }
            if (this.g == null) {
                str = je.x0(str, " protobufEnabled");
            }
            if (this.h == null) {
                str = je.x0(str, " uiimpressionsV2");
            }
            if (this.i == null) {
                str = je.x0(str, " voiceMicPermissionPrompt");
            }
            if (str.isEmpty()) {
                return new ud(this.a.booleanValue(), this.b.intValue(), this.c, this.d.booleanValue(), this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureHomeProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureHomeProperties.a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public AndroidFeatureHomeProperties.a d(AndroidFeatureHomeProperties.HomePageloader homePageloader) {
            if (homePageloader != null) {
                this.c = homePageloader;
                return this;
            }
            throw new NullPointerException("Null homePageloader");
        }

        public AndroidFeatureHomeProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureHomeProperties.a f(AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition inlineOnboardingSearchCardPosition) {
            if (inlineOnboardingSearchCardPosition != null) {
                this.e = inlineOnboardingSearchCardPosition;
                return this;
            }
            throw new NullPointerException("Null inlineOnboardingSearchCardPosition");
        }

        public AndroidFeatureHomeProperties.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureHomeProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureHomeProperties.a i(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureHomeProperties.a j(AndroidFeatureHomeProperties.VoiceMicPermissionPrompt voiceMicPermissionPrompt) {
            if (voiceMicPermissionPrompt != null) {
                this.i = voiceMicPermissionPrompt;
                return this;
            }
            throw new NullPointerException("Null voiceMicPermissionPrompt");
        }
    }

    ud(boolean z, int i2, AndroidFeatureHomeProperties.HomePageloader homePageloader, boolean z2, AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition inlineOnboardingSearchCardPosition, boolean z3, boolean z4, boolean z5, AndroidFeatureHomeProperties.VoiceMicPermissionPrompt voiceMicPermissionPrompt, a aVar) {
        this.a = z;
        this.b = i2;
        this.c = homePageloader;
        this.d = z2;
        this.e = inlineOnboardingSearchCardPosition;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = voiceMicPermissionPrompt;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public int b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public AndroidFeatureHomeProperties.HomePageloader c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeatureHomeProperties)) {
            return false;
        }
        AndroidFeatureHomeProperties androidFeatureHomeProperties = (AndroidFeatureHomeProperties) obj;
        if (this.a == androidFeatureHomeProperties.a() && this.b == androidFeatureHomeProperties.b() && this.c.equals(androidFeatureHomeProperties.c()) && this.d == androidFeatureHomeProperties.d() && this.e.equals(androidFeatureHomeProperties.e()) && this.f == androidFeatureHomeProperties.f() && this.g == androidFeatureHomeProperties.g() && this.h == androidFeatureHomeProperties.h() && this.i.equals(androidFeatureHomeProperties.i())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i2 = 1237;
        }
        return ((hashCode ^ i2) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureHomeProperties
    public AndroidFeatureHomeProperties.VoiceMicPermissionPrompt i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureHomeProperties{hideSettingsButton=");
        V0.append(this.a);
        V0.append(", homeInlineOnboarding=");
        V0.append(this.b);
        V0.append(", homePageloader=");
        V0.append(this.c);
        V0.append(", homeUseNewTopBar=");
        V0.append(this.d);
        V0.append(", inlineOnboardingSearchCardPosition=");
        V0.append(this.e);
        V0.append(", listeningHistory=");
        V0.append(this.f);
        V0.append(", protobufEnabled=");
        V0.append(this.g);
        V0.append(", uiimpressionsV2=");
        V0.append(this.h);
        V0.append(", voiceMicPermissionPrompt=");
        V0.append(this.i);
        V0.append("}");
        return V0.toString();
    }
}
