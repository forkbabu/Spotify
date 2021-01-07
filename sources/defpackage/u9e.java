package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: u9e  reason: default package */
public abstract class u9e {
    @JsonCreator
    public static u9e create(@JsonProperty("destinations") List<t9e> list) {
        return new s9e(list);
    }

    @JsonProperty("destinations")
    public abstract List<t9e> destinations();
}
