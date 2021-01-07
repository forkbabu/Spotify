package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsSocialListeningProperties;

/* access modifiers changed from: package-private */
public final class wg extends AndroidLibsSocialListeningProperties {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final AndroidLibsSocialListeningProperties.PlayActionMode h;

    static final class b extends AndroidLibsSocialListeningProperties.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Integer f;
        private Boolean g;
        private AndroidLibsSocialListeningProperties.PlayActionMode h;

        b() {
        }

        public AndroidLibsSocialListeningProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        public AndroidLibsSocialListeningProperties b() {
            String str = this.a == null ? " allowListen" : "";
            if (this.b == null) {
                str = je.x0(str, " canUseSocialSessions");
            }
            if (this.c == null) {
                str = je.x0(str, " enabled");
            }
            if (this.d == null) {
                str = je.x0(str, " inviteAlwaysEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " leftAlignDevicePickerCard");
            }
            if (this.f == null) {
                str = je.x0(str, " multiOutputMaxNumberOfParticipants");
            }
            if (this.g == null) {
                str = je.x0(str, " nearby");
            }
            if (this.h == null) {
                str = je.x0(str, " playActionMode");
            }
            if (str.isEmpty()) {
                return new wg(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.intValue(), this.g.booleanValue(), this.h, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsSocialListeningProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a g(int i) {
            this.f = Integer.valueOf(i);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsSocialListeningProperties.a i(AndroidLibsSocialListeningProperties.PlayActionMode playActionMode) {
            if (playActionMode != null) {
                this.h = playActionMode;
                return this;
            }
            throw new NullPointerException("Null playActionMode");
        }
    }

    wg(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, AndroidLibsSocialListeningProperties.PlayActionMode playActionMode, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = z6;
        this.h = playActionMode;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsSocialListeningProperties)) {
            return false;
        }
        AndroidLibsSocialListeningProperties androidLibsSocialListeningProperties = (AndroidLibsSocialListeningProperties) obj;
        if (this.a == androidLibsSocialListeningProperties.a() && this.b == androidLibsSocialListeningProperties.b() && this.c == androidLibsSocialListeningProperties.c() && this.d == androidLibsSocialListeningProperties.d() && this.e == androidLibsSocialListeningProperties.e() && this.f == androidLibsSocialListeningProperties.f() && this.g == androidLibsSocialListeningProperties.g() && this.h.equals(androidLibsSocialListeningProperties.h())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public int f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsSocialListeningProperties
    public AndroidLibsSocialListeningProperties.PlayActionMode h() {
        return this.h;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsSocialListeningProperties{allowListen=");
        V0.append(this.a);
        V0.append(", canUseSocialSessions=");
        V0.append(this.b);
        V0.append(", enabled=");
        V0.append(this.c);
        V0.append(", inviteAlwaysEnabled=");
        V0.append(this.d);
        V0.append(", leftAlignDevicePickerCard=");
        V0.append(this.e);
        V0.append(", multiOutputMaxNumberOfParticipants=");
        V0.append(this.f);
        V0.append(", nearby=");
        V0.append(this.g);
        V0.append(", playActionMode=");
        V0.append(this.h);
        V0.append("}");
        return V0.toString();
    }
}
