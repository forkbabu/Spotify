package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;
import java.util.List;

final class AutoValue_VoiceViewResponse_Body_Custom extends VoiceViewResponse.Body.Custom {
    private final boolean explicit;
    private final List<VoiceViewResponse.Body.Custom.Overrides> override;

    AutoValue_VoiceViewResponse_Body_Custom(List<VoiceViewResponse.Body.Custom.Overrides> list, boolean z) {
        this.override = list;
        this.explicit = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body.Custom)) {
            return false;
        }
        VoiceViewResponse.Body.Custom custom = (VoiceViewResponse.Body.Custom) obj;
        List<VoiceViewResponse.Body.Custom.Overrides> list = this.override;
        if (list != null ? list.equals(custom.override()) : custom.override() == null) {
            if (this.explicit == custom.explicit()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Custom
    @JsonProperty("isExplicit")
    public boolean explicit() {
        return this.explicit;
    }

    public int hashCode() {
        List<VoiceViewResponse.Body.Custom.Overrides> list = this.override;
        return (((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003) ^ (this.explicit ? 1231 : 1237);
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Custom
    @JsonProperty("overrides")
    public List<VoiceViewResponse.Body.Custom.Overrides> override() {
        return this.override;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Custom{override=");
        V0.append(this.override);
        V0.append(", explicit=");
        return je.P0(V0, this.explicit, "}");
    }
}
