package defpackage;

import android.graphics.Bitmap;
import android.os.Parcelable;

/* renamed from: l8e  reason: default package */
public abstract class l8e implements m8e {
    public static l8e a(Bitmap bitmap) {
        return new i8e(bitmap);
    }

    public static Parcelable.Creator<i8e> b() {
        return i8e.CREATOR;
    }

    public abstract Bitmap c();
}
