package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.d;
import com.google.android.gms.tasks.h;

final class g3 extends y2 {
    private final /* synthetic */ h a;

    g3(h hVar) {
        this.a = hVar;
    }

    public final void D3(Status status, d dVar) {
        f.g(status, dVar, this.a);
    }
}
