package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class u2 extends a implements v2 {
    public u2() {
        super("com.google.android.gms.recaptcha.internal.ICloseCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        if (i != 1) {
            return false;
        }
        Status status = (Status) v.a(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z = true;
        }
        ((b) this).D3(status, z);
        return true;
    }
}
