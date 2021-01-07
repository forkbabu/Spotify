package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h3d  reason: default package */
final class h3d extends e3d {
    public static final Parcelable.Creator<h3d> CREATOR = new a();

    /* renamed from: h3d$a */
    static class a implements Parcelable.Creator<h3d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public h3d createFromParcel(Parcel parcel) {
            return new h3d(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public h3d[] newArray(int i) {
            return new h3d[i];
        }
    }

    h3d(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(f());
        parcel.writeInt(e());
        parcel.writeInt(a());
        parcel.writeInt(c());
    }
}
