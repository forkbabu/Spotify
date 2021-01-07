package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.album.offline.model.ListPolicy;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_ListPolicy  reason: invalid class name */
public abstract class C$AutoValue_ListPolicy extends ListPolicy {
    private final ImmutableMap<String, Boolean> attributes;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_ListPolicy$b */
    public static class b implements ListPolicy.a {
        private ImmutableMap<String, Boolean> a;

        b() {
        }

        @Override // com.spotify.music.features.album.offline.model.ListPolicy.a
        public ListPolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.a = immutableMap;
                return this;
            }
            throw new NullPointerException("Null attributes");
        }

        @Override // com.spotify.music.features.album.offline.model.ListPolicy.a
        public ListPolicy build() {
            String str = this.a == null ? " attributes" : "";
            if (str.isEmpty()) {
                return new AutoValue_ListPolicy(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        b(ListPolicy listPolicy, a aVar) {
            this.a = listPolicy.attributes();
        }
    }

    C$AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap) {
        if (immutableMap != null) {
            this.attributes = immutableMap;
            return;
        }
        throw new NullPointerException("Null attributes");
    }

    @Override // com.spotify.music.features.album.offline.model.ListPolicy
    @JsonAnyGetter
    public ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ListPolicy) {
            return this.attributes.equals(((ListPolicy) obj).attributes());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.attributes.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.album.offline.model.ListPolicy
    public ListPolicy.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ListPolicy{attributes=");
        V0.append(this.attributes);
        V0.append("}");
        return V0.toString();
    }
}
