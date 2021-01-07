package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.player.model.ContextTrack;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public abstract class VoiceViewResponse implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Body implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Custom implements JacksonModel {

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static abstract class Overrides implements JacksonModel {
                @JsonCreator
                public static Overrides create(@JsonProperty("name") String str, @JsonProperty("uri") String str2) {
                    return new AutoValue_VoiceViewResponse_Body_Custom_Overrides(str, str2);
                }

                @JsonProperty("name")
                public abstract String name();

                @JsonProperty("uri")
                public abstract String uri();
            }

            @JsonCreator
            public static Custom create(@JsonProperty("overrides") List<Overrides> list, @JsonProperty("isExplicit") boolean z) {
                return new AutoValue_VoiceViewResponse_Body_Custom(list, z);
            }

            @JsonProperty("isExplicit")
            public abstract boolean explicit();

            @JsonProperty("overrides")
            public abstract List<Overrides> override();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Images implements JacksonModel {

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static abstract class Image implements JacksonModel {
                @JsonCreator
                public static Image create(@JsonProperty("uri") String str) {
                    return new AutoValue_VoiceViewResponse_Body_Images_Image(str);
                }

                @JsonProperty("uri")
                public abstract String uri();
            }

            @JsonCreator
            public static Images create(@JsonProperty("main") Image image) {
                return new AutoValue_VoiceViewResponse_Body_Images(image);
            }

            @JsonProperty("main")
            public abstract Image main();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Target implements JacksonModel {
            @JsonCreator
            public static Target create(@JsonProperty("uri") String str) {
                return new AutoValue_VoiceViewResponse_Body_Target(str);
            }

            @JsonProperty("uri")
            public abstract String uri();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Text implements JacksonModel {
            @JsonCreator
            public static Text create(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2) {
                return new AutoValue_VoiceViewResponse_Body_Text(str, str2);
            }

            @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
            public abstract String subtitle();

            @JsonProperty("title")
            public abstract String title();
        }

        @JsonCreator
        public static Body create(@JsonProperty("text") Text text, @JsonProperty("target") Target target, @JsonProperty("images") Images images, @JsonProperty("custom") Custom custom) {
            return new AutoValue_VoiceViewResponse_Body(text, target, images, custom);
        }

        @JsonProperty("custom")
        public abstract Custom custom();

        @JsonProperty("images")
        public abstract Images images();

        @JsonProperty("target")
        public abstract Target target();

        @JsonProperty("text")
        public abstract Text text();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Custom implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Restriction implements JacksonModel {
            @JsonCreator
            public static Restriction create(@JsonProperty("heading") String str, @JsonProperty("detail") String str2) {
                return new AutoValue_VoiceViewResponse_Custom_Restriction(str, str2);
            }

            @JsonProperty("detail")
            public abstract String detail();

            @JsonProperty("heading")
            public abstract String heading();
        }

        @JsonCreator
        public static Custom create(@JsonProperty("intent") String str, @JsonProperty("query") String str2, @JsonProperty("restriction") Restriction restriction, @JsonProperty("friendlyError") String str3, @JsonProperty("error") String str4, @JsonProperty("ttsUrl") String str5) {
            return new AutoValue_VoiceViewResponse_Custom(str, str2, restriction, str3, str4, str5);
        }

        @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
        public abstract String error();

        @JsonProperty("friendlyError")
        public abstract String friendlyError();

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

        @JsonProperty("query")
        public abstract String query();

        @JsonProperty("intent")
        public abstract String rawIntent();

        @JsonProperty("restriction")
        public abstract Restriction restriction();

        @JsonProperty("ttsUrl")
        public abstract String ttsUrl();
    }

    @JsonCreator
    public static VoiceViewResponse create(@JsonProperty("custom") Custom custom, @JsonProperty("body") List<Body> list) {
        return new AutoValue_VoiceViewResponse(custom, list);
    }

    @JsonProperty("body")
    public abstract List<Body> body();

    @JsonProperty("custom")
    public abstract Custom custom();
}
