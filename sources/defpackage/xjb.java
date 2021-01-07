package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.viewuri.c;
import java.util.List;

/* renamed from: xjb  reason: default package */
final class xjb extends wjb {
    public static final Parcelable.Creator<xjb> CREATOR = new a();

    /* renamed from: xjb$a */
    static class a implements Parcelable.Creator<xjb> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public xjb createFromParcel(Parcel parcel) {
            return new xjb((c) parcel.readParcelable(yjb.class.getClassLoader()), parcel.readArrayList(yjb.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public xjb[] newArray(int i) {
            return new xjb[i];
        }
    }

    xjb(c cVar, List<String> list) {
        super(cVar, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), i);
        parcel.writeList(b());
    }
}
