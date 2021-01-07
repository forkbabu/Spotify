package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: zue  reason: default package */
public final class zue extends xue {
    public static final Parcelable.Creator<zue> CREATOR = new a();

    /* renamed from: zue$a */
    static class a implements Parcelable.Creator<zue> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public zue createFromParcel(Parcel parcel) {
            return new zue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public zue[] newArray(int i) {
            return new zue[i];
        }
    }

    zue(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(h());
        parcel.writeString(e());
        parcel.writeString(f());
        parcel.writeString(a());
    }
}
