package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.b;
import defpackage.n6;

public final class p extends n6.a {
    private static final b b = new b("MediaRouterCallback");
    private final n a;

    public p(n nVar) {
        if (nVar != null) {
            this.a = nVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // defpackage.n6.a
    public final void d(n6 n6Var, n6.f fVar) {
        try {
            this.a.T1(fVar.i(), fVar.g());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteAdded", n.class.getSimpleName());
        }
    }

    @Override // defpackage.n6.a
    public final void e(n6 n6Var, n6.f fVar) {
        try {
            this.a.I1(fVar.i(), fVar.g());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteChanged", n.class.getSimpleName());
        }
    }

    @Override // defpackage.n6.a
    public final void f(n6 n6Var, n6.f fVar) {
        try {
            this.a.z1(fVar.i(), fVar.g());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteRemoved", n.class.getSimpleName());
        }
    }

    @Override // defpackage.n6.a
    public final void g(n6 n6Var, n6.f fVar) {
        try {
            this.a.g1(fVar.i(), fVar.g());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteSelected", n.class.getSimpleName());
        }
    }

    @Override // defpackage.n6.a
    public final void i(n6 n6Var, n6.f fVar, int i) {
        try {
            this.a.N2(fVar.i(), fVar.g(), i);
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteUnselected", n.class.getSimpleName());
        }
    }
}
