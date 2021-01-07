package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: bab  reason: default package */
public class bab {
    private final String a;
    private final String b;

    @JsonCreator
    public bab(@JsonProperty(defaultValue = "Live event", value = "title") String str, @JsonProperty(defaultValue = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8", value = "urlTemplate") String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
