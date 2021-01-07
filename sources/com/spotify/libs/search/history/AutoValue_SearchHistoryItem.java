package com.spotify.libs.search.history;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public final class AutoValue_SearchHistoryItem extends SearchHistoryItem {
    private static final long serialVersionUID = -1732689253947124362L;
    private final String getComponentCategory;
    private final String getComponentId;
    private final String getImageUri;
    private final String getOriginUri;
    private final String getPreviewId;
    private final String getSubtitle;
    private final String getTargetUri;
    private final String getTitle;
    private final boolean isExplicit;
    private final boolean isMogef19;
    private final boolean shouldAppearDisabled;

    AutoValue_SearchHistoryItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3) {
        this.getComponentId = str;
        this.getComponentCategory = str2;
        if (str3 != null) {
            this.getTargetUri = str3;
            if (str4 != null) {
                this.getTitle = str4;
                this.getSubtitle = str5;
                this.getImageUri = str6;
                if (str7 != null) {
                    this.getOriginUri = str7;
                    this.getPreviewId = str8;
                    this.isExplicit = z;
                    this.shouldAppearDisabled = z2;
                    this.isMogef19 = z3;
                    return;
                }
                throw new NullPointerException("Null getOriginUri");
            }
            throw new NullPointerException("Null getTitle");
        }
        throw new NullPointerException("Null getTargetUri");
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("componentCategory")
    public String getComponentCategory() {
        return this.getComponentCategory;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("componentId")
    public String getComponentId() {
        return this.getComponentId;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("imageUri")
    public String getImageUri() {
        return this.getImageUri;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("originUri")
    public String getOriginUri() {
        return this.getOriginUri;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("previewId")
    public String getPreviewId() {
        return this.getPreviewId;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter(ContextTrack.Metadata.KEY_SUBTITLE)
    public String getSubtitle() {
        return this.getSubtitle;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("targetUri")
    public String getTargetUri() {
        return this.getTargetUri;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("title")
    public String getTitle() {
        return this.getTitle;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("isExplicit")
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("isMogef19")
    public boolean isMogef19() {
        return this.isMogef19;
    }

    @Override // com.spotify.libs.search.history.SearchHistoryItem
    @JsonGetter("shouldAppearDisabled")
    public boolean shouldAppearDisabled() {
        return this.shouldAppearDisabled;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchHistoryItem{getComponentId=");
        V0.append(this.getComponentId);
        V0.append(", getComponentCategory=");
        V0.append(this.getComponentCategory);
        V0.append(", getTargetUri=");
        V0.append(this.getTargetUri);
        V0.append(", getTitle=");
        V0.append(this.getTitle);
        V0.append(", getSubtitle=");
        V0.append(this.getSubtitle);
        V0.append(", getImageUri=");
        V0.append(this.getImageUri);
        V0.append(", getOriginUri=");
        V0.append(this.getOriginUri);
        V0.append(", getPreviewId=");
        V0.append(this.getPreviewId);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", shouldAppearDisabled=");
        V0.append(this.shouldAppearDisabled);
        V0.append(", isMogef19=");
        return je.P0(V0, this.isMogef19, "}");
    }
}
