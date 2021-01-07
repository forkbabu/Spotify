package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableCommandModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableTarget;
import com.spotify.mobile.android.hubframework.model.immutable.c;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;
import java.util.List;
import java.util.Map;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonComponentModel extends HubsImmutableComponentModel implements JacksonModel {
    private static final String JSON_KEY_CHILDREN = "children";
    private static final String JSON_KEY_COMPONENT_ID = "component";
    private static final String JSON_KEY_CUSTOM = "custom";
    private static final String JSON_KEY_EVENTS = "events";
    private static final String JSON_KEY_GROUP = "group";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_IMAGES = "images";
    private static final String JSON_KEY_LOGGING = "logging";
    private static final String JSON_KEY_METADATA = "metadata";
    private static final String JSON_KEY_TARGET = "target";
    private static final String JSON_KEY_TEXT = "text";

    private HubsJsonComponentModel(HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier, HubsImmutableComponentText hubsImmutableComponentText, HubsImmutableComponentImages hubsImmutableComponentImages, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, HubsImmutableTarget hubsImmutableTarget, String str, String str2, ImmutableMap<String, HubsImmutableCommandModel> immutableMap, ImmutableList<HubsImmutableComponentModel> immutableList) {
        super(hubsImmutableComponentIdentifier, hubsImmutableComponentText, hubsImmutableComponentImages, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hubsImmutableTarget, str, str2, immutableMap, immutableList);
    }

    @JsonCreator
    static HubsJsonComponentModel fromJson(@JsonProperty("component") HubsJsonComponentIdentifier hubsJsonComponentIdentifier, @JsonProperty("text") HubsJsonComponentText hubsJsonComponentText, @JsonProperty("images") HubsJsonComponentImages hubsJsonComponentImages, @JsonProperty("metadata") HubsJsonComponentBundle hubsJsonComponentBundle, @JsonProperty("logging") HubsJsonComponentBundle hubsJsonComponentBundle2, @JsonProperty("custom") HubsJsonComponentBundle hubsJsonComponentBundle3, @JsonProperty("target") HubsJsonTarget hubsJsonTarget, @JsonProperty("id") String str, @JsonProperty("group") String str2, @JsonProperty("events") Map<String, HubsJsonCommandModel> map, @JsonProperty("children") List<HubsJsonComponentModel> list) {
        return new HubsJsonComponentModel(HubsImmutableComponentIdentifier.fromNullable(hubsJsonComponentIdentifier), HubsImmutableComponentText.fromNullable(hubsJsonComponentText), HubsImmutableComponentImages.fromNullable(hubsJsonComponentImages), HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle), HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle2), HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle3), hubsJsonTarget, str, str2, HubsImmutableCommandModel.asImmutableCommandMap(map), f91.b(c.c(list)));
    }
}
