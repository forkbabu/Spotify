package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.data.DataHolder;

public class d extends com.google.android.gms.common.data.d<Object> implements i {
    private final Status f;

    public d(DataHolder dataHolder) {
        super(dataHolder);
        this.f = new Status(dataHolder.o2(), (String) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.d
    public /* synthetic */ Object I(int i, int i2) {
        return new bw(this.a, i, i2);
    }

    @Override // com.google.android.gms.common.api.i
    public Status h() {
        return this.f;
    }
}
