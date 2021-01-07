package com.spotify.music.features.blendtastematch;

import android.app.Activity;
import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.ubi.specification.factories.a0;
import kotlin.jvm.internal.h;

public final class g implements fjf<a0> {
    private final d a;
    private final wlf<Activity> b;

    public g(d dVar, wlf<Activity> wlf) {
        this.a = dVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a;
        Activity activity = this.b.get();
        dVar.getClass();
        h.e(activity, "activity");
        String pageIdentifiers = PageIdentifiers.BLEND_TASTE_MATCH.toString();
        Intent intent = activity.getIntent();
        h.d(intent, "activity.intent");
        return new a0(pageIdentifiers, intent.getDataString());
    }
}
