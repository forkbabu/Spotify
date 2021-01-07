package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: us9  reason: default package */
public abstract class us9 {
    @JsonCreator
    public static us9 create(@JsonProperty("device_id") String str, @JsonProperty("serial") String str2, @JsonProperty("username") String str3, @JsonProperty("version_os") String str4, @JsonProperty("version_hardware") String str5, @JsonProperty("version_firmware") String str6, @JsonProperty("version_software") String str7, @JsonProperty("version_audio_driver") String str8, @JsonProperty("connect_device_name") String str9, @JsonProperty("platform") vs9 vs9, @JsonProperty("status") String str10) {
        return new ss9(str, str2, str3, str4, str5, str6, str7, str8, str9, vs9, str10);
    }

    public abstract String a();

    public abstract String b();

    public abstract vs9 c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();
}
