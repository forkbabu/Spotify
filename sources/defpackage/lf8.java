package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: lf8  reason: default package */
public final class lf8 extends xe8 {
    public static final Parcelable.Creator<lf8> CREATOR = new a();

    /* renamed from: lf8$a */
    static class a implements Parcelable.Creator<lf8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public lf8 createFromParcel(Parcel parcel) {
            dfa dfa = (dfa) parcel.readParcelable(uf8.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new lf8(dfa, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public lf8[] newArray(int i) {
            return new lf8[i];
        }
    }

    lf8(dfa dfa, boolean z) {
        super(dfa, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeInt(b() ? 1 : 0);
    }
}
