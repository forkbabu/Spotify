package com.spotify.music.features.findfriends.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.findfriends.model.$AutoValue_FindFriendsModel  reason: invalid class name */
public abstract class C$AutoValue_FindFriendsModel extends FindFriendsModel {
    private final List<UserModel> results;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.findfriends.model.$AutoValue_FindFriendsModel$b */
    public static final class b extends FindFriendsModel.a {
        private List<UserModel> a;

        b() {
        }

        @Override // com.spotify.music.features.findfriends.model.FindFriendsModel.a
        public FindFriendsModel a() {
            String str = this.a == null ? " results" : "";
            if (str.isEmpty()) {
                return new AutoValue_FindFriendsModel(this.a);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.findfriends.model.FindFriendsModel.a
        public FindFriendsModel.a b(List<UserModel> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null results");
        }

        b(FindFriendsModel findFriendsModel, a aVar) {
            this.a = findFriendsModel.results();
        }
    }

    C$AutoValue_FindFriendsModel(List<UserModel> list) {
        if (list != null) {
            this.results = list;
            return;
        }
        throw new NullPointerException("Null results");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindFriendsModel) {
            return this.results.equals(((FindFriendsModel) obj).results());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.results.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.findfriends.model.FindFriendsModel
    @JsonProperty("results")
    public List<UserModel> results() {
        return this.results;
    }

    @Override // com.spotify.music.features.findfriends.model.FindFriendsModel
    public FindFriendsModel.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("FindFriendsModel{results="), this.results, "}");
    }
}
