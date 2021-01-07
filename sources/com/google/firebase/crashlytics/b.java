package com.google.firebase.crashlytics;

import com.google.firebase.c;
import com.google.firebase.components.e;
import com.google.firebase.components.g;

final /* synthetic */ class b implements g {
    private final CrashlyticsRegistrar a;

    private b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    public static g b(CrashlyticsRegistrar crashlyticsRegistrar) {
        return new b(crashlyticsRegistrar);
    }

    @Override // com.google.firebase.components.g
    public Object a(e eVar) {
        this.a.getClass();
        return FirebaseCrashlytics.a((c) eVar.get(c.class), (com.google.firebase.installations.g) eVar.get(com.google.firebase.installations.g.class), (sy) eVar.get(sy.class), (oy) eVar.get(oy.class));
    }
}
