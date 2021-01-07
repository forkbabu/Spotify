package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TasteOnboardingItem implements JacksonModel, Parcelable {

    public static final class a extends bpd<TasteOnboardingItem> {
        public a() {
            super(b.a);
        }
    }

    @JsonCreator
    public static TasteOnboardingItem create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("related_questions") List<TasteOnboardingItem> list, @JsonProperty("images_with_size") List<TasteOnboardingImage> list2, @JsonProperty("logging") d dVar, @JsonProperty("more_uri") String str4, @JsonProperty("color") String str5, @JsonProperty("related_media") String str6) {
        return new AutoValue_TasteOnboardingItem(str, str2, str3, gf0.a(list), gf0.a(list2), getLogging(dVar), str4, str6, getIsArtist(str), getIsPodcast(str), false, false, str5);
    }

    private static boolean getIsArtist(String str) {
        return l0.z(str).q() == LinkType.ARTIST;
    }

    private static boolean getIsPodcast(String str) {
        return l0.z(str).q() == LinkType.SHOW_SHOW;
    }

    private static d getLogging(d dVar) {
        return dVar != null ? dVar : d.create(null, null);
    }

    public static boolean getRelatedMedia(TasteOnboardingItem tasteOnboardingItem) {
        return !MoreObjects.isNullOrEmpty(tasteOnboardingItem.relatedMedia());
    }

    @JsonProperty("isColor")
    public abstract String color();

    public TasteOnboardingItem createWithExpanded(boolean z) {
        return new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), moreUri(), relatedMedia(), isArtist(), isPodcast(), isLiked(), z, color());
    }

    public TasteOnboardingItem createWithLike(boolean z) {
        return new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), moreUri(), relatedMedia(), isArtist(), isPodcast(), z, isExpanded(), color());
    }

    public TasteOnboardingItem createWithLogging(d dVar) {
        return new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), dVar, moreUri(), relatedMedia(), isArtist(), isPodcast(), isLiked(), isExpanded(), color());
    }

    public TasteOnboardingItem createWithMoreUri(String str) {
        return new AutoValue_TasteOnboardingItem(id(), name(), image(), relatedItems(), imagesWithSize(), logging(), str, relatedMedia(), isArtist(), isPodcast(), isLiked(), isExpanded(), color());
    }

    public TasteOnboardingItem createWithRelatedItems(List<TasteOnboardingItem> list) {
        return new AutoValue_TasteOnboardingItem(id(), name(), image(), list, imagesWithSize(), logging(), moreUri(), relatedMedia(), isArtist(), isPodcast(), isLiked(), isExpanded(), color());
    }

    public String findSuitableImage(int i) {
        TasteOnboardingImage tasteOnboardingImage = null;
        if (!imagesWithSize().isEmpty()) {
            int i2 = Integer.MAX_VALUE;
            for (TasteOnboardingImage tasteOnboardingImage2 : imagesWithSize()) {
                if (tasteOnboardingImage == null) {
                    tasteOnboardingImage = tasteOnboardingImage2;
                } else {
                    int max = Math.max(tasteOnboardingImage2.width(), tasteOnboardingImage2.height());
                    if (max < i2 && max >= i) {
                        tasteOnboardingImage = tasteOnboardingImage2;
                        i2 = max;
                    }
                }
            }
        }
        return tasteOnboardingImage == null ? image() : tasteOnboardingImage.uri();
    }

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("image")
    public abstract String image();

    public abstract List<TasteOnboardingImage> imagesWithSize();

    @JsonProperty("isArtist")
    public abstract boolean isArtist();

    @JsonProperty("isExpanded")
    public abstract boolean isExpanded();

    @JsonProperty("isLiked")
    public abstract boolean isLiked();

    @JsonProperty("isPodcast")
    public abstract boolean isPodcast();

    @JsonProperty("logging")
    public abstract d logging();

    @JsonProperty("moreUri")
    public abstract String moreUri();

    @JsonProperty("name")
    public abstract String name();

    public abstract List<TasteOnboardingItem> relatedItems();

    @JsonProperty("relatedMedia")
    public abstract String relatedMedia();

    public List<TasteOnboardingItem> selectable() {
        return relatedItems().subList(0, Math.min(2, relatedItems().size()));
    }
}
