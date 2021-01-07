package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpaceItemsResponse implements JacksonModel {
    @JsonProperty("items")
    public List<SpaceItemWrapper> itemsWrappers;
}
