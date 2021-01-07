package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mg0;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: bpd  reason: default package */
public class bpd<T extends Parcelable> implements Object<List<T>> {
    private final mg0<Parcelable.Creator<? extends T>> a;
    private final Class<T[]> b = null;

    protected bpd(mg0.b<Parcelable.Creator<? extends T>> bVar) {
        this.a = mg0.b(bVar);
    }

    public Object createFromParcel(Parcel parcel) {
        return (Parcelable) this.a.a().createFromParcel(parcel);
    }

    public Object[] newArray(int i) {
        Class<T[]> cls = this.b;
        if (cls != null) {
            return cls.cast(Array.newInstance(cls.getComponentType(), i));
        }
        throw new UnsupportedOperationException();
    }
}
