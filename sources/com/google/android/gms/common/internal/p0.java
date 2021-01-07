package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.b;

public final class p0 extends RemoteCreator<d0> {
    private static final p0 c = new p0();

    private p0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i, int i2) {
        p0 p0Var = c;
        try {
            n0 n0Var = new n0(i, i2);
            return (View) b.E3(((d0) p0Var.b(context)).v1(b.F3(context), n0Var));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(je.h0(64, "Could not get button with size ", i, " and color ", i2), e);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ d0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof d0) {
            return (d0) queryLocalInterface;
        }
        return new c0(iBinder);
    }
}
