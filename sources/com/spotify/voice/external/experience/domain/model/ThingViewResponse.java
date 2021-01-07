package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ThingViewResponse implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Body implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Target implements JacksonModel {
            @JsonCreator
            public static Target create(@JsonProperty("uri") String str) {
                return new AutoValue_ThingViewResponse_Body_Target(str);
            }

            @JsonProperty("uri")
            public abstract String uri();
        }

        @JsonCreator
        public static Body create(@JsonProperty("target") Target target) {
            return new AutoValue_ThingViewResponse_Body(target);
        }

        @JsonProperty("target")
        public abstract Target target();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Custom implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Restriction implements JacksonModel {
            @JsonCreator
            public static Restriction create(@JsonProperty("heading") String str, @JsonProperty("detail") String str2) {
                return new AutoValue_ThingViewResponse_Custom_Restriction(str, str2);
            }

            @JsonProperty("detail")
            public abstract String detail();

            @JsonProperty("heading")
            public abstract String heading();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Slots implements JacksonModel {
            @JsonCreator
            public static Slots create(@JsonProperty("requestedEntityType") List<String> list, @JsonProperty("preset") List<String> list2) {
                return new AutoValue_ThingViewResponse_Custom_Slots(list, list2);
            }

            @JsonProperty("preset")
            public abstract List<String> preset();

            @JsonProperty("requestedEntityType")
            public abstract List<String> requestedEntityType();
        }

        @JsonCreator
        public static Custom create(@JsonProperty("intent") String str, @JsonProperty("slots") Slots slots, @JsonProperty("query") String str2, @JsonProperty("context") PlayerContext playerContext, @JsonProperty("restriction") Restriction restriction, @JsonProperty("error") String str3, @JsonProperty("ttsUrl") String str4, @JsonProperty("volume_level") Integer num) {
            return new AutoValue_ThingViewResponse_Custom(str, slots, str2, playerContext, restriction, str3, str4, num);
        }

        @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
        public abstract String error();

        public SlimoProto$ParsedQuery$Intent intent() {
            try {
                if (rawIntent() == null) {
                    return SlimoProto$ParsedQuery$Intent.NO_INTENT;
                }
                return SlimoProto$ParsedQuery$Intent.valueOf(rawIntent());
            } catch (Exception unused) {
                return SlimoProto$ParsedQuery$Intent.WTF;
            }
        }

        @JsonProperty("context")
        public abstract PlayerContext playerContext();

        @JsonProperty("query")
        public abstract String query();

        /* access modifiers changed from: package-private */
        @JsonProperty("intent")
        public abstract String rawIntent();

        @JsonProperty("restriction")
        public abstract Restriction restriction();

        @JsonProperty("slots")
        public abstract Slots slots();

        @JsonProperty("ttsUrl")
        public abstract String ttsUrl();

        @JsonProperty("volume_level")
        public abstract Integer volumeLevel();
    }

    @JsonCreator
    public static ThingViewResponse create(@JsonProperty("custom") Custom custom, @JsonProperty("body") List<Body> list) {
        return new AutoValue_ThingViewResponse(custom, list);
    }

    @JsonProperty("body")
    public abstract List<Body> body();

    @JsonProperty("custom")
    public abstract Custom custom();
}
