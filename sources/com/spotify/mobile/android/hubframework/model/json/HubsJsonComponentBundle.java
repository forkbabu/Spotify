package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonDeserialize(using = HubsJsonComponentBundleDeserializer.class)
@JsonSerialize(using = HubsModelFailingSerializer.class)
class HubsJsonComponentBundle extends HubsImmutableComponentBundle implements JacksonModel {
    HubsJsonComponentBundle(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        super(hubsImmutableComponentBundle);
    }
}
