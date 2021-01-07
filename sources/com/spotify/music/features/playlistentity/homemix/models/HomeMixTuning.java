package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.music.features.playlistentity.homemix.models.d;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HomeMixTuning {

    public enum Style {
        DEFAULT("default"),
        CHILL("chill"),
        UPBEAT("upbeat");
        
        private static final Style[] f = values();
        private final String mValue;

        private Style(String str) {
            this.mValue = str;
        }

        @JsonCreator
        public static Style fromValue(String str) {
            if (str != null) {
                Style[] styleArr = f;
                for (Style style : styleArr) {
                    if (style.mValue.equalsIgnoreCase(str)) {
                        return style;
                    }
                }
            }
            return DEFAULT;
        }

        @JsonValue
        public String d() {
            return this.mValue;
        }
    }

    public interface a {
    }

    @JsonCreator
    public static HomeMixTuning create(Style style, List<String> list) {
        d.b bVar = new d.b();
        bVar.c(style.d());
        d.b bVar2 = bVar;
        bVar2.a(list);
        return bVar2.b();
    }

    @JsonProperty("member_blacklist")
    public abstract List<String> blacklist();

    @JsonProperty("style")
    public abstract String style();
}
