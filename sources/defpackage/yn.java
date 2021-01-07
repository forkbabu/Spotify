package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yn  reason: default package */
public final class yn extends vn {
    public static final Parcelable.Creator<yn> CREATOR = new a();

    /* renamed from: yn$a */
    static class a implements Parcelable.Creator<yn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public yn createFromParcel(Parcel parcel) {
            return new yn();
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public yn[] newArray(int i) {
            return new yn[i];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
