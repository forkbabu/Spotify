package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
/* renamed from: md8  reason: default package */
public final class md8 extends gd8 {
    public static final Parcelable.Creator<md8> CREATOR = new a();

    /* renamed from: md8$a */
    static class a implements Parcelable.Creator<md8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public md8 createFromParcel(Parcel parcel) {
            td8 td8 = (td8) parcel.readParcelable(wd8.class.getClassLoader());
            Optional optional = (Optional) parcel.readSerializable();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new md8(td8, optional, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public md8[] newArray(int i) {
            return new md8[i];
        }
    }

    md8(td8 td8, Optional<String> optional, boolean z) {
        super(td8, optional, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeSerializable(b());
        parcel.writeInt(c() ? 1 : 0);
    }
}
