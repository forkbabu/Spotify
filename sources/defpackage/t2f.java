package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: t2f  reason: default package */
public final class t2f extends s2f {
    public static final Parcelable.Creator<t2f> CREATOR = new a();

    /* renamed from: t2f$a */
    static class a implements Parcelable.Creator<t2f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public t2f createFromParcel(Parcel parcel) {
            return new t2f(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public t2f[] newArray(int i) {
            return new t2f[i];
        }
    }

    t2f(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(g());
        parcel.writeString(c());
        parcel.writeString(e());
    }
}
