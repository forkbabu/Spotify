package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.profile.saveprofile.domain.r;

/* renamed from: jm7  reason: default package */
final class jm7 extends ll7 {
    public static final Parcelable.Creator<jm7> CREATOR = new a();

    /* renamed from: jm7$a */
    static class a implements Parcelable.Creator<jm7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public jm7 createFromParcel(Parcel parcel) {
            return new jm7(parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readInt() == 1, parcel.readInt(), parcel.readInt() == 1, (r) parcel.readParcelable(mm7.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public jm7[] newArray(int i) {
            return new jm7[i];
        }
    }

    jm7(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, boolean z5, int i, boolean z6, r rVar) {
        super(str, str2, z, z2, z3, z4, str3, str4, z5, i, z6, rVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(p());
        parcel.writeString(e());
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeInt(a() ? 1 : 0);
        parcel.writeInt(h() ? 1 : 0);
        if (i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(i());
        }
        parcel.writeString(j());
        parcel.writeInt(g() ? 1 : 0);
        parcel.writeInt(c());
        parcel.writeInt(n() ? 1 : 0);
        parcel.writeParcelable(m(), i);
    }
}
