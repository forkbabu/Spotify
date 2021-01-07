package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

/* renamed from: tv  reason: default package */
public final class tv extends a {
    public static final Parcelable.Creator<tv> CREATOR = new uv();
    private final String a;
    private final List<iw> b;

    public tv(String str, List<iw> list) {
        this.a = str;
        this.b = list;
        if (str != null) {
            g.l(list);
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tv.class != obj.getClass()) {
            return false;
        }
        tv tvVar = (tv) obj;
        String str = this.a;
        if (str == null ? tvVar.a != null : !str.equals(tvVar.a)) {
            return false;
        }
        List<iw> list = this.b;
        List<iw> list2 = tvVar.b;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List<iw> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder U0 = je.U0(valueOf.length() + je.N0(str, 18), "CapabilityInfo{", str, ", ", valueOf);
        U0.append("}");
        return U0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.X(parcel, 3, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }
}
