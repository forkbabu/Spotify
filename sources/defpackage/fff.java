package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: fff  reason: default package */
public final class fff extends uef {
    public static final Parcelable.Creator<fff> CREATOR = new a();

    /* renamed from: fff$a */
    static class a implements Parcelable.Creator<fff> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public fff createFromParcel(Parcel parcel) {
            return new fff(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public fff[] newArray(int i) {
            return new fff[i];
        }
    }

    fff(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        super(z, z2, z3, z4, z5, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h() ? 1 : 0);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(g() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeString(a());
    }
}
