package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties;

final class fh extends AndroidLibsVoiceExperimentsProperties {
    private final AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend a;
    private final boolean b;

    static final class b extends AndroidLibsVoiceExperimentsProperties.a {
        private AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend a;
        private Boolean b;

        b() {
        }

        public AndroidLibsVoiceExperimentsProperties a() {
            String str = this.a == null ? " voiceEndpointBackend" : "";
            if (this.b == null) {
                str = je.x0(str, " voiceIntroducerV2");
            }
            if (str.isEmpty()) {
                return new fh(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsVoiceExperimentsProperties.a b(AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend voiceEndpointBackend) {
            if (voiceEndpointBackend != null) {
                this.a = voiceEndpointBackend;
                return this;
            }
            throw new NullPointerException("Null voiceEndpointBackend");
        }

        public AndroidLibsVoiceExperimentsProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    fh(AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend voiceEndpointBackend, boolean z, a aVar) {
        this.a = voiceEndpointBackend;
        this.b = z;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties
    public AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsVoiceExperimentsProperties)) {
            return false;
        }
        AndroidLibsVoiceExperimentsProperties androidLibsVoiceExperimentsProperties = (AndroidLibsVoiceExperimentsProperties) obj;
        if (!this.a.equals(androidLibsVoiceExperimentsProperties.a()) || this.b != androidLibsVoiceExperimentsProperties.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsVoiceExperimentsProperties{voiceEndpointBackend=");
        V0.append(this.a);
        V0.append(", voiceIntroducerV2=");
        return je.P0(V0, this.b, "}");
    }
}
