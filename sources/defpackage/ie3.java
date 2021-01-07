package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e61;

/* renamed from: ie3  reason: default package */
class ie3 extends e61.a {
    public static final Parcelable.Creator<ie3> CREATOR = new a();
    public final Parcelable c;
    public final boolean f;

    /* renamed from: ie3$a */
    static class a implements Parcelable.Creator<ie3> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ie3 createFromParcel(Parcel parcel) {
            e61.a createFromParcel = e61.a.CREATOR.createFromParcel(parcel);
            return new ie3(createFromParcel.a, createFromParcel.b, parcel.readParcelable(ie3.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ie3[] newArray(int i) {
            return new ie3[i];
        }
    }

    ie3(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.f = z;
    }

    @Override // defpackage.e61.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
