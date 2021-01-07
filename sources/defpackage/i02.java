package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: i02  reason: default package */
public abstract class i02 {
    @JsonCreator
    public static i02 create(@JsonProperty("fields") List<j02> list) {
        return new e02(list);
    }

    public abstract List<j02> a();
}
