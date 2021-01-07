package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Ad implements JacksonModel, Parcelable {
    public static final String DEFAULT_SKIPPABLE_AD_DELAY = "0";
    public static final String METADATA_ACTION_OPT_IN = "optin";
    public static final String METADATA_ACTION_OPT_OUT = "optout";
    public static final String METADATA_ACTION_SAVE = "Save";
    public static final String METADATA_ADVERTISER_ID = "advertiser_id";
    private static final String METADATA_AD_SOURCE_TYPE = "source_type";
    public static final String METADATA_AD_SPONSOR_ID = "sponsorID";
    public static final String METADATA_AUDIO_PLUS = "audio_plus";
    public static final String METADATA_CAROUSEL_AD = "is_carousel_ad";
    public static final String METADATA_CREATIVE_COLOR = "creative_color";
    public static final String METADATA_DEPENDENT_SLOT_KEY = "dependent_slot";
    public static final String METADATA_FEATURED_ACTION_KEY = "featuredAction";
    public static final String METADATA_FEATURED_ACTION_URI_KEY = "featuredActionURI";
    public static final String METADATA_IN_APP_BROWSER_KEY = "in_app_browser";
    public static final String METADATA_IS_BOOKMARKED = "is_bookmarked";
    public static final String METADATA_IS_SKIPPABLE_AD = "skippable";
    public static final String METADATA_KEY_BUTTON_TEXT = "buttonMessage";
    public static final String METADATA_ORDER_ID = "order_id";
    public static final String METADATA_PREVIEW_KEY = "is_preview";
    public static final String METADATA_PROMO_DETAILS = "promo_details";
    public static final String METADATA_PROMO_ENTITY = "promo_entity";
    public static final String METADATA_PROMO_NAME = "promo_name";
    public static final String METADATA_PROMO_TYPE = "promo_type";
    public static final String METADATA_SKIPPABLE_AD_DELAY = "skippable_ad_delay";
    private static final String METADATA_VIDEO_ORIENTATION = "video_orientation";
    public static final String METADATA_VOICE_ACTION_URI = "voice_action_uri";
    public static final String METADATA_VOICE_INTENT = "voice_intent";
    public static final String METADATA_VOICE_MICROPHONE_DELAY = "voice_microphone_delay";
    protected static final int SPONSORSHIP_HEIGHT = 75;
    protected static final int SPONSORSHIP_WIDTH = 300;

    public enum AdType implements JacksonModel {
        NORMAL(0),
        OFFER_AD(1),
        END_CARD_AD(2),
        VOICE(3);
        
        private final int mValue;

        private AdType(int i) {
            this.mValue = i;
        }

        public static AdType getByValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return OFFER_AD;
            }
            if (i == 2) {
                return END_CARD_AD;
            }
            if (i == 3) {
                return VOICE;
            }
            throw new IllegalArgumentException(je.p0("Unknown AdType ", i));
        }

        @JsonValue
        public int getValue() {
            return this.mValue;
        }
    }

    public enum FeaturedActionType {
        NONE(""),
        SAVE(Ad.METADATA_ACTION_SAVE),
        OPT_IN(Ad.METADATA_ACTION_OPT_IN),
        OPT_OUT(Ad.METADATA_ACTION_OPT_OUT);
        
        public static final FeaturedActionType[] n = values();
        private final String mValue;

        private FeaturedActionType(String str) {
            this.mValue = str;
        }

        public static FeaturedActionType d(String str) {
            FeaturedActionType[] featuredActionTypeArr = n;
            for (FeaturedActionType featuredActionType : featuredActionTypeArr) {
                if (featuredActionType.mValue.equals(str)) {
                    return featuredActionType;
                }
            }
            return NONE;
        }
    }

    @JsonCreator
    public static Ad create(@JsonProperty("id") String str, @JsonProperty("uri") String str2, @JsonProperty("advertiser") String str3, @JsonProperty("title") String str4, @JsonProperty("click_url") String str5, @JsonProperty("click_tracking_url") String str6, @JsonProperty("duration") long j, @JsonProperty("caption") String str7, @JsonProperty("ad_type") int i, @JsonProperty("test_ad") boolean z, @JsonProperty("non_explicit") boolean z2, @JsonProperty("metadata") Map<String, String> map, @JsonProperty("companion_ad") CompanionAd companionAd, @JsonProperty("videos") List<Video> list, @JsonProperty("images") List<Image> list2, @JsonProperty("display") List<Display> list3, @JsonProperty("companion_ads") List<CompanionAd> list4, @JsonProperty("line_item_id") String str8, @JsonProperty("creative_id") String str9, @JsonProperty("ad_playback_id") String str10, @JsonProperty("skippable") boolean z3) {
        return new AutoValue_Ad(str, str2, str3, str4, str5, str6, j, str7, i, z, z2, map, companionAd, list, list2, list3, list4, str8, str9, str10, z3);
    }

    private VideoType extractVideoType() {
        return VideoType.d(extractMetadata(METADATA_VIDEO_ORIENTATION));
    }

    @JsonProperty("ad_playback_id")
    public abstract String adPlaybackId();

    @JsonProperty(ContextTrack.Metadata.KEY_AD_TYPE)
    public abstract int adType();

    @JsonProperty("advertiser")
    public abstract String advertiser();

    @JsonProperty("caption")
    public abstract String caption();

    @JsonProperty("click_tracking_url")
    public abstract String clickTrackingUrl();

    @JsonProperty("click_url")
    public abstract String clickUrl();

    @JsonProperty("companion_ad")
    public abstract CompanionAd companionAd();

    @JsonProperty("companion_ads")
    public abstract List<CompanionAd> companionAds();

    @JsonProperty("creative_id")
    public abstract String creativeId();

    @JsonProperty("display")
    public abstract List<Display> displays();

    @JsonProperty("duration")
    public abstract long duration();

    public String extractMetadata(String str) {
        if (metadata() == null) {
            return null;
        }
        return metadata().get(str);
    }

    public AdType getAdType() {
        return AdType.getByValue(adType());
    }

    public String getAdvertiserId() {
        return extractMetadata(METADATA_ADVERTISER_ID);
    }

    public String getButtonText() {
        return extractMetadata(METADATA_KEY_BUTTON_TEXT);
    }

    public List<CompanionAd> getCompanionAds() {
        return companionAds() == null ? new ArrayList() : companionAds();
    }

    public String getDependentSlot() {
        if (metadata() != null) {
            return metadata().get(METADATA_DEPENDENT_SLOT_KEY);
        }
        return null;
    }

    public List<Display> getDisplays() {
        return displays() == null ? new ArrayList() : displays();
    }

    public FeaturedActionType getFeaturedActionType() {
        if (metadata() == null) {
            return FeaturedActionType.NONE;
        }
        return FeaturedActionType.d(metadata().get(METADATA_FEATURED_ACTION_KEY));
    }

    public String getFeaturedActionUri() {
        return extractMetadata(METADATA_FEATURED_ACTION_URI_KEY);
    }

    public List<Image> getImages() {
        return images() == null ? new ArrayList() : images();
    }

    public String getOrderId() {
        return extractMetadata(METADATA_ORDER_ID);
    }

    public int getSkippableAdDelay() {
        Integer num;
        String extractMetadata = extractMetadata(METADATA_SKIPPABLE_AD_DELAY);
        if (extractMetadata != null) {
            num = Integer.valueOf(extractMetadata);
        } else {
            num = Integer.valueOf(DEFAULT_SKIPPABLE_AD_DELAY);
        }
        return num.intValue();
    }

    public VideoType getVideoType() {
        return extractVideoType();
    }

    public List<Video> getVideos() {
        return videos() == null ? new ArrayList() : videos();
    }

    public boolean hasAction() {
        return !TextUtils.isEmpty(getButtonText()) && !TextUtils.isEmpty(clickUrl());
    }

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("images")
    public abstract List<Image> images();

    public boolean isAudioPlus() {
        return Boolean.valueOf(extractMetadata(METADATA_AUDIO_PLUS)).booleanValue();
    }

    public boolean isBookmarkable() {
        return extractMetadata(METADATA_IS_BOOKMARKED) != null;
    }

    public boolean isBookmarked() {
        return extractMetadata(METADATA_IS_BOOKMARKED) != null && Boolean.parseBoolean(extractMetadata(METADATA_IS_BOOKMARKED));
    }

    public boolean isCarouselAd() {
        return Boolean.valueOf(extractMetadata(METADATA_CAROUSEL_AD)).booleanValue();
    }

    public boolean isInAppBrowser() {
        return Boolean.valueOf(extractMetadata(METADATA_IN_APP_BROWSER_KEY)).booleanValue();
    }

    public boolean isMobileScreensaver() {
        return getImages().size() == 1 && companionAd() == null;
    }

    public boolean isPreview() {
        return "true".equalsIgnoreCase(extractMetadata(METADATA_PREVIEW_KEY));
    }

    public boolean isProgrammatic() {
        return metadata() != null && metadata().containsKey(METADATA_AD_SOURCE_TYPE) && "programmatic".equals(metadata().get(METADATA_AD_SOURCE_TYPE));
    }

    public boolean isSkippableAd() {
        return Boolean.valueOf(extractMetadata(METADATA_IS_SKIPPABLE_AD)).booleanValue();
    }

    public boolean isSponsorship() {
        if (!getDisplays().isEmpty() && getDisplays().get(0).getWidth() == 300 && getDisplays().get(0).getHeight() == 75) {
            return true;
        }
        return false;
    }

    public boolean isVoiceAd() {
        return (getAdType() != AdType.VOICE || extractMetadata(METADATA_VOICE_MICROPHONE_DELAY) == null || extractMetadata(METADATA_VOICE_INTENT) == null || extractMetadata(METADATA_VOICE_ACTION_URI) == null) ? false : true;
    }

    @JsonProperty("line_item_id")
    public abstract String lineItemId();

    @JsonProperty("metadata")
    public abstract Map<String, String> metadata();

    @JsonProperty("non_explicit")
    public abstract boolean nonExplicit();

    public void setAudioPlus(boolean z) {
        metadata().put(METADATA_AUDIO_PLUS, String.valueOf(z));
    }

    @JsonProperty(METADATA_IS_SKIPPABLE_AD)
    public abstract boolean skippable();

    @JsonProperty("test_ad")
    public abstract boolean testAd();

    @JsonProperty("title")
    public abstract String title();

    @JsonProperty("uri")
    public abstract String uri();

    @JsonProperty("videos")
    public abstract List<Video> videos();
}
