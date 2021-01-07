package com.google.firebase.crashlytics;

import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        d.b a = d.a(FirebaseCrashlytics.class);
        a.b(p.f(c.class));
        a.b(p.f(g.class));
        a.b(p.e(oy.class));
        a.b(p.e(sy.class));
        a.f(b.b(this));
        a.e();
        return Arrays.asList(a.d(), a20.a("fire-cls", "17.2.1"));
    }
}
