package com.spotify.music.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

@JsonDeserialize(as = Map.class, using = JsonBundleHelper$BundleDeserializer.class)
@JsonSerialize(as = Map.class, using = JsonBundleHelper$BundleSerializer.class)
public interface b {
}
