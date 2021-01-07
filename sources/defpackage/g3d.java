package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k3d;

/* renamed from: g3d  reason: default package */
final class g3d extends d3d {
    public static final Parcelable.Creator<g3d> CREATOR = new a();

    /* renamed from: g3d$a */
    static class a implements Parcelable.Creator<g3d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public g3d createFromParcel(Parcel parcel) {
            return new g3d(parcel.readInt(), parcel.readInt(), (k3d.b.AbstractC0631b) parcel.readParcelable(k3d.b.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public g3d[] newArray(int i) {
            return new g3d[i];
        }
    }

    g3d(int i, int i2, k3d.b.AbstractC0631b bVar) {
        super(i, i2, bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
        parcel.writeInt(c());
        parcel.writeParcelable(b(), i);
    }
}
