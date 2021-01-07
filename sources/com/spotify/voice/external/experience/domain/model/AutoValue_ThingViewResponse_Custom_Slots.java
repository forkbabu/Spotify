package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;
import java.util.List;

final class AutoValue_ThingViewResponse_Custom_Slots extends ThingViewResponse.Custom.Slots {
    private final List<String> preset;
    private final List<String> requestedEntityType;

    AutoValue_ThingViewResponse_Custom_Slots(List<String> list, List<String> list2) {
        this.requestedEntityType = list;
        this.preset = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse.Custom.Slots)) {
            return false;
        }
        ThingViewResponse.Custom.Slots slots = (ThingViewResponse.Custom.Slots) obj;
        List<String> list = this.requestedEntityType;
        if (list != null ? list.equals(slots.requestedEntityType()) : slots.requestedEntityType() == null) {
            List<String> list2 = this.preset;
            if (list2 == null) {
                if (slots.preset() == null) {
                    return true;
                }
            } else if (list2.equals(slots.preset())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.requestedEntityType;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<String> list2 = this.preset;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom.Slots
    @JsonProperty("preset")
    public List<String> preset() {
        return this.preset;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom.Slots
    @JsonProperty("requestedEntityType")
    public List<String> requestedEntityType() {
        return this.requestedEntityType;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Slots{requestedEntityType=");
        V0.append(this.requestedEntityType);
        V0.append(", preset=");
        return je.L0(V0, this.preset, "}");
    }
}
