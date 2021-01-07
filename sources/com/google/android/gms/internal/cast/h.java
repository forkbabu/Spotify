package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.c0;
import com.google.android.gms.cast.framework.g0;
import com.google.android.gms.cast.framework.j0;
import com.google.android.gms.cast.framework.m;
import com.google.android.gms.cast.framework.media.internal.e;
import com.google.android.gms.cast.framework.media.internal.i;
import com.google.android.gms.cast.framework.x;
import com.google.android.gms.cast.framework.z;
import com.google.android.gms.cast.framework.zzad;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

public final class h {
    private static final b a = new b("CastDynamiteModule");

    /* JADX WARN: Incorrect args count in method signature: (Landroid/content/Context;Landroid/os/AsyncTask<Landroid/net/Uri;Ljava/lang/Long;Landroid/graphics/Bitmap;>;Lcom/google/android/gms/cast/framework/media/internal/i;IIZJIII)Lcom/google/android/gms/cast/framework/media/internal/e; */
    public static e a(Context context, AsyncTask asyncTask, i iVar, int i, int i2, boolean z) {
        try {
            return f(context.getApplicationContext()).z3(com.google.android.gms.dynamic.b.F3(asyncTask), iVar, i, i2, z, 2097152, 5, 333, 10000);
        } catch (RemoteException | zzad e) {
            a.b(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static z b(Context context, com.google.android.gms.cast.framework.b bVar, l lVar, Map<String, IBinder> map) {
        try {
            return f(context).s2(com.google.android.gms.dynamic.b.F3(context.getApplicationContext()), bVar, lVar, map);
        } catch (RemoteException e) {
            a.b(e, "Unable to call %s on %s.", "newCastContextImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static c0 c(Context context, com.google.android.gms.cast.framework.b bVar, a aVar, x xVar) {
        try {
            return f(context).v0(bVar, aVar, xVar);
        } catch (RemoteException | zzad e) {
            a.b(e, "Unable to call %s on %s.", "newCastSessionImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static g0 d(Service service, a aVar, a aVar2) {
        try {
            return f(service.getApplicationContext()).V0(com.google.android.gms.dynamic.b.F3(service), aVar, aVar2);
        } catch (RemoteException | zzad e) {
            a.b(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static j0 e(Context context, String str, String str2, m mVar) {
        try {
            return f(context).j0(str, str2, mVar);
        } catch (RemoteException | zzad e) {
            a.b(e, "Unable to call %s on %s.", "newSessionImpl", j.class.getSimpleName());
            return null;
        }
    }

    private static j f(Context context) {
        try {
            IBinder b = DynamiteModule.c(context, DynamiteModule.j, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof j) {
                return (j) queryLocalInterface;
            }
            return new i(b);
        } catch (DynamiteModule.LoadingException e) {
            throw new zzad(e);
        }
    }
}
