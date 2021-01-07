package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.util.Assertion;
import defpackage.wie;

/* access modifiers changed from: package-private */
/* renamed from: vie  reason: default package */
public final class vie extends tie {
    public static final Parcelable.Creator<vie> CREATOR = new a();
    private static final ome n = new ome();

    /* renamed from: vie$a */
    static class a implements Parcelable.Creator<vie> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public vie createFromParcel(Parcel parcel) {
            wie wie;
            ome unused = vie.n;
            String readString = parcel.readString();
            readString.getClass();
            if (readString.equals(wie.c.class.getCanonicalName())) {
                wie = wie.e();
            } else if (readString.equals(wie.b.class.getCanonicalName())) {
                wie = wie.b();
            } else if (readString.equals(wie.a.class.getCanonicalName())) {
                wie = wie.a();
            } else if (readString.equals(wie.d.class.getCanonicalName())) {
                wie = wie.f();
            } else {
                Assertion.v("Unknown state: " + readString);
                wie = wie.e();
            }
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new vie(wie, z2, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public vie[] newArray(int i) {
            return new vie[i];
        }
    }

    vie(wie wie, boolean z, boolean z2) {
        super(wie, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        b().d(new yle(parcel), new xle(parcel), new vle(parcel), new wle(parcel));
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(a() ? 1 : 0);
    }
}
