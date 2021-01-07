package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;

public class LifecycleCallback {
    @RecentlyNonNull
    protected final j a;

    protected LifecycleCallback(@RecentlyNonNull j jVar) {
        this.a = jVar;
    }

    @RecentlyNonNull
    public static j c(@RecentlyNonNull Activity activity) {
        i iVar = new i(activity);
        if (iVar.c()) {
            return zzc.L4(iVar.b());
        }
        if (iVar.d()) {
            return n1.b(iVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a() {
    }

    @RecentlyNonNull
    public Activity b() {
        return this.a.H1();
    }

    public void d(int i, int i2, @RecentlyNonNull Intent intent) {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g(@RecentlyNonNull Bundle bundle) {
    }

    public void h() {
    }

    public void i() {
    }
}
