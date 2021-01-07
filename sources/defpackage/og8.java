package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e61;

/* renamed from: og8  reason: default package */
final class og8 extends jg8 {
    public static final Parcelable.Creator<og8> CREATOR = new a();

    /* renamed from: og8$a */
    static class a implements Parcelable.Creator<og8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public og8 createFromParcel(Parcel parcel) {
            return new og8((e61.a) parcel.readParcelable(pg8.class.getClassLoader()), parcel.readParcelable(pg8.class.getClassLoader()), (gh8) parcel.readParcelable(pg8.class.getClassLoader()), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public og8[] newArray(int i) {
            return new og8[i];
        }
    }

    og8(e61.a aVar, Parcelable parcelable, gh8 gh8, int i) {
        super(aVar, parcelable, gh8, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(b(), i);
        parcel.writeParcelable(e(), i);
        parcel.writeParcelable(a(), i);
        parcel.writeInt(c());
    }
}
