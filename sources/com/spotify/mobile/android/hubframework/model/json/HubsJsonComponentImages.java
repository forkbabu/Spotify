package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableImage;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;
import java.util.Map;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonComponentImages extends HubsImmutableComponentImages implements JacksonModel {
    private static final String JSON_KEY_BACKGROUND = "background";
    private static final String JSON_KEY_CUSTOM = "custom";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_MAIN = "main";

    private HubsJsonComponentImages(HubsJsonImage hubsJsonImage, HubsJsonImage hubsJsonImage2, Map<String, ? extends HubsImmutableImage> map, String str) {
        super(hubsJsonImage, hubsJsonImage2, f91.c(map), str);
    }

    @JsonCreator
    static HubsJsonComponentImages fromJson(@JsonProperty("main") HubsJsonImage hubsJsonImage, @JsonProperty("background") HubsJsonImage hubsJsonImage2, @JsonProperty("custom") Map<String, HubsJsonImage> map, @JsonProperty("icon") String str) {
        return new HubsJsonComponentImages(hubsJsonImage, hubsJsonImage2, map, str);
    }
}
