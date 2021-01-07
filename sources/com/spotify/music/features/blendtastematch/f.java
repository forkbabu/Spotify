package com.spotify.music.features.blendtastematch;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.h;

public final class f implements fjf<String> {
    private final d a;
    private final wlf<Activity> b;

    public f(d dVar, wlf<Activity> wlf) {
        this.a = dVar;
        this.b = wlf;
    }

    public static String a(d dVar, Activity activity) {
        String stringExtra;
        dVar.getClass();
        h.e(activity, "activity");
        Intent intent = activity.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("key-invitation-token")) == null) ? "" : stringExtra;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a, this.b.get());
    }
}
