package com.spotify.android.recaptcha;

import com.google.android.gms.recaptcha.d;

public final /* synthetic */ class e implements com.google.android.gms.tasks.e {
    public final /* synthetic */ n a;

    public /* synthetic */ e(n nVar) {
        this.a = nVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.d((d) obj);
    }
}
