package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.album.offline.model.DecorationPolicy;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_DecorationPolicy  reason: invalid class name */
public abstract class C$AutoValue_DecorationPolicy extends DecorationPolicy {
    private final ListPolicy list;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.album.offline.model.$AutoValue_DecorationPolicy$b */
    public static class b implements DecorationPolicy.a {
        private ListPolicy a;

        b() {
        }

        @Override // com.spotify.music.features.album.offline.model.DecorationPolicy.a
        public DecorationPolicy.a a(ListPolicy listPolicy) {
            this.a = listPolicy;
            return this;
        }

        @Override // com.spotify.music.features.album.offline.model.DecorationPolicy.a
        public DecorationPolicy build() {
            String str = this.a == null ? " list" : "";
            if (str.isEmpty()) {
                return new AutoValue_DecorationPolicy(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        b(DecorationPolicy decorationPolicy, a aVar) {
            this.a = decorationPolicy.list();
        }
    }

    C$AutoValue_DecorationPolicy(ListPolicy listPolicy) {
        if (listPolicy != null) {
            this.list = listPolicy;
            return;
        }
        throw new NullPointerException("Null list");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DecorationPolicy) {
            return this.list.equals(((DecorationPolicy) obj).list());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.list.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.album.offline.model.DecorationPolicy
    @JsonProperty("list")
    public ListPolicy list() {
        return this.list;
    }

    @Override // com.spotify.music.features.album.offline.model.DecorationPolicy
    public DecorationPolicy.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DecorationPolicy{list=");
        V0.append(this.list);
        V0.append("}");
        return V0.toString();
    }
}
