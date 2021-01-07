package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.i7;
import java.util.List;
import java.util.Map;

final class a implements i7 {
    private final /* synthetic */ h a;

    a(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final String a() {
        return this.a.D();
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final String b() {
        return this.a.E();
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final String c() {
        return this.a.A();
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final void d(String str) {
        this.a.t(str);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final String e() {
        return this.a.w();
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final long f() {
        return this.a.C();
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final List<Bundle> g(String str, String str2) {
        return this.a.r(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final void h(String str, String str2, Bundle bundle) {
        this.a.u(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final void i(String str, String str2, Bundle bundle) {
        this.a.m(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final int j(String str) {
        return this.a.z(str);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final void k(String str) {
        this.a.x(str);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final Map<String, Object> l(String str, String str2, boolean z) {
        return this.a.f(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.i7
    public final void m(Bundle bundle) {
        this.a.h(bundle);
    }
}
