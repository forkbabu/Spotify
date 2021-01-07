package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.slate.model.BackgroundColor;
import com.spotify.music.slate.model.q;
import com.spotify.music.slate.model.u;
import defpackage.k3d;

/* renamed from: f3d  reason: default package */
final class f3d extends c3d {
    public static final Parcelable.Creator<f3d> CREATOR = new a();

    /* renamed from: f3d$a */
    static class a implements Parcelable.Creator<f3d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f3d createFromParcel(Parcel parcel) {
            return new f3d((u) parcel.readParcelable(k3d.class.getClassLoader()), (u) parcel.readParcelable(k3d.class.getClassLoader()), (q) parcel.readParcelable(k3d.class.getClassLoader()), (u) parcel.readParcelable(k3d.class.getClassLoader()), (BackgroundColor) parcel.readParcelable(k3d.class.getClassLoader()), (k3d.b) parcel.readParcelable(k3d.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f3d[] newArray(int i) {
            return new f3d[i];
        }
    }

    f3d(u uVar, u uVar2, q qVar, u uVar3, BackgroundColor backgroundColor, k3d.b bVar) {
        super(uVar, uVar2, qVar, uVar3, backgroundColor, bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(h(), i);
        parcel.writeParcelable(g(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(f(), i);
        parcel.writeParcelable(a(), i);
        parcel.writeParcelable(e(), i);
    }
}
