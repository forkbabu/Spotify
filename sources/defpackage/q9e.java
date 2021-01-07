package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: q9e  reason: default package */
public abstract class q9e {
    @JsonCreator
    public static q9e create(@JsonProperty("integration") String str, @JsonProperty("os_version") String str2, @JsonProperty("device_platform") String str3) {
        return new p9e(str, str2, str3);
    }

    /* access modifiers changed from: package-private */
    @JsonProperty("integration")
    public abstract String integration();

    /* access modifiers changed from: package-private */
    @JsonProperty("os_version")
    public abstract String osVersion();

    /* access modifiers changed from: package-private */
    @JsonProperty("device_platform")
    public abstract String platform();
}
