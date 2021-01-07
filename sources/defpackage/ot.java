package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ot  reason: default package */
public class ot {
    public static final /* synthetic */ int a = 0;

    static {
        ot.class.getClassLoader();
    }

    private ot() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
