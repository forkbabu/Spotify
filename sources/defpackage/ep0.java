package defpackage;

import android.os.Parcelable;
import com.spotify.inappmessaging.ActionType;

/* renamed from: ep0  reason: default package */
public abstract class ep0 implements Parcelable {
    public static ep0 a(ActionType actionType, String str, String str2, boolean z) {
        return new bp0(actionType, str, str2, z);
    }

    public abstract ActionType b();

    public abstract String c();

    public abstract String e();

    public abstract boolean f();
}
