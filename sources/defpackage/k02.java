package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: k02  reason: default package */
public abstract class k02 {
    @JsonCreator
    public static k02 create(@JsonProperty("display") i02 i02) {
        return new g02(i02);
    }

    public abstract i02 a();
}
