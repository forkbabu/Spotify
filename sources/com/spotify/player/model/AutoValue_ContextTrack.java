package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.ContextTrack;
import java.util.Map;

final class AutoValue_ContextTrack extends ContextTrack {
    private final ImmutableMap<String, String> metadata;
    private final String provider;
    private final String uid;
    private final String uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ContextTrack.Builder {
        private ImmutableMap<String, String> metadata;
        private String provider;
        private String uid;
        private String uri;

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack build() {
            String str = this.uri == null ? " uri" : "";
            if (this.uid == null) {
                str = je.x0(str, " uid");
            }
            if (this.metadata == null) {
                str = je.x0(str, " metadata");
            }
            if (this.provider == null) {
                str = je.x0(str, " provider");
            }
            if (str.isEmpty()) {
                return new AutoValue_ContextTrack(this.uri, this.uid, this.metadata, this.provider);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder metadata(Map<String, String> map) {
            this.metadata = ImmutableMap.copyOf(map);
            return this;
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder provider(String str) {
            if (str != null) {
                this.provider = str;
                return this;
            }
            throw new NullPointerException("Null provider");
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder uid(String str) {
            if (str != null) {
                this.uid = str;
                return this;
            }
            throw new NullPointerException("Null uid");
        }

        @Override // com.spotify.player.model.ContextTrack.Builder
        public ContextTrack.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        Builder() {
        }

        private Builder(ContextTrack contextTrack) {
            this.uri = contextTrack.uri();
            this.uid = contextTrack.uid();
            this.metadata = contextTrack.metadata();
            this.provider = contextTrack.provider();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextTrack)) {
            return false;
        }
        ContextTrack contextTrack = (ContextTrack) obj;
        if (!this.uri.equals(contextTrack.uri()) || !this.uid.equals(contextTrack.uid()) || !this.metadata.equals(contextTrack.metadata()) || !this.provider.equals(contextTrack.provider())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.uid.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.provider.hashCode();
    }

    @Override // com.spotify.player.model.ContextTrack
    @JsonProperty("metadata")
    public ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    @Override // com.spotify.player.model.ContextTrack
    @JsonProperty(ContextTrack.Metadata.KEY_PROVIDER)
    public String provider() {
        return this.provider;
    }

    @Override // com.spotify.player.model.ContextTrack
    public ContextTrack.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextTrack{uri=");
        V0.append(this.uri);
        V0.append(", uid=");
        V0.append(this.uid);
        V0.append(", metadata=");
        V0.append(this.metadata);
        V0.append(", provider=");
        return je.I0(V0, this.provider, "}");
    }

    @Override // com.spotify.player.model.ContextTrack
    @JsonProperty("uid")
    public String uid() {
        return this.uid;
    }

    @Override // com.spotify.player.model.ContextTrack
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    private AutoValue_ContextTrack(String str, String str2, ImmutableMap<String, String> immutableMap, String str3) {
        this.uri = str;
        this.uid = str2;
        this.metadata = immutableMap;
        this.provider = str3;
    }
}
