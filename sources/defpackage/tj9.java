package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: tj9  reason: default package */
public abstract class tj9 {
    @JsonCreator
    public static tj9 create(@JsonProperty("start_date") String str, @JsonProperty("end_date") String str2) {
        return new qj9(str, str2);
    }

    @JsonProperty("end_date")
    public abstract String endDate();

    @JsonProperty("start_date")
    public abstract String startDate();
}
