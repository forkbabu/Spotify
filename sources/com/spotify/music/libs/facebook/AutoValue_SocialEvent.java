package com.spotify.music.libs.facebook;

import com.spotify.music.libs.facebook.SocialEvent;

final class AutoValue_SocialEvent extends SocialEvent {
    private final String description;
    private final SocialError socialError;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SocialEvent.Builder {
        private String description;
        private SocialError socialError;

        @Override // com.spotify.music.libs.facebook.SocialEvent.Builder
        public SocialEvent build() {
            String str = this.socialError == null ? " socialError" : "";
            if (this.description == null) {
                str = je.x0(str, " description");
            }
            if (str.isEmpty()) {
                return new AutoValue_SocialEvent(this.socialError, this.description);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.facebook.SocialEvent.Builder
        public SocialEvent.Builder description(String str) {
            if (str != null) {
                this.description = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        @Override // com.spotify.music.libs.facebook.SocialEvent.Builder
        public SocialEvent.Builder socialError(SocialError socialError2) {
            if (socialError2 != null) {
                this.socialError = socialError2;
                return this;
            }
            throw new NullPointerException("Null socialError");
        }

        Builder() {
        }

        private Builder(SocialEvent socialEvent) {
            this.socialError = socialEvent.socialError();
            this.description = socialEvent.description();
        }
    }

    @Override // com.spotify.music.libs.facebook.SocialEvent
    public String description() {
        return this.description;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialEvent)) {
            return false;
        }
        SocialEvent socialEvent = (SocialEvent) obj;
        if (!this.socialError.equals(socialEvent.socialError()) || !this.description.equals(socialEvent.description())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.socialError.hashCode() ^ 1000003) * 1000003) ^ this.description.hashCode();
    }

    @Override // com.spotify.music.libs.facebook.SocialEvent
    public SocialError socialError() {
        return this.socialError;
    }

    @Override // com.spotify.music.libs.facebook.SocialEvent
    public SocialEvent.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SocialEvent{socialError=");
        V0.append(this.socialError);
        V0.append(", description=");
        return je.I0(V0, this.description, "}");
    }

    private AutoValue_SocialEvent(SocialError socialError2, String str) {
        this.socialError = socialError2;
        this.description = str;
    }
}
