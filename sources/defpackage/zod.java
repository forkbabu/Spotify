package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: zod  reason: default package */
public abstract class zod<T extends Parcelable> implements Object<List<T>> {
    private final Parcelable.Creator<? extends T> a;
    private final Class<T[]> b = null;

    protected zod(Parcelable.Creator<? extends T> creator) {
        this.a = creator;
    }

    public Object createFromParcel(Parcel parcel) {
        return (Parcelable) this.a.createFromParcel(parcel);
    }

    public Object[] newArray(int i) {
        Class<T[]> cls = this.b;
        if (cls != null) {
            return cls.cast(Array.newInstance(cls.getComponentType(), i));
        }
        throw new UnsupportedOperationException();
    }
}
