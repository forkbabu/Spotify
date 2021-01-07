package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: d36  reason: default package */
public abstract class d36 {
    @JsonCreator
    public static d36 create(String str) {
        return new c36(str);
    }

    @JsonProperty("playlist_uri")
    public abstract String playlistUri();
}
