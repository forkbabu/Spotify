package com.spotify.android.recaptcha;

import com.google.android.gms.tasks.e;

public final /* synthetic */ class a implements e {
    public final /* synthetic */ n a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.f(this.b, (com.google.android.gms.recaptcha.e) obj);
    }
}
