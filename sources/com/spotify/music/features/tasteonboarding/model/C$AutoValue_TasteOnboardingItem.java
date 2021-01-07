package com.spotify.music.features.tasteonboarding.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.tasteonboarding.model.$AutoValue_TasteOnboardingItem  reason: invalid class name */
abstract class C$AutoValue_TasteOnboardingItem extends TasteOnboardingItem {
    private final String color;
    private final String id;
    private final String image;
    private final List<TasteOnboardingImage> imagesWithSize;
    private final boolean isArtist;
    private final boolean isExpanded;
    private final boolean isLiked;
    private final boolean isPodcast;
    private final d logging;
    private final String moreUri;
    private final String name;
    private final List<TasteOnboardingItem> relatedItems;
    private final String relatedMedia;

    C$AutoValue_TasteOnboardingItem(String str, String str2, String str3, List<TasteOnboardingItem> list, List<TasteOnboardingImage> list2, d dVar, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, String str6) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.name = str2;
                this.image = str3;
                if (list != null) {
                    this.relatedItems = list;
                    if (list2 != null) {
                        this.imagesWithSize = list2;
                        this.logging = dVar;
                        this.moreUri = str4;
                        this.relatedMedia = str5;
                        this.isArtist = z;
                        this.isPodcast = z2;
                        this.isLiked = z3;
                        this.isExpanded = z4;
                        this.color = str6;
                        return;
                    }
                    throw new NullPointerException("Null imagesWithSize");
                }
                throw new NullPointerException("Null relatedItems");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("isColor")
    public String color() {
        return this.color;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        d dVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TasteOnboardingItem)) {
            return false;
        }
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        if (this.id.equals(tasteOnboardingItem.id()) && this.name.equals(tasteOnboardingItem.name()) && ((str = this.image) != null ? str.equals(tasteOnboardingItem.image()) : tasteOnboardingItem.image() == null) && this.relatedItems.equals(tasteOnboardingItem.relatedItems()) && this.imagesWithSize.equals(tasteOnboardingItem.imagesWithSize()) && ((dVar = this.logging) != null ? dVar.equals(tasteOnboardingItem.logging()) : tasteOnboardingItem.logging() == null) && ((str2 = this.moreUri) != null ? str2.equals(tasteOnboardingItem.moreUri()) : tasteOnboardingItem.moreUri() == null) && ((str3 = this.relatedMedia) != null ? str3.equals(tasteOnboardingItem.relatedMedia()) : tasteOnboardingItem.relatedMedia() == null) && this.isArtist == tasteOnboardingItem.isArtist() && this.isPodcast == tasteOnboardingItem.isPodcast() && this.isLiked == tasteOnboardingItem.isLiked() && this.isExpanded == tasteOnboardingItem.isExpanded()) {
            String str4 = this.color;
            if (str4 == null) {
                if (tasteOnboardingItem.color() == null) {
                    return true;
                }
            } else if (str4.equals(tasteOnboardingItem.color())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.image;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.relatedItems.hashCode()) * 1000003) ^ this.imagesWithSize.hashCode()) * 1000003;
        d dVar = this.logging;
        int hashCode3 = (hashCode2 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        String str2 = this.moreUri;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.relatedMedia;
        int i2 = 1231;
        int hashCode5 = (((((((hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (this.isArtist ? 1231 : 1237)) * 1000003) ^ (this.isPodcast ? 1231 : 1237)) * 1000003) ^ (this.isLiked ? 1231 : 1237)) * 1000003;
        if (!this.isExpanded) {
            i2 = 1237;
        }
        int i3 = (hashCode5 ^ i2) * 1000003;
        String str4 = this.color;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("id")
    public String id() {
        return this.id;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("image")
    public String image() {
        return this.image;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    public List<TasteOnboardingImage> imagesWithSize() {
        return this.imagesWithSize;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("isArtist")
    public boolean isArtist() {
        return this.isArtist;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("isExpanded")
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("isLiked")
    public boolean isLiked() {
        return this.isLiked;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("isPodcast")
    public boolean isPodcast() {
        return this.isPodcast;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("logging")
    public d logging() {
        return this.logging;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("moreUri")
    public String moreUri() {
        return this.moreUri;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    public List<TasteOnboardingItem> relatedItems() {
        return this.relatedItems;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem
    @JsonProperty("relatedMedia")
    public String relatedMedia() {
        return this.relatedMedia;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TasteOnboardingItem{id=");
        V0.append(this.id);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", image=");
        V0.append(this.image);
        V0.append(", relatedItems=");
        V0.append(this.relatedItems);
        V0.append(", imagesWithSize=");
        V0.append(this.imagesWithSize);
        V0.append(", logging=");
        V0.append(this.logging);
        V0.append(", moreUri=");
        V0.append(this.moreUri);
        V0.append(", relatedMedia=");
        V0.append(this.relatedMedia);
        V0.append(", isArtist=");
        V0.append(this.isArtist);
        V0.append(", isPodcast=");
        V0.append(this.isPodcast);
        V0.append(", isLiked=");
        V0.append(this.isLiked);
        V0.append(", isExpanded=");
        V0.append(this.isExpanded);
        V0.append(", color=");
        return je.I0(V0, this.color, "}");
    }
}
