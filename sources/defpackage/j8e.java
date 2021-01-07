package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: j8e  reason: default package */
public final class j8e extends g8e {
    public static final Parcelable.Creator<j8e> CREATOR = new a();

    /* renamed from: j8e$a */
    static class a implements Parcelable.Creator<j8e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public j8e createFromParcel(Parcel parcel) {
            return new j8e((Uri) parcel.readParcelable(n8e.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public j8e[] newArray(int i) {
            return new j8e[i];
        }
    }

    j8e(Uri uri) {
        super(uri);
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
