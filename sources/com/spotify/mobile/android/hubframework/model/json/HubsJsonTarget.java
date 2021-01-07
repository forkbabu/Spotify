package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableTarget;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;
import java.util.List;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonTarget extends HubsImmutableTarget implements JacksonModel {
    private static final String KEY_ACTIONS = "actions";
    private static final String KEY_URI = "uri";

    private HubsJsonTarget(String str, ImmutableList<String> immutableList) {
        super(str, immutableList);
    }

    @JsonCreator
    static HubsJsonTarget fromJson(@JsonProperty("uri") String str, @JsonProperty("actions") List<String> list) {
        return new HubsJsonTarget(str, f91.b(list));
    }
}
