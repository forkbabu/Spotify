package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsNdkRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        d.b a = d.a(sy.class);
        a.b(p.f(Context.class));
        a.f(b.b(this));
        a.e();
        return Arrays.asList(a.d(), a20.a("fire-cls-ndk", "17.2.1"));
    }
}
