package com.spotify.music;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.a;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class i0 implements Runnable {
    private final WeakReference<ys2> a;
    private c b;
    private final WeakReference<androidx.fragment.app.c> c;
    private final String f;

    i0(androidx.fragment.app.c cVar, ys2 ys2, c cVar2) {
        this.c = new WeakReference<>(cVar);
        this.a = new WeakReference<>(ys2);
        this.b = cVar2;
        this.f = cVar.getClass().getSimpleName();
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ys2 ys2 = this.a.get();
        ys2.getClass();
        Fragment u = ys2.u();
        if (this.b != null && u != null && !u.f3()) {
            androidx.fragment.app.c cVar = this.c.get();
            MoreObjects.checkNotNull(cVar, "This runnable was posted to run, but its fragment activity(%s) has gone out of scope. Did you forget to remove the callback in onStop or onDestroy?", this.f);
            androidx.fragment.app.c cVar2 = cVar;
            Assertion.e(u);
            Bundle D2 = u.D2();
            c cVar3 = (D2 == null || !D2.containsKey("FlagsArgumentHelper.Flags")) ? null : (c) D2.getParcelable("FlagsArgumentHelper.Flags");
            c cVar4 = this.b;
            a aVar = g51.d;
            cVar4.getClass();
            if (cVar3 != null && !cVar3.O0(cVar4, aVar)) {
                c cVar5 = this.b;
                Bundle D22 = u.D2();
                if (D22 != null && D22.containsKey("FlagsArgumentHelper.Flags")) {
                    D22.putParcelable("FlagsArgumentHelper.Flags", cVar5);
                }
                o v0 = cVar2.v0();
                v0.Q();
                x i = v0.i();
                i.l(u);
                i.h(u);
                i.j();
            }
        }
    }
}
