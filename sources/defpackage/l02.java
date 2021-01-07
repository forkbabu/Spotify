package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: l02  reason: default package */
public abstract class l02 {
    @JsonCreator
    public static l02 create(@JsonProperty("promotions") List<k02> list) {
        return new h02(list);
    }

    public abstract List<k02> a();
}
