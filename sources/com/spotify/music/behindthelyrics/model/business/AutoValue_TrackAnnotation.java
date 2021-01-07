package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_TrackAnnotation extends TrackAnnotation {
    private final TrackAnnotationAuthor author;
    private final String content;
    private final String contentType;
    private final double timestamp;

    AutoValue_TrackAnnotation(String str, String str2, double d, TrackAnnotationAuthor trackAnnotationAuthor) {
        if (str != null) {
            this.content = str;
            if (str2 != null) {
                this.contentType = str2;
                this.timestamp = d;
                this.author = trackAnnotationAuthor;
                return;
            }
            throw new NullPointerException("Null contentType");
        }
        throw new NullPointerException("Null content");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackAnnotation)) {
            return false;
        }
        TrackAnnotation trackAnnotation = (TrackAnnotation) obj;
        if (this.content.equals(trackAnnotation.getContent()) && this.contentType.equals(trackAnnotation.getContentType()) && Double.doubleToLongBits(this.timestamp) == Double.doubleToLongBits(trackAnnotation.getTimestamp())) {
            TrackAnnotationAuthor trackAnnotationAuthor = this.author;
            if (trackAnnotationAuthor == null) {
                if (trackAnnotation.getAuthor() == null) {
                    return true;
                }
            } else if (trackAnnotationAuthor.equals(trackAnnotation.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotation
    @JsonProperty("author")
    public TrackAnnotationAuthor getAuthor() {
        return this.author;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotation
    @JsonProperty("contents")
    public String getContent() {
        return this.content;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotation
    @JsonProperty("contentType")
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotation
    @JsonProperty("timestamp")
    public double getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (((((this.content.hashCode() ^ 1000003) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.timestamp) >>> 32) ^ Double.doubleToLongBits(this.timestamp)))) * 1000003;
        TrackAnnotationAuthor trackAnnotationAuthor = this.author;
        return hashCode ^ (trackAnnotationAuthor == null ? 0 : trackAnnotationAuthor.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackAnnotation{content=");
        V0.append(this.content);
        V0.append(", contentType=");
        V0.append(this.contentType);
        V0.append(", timestamp=");
        V0.append(this.timestamp);
        V0.append(", author=");
        V0.append(this.author);
        V0.append("}");
        return V0.toString();
    }
}
