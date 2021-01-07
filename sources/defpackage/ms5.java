package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: ms5  reason: default package */
public final class ms5 extends ks5 {
    public static final Parcelable.Creator<ms5> CREATOR = new a();

    /* renamed from: ms5$a */
    static class a implements Parcelable.Creator<ms5> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ms5 createFromParcel(Parcel parcel) {
            return new ms5(parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ms5[] newArray(int i) {
            return new ms5[i];
        }
    }

    ms5(String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
    }
}
