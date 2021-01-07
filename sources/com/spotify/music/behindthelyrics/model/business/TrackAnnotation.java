package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackAnnotation implements JacksonModel, dq1 {
    @JsonCreator
    public static TrackAnnotation create(@JsonProperty("contents") String str, @JsonProperty("contentType") String str2, @JsonProperty("timestamp") double d, @JsonProperty("author") TrackAnnotationAuthor trackAnnotationAuthor) {
        return new AutoValue_TrackAnnotation(str, str2, d, trackAnnotationAuthor);
    }

    public static TrackAnnotation createIntroAnnotation() {
        return create("", "intro", 0.0d, TrackAnnotationAuthor.create(true, null, "Genius", null));
    }

    @JsonProperty("author")
    public abstract TrackAnnotationAuthor getAuthor();

    @JsonProperty("contents")
    public abstract String getContent();

    @JsonProperty("contentType")
    public abstract String getContentType();

    @JsonProperty("timestamp")
    public abstract double getTimestamp();

    @Override // defpackage.dq1
    public int getTimestampMillis() {
        return (int) (getTimestamp() * 1000.0d);
    }
}
