package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpaceGenre implements JacksonModel {
    @JsonProperty("iconImageUrl")
    public String iconImageUrl;
    @JsonProperty("iconUrl")
    public String iconUrl;
    @JsonProperty("id")
    public String id;
    @JsonProperty("moodImageUrl")
    public String moodImageUrl;
    @JsonProperty("name")
    public String name;
    @JsonProperty("playlistUri")
    public String playlistUri;
    @JsonProperty("subGenres")
    public List<SpaceSubGenre> subGenres;
    @JsonProperty("templateName")
    public String templateName;
}
