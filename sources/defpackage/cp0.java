package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.inappmessaging.FormatType;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: cp0  reason: default package */
public final class cp0 extends zo0 {
    public static final Parcelable.Creator<cp0> CREATOR = new a();

    /* renamed from: cp0$a */
    static class a implements Parcelable.Creator<cp0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public cp0 createFromParcel(Parcel parcel) {
            return new cp0(parcel.readString(), parcel.readHashMap(fp0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (FormatType) Enum.valueOf(FormatType.class, parcel.readString()) : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public cp0[] newArray(int i) {
            return new cp0[i];
        }
    }

    cp0(String str, Map<String, ep0> map, String str2, String str3, String str4, FormatType formatType) {
        super(str, map, str2, str3, str4, formatType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeMap(b());
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
        if (h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(h());
        }
        if (c() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(c().name());
    }
}
