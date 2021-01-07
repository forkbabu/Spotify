package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.td3;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: sd3  reason: default package */
public final class sd3 extends rd3 {
    public static final Parcelable.Creator<sd3> CREATOR = new a();

    /* renamed from: sd3$a */
    static class a implements Parcelable.Creator<sd3> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public sd3 createFromParcel(Parcel parcel) {
            Boolean bool;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return new sd3(readString, readString2, readString3, z2, z3, z4, bool, parcel.readString(), parcel.readString(), parcel.readArrayList(td3.a.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public sd3[] newArray(int i) {
            return new sd3[i];
        }
    }

    sd3(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, List<String> list, String str6, String str7) {
        super(str, str2, str3, z, z2, z3, bool, str4, str5, list, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        parcel.writeString(getName());
        parcel.writeString(getPreviewId());
        parcel.writeInt(isExplicit() ? 1 : 0);
        parcel.writeInt(N1() ? 1 : 0);
        parcel.writeInt(m1() ? 1 : 0);
        if (k0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(k0().booleanValue() ? 1 : 0);
        }
        parcel.writeString(b());
        parcel.writeString(c());
        parcel.writeList(x1());
        parcel.writeString(getImageUri());
        if (i2() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(i2());
    }
}
