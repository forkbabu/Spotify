package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.ads.model.Ad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SponsorshipAdData implements JacksonModel {
    private static final Pattern CREATIVE_JSON_PATTERN = Pattern.compile("<span data-template=\"sponsored\\-playlist\">(.+)?</span>", 32);

    @JsonCreator
    public static SponsorshipAdData create(@JsonProperty("thirdPartyImpression") String str, @JsonProperty("creativeId") String str2, @JsonProperty("lineItemId") String str3, @JsonProperty("impression") String str4, @JsonProperty("logoUrl") String str5, @JsonProperty("clickThrough") String str6, @JsonProperty("clickTracking") String str7, @JsonProperty("advertiserName") String str8) {
        return new AutoValue_SponsorshipAdData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static SponsorshipAdData fromPreviewAd(Ad ad) {
        Assertion.j("Unable to extract sponsorship data from non sponsorship ad", ad.isSponsorship());
        JSONObject parseJsonDataFromCreativeMedia = parseJsonDataFromCreativeMedia(ad.getDisplays().get(0).getMedia());
        return create(parseJsonDataFromCreativeMedia.getString("thirdPartyTracking"), parseJsonDataFromCreativeMedia.getString("creativeId"), parseJsonDataFromCreativeMedia.getString("lineItemId"), "", parseJsonDataFromCreativeMedia.getString("logo"), parseJsonDataFromCreativeMedia.getString("clickThrough"), parseJsonDataFromCreativeMedia.getString("clickTracking"), parseJsonDataFromCreativeMedia.getString("advertiserName"));
    }

    public static JSONObject parseJsonDataFromCreativeMedia(String str) {
        Matcher matcher = CREATIVE_JSON_PATTERN.matcher(str);
        if (matcher.find()) {
            return new JSONObject(matcher.group(1).trim()).getJSONObject("sponsoredPlaylist");
        }
        throw new JSONException("Can't find JSON in creative html");
    }

    @JsonProperty("advertiserName")
    public abstract String advertiserName();

    @JsonProperty("clickThrough")
    public abstract String clickThroughUrl();

    @JsonProperty("clickTracking")
    public abstract String clickTrackingUrl();

    @JsonProperty("creativeId")
    public abstract String creativeId();

    @JsonProperty("impression")
    public abstract String impression();

    @JsonProperty("lineItemId")
    public abstract String lineItemId();

    @JsonProperty("logoUrl")
    public abstract String logoUrl();

    @JsonProperty("thirdPartyImpression")
    public abstract String thirdPartyImpression();
}
