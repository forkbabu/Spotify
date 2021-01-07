package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: zu  reason: default package */
public final class zu extends a implements i {
    public static final Parcelable.Creator<zu> CREATOR = new bv();
    private final int a;
    private int b;
    private Intent c;

    public zu() {
        this.a = 2;
        this.b = 0;
        this.c = null;
    }

    @Override // com.google.android.gms.common.api.i
    public final Status h() {
        if (this.b == 0) {
            return Status.o;
        }
        return Status.s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    zu(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }
}
