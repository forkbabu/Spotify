package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.Context;

final class AutoValue_Context extends Context {
    private final ImmutableMap<String, String> metadata;
    private final Optional<ImmutableList<ContextPage>> pages;
    private final Optional<Restrictions> restrictions;
    private final String uri;
    private final String url;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Context.Builder {
        private ImmutableMap<String, String> metadata;
        private Optional<ImmutableList<ContextPage>> pages;
        private Optional<Restrictions> restrictions;
        private String uri;
        private String url;

        @Override // com.spotify.player.model.Context.Builder
        public Context build() {
            String str = this.uri == null ? " uri" : "";
            if (this.url == null) {
                str = je.x0(str, " url");
            }
            if (this.metadata == null) {
                str = je.x0(str, " metadata");
            }
            if (str.isEmpty()) {
                return new AutoValue_Context(this.uri, this.url, this.metadata, this.pages, this.restrictions);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.Context.Builder
        public Context.Builder metadata(ImmutableMap<String, String> immutableMap) {
            if (immutableMap != null) {
                this.metadata = immutableMap;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }

        @Override // com.spotify.player.model.Context.Builder
        public Context.Builder pages(ImmutableList<ContextPage> immutableList) {
            this.pages = Optional.of(immutableList);
            return this;
        }

        @Override // com.spotify.player.model.Context.Builder
        public Context.Builder restrictions(Restrictions restrictions2) {
            this.restrictions = Optional.of(restrictions2);
            return this;
        }

        @Override // com.spotify.player.model.Context.Builder
        public Context.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        @Override // com.spotify.player.model.Context.Builder
        public Context.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            throw new NullPointerException("Null url");
        }

        Builder() {
            this.pages = Optional.absent();
            this.restrictions = Optional.absent();
        }

        private Builder(Context context) {
            this.pages = Optional.absent();
            this.restrictions = Optional.absent();
            this.uri = context.uri();
            this.url = context.url();
            this.metadata = context.metadata();
            this.pages = context.pages();
            this.restrictions = context.restrictions();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return false;
        }
        Context context = (Context) obj;
        if (!this.uri.equals(context.uri()) || !this.url.equals(context.url()) || !this.metadata.equals(context.metadata()) || !this.pages.equals(context.pages()) || !this.restrictions.equals(context.restrictions())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.pages.hashCode()) * 1000003) ^ this.restrictions.hashCode();
    }

    @Override // com.spotify.player.model.Context
    @JsonProperty("metadata")
    public ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    @Override // com.spotify.player.model.Context
    @JsonProperty("pages")
    public Optional<ImmutableList<ContextPage>> pages() {
        return this.pages;
    }

    @Override // com.spotify.player.model.Context
    @JsonProperty("restrictions")
    public Optional<Restrictions> restrictions() {
        return this.restrictions;
    }

    @Override // com.spotify.player.model.Context
    public Context.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Context{uri=");
        V0.append(this.uri);
        V0.append(", url=");
        V0.append(this.url);
        V0.append(", metadata=");
        V0.append(this.metadata);
        V0.append(", pages=");
        V0.append(this.pages);
        V0.append(", restrictions=");
        return je.F0(V0, this.restrictions, "}");
    }

    @Override // com.spotify.player.model.Context
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    @Override // com.spotify.player.model.Context
    @JsonProperty("url")
    public String url() {
        return this.url;
    }

    private AutoValue_Context(String str, String str2, ImmutableMap<String, String> immutableMap, Optional<ImmutableList<ContextPage>> optional, Optional<Restrictions> optional2) {
        this.uri = str;
        this.url = str2;
        this.metadata = immutableMap;
        this.pages = optional;
        this.restrictions = optional2;
    }
}
