package com.spotify.music.features.tasteonboarding.artistpicker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.artistpicker.model.$AutoValue_ArtistPickerResponse  reason: invalid class name */
abstract class C$AutoValue_ArtistPickerResponse extends ArtistPickerResponse {
    private final List<TasteOnboardingItem> items;
    private final PickerViewType renderType;

    C$AutoValue_ArtistPickerResponse(List<TasteOnboardingItem> list, PickerViewType pickerViewType) {
        if (list != null) {
            this.items = list;
            if (pickerViewType != null) {
                this.renderType = pickerViewType;
                return;
            }
            throw new NullPointerException("Null renderType");
        }
        throw new NullPointerException("Null items");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArtistPickerResponse)) {
            return false;
        }
        ArtistPickerResponse artistPickerResponse = (ArtistPickerResponse) obj;
        if (!this.items.equals(artistPickerResponse.items()) || !this.renderType.equals(artistPickerResponse.renderType())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.items.hashCode() ^ 1000003) * 1000003) ^ this.renderType.hashCode();
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse
    @JsonProperty("questions")
    public List<TasteOnboardingItem> items() {
        return this.items;
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse
    @JsonProperty("render_type")
    public PickerViewType renderType() {
        return this.renderType;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ArtistPickerResponse{items=");
        V0.append(this.items);
        V0.append(", renderType=");
        V0.append(this.renderType);
        V0.append("}");
        return V0.toString();
    }
}
