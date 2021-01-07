package com.spotify.libs.nudges;

import android.content.Context;
import kotlin.jvm.internal.h;

public final class i implements l {
    private final Context a;

    public i(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // com.spotify.libs.nudges.l
    public k a(int i) {
        return new h(this.a, i);
    }
}
