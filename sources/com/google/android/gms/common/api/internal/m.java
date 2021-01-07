package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import java.util.Collections;
import java.util.Set;

public final class m implements ServiceConnection, a.f {
    @Override // com.google.android.gms.common.api.a.f
    public final void a(@RecentlyNonNull String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @RecentlyNonNull
    public final String b() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void c(@RecentlyNonNull b.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void d() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean h() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> i() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void j(i iVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void k(@RecentlyNonNull b.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    @RecentlyNonNull
    public final c[] m() {
        return new c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    @RecentlyNullable
    public final String n() {
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean s() {
        Thread.currentThread();
        throw null;
    }
}
