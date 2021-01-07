package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;
import java.util.List;
import java.util.Map;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_Ad  reason: invalid class name */
abstract class C$AutoValue_Ad extends Ad {
    private final String adPlaybackId;
    private final int adType;
    private final String advertiser;
    private final String caption;
    private final String clickTrackingUrl;
    private final String clickUrl;
    private final CompanionAd companionAd;
    private final List<CompanionAd> companionAds;
    private final String creativeId;
    private final List<Display> displays;
    private final long duration;
    private final String id;
    private final List<Image> images;
    private final String lineItemId;
    private final Map<String, String> metadata;
    private final boolean nonExplicit;
    private final boolean skippable;
    private final boolean testAd;
    private final String title;
    private final String uri;
    private final List<Video> videos;

    C$AutoValue_Ad(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, boolean z, boolean z2, Map<String, String> map, CompanionAd companionAd2, List<Video> list, List<Image> list2, List<Display> list3, List<CompanionAd> list4, String str8, String str9, String str10, boolean z3) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.uri = str2;
                if (str3 != null) {
                    this.advertiser = str3;
                    if (str4 != null) {
                        this.title = str4;
                        if (str5 != null) {
                            this.clickUrl = str5;
                            this.clickTrackingUrl = str6;
                            this.duration = j;
                            this.caption = str7;
                            this.adType = i;
                            this.testAd = z;
                            this.nonExplicit = z2;
                            if (map != null) {
                                this.metadata = map;
                                this.companionAd = companionAd2;
                                this.videos = list;
                                this.images = list2;
                                this.displays = list3;
                                this.companionAds = list4;
                                if (str8 != null) {
                                    this.lineItemId = str8;
                                    if (str9 != null) {
                                        this.creativeId = str9;
                                        if (str10 != null) {
                                            this.adPlaybackId = str10;
                                            this.skippable = z3;
                                            return;
                                        }
                                        throw new NullPointerException("Null adPlaybackId");
                                    }
                                    throw new NullPointerException("Null creativeId");
                                }
                                throw new NullPointerException("Null lineItemId");
                            }
                            throw new NullPointerException("Null metadata");
                        }
                        throw new NullPointerException("Null clickUrl");
                    }
                    throw new NullPointerException("Null title");
                }
                throw new NullPointerException("Null advertiser");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("ad_playback_id")
    public String adPlaybackId() {
        return this.adPlaybackId;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty(ContextTrack.Metadata.KEY_AD_TYPE)
    public int adType() {
        return this.adType;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("advertiser")
    public String advertiser() {
        return this.advertiser;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("click_tracking_url")
    public String clickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("click_url")
    public String clickUrl() {
        return this.clickUrl;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("companion_ad")
    public CompanionAd companionAd() {
        return this.companionAd;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("companion_ads")
    public List<CompanionAd> companionAds() {
        return this.companionAds;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("creative_id")
    public String creativeId() {
        return this.creativeId;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("display")
    public List<Display> displays() {
        return this.displays;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("duration")
    public long duration() {
        return this.duration;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        CompanionAd companionAd2;
        List<Video> list;
        List<Image> list2;
        List<Display> list3;
        List<CompanionAd> list4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        if (!this.id.equals(ad.id()) || !this.uri.equals(ad.uri()) || !this.advertiser.equals(ad.advertiser()) || !this.title.equals(ad.title()) || !this.clickUrl.equals(ad.clickUrl()) || ((str = this.clickTrackingUrl) != null ? !str.equals(ad.clickTrackingUrl()) : ad.clickTrackingUrl() != null) || this.duration != ad.duration() || ((str2 = this.caption) != null ? !str2.equals(ad.caption()) : ad.caption() != null) || this.adType != ad.adType() || this.testAd != ad.testAd() || this.nonExplicit != ad.nonExplicit() || !this.metadata.equals(ad.metadata()) || ((companionAd2 = this.companionAd) != null ? !companionAd2.equals(ad.companionAd()) : ad.companionAd() != null) || ((list = this.videos) != null ? !list.equals(ad.videos()) : ad.videos() != null) || ((list2 = this.images) != null ? !list2.equals(ad.images()) : ad.images() != null) || ((list3 = this.displays) != null ? !list3.equals(ad.displays()) : ad.displays() != null) || ((list4 = this.companionAds) != null ? !list4.equals(ad.companionAds()) : ad.companionAds() != null) || !this.lineItemId.equals(ad.lineItemId()) || !this.creativeId.equals(ad.creativeId()) || !this.adPlaybackId.equals(ad.adPlaybackId()) || this.skippable != ad.skippable()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.advertiser.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        String str = this.clickTrackingUrl;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.duration;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.caption;
        int i3 = 1231;
        int hashCode3 = (((((((((i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.adType) * 1000003) ^ (this.testAd ? 1231 : 1237)) * 1000003) ^ (this.nonExplicit ? 1231 : 1237)) * 1000003) ^ this.metadata.hashCode()) * 1000003;
        CompanionAd companionAd2 = this.companionAd;
        int hashCode4 = (hashCode3 ^ (companionAd2 == null ? 0 : companionAd2.hashCode())) * 1000003;
        List<Video> list = this.videos;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Image> list2 = this.images;
        int hashCode6 = (hashCode5 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<Display> list3 = this.displays;
        int hashCode7 = (hashCode6 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List<CompanionAd> list4 = this.companionAds;
        if (list4 != null) {
            i = list4.hashCode();
        }
        int hashCode8 = (((((((hashCode7 ^ i) * 1000003) ^ this.lineItemId.hashCode()) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.adPlaybackId.hashCode()) * 1000003;
        if (!this.skippable) {
            i3 = 1237;
        }
        return hashCode8 ^ i3;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("id")
    public String id() {
        return this.id;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("images")
    public List<Image> images() {
        return this.images;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("line_item_id")
    public String lineItemId() {
        return this.lineItemId;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("metadata")
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("non_explicit")
    public boolean nonExplicit() {
        return this.nonExplicit;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty(Ad.METADATA_IS_SKIPPABLE_AD)
    public boolean skippable() {
        return this.skippable;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("test_ad")
    public boolean testAd() {
        return this.testAd;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Ad{id=");
        V0.append(this.id);
        V0.append(", uri=");
        V0.append(this.uri);
        V0.append(", advertiser=");
        V0.append(this.advertiser);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", clickUrl=");
        V0.append(this.clickUrl);
        V0.append(", clickTrackingUrl=");
        V0.append(this.clickTrackingUrl);
        V0.append(", duration=");
        V0.append(this.duration);
        V0.append(", caption=");
        V0.append(this.caption);
        V0.append(", adType=");
        V0.append(this.adType);
        V0.append(", testAd=");
        V0.append(this.testAd);
        V0.append(", nonExplicit=");
        V0.append(this.nonExplicit);
        V0.append(", metadata=");
        V0.append(this.metadata);
        V0.append(", companionAd=");
        V0.append(this.companionAd);
        V0.append(", videos=");
        V0.append(this.videos);
        V0.append(", images=");
        V0.append(this.images);
        V0.append(", displays=");
        V0.append(this.displays);
        V0.append(", companionAds=");
        V0.append(this.companionAds);
        V0.append(", lineItemId=");
        V0.append(this.lineItemId);
        V0.append(", creativeId=");
        V0.append(this.creativeId);
        V0.append(", adPlaybackId=");
        V0.append(this.adPlaybackId);
        V0.append(", skippable=");
        return je.P0(V0, this.skippable, "}");
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    @Override // com.spotify.music.features.ads.model.Ad
    @JsonProperty("videos")
    public List<Video> videos() {
        return this.videos;
    }
}
