package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

/* renamed from: hv  reason: default package */
public final class hv extends a implements i {
    public static final Parcelable.Creator<hv> CREATOR = new gv();
    private final List<String> a;
    private final String b;

    public hv(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.i
    public final Status h() {
        if (this.b != null) {
            return Status.o;
        }
        return Status.s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.V(parcel, 1, this.a, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }
}
