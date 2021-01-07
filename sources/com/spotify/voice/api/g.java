package com.spotify.voice.api;

import android.content.Context;
import androidx.core.content.a;

public final /* synthetic */ class g implements sg0 {
    public final /* synthetic */ Context a;

    public /* synthetic */ g(Context context) {
        this.a = context;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        ng0 ng0 = (ng0) obj;
        return Boolean.valueOf(a.a(this.a, "android.permission.RECORD_AUDIO") == 0);
    }
}
