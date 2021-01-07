package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class CredentialPickerConfig extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new i();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int f;

    public static class a {
        private boolean a = true;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(2, false, this.a, false, 1);
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        int i3 = 3;
        if (i < 2) {
            this.f = !z3 ? 1 : i3;
        } else {
            this.f = i2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        boolean z = true;
        SafeParcelReader.C(parcel, 1, this.b);
        SafeParcelReader.C(parcel, 2, this.c);
        if (this.f != 3) {
            z = false;
        }
        SafeParcelReader.C(parcel, 3, z);
        SafeParcelReader.M(parcel, 4, this.f);
        SafeParcelReader.M(parcel, Constants.ONE_SECOND, this.a);
        SafeParcelReader.m(parcel, a2);
    }
}
