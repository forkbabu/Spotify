package com.spotify.music.promodisclosure.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.h;

public final class c implements vxc {
    private final Context a;

    public c(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.vxc
    public void a() {
        Context context = this.a;
        h.e(context, "context");
        context.startActivity(new Intent(context, PromoDisclosureActivity.class));
    }
}
