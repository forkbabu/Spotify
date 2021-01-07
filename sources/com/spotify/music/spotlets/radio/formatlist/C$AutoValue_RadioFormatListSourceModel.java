package com.spotify.music.spotlets.radio.formatlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* renamed from: com.spotify.music.spotlets.radio.formatlist.$AutoValue_RadioFormatListSourceModel  reason: invalid class name */
abstract class C$AutoValue_RadioFormatListSourceModel extends RadioFormatListSourceModel {
    private final List<Map<String, String>> mediaItems;
    private final Integer total;

    C$AutoValue_RadioFormatListSourceModel(Integer num, List<Map<String, String>> list) {
        this.total = num;
        this.mediaItems = list;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RadioFormatListSourceModel)) {
            return false;
        }
        RadioFormatListSourceModel radioFormatListSourceModel = (RadioFormatListSourceModel) obj;
        Integer num = this.total;
        if (num != null ? num.equals(radioFormatListSourceModel.total()) : radioFormatListSourceModel.total() == null) {
            List<Map<String, String>> list = this.mediaItems;
            if (list == null) {
                if (radioFormatListSourceModel.mediaItems() == null) {
                    return true;
                }
            } else if (list.equals(radioFormatListSourceModel.mediaItems())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Integer num = this.total;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        List<Map<String, String>> list = this.mediaItems;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.spotlets.radio.formatlist.RadioFormatListSourceModel
    @JsonProperty("mediaItems")
    public List<Map<String, String>> mediaItems() {
        return this.mediaItems;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RadioFormatListSourceModel{total=");
        V0.append(this.total);
        V0.append(", mediaItems=");
        return je.L0(V0, this.mediaItems, "}");
    }

    @Override // com.spotify.music.spotlets.radio.formatlist.RadioFormatListSourceModel
    @JsonProperty("total")
    public Integer total() {
        return this.total;
    }
}
