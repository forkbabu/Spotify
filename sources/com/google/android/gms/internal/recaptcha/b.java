package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.h;

final class b extends u2 {
    private final /* synthetic */ h a;

    b(h hVar) {
        this.a = hVar;
    }

    public final void D3(Status status, boolean z) {
        f.g(status, Boolean.valueOf(z), this.a);
    }
}
