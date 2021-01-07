package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: xn0  reason: default package */
public final class xn0 extends wn0 {
    public static final Parcelable.Creator<xn0> CREATOR = new a();

    /* renamed from: xn0$a */
    static class a implements Parcelable.Creator<xn0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public xn0 createFromParcel(Parcel parcel) {
            return new xn0((ifd) parcel.readParcelable(yn0.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public xn0[] newArray(int i) {
            return new xn0[i];
        }
    }

    xn0(ifd ifd) {
        super(ifd);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(b(), i);
    }
}
