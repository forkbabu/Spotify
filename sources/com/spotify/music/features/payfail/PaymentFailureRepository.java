package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;
import java.util.List;

public class PaymentFailureRepository {
    private final g0 a;

    @JsonIgnoreProperties(ignoreUnknown = true)
    static abstract class Resources implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        static abstract class Resource implements JacksonModel {
            Resource() {
            }

            @JsonCreator
            public static Resource create(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
                return new AutoValue_PaymentFailureRepository_Resources_Resource(str, str2);
            }

            @JsonProperty("offline_availability")
            public abstract String offlineAvailability();

            @JsonProperty("uri")
            public abstract String uri();
        }

        Resources() {
        }

        @JsonCreator
        public static Resources create(@JsonProperty("resources") List<Resource> list) {
            return new AutoValue_PaymentFailureRepository_Resources(list);
        }

        @JsonProperty("resources")
        public abstract List<Resource> offlineAvailabilities();
    }

    public PaymentFailureRepository(g0 g0Var) {
        this.a = g0Var;
    }

    public s<Integer> a() {
        return this.a.a().P().j0(o.a);
    }
}
