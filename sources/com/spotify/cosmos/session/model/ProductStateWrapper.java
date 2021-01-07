package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

@JsonSerialize(using = ProductStateSerializer.class)
public abstract class ProductStateWrapper {
    public static ProductStateWrapper create(Map<String, String> map) {
        return new AutoValue_ProductStateWrapper(map);
    }

    public abstract Map<String, String> productState();
}
