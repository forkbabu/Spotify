package com.spotify.music.features.findfriends.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.findfriends.model.C$AutoValue_FindFriendsModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = FindFriendsModel.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class FindFriendsModel implements JacksonModel, Parcelable {
    public static final FindFriendsModel EMPTY = create(ImmutableList.of());

    public static abstract class a {
        public abstract FindFriendsModel a();

        public abstract a b(List<UserModel> list);
    }

    public static a builder() {
        return new C$AutoValue_FindFriendsModel.b();
    }

    @JsonCreator
    public static FindFriendsModel create(@JsonProperty("results") List<UserModel> list) {
        a builder = builder();
        builder.b(ImmutableList.copyOf(Collections2.filter((Iterable) list, (Predicate) a.a)));
        return builder.a();
    }

    @JsonProperty("results")
    public abstract List<UserModel> results();

    public abstract a toBuilder();
}
