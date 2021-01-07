package com.spotify.mobile.android.playlist.model.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Deprecated
public class HeaderPolicy implements JacksonModel {
    @JsonIgnore
    private Map<String, Boolean> mAttributes;
    @JsonProperty("madeFor")
    private Map<String, Boolean> mMadeForAttributes;
    @JsonProperty("owner")
    private Map<String, Boolean> mOwnerAttributes;

    @JsonAnyGetter
    public Map<String, Boolean> getMap() {
        return this.mAttributes;
    }

    public void setAttributes(Map<String, Boolean> map) {
        this.mAttributes = map;
    }

    public void setMadeForAttributes(Map<String, Boolean> map) {
        this.mMadeForAttributes = map;
    }

    public void setOwnerAttributes(Map<String, Boolean> map) {
        this.mOwnerAttributes = map;
    }
}
