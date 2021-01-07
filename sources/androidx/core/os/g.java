package androidx.core.os;

import android.os.Parcel;

@Deprecated
public interface g<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
