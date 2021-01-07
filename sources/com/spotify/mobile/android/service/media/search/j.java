package com.spotify.mobile.android.service.media.search;

import android.os.Bundle;
import io.reactivex.a0;

public class j {
    private final n a;

    public j(n nVar) {
        this.a = nVar;
    }

    public /* synthetic */ void a(String str, String str2, int i, int i2, Bundle bundle, a0 a0Var) {
        a0Var.e(new d(this.a.b(str, str2, (long) i, (long) i2, bundle, new i(this, a0Var, str))));
    }
}
