package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.functions.g;

public final /* synthetic */ class l0 implements g {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ l0(Uri uri, Bundle bundle) {
        this.a = uri;
        this.b = bundle;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((a2) obj).i(this.a, this.b);
    }
}
