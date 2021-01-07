package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableCommandModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonCommandModel extends HubsImmutableCommandModel implements JacksonModel {
    private static final String KEY_DATA = "data";
    private static final String KEY_NAME = "name";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HubsJsonCommandModel(String str, HubsJsonComponentBundle hubsJsonComponentBundle) {
        super(str == null ? "" : str, HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle));
    }

    @JsonCreator
    static HubsJsonCommandModel fromJson(@JsonProperty("name") String str, @JsonProperty("data") HubsJsonComponentBundle hubsJsonComponentBundle) {
        return new HubsJsonCommandModel(str, hubsJsonComponentBundle);
    }
}
