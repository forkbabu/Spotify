package com.spotify.music.settings;

import com.spotify.music.settings.SettingsState;

final class AutoValue_SettingsState extends SettingsState {
    private final String accessPoint;
    private final boolean automix;
    private final boolean crossfade;
    private final int crossfadeTimeSeconds;
    private final boolean downloadOver3g;
    private final int downloadPreferredResourceType;
    private final int downloadQuality;
    private final boolean gapless;
    private final boolean localDevicesOnly;
    private final int loudnessEnvironment;
    private final boolean normalize;
    private final boolean offlineMode;
    private final boolean playExplicitContent;
    private final boolean privateSession;
    private final int secondsToOfflineExpiry;
    private final boolean showUnavailableTracks;
    private final boolean silenceTrimmer;
    private final int streamNonMeteredQuality;
    private final int streamQuality;
    private final String webgateUrl;

    /* access modifiers changed from: package-private */
    public static final class b extends SettingsState.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private Integer g;
        private String h;
        private Integer i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Integer m;
        private Boolean n;
        private Integer o;
        private Boolean p;
        private Boolean q;
        private String r;
        private Integer s;
        private Boolean t;

        b() {
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a a(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null accessPoint");
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a b(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState c() {
            String str = this.a == null ? " offlineMode" : "";
            if (this.b == null) {
                str = je.x0(str, " playExplicitContent");
            }
            if (this.c == null) {
                str = je.x0(str, " privateSession");
            }
            if (this.d == null) {
                str = je.x0(str, " downloadOver3g");
            }
            if (this.e == null) {
                str = je.x0(str, " downloadQuality");
            }
            if (this.f == null) {
                str = je.x0(str, " streamQuality");
            }
            if (this.g == null) {
                str = je.x0(str, " streamNonMeteredQuality");
            }
            if (this.h == null) {
                str = je.x0(str, " accessPoint");
            }
            if (this.i == null) {
                str = je.x0(str, " secondsToOfflineExpiry");
            }
            if (this.j == null) {
                str = je.x0(str, " gapless");
            }
            if (this.k == null) {
                str = je.x0(str, " automix");
            }
            if (this.l == null) {
                str = je.x0(str, " normalize");
            }
            if (this.m == null) {
                str = je.x0(str, " loudnessEnvironment");
            }
            if (this.n == null) {
                str = je.x0(str, " crossfade");
            }
            if (this.o == null) {
                str = je.x0(str, " crossfadeTimeSeconds");
            }
            if (this.p == null) {
                str = je.x0(str, " showUnavailableTracks");
            }
            if (this.q == null) {
                str = je.x0(str, " localDevicesOnly");
            }
            if (this.r == null) {
                str = je.x0(str, " webgateUrl");
            }
            if (this.s == null) {
                str = je.x0(str, " downloadPreferredResourceType");
            }
            if (this.t == null) {
                str = je.x0(str, " silenceTrimmer");
            }
            if (str.isEmpty()) {
                return new AutoValue_SettingsState(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h, this.i.intValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.intValue(), this.n.booleanValue(), this.o.intValue(), this.p.booleanValue(), this.q.booleanValue(), this.r, this.s.intValue(), this.t.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a d(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a e(int i2) {
            this.o = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a f(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a g(int i2) {
            this.s = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a h(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a i(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a j(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a k(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a l(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a m(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a n(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a o(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a p(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a q(boolean z) {
            this.t = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a r(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a s(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.settings.SettingsState.a
        public SettingsState.a t(String str) {
            if (str != null) {
                this.r = str;
                return this;
            }
            throw new NullPointerException("Null webgateUrl");
        }

        public SettingsState.a u(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    @Override // com.spotify.music.settings.SettingsState
    public String accessPoint() {
        return this.accessPoint;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean automix() {
        return this.automix;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean crossfade() {
        return this.crossfade;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int crossfadeTimeSeconds() {
        return this.crossfadeTimeSeconds;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean downloadOver3g() {
        return this.downloadOver3g;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int downloadPreferredResourceType() {
        return this.downloadPreferredResourceType;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int downloadQuality() {
        return this.downloadQuality;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingsState)) {
            return false;
        }
        SettingsState settingsState = (SettingsState) obj;
        if (this.offlineMode == settingsState.offlineMode() && this.playExplicitContent == settingsState.playExplicitContent() && this.privateSession == settingsState.privateSession() && this.downloadOver3g == settingsState.downloadOver3g() && this.downloadQuality == settingsState.downloadQuality() && this.streamQuality == settingsState.streamQuality() && this.streamNonMeteredQuality == settingsState.streamNonMeteredQuality() && this.accessPoint.equals(settingsState.accessPoint()) && this.secondsToOfflineExpiry == settingsState.secondsToOfflineExpiry() && this.gapless == settingsState.gapless() && this.automix == settingsState.automix() && this.normalize == settingsState.normalize() && this.loudnessEnvironment == settingsState.loudnessEnvironment() && this.crossfade == settingsState.crossfade() && this.crossfadeTimeSeconds == settingsState.crossfadeTimeSeconds() && this.showUnavailableTracks == settingsState.showUnavailableTracks() && this.localDevicesOnly == settingsState.localDevicesOnly() && this.webgateUrl.equals(settingsState.webgateUrl()) && this.downloadPreferredResourceType == settingsState.downloadPreferredResourceType() && this.silenceTrimmer == settingsState.silenceTrimmer()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean gapless() {
        return this.gapless;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((((((((((((((((((((((((((((this.offlineMode ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.playExplicitContent ? 1231 : 1237)) * 1000003) ^ (this.privateSession ? 1231 : 1237)) * 1000003) ^ (this.downloadOver3g ? 1231 : 1237)) * 1000003) ^ this.downloadQuality) * 1000003) ^ this.streamQuality) * 1000003) ^ this.streamNonMeteredQuality) * 1000003) ^ this.accessPoint.hashCode()) * 1000003) ^ this.secondsToOfflineExpiry) * 1000003) ^ (this.gapless ? 1231 : 1237)) * 1000003) ^ (this.automix ? 1231 : 1237)) * 1000003) ^ (this.normalize ? 1231 : 1237)) * 1000003) ^ this.loudnessEnvironment) * 1000003) ^ (this.crossfade ? 1231 : 1237)) * 1000003) ^ this.crossfadeTimeSeconds) * 1000003) ^ (this.showUnavailableTracks ? 1231 : 1237)) * 1000003) ^ (this.localDevicesOnly ? 1231 : 1237)) * 1000003) ^ this.webgateUrl.hashCode()) * 1000003) ^ this.downloadPreferredResourceType) * 1000003;
        if (!this.silenceTrimmer) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean localDevicesOnly() {
        return this.localDevicesOnly;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int loudnessEnvironment() {
        return this.loudnessEnvironment;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean normalize() {
        return this.normalize;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean offlineMode() {
        return this.offlineMode;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean playExplicitContent() {
        return this.playExplicitContent;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean privateSession() {
        return this.privateSession;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int secondsToOfflineExpiry() {
        return this.secondsToOfflineExpiry;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean showUnavailableTracks() {
        return this.showUnavailableTracks;
    }

    @Override // com.spotify.music.settings.SettingsState
    public boolean silenceTrimmer() {
        return this.silenceTrimmer;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int streamNonMeteredQuality() {
        return this.streamNonMeteredQuality;
    }

    @Override // com.spotify.music.settings.SettingsState
    public int streamQuality() {
        return this.streamQuality;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SettingsState{offlineMode=");
        V0.append(this.offlineMode);
        V0.append(", playExplicitContent=");
        V0.append(this.playExplicitContent);
        V0.append(", privateSession=");
        V0.append(this.privateSession);
        V0.append(", downloadOver3g=");
        V0.append(this.downloadOver3g);
        V0.append(", downloadQuality=");
        V0.append(this.downloadQuality);
        V0.append(", streamQuality=");
        V0.append(this.streamQuality);
        V0.append(", streamNonMeteredQuality=");
        V0.append(this.streamNonMeteredQuality);
        V0.append(", accessPoint=");
        V0.append(this.accessPoint);
        V0.append(", secondsToOfflineExpiry=");
        V0.append(this.secondsToOfflineExpiry);
        V0.append(", gapless=");
        V0.append(this.gapless);
        V0.append(", automix=");
        V0.append(this.automix);
        V0.append(", normalize=");
        V0.append(this.normalize);
        V0.append(", loudnessEnvironment=");
        V0.append(this.loudnessEnvironment);
        V0.append(", crossfade=");
        V0.append(this.crossfade);
        V0.append(", crossfadeTimeSeconds=");
        V0.append(this.crossfadeTimeSeconds);
        V0.append(", showUnavailableTracks=");
        V0.append(this.showUnavailableTracks);
        V0.append(", localDevicesOnly=");
        V0.append(this.localDevicesOnly);
        V0.append(", webgateUrl=");
        V0.append(this.webgateUrl);
        V0.append(", downloadPreferredResourceType=");
        V0.append(this.downloadPreferredResourceType);
        V0.append(", silenceTrimmer=");
        return je.P0(V0, this.silenceTrimmer, "}");
    }

    @Override // com.spotify.music.settings.SettingsState
    public String webgateUrl() {
        return this.webgateUrl;
    }

    private AutoValue_SettingsState(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, String str, int i4, boolean z5, boolean z6, boolean z7, int i5, boolean z8, int i6, boolean z9, boolean z10, String str2, int i7, boolean z11) {
        this.offlineMode = z;
        this.playExplicitContent = z2;
        this.privateSession = z3;
        this.downloadOver3g = z4;
        this.downloadQuality = i;
        this.streamQuality = i2;
        this.streamNonMeteredQuality = i3;
        this.accessPoint = str;
        this.secondsToOfflineExpiry = i4;
        this.gapless = z5;
        this.automix = z6;
        this.normalize = z7;
        this.loudnessEnvironment = i5;
        this.crossfade = z8;
        this.crossfadeTimeSeconds = i6;
        this.showUnavailableTracks = z9;
        this.localDevicesOnly = z10;
        this.webgateUrl = str2;
        this.downloadPreferredResourceType = i7;
        this.silenceTrimmer = z11;
    }
}
