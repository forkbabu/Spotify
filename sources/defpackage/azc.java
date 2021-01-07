package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.w;
import defpackage.pzc;

/* renamed from: azc  reason: default package */
final class azc extends syc {
    public static final Parcelable.Creator<azc> CREATOR = new a();
    private static final pzc.b r = new pzc.b();
    private static final pzc.c s = new pzc.c();
    private static final pzc.f t = new pzc.f();
    private static final pzc.d u = new pzc.d();

    /* renamed from: azc$a */
    static class a implements Parcelable.Creator<azc> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public azc createFromParcel(Parcel parcel) {
            return new azc((Uri) parcel.readParcelable(pzc.class.getClassLoader()), parcel.readString(), parcel.readString(), (r) parcel.readParcelable(pzc.class.getClassLoader()), Optional.fromNullable(gf0.n(parcel, azc.r.a())), Optional.fromNullable(gf0.n(parcel, azc.s.a())), Optional.fromNullable(gf0.n(parcel, azc.t.a())), Optional.fromNullable(gf0.n(parcel, azc.u.a())));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public azc[] newArray(int i) {
            return new azc[i];
        }
    }

    azc(Uri uri, String str, String str2, r rVar, Optional<o> optional, Optional<q> optional2, Optional<w> optional3, Optional<s> optional4) {
        super(uri, str, str2, rVar, optional, optional2, optional3, optional4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(f(), i);
        parcel.writeString(h());
        parcel.writeString(g());
        parcel.writeParcelable(k(), i);
        gf0.v(parcel, i().orNull(), 0);
        gf0.v(parcel, j().orNull(), 0);
        gf0.v(parcel, m().orNull(), 0);
        gf0.v(parcel, l().orNull(), 0);
    }
}
