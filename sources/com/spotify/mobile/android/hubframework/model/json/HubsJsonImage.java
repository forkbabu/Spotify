package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableImage;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonImage extends HubsImmutableImage implements JacksonModel {
    private static final String KEY_CUSTOM = "custom";
    private static final String KEY_PLACEHOLDER = "placeholder";
    private static final String KEY_URI = "uri";

    private HubsJsonImage(String str, String str2, HubsJsonComponentBundle hubsJsonComponentBundle) {
        super(str, str2, HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle));
    }

    @JsonCreator
    static HubsJsonImage fromJson(@JsonProperty("uri") String str, @JsonProperty("placeholder") String str2, @JsonProperty("custom") HubsJsonComponentBundle hubsJsonComponentBundle) {
        return new HubsJsonImage(str, str2, hubsJsonComponentBundle);
    }
}
