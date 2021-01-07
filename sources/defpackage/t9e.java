package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: t9e  reason: default package */
public abstract class t9e {
    @JsonCreator
    public static t9e create(@JsonProperty("id") String str, @JsonProperty("capabilities") List<String> list) {
        return new r9e(str, list);
    }

    @JsonProperty("capabilities")
    public abstract List<String> capabilities();

    @JsonProperty("id")
    public abstract String id();
}
