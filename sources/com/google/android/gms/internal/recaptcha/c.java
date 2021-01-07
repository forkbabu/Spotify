package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.e;
import com.google.android.gms.tasks.h;

final class c extends w2 {
    private final /* synthetic */ h a;

    c(h hVar) {
        this.a = hVar;
    }

    public final void D3(Status status, e eVar) {
        f.g(status, eVar, this.a);
    }
}
