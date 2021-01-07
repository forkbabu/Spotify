package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: ft9  reason: default package */
public abstract class ft9 {
    @JsonCreator
    public static ft9 create(@JsonProperty("key") String str, @JsonProperty("value") String str2, @JsonProperty("type") String str3, @JsonProperty("title") String str4, @JsonProperty("description") String str5, @JsonProperty("visibility") boolean z, @JsonProperty("modified") Long l, @JsonProperty("enum_values") List<et9> list) {
        return new dt9(str, str2, str3, str4, str5, z, l, list);
    }

    public ft9 a(String str, Long l) {
        return new dt9(key(), str, type(), title(), description(), visibility(), l, enumValues());
    }

    @JsonProperty("description")
    public abstract String description();

    @JsonProperty("enum_values")
    public abstract List<et9> enumValues();

    @JsonProperty("key")
    public abstract String key();

    @JsonProperty("modified")
    public abstract Long modified();

    @JsonProperty("title")
    public abstract String title();

    @JsonProperty("type")
    public abstract String type();

    @JsonProperty("value")
    public abstract String value();

    @JsonProperty("visibility")
    public abstract boolean visibility();
}
