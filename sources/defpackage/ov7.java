package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: ov7  reason: default package */
public abstract class ov7 implements pv7, Parcelable {
    @JsonCreator
    public static ov7 create(int i, String str, String str2, String str3) {
        return new iv7(i, str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int e();
}
