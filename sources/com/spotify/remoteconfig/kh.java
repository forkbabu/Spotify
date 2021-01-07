package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties;

final class kh extends AndroidLibsYourLibraryFlagsProperties {
    private final AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop a;
    private final boolean b;
    private final int c;
    private final boolean d;

    static final class b extends AndroidLibsYourLibraryFlagsProperties.a {
        private AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop a;
        private Boolean b;
        private Integer c;
        private Boolean d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public AndroidLibsYourLibraryFlagsProperties a() {
            String str = this.a == null ? " playlistLayoutWorkshop" : "";
            if (this.b == null) {
                str = je.x0(str, " yourLibraryPersistActiveTab");
            }
            if (this.c == null) {
                str = je.x0(str, " yourLibraryPersistActiveTabDurationInHours");
            }
            if (this.d == null) {
                str = je.x0(str, " yourLibrarySettingsButtonInHeaderEnabled");
            }
            if (str.isEmpty()) {
                return new kh(this.a, this.b.booleanValue(), this.c.intValue(), this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsYourLibraryFlagsProperties.a b(AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop playlistLayoutWorkshop) {
            if (playlistLayoutWorkshop != null) {
                this.a = playlistLayoutWorkshop;
                return this;
            }
            throw new NullPointerException("Null playlistLayoutWorkshop");
        }

        public AndroidLibsYourLibraryFlagsProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryFlagsProperties.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public AndroidLibsYourLibraryFlagsProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    kh(AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop playlistLayoutWorkshop, boolean z, int i, boolean z2, a aVar) {
        this.a = playlistLayoutWorkshop;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties
    public AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties
    public int c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsYourLibraryFlagsProperties)) {
            return false;
        }
        AndroidLibsYourLibraryFlagsProperties androidLibsYourLibraryFlagsProperties = (AndroidLibsYourLibraryFlagsProperties) obj;
        if (this.a.equals(androidLibsYourLibraryFlagsProperties.a()) && this.b == androidLibsYourLibraryFlagsProperties.b() && this.c == androidLibsYourLibraryFlagsProperties.c() && this.d == androidLibsYourLibraryFlagsProperties.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsYourLibraryFlagsProperties{playlistLayoutWorkshop=");
        V0.append(this.a);
        V0.append(", yourLibraryPersistActiveTab=");
        V0.append(this.b);
        V0.append(", yourLibraryPersistActiveTabDurationInHours=");
        V0.append(this.c);
        V0.append(", yourLibrarySettingsButtonInHeaderEnabled=");
        return je.P0(V0, this.d, "}");
    }
}
