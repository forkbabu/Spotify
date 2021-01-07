package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.profile.model.e;

/* renamed from: jt7  reason: default package */
final class jt7 extends et7 {
    public static final Parcelable.Creator<jt7> CREATOR = new a();

    /* renamed from: jt7$a */
    static class a implements Parcelable.Creator<jt7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public jt7 createFromParcel(Parcel parcel) {
            return new jt7(parcel.readString(), parcel.readString(), (e) parcel.readParcelable(mt7.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public jt7[] newArray(int i) {
            return new jt7[i];
        }
    }

    jt7(String str, String str2, e eVar) {
        super(str, str2, eVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeString(a());
        parcel.writeParcelable(b(), i);
    }
}
