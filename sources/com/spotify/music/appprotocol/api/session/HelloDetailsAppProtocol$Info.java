package com.spotify.music.appprotocol.api.session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloDetailsAppProtocol$Info implements JacksonModel {
    private static final String CATEGORY_APP = "app";
    private static final String CATEGORY_CAR = "car";
    private static final String CATEGORY_WEARABLE = "wearable";
    private static final String UNKNOWN_ID = "Unknown_app_protocol_client_id";
    @JsonProperty("category")
    public String category;
    @JsonProperty("default_image_height")
    public int defaultImageHeight;
    @JsonProperty("default_image_width")
    public int defaultImageWidth;
    @JsonProperty("default_thumbnail_image_height")
    public int defaultThumbnailImageHeight;
    @JsonProperty("default_thumbnail_image_width")
    public int defaultThumbnailImageWidth;
    @JsonProperty("device_identifier")
    public String deviceIdentifier;
    @JsonProperty("id")
    public String id;
    @JsonProperty("image_type")
    public String imageType;
    @JsonProperty("manufacturer")
    public String manufacturer;
    @JsonProperty("model")
    public String model;
    @JsonProperty("name")
    public String name;
    @JsonProperty("protocol_version")
    public int protocolVersion;
    @JsonProperty("required_features")
    public List<String> requiredFeatures;
    @JsonProperty("version")
    public String version;

    public String idOrUnknown() {
        return MoreObjects.isNullOrEmpty(this.id) ? UNKNOWN_ID : this.id;
    }

    public boolean isCategoryApp() {
        return CATEGORY_APP.equalsIgnoreCase(this.category);
    }

    public boolean isCategoryCar() {
        return CATEGORY_CAR.equalsIgnoreCase(this.category);
    }

    public boolean isCategoryWearable() {
        return CATEGORY_WEARABLE.equalsIgnoreCase(this.category);
    }

    public boolean requiresFeature(String str) {
        List<String> list = this.requiredFeatures;
        return list != null && list.contains(str);
    }
}
