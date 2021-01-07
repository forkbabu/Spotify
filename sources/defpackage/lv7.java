package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;

/* renamed from: lv7  reason: default package */
public abstract class lv7 implements pv7, Parcelable {
    @JsonCreator
    public static lv7 create(int i, String str, String str2) {
        return new fv7(i, str, str2);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();
}
