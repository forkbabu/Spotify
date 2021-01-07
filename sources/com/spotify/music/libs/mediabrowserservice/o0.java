package com.spotify.music.libs.mediabrowserservice;

import android.os.Bundle;
import io.reactivex.functions.g;

public final /* synthetic */ class o0 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ o0(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((a2) obj).c(this.a, this.b);
    }
}
