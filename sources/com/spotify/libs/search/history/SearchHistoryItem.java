package com.spotify.libs.search.history;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.ContextTrack;
import java.io.Serializable;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchHistoryItem implements JacksonModel, Serializable {
    private static final long serialVersionUID = -1732689253947124362L;

    @JsonCreator
    public static SearchHistoryItem create(@JsonProperty("componentId") String str, @JsonProperty("componentCategory") String str2, @JsonProperty("targetUri") String str3, @JsonProperty("title") String str4, @JsonProperty("subtitle") String str5, @JsonProperty("imageUri") String str6, @JsonProperty("originUri") String str7, @JsonProperty("previewId") String str8, @JsonProperty("isExplicit") boolean z, @JsonProperty("shouldAppearDisabled") boolean z2, @JsonProperty("isMogef19") boolean z3) {
        return new AutoValue_SearchHistoryItem(str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchHistoryItem)) {
            return false;
        }
        SearchHistoryItem searchHistoryItem = (SearchHistoryItem) obj;
        if (!rw.equal(getTargetUri(), searchHistoryItem.getTargetUri()) || !rw.equal(getOriginUri(), searchHistoryItem.getOriginUri())) {
            return false;
        }
        return true;
    }

    @JsonGetter("componentCategory")
    public abstract String getComponentCategory();

    @JsonGetter("componentId")
    public abstract String getComponentId();

    @JsonGetter("imageUri")
    public abstract String getImageUri();

    @JsonGetter("originUri")
    public abstract String getOriginUri();

    @JsonGetter("previewId")
    public abstract String getPreviewId();

    @JsonGetter(ContextTrack.Metadata.KEY_SUBTITLE)
    public abstract String getSubtitle();

    @JsonGetter("targetUri")
    public abstract String getTargetUri();

    @JsonGetter("title")
    public abstract String getTitle();

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{getTargetUri(), getOriginUri()});
    }

    @JsonGetter("isExplicit")
    public abstract boolean isExplicit();

    @JsonGetter("isMogef19")
    public abstract boolean isMogef19();

    @JsonGetter("shouldAppearDisabled")
    public abstract boolean shouldAppearDisabled();
}
