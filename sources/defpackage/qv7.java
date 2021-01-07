package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: qv7  reason: default package */
public abstract class qv7 implements pv7, Parcelable {
    @JsonCreator
    public static qv7 create(int i, String str, String str2, String str3) {
        return new jv7(i, str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int e();
}
