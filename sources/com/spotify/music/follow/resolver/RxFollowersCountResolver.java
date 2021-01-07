package com.spotify.music.follow.resolver;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;
import java.util.List;

public interface RxFollowersCountResolver {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Count implements JacksonModel {
        private final int mFollowersCount;
        private final int mFollowingCount;

        @JsonCreator
        public Count(@JsonProperty("followers_count") int i, @JsonProperty("following_count") int i2) {
            this.mFollowersCount = Math.max(0, i);
            this.mFollowingCount = Math.max(0, i2);
        }

        public int getFollowersCount() {
            return this.mFollowersCount;
        }

        public int getFollowingCount() {
            return this.mFollowingCount;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonDeserialize(using = RxFollowersCountResolver_Counts_Deserializer.class)
    public static class Counts implements JacksonModel {
        public final Count[] counts;

        @JsonCreator
        public Counts(Count[] countArr) {
            this.counts = countArr;
        }
    }

    s<Count> a(String str);

    s<Counts> b(List<String> list);
}
