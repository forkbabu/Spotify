package com.spotify.mobile.android.spotlets.collection.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

public class CollectionStateProvider {
    private final f a;

    public static abstract class ContainsRequest implements JacksonModel {
        public static ContainsRequest create(List<String> list, String str, String str2) {
            return new AutoValue_CollectionStateProvider_ContainsRequest(list, str, str2);
        }

        @JsonProperty("contextUri")
        public abstract String getContextUri();

        @JsonProperty("items")
        public abstract List<String> getItems();

        @JsonProperty("source")
        public abstract String getSource();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Response implements JacksonModel {
        @JsonCreator
        public static Response create(@JsonProperty("found") boolean[] zArr, @JsonProperty("ban_found") boolean[] zArr2) {
            return new AutoValue_CollectionStateProvider_Response(zArr, zArr2);
        }

        public abstract boolean[] isBanned();

        public abstract boolean[] isInCollection();
    }

    public static abstract class a {
        public abstract boolean a();

        public abstract boolean b();
    }

    public CollectionStateProvider(f fVar) {
        this.a = fVar;
    }

    public z<Map<String, a>> a(String str, String str2, String... strArr) {
        return this.a.b(ContainsRequest.create(Collections2.newArrayList(strArr), str, str2)).A(new a(strArr)).A(new c(this)).A(new d(this));
    }

    public s<Map<String, a>> b(String str, String str2, String... strArr) {
        return this.a.a(ContainsRequest.create(Collections2.newArrayList(strArr), str, str2)).j0(new b(strArr)).j0(new c(this)).j0(new d(this)).E();
    }
}
