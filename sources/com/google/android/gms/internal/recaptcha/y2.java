package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.d;

public abstract class y2 extends a implements z2 {
    public y2() {
        super("com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ((g3) this).D3((Status) v.a(parcel, Status.CREATOR), (d) v.a(parcel, d.CREATOR));
        return true;
    }
}
