package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.e;

public abstract class w2 extends a implements x2 {
    public w2() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ((c) this).D3((Status) v.a(parcel, Status.CREATOR), (e) v.a(parcel, e.CREATOR));
        return true;
    }
}
