package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements j {
    private static WeakHashMap<c, WeakReference<zzc>> j0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> g0 = Collections.synchronizedMap(new m1());
    private int h0 = 0;
    private Bundle i0;

    public static zzc L4(c cVar) {
        zzc zzc;
        WeakReference<zzc> weakReference = j0.get(cVar);
        if (weakReference != null && (zzc = weakReference.get()) != null) {
            return zzc;
        }
        try {
            zzc zzc2 = (zzc) cVar.v0().U("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.i3()) {
                zzc2 = new zzc();
                x i = cVar.v0().i();
                i.d(zzc2, "SupportLifecycleFragmentImpl");
                i.j();
            }
            j0.put(cVar, new WeakReference<>(zzc2));
            return zzc2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void F(String str, LifecycleCallback lifecycleCallback) {
        if (!this.g0.containsKey(str)) {
            this.g0.put(str, lifecycleCallback);
            if (this.h0 > 0) {
                new yt(Looper.getMainLooper()).post(new o1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(je.j0(str.length() + 59, "LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final /* synthetic */ Activity H1() {
        return B2();
    }

    @Override // androidx.fragment.app.Fragment
    public final void M3() {
        super.M3();
        this.h0 = 3;
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void N3(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.g0.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().g(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O3() {
        super.O3();
        this.h0 = 2;
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void P3() {
        super.P3();
        this.h0 = 4;
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T a0(String str, Class<T> cls) {
        return cls.cast(this.g0.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void n3(int i, int i2, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.d(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void s3(Bundle bundle) {
        super.s3(bundle);
        this.h0 = 1;
        this.i0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.g0.entrySet()) {
            entry.getValue().e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void x3() {
        super.x3();
        this.h0 = 5;
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z2(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.z2(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.g0.values()) {
            lifecycleCallback.a();
        }
    }
}
