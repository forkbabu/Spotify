package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.assistedcuration.model.e;
import java.util.List;

/* renamed from: h1a  reason: default package */
final class h1a extends c0a {
    public static final Parcelable.Creator<h1a> CREATOR = new a();

    /* renamed from: h1a$a */
    static class a implements Parcelable.Creator<h1a> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public h1a createFromParcel(Parcel parcel) {
            return new h1a(parcel.readString(), parcel.readArrayList(i1a.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public h1a[] newArray(int i) {
            return new h1a[i];
        }
    }

    h1a(String str, List<e> list) {
        super(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
        parcel.writeList(a());
    }
}
