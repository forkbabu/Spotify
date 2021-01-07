package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonComponentText extends HubsImmutableComponentText implements JacksonModel {
    private static final String JSON_KEY_ACCESSORY_TITLE = "accessory";
    private static final String JSON_KEY_DESCRIPTION = "description";
    private static final String JSON_KEY_SUBTITLE = "subtitle";
    private static final String JSON_KEY_TITLE = "title";

    private HubsJsonComponentText(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    @JsonCreator
    static HubsJsonComponentText fromJson(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("accessory") String str3, @JsonProperty("description") String str4) {
        return new HubsJsonComponentText(str, str2, str3, str4);
    }
}
