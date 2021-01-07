package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vs9  reason: default package */
public abstract class vs9 {
    @JsonCreator
    public static vs9 create(@JsonProperty("client_id") String str, @JsonProperty("name") String str2, @JsonProperty("display_name") String str3) {
        return new ts9(str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();
}
