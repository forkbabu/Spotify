package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cpd  reason: default package */
public abstract class cpd<T extends Parcelable> {
    private final Parcelable.Creator<? extends T> a;

    protected cpd(Parcelable.Creator<? extends T> creator) {
        this.a = creator;
    }

    public T a(Parcel parcel) {
        return (T) gf0.n(parcel, this.a);
    }
}
