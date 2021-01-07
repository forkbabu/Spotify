package com.spotify.mobile.android.rx;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.HashMap;
import java.util.Map;

public class ProductStateValuesResponse implements JacksonModel {
    private final Map<String, String> mProperties = new HashMap();

    public static Optional<Map<String, String>> asOptionalMap(ProductStateValuesResponse productStateValuesResponse) {
        return Optional.of(productStateValuesResponse.getProperties());
    }

    public Map<String, String> getProperties() {
        return ImmutableMap.copyOf(this.mProperties);
    }

    @JsonAnySetter
    public void setProperty(String str, String str2) {
        this.mProperties.put(str, str2);
    }
}
