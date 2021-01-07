package com.spotify.remoteconfig;

import com.spotify.remoteconfig.uc;

final class ai extends uc {
    private final boolean a;

    static final class b extends uc.a {
        private Boolean a;

        b() {
        }

        public uc a() {
            String str = this.a == null ? " voiceAdInaudibleToneEnabled" : "";
            if (str.isEmpty()) {
                return new ai(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public uc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ai(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.uc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uc) || this.a != ((uc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsVoiceAdsProperties{voiceAdInaudibleToneEnabled="), this.a, "}");
    }
}
