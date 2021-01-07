package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new e();
    private final PendingIntent a;

    public b(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public PendingIntent I1() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return m.a(this.a, ((b) obj).a);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.a, i, false);
        SafeParcelReader.m(parcel, a2);
    }
}
