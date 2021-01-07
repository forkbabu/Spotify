package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class i implements Parcelable {
    @JsonCreator
    public static i create(@JsonProperty("stream") String str, @JsonProperty("midroll-watchnow") String str2, @JsonProperty("watchnow") String str3, @JsonProperty("preroll") String str4, @JsonProperty("mobile-screensaver") String str5) {
        return new h(str, str2, str3, str4, str5);
    }

    @JsonProperty("midroll-watchnow")
    public abstract String getMidrollWatchNow();

    @JsonProperty("mobile-screensaver")
    public abstract String getMobileScreensaver();

    @JsonProperty("preroll")
    public abstract String getPreroll();

    @JsonProperty("stream")
    public abstract String getStream();

    @JsonProperty("watchnow")
    public abstract String getWatchNow();

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getStream() != null) {
            sb.append("\tstream: ");
            sb.append(getStream());
            sb.append('\n');
        }
        if (getMidrollWatchNow() != null) {
            sb.append("\tmidroll-watchnow: ");
            sb.append(getMidrollWatchNow());
            sb.append('\n');
        }
        if (getWatchNow() != null) {
            sb.append("\twatchnow: ");
            sb.append(getWatchNow());
            sb.append('\n');
        }
        if (getPreroll() != null) {
            sb.append("\tpreroll: ");
            sb.append(getPreroll());
            sb.append('\n');
        }
        if (getMobileScreensaver() != null) {
            sb.append("\tmobile-screensaver: ");
            sb.append(getMobileScreensaver());
            sb.append('\n');
        }
        return sb.toString();
    }
}
