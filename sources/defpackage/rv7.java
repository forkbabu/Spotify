package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: rv7  reason: default package */
public abstract class rv7 implements pv7, Parcelable {
    @JsonCreator
    public static rv7 create(int i, String str, String str2) {
        return new kv7(i, str, str2);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();
}
