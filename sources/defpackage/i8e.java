package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: i8e  reason: default package */
public final class i8e extends f8e {
    public static final Parcelable.Creator<i8e> CREATOR = new a();

    /* renamed from: i8e$a */
    static class a implements Parcelable.Creator<i8e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i8e createFromParcel(Parcel parcel) {
            return new i8e((Bitmap) parcel.readParcelable(l8e.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i8e[] newArray(int i) {
            return new i8e[i];
        }
    }

    i8e(Bitmap bitmap) {
        super(bitmap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), i);
    }
}
