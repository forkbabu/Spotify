package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import defpackage.szc;

/* access modifiers changed from: package-private */
/* renamed from: bzc  reason: default package */
public final class bzc extends tyc {
    public static final Parcelable.Creator<bzc> CREATOR = new a();
    private static final szc.a c = new szc.a();

    /* renamed from: bzc$a */
    static class a implements Parcelable.Creator<bzc> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public bzc createFromParcel(Parcel parcel) {
            return new bzc((m8e) parcel.readParcelable(szc.class.getClassLoader()), Optional.fromNullable(gf0.n(parcel, bzc.c.a())));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public bzc[] newArray(int i) {
            return new bzc[i];
        }
    }

    bzc(m8e m8e, Optional<l8e> optional) {
        super(m8e, optional);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        gf0.v(parcel, c().orNull(), 0);
    }
}
