package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: et9  reason: default package */
public abstract class et9 {
    @JsonCreator
    public static et9 create(@JsonProperty("value") String str, @JsonProperty("name") String str2) {
        return new ct9(str, str2);
    }

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("value")
    public abstract String value();
}
