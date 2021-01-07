package com.spotify.android.recaptcha;

import com.google.android.gms.tasks.e;

public final /* synthetic */ class d implements e {
    public final /* synthetic */ n a;

    public /* synthetic */ d(n nVar) {
        this.a = nVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.b((Boolean) obj);
    }
}
