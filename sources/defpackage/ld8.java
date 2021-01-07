package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: ld8  reason: default package */
public final class ld8 extends fd8 {
    public static final Parcelable.Creator<ld8> CREATOR = new a();

    /* renamed from: ld8$a */
    static class a implements Parcelable.Creator<ld8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ld8 createFromParcel(Parcel parcel) {
            return new ld8((td8) parcel.readParcelable(ud8.class.getClassLoader()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ld8[] newArray(int i) {
            return new ld8[i];
        }
    }

    ld8(td8 td8, String str) {
        super(td8, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeString(b());
    }
}
