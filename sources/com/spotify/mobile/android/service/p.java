package com.spotify.mobile.android.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.z0;

public final class p implements o {
    private final z0 a;
    private final String b;
    private final String c;

    public p(z0 z0Var, String str, String str2) {
        this.a = z0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // com.spotify.mobile.android.service.o
    public Intent a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, this.c);
        return intent;
    }

    @Override // com.spotify.mobile.android.service.o
    public PendingIntent b(Context context) {
        Intent intent = new Intent();
        context.getClass();
        intent.setClassName(context, this.c);
        return PendingIntent.getActivity(context, 0, intent, 0);
    }

    @Override // com.spotify.mobile.android.service.o
    public Intent c(Context context, String str) {
        Intent intent = new Intent(str);
        context.getClass();
        return intent.setClassName(context, this.b);
    }

    @Override // com.spotify.mobile.android.service.o
    public PendingIntent d(Context context) {
        z0 z0Var = this.a;
        context.getClass();
        z0.b b2 = z0Var.b(context, ViewUris.W1.toString());
        b2.c("Settings");
        return PendingIntent.getActivity(context, 0, b2.a(), 0);
    }
}
