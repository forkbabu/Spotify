package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apd  reason: default package */
public class apd<T extends Parcelable> {
    private final Parcelable.Creator<T> a;

    protected apd(Parcelable.Creator<T> creator) {
        this.a = creator;
    }

    public List<T> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, this.a);
        return arrayList;
    }
}
