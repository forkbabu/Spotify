package com.spotify.music.features.settings;

import com.spotify.music.features.settings.h1;

final class r0 extends h1 {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    /* access modifiers changed from: package-private */
    public static final class b extends h1.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        b() {
        }

        public h1.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public h1 b() {
            String str = this.a == null ? " offlineEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " podcastsInYourLibraryEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " highBitrateEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " localFilesImportEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " nftDisabled");
            }
            if (this.f == null) {
                str = je.x0(str, " adsSettingsEnabled");
            }
            if (this.g == null) {
                str = je.x0(str, " loudnessLevelsUIEnabled");
            }
            if (this.h == null) {
                str = je.x0(str, " languageOnboardingEnabled");
            }
            if (str.isEmpty()) {
                return new r0(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public h1.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public h1.a d(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public h1.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public h1.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public h1.a g(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public h1.a h(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public h1.a i(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    r0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, a aVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean a() {
        return this.g;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean b() {
        return this.d;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean c() {
        return this.i;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean d() {
        return this.e;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.b == h1Var.g() && this.c == h1Var.h() && this.d == h1Var.b() && this.e == h1Var.d() && this.f == h1Var.f() && this.g == h1Var.a() && this.h == h1Var.e() && this.i == h1Var.c()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean g() {
        return this.b;
    }

    @Override // com.spotify.music.features.settings.h1
    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003;
        if (!this.i) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SettingsProductStates{offlineEnabled=");
        V0.append(this.b);
        V0.append(", podcastsInYourLibraryEnabled=");
        V0.append(this.c);
        V0.append(", highBitrateEnabled=");
        V0.append(this.d);
        V0.append(", localFilesImportEnabled=");
        V0.append(this.e);
        V0.append(", nftDisabled=");
        V0.append(this.f);
        V0.append(", adsSettingsEnabled=");
        V0.append(this.g);
        V0.append(", loudnessLevelsUIEnabled=");
        V0.append(this.h);
        V0.append(", languageOnboardingEnabled=");
        return je.P0(V0, this.i, "}");
    }
}
