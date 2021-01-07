package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.hubframework.model.immutable.c;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;
import java.util.List;

@JsonSerialize(using = HubsModelFailingSerializer.class)
public class HubsJsonViewModel extends HubsImmutableViewModel implements JacksonModel {
    private static final String JSON_KEY_BODY = "body";
    private static final String JSON_KEY_CUSTOM = "custom";
    private static final String JSON_KEY_EXTENSION = "extension";
    private static final String JSON_KEY_HEADER = "header";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_OVERLAYS = "overlays";
    private static final String JSON_KEY_TITLE = "title";

    @JsonCreator
    static HubsJsonViewModel fromJson(@JsonProperty("id") String str, @JsonProperty("title") String str2, @JsonProperty("header") HubsJsonComponentModel hubsJsonComponentModel, @JsonProperty("body") List<HubsJsonComponentModel> list, @JsonProperty("overlays") List<HubsJsonComponentModel> list2, @JsonProperty("extension") String str3, @JsonProperty("custom") HubsJsonComponentBundle hubsJsonComponentBundle) {
        return new HubsJsonViewModel(str, str2, hubsJsonComponentModel, f91.b(c.c(list)), f91.b(c.c(list2)), str3, HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle));
    }

    private HubsJsonViewModel(String str, String str2, HubsImmutableComponentModel hubsImmutableComponentModel, ImmutableList<HubsImmutableComponentModel> immutableList, ImmutableList<HubsImmutableComponentModel> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        super(str, str2, hubsImmutableComponentModel, immutableList, immutableList2, str3, hubsImmutableComponentBundle);
    }
}
