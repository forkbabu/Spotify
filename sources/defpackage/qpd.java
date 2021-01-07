package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.util.SortOption;
import java.util.Arrays;

/* renamed from: qpd  reason: default package */
public class qpd implements Parcelable {
    public static final Parcelable.Creator<qpd> CREATOR = new a();
    public static final qpd b = new qpd(null);
    private final SortOption a;

    /* renamed from: qpd$a */
    static class a implements Parcelable.Creator<qpd> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public qpd createFromParcel(Parcel parcel) {
            return new qpd((SortOption) gf0.n(parcel, SortOption.CREATOR), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public qpd[] newArray(int i) {
            return new qpd[i];
        }
    }

    private qpd(SortOption sortOption) {
        this.a = sortOption;
    }

    public static qpd b(SortOption sortOption) {
        return new qpd(sortOption);
    }

    public SortOption a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpd)) {
            return false;
        }
        SortOption sortOption = this.a;
        SortOption sortOption2 = ((qpd) obj).a;
        if (rw.equal(sortOption, sortOption2) && sortOption.g() == sortOption2.g() && sortOption.f() == sortOption2.f()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        SortOption sortOption = this.a;
        if (sortOption != null) {
            return Arrays.hashCode(new Object[]{sortOption, Boolean.valueOf(sortOption.g()), Boolean.valueOf(this.a.f())});
        }
        return super.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.v(parcel, this.a, i);
    }

    qpd(SortOption sortOption, a aVar) {
        this.a = sortOption;
    }
}
