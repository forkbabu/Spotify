package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: iv7  reason: default package */
public final class iv7 extends cv7 {
    public static final Parcelable.Creator<iv7> CREATOR = new a();

    /* renamed from: iv7$a */
    static class a implements Parcelable.Creator<iv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public iv7 createFromParcel(Parcel parcel) {
            return new iv7(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public iv7[] newArray(int i) {
            return new iv7[i];
        }
    }

    iv7(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
        parcel.writeString(c());
        parcel.writeString(a());
        parcel.writeString(b());
    }
}
