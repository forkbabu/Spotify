package com.spotify.mobile.android.video.exo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = SpotifyJsonManifest_Deserializer.class)
public class SpotifyJsonManifest implements JacksonModel {
    @JsonProperty("base_urls")
    public String[] baseUrls;
    @JsonProperty("contents")
    public Content[] contents;
    @JsonProperty("end_time_millis")
    public long endTimeMs;
    @JsonProperty("initialization_template")
    public String initializationTemplate;
    @JsonProperty("segment_template")
    public String segmentTemplate;
    @JsonProperty("spritemaps")
    public SpriteMap[] spriteMaps;
    @JsonProperty("spritemap_base_urls")
    public String[] spritemapBaseUrls;
    @JsonProperty("spritemap_template")
    public String spritemapTemplate;
    @JsonProperty("start_time_millis")
    public long startTimeMs;
    @JsonProperty("subtitle_base_urls")
    public String[] subtitleBaseUrls;
    @JsonProperty("subtitle_language_codes")
    public String[] subtitleLanguageCodes;
    @JsonProperty("subtitle_template")
    public String subtitleTemplate;

    @JsonCreator
    public SpotifyJsonManifest(@JsonProperty("contents") Content[] contentArr, @JsonProperty("start_time_millis") long j, @JsonProperty("end_time_millis") long j2, @JsonProperty("initialization_template") String str, @JsonProperty("segment_template") String str2, @JsonProperty("spritemap_template") String str3, @JsonProperty("base_urls") String[] strArr, @JsonProperty("spritemap_base_urls") String[] strArr2, @JsonProperty("subtitle_base_urls") String[] strArr3, @JsonProperty("spritemaps") SpriteMap[] spriteMapArr, @JsonProperty("subtitle_language_codes") String[] strArr4, @JsonProperty("subtitle_template") String str4) {
        this.contents = contentArr;
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.initializationTemplate = str;
        this.segmentTemplate = str2;
        this.spritemapTemplate = str3;
        this.baseUrls = strArr;
        this.spritemapBaseUrls = strArr2;
        this.subtitleBaseUrls = strArr3;
        this.spriteMaps = spriteMapArr;
        this.subtitleLanguageCodes = strArr4;
        this.subtitleTemplate = str4;
    }
}
