package com.waze.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.waze.sdk.a;
import com.waze.sdk.g;
import java.lang.ref.WeakReference;

public class c extends g {
    private static WeakReference<c> n;

    /* access modifiers changed from: package-private */
    public class a implements ServiceConnection {
        final /* synthetic */ AbstractC0586c a;
        final /* synthetic */ Context b;

        a(AbstractC0586c cVar, Context context) {
            this.a = cVar;
            this.b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean z = false;
            try {
                z = a.AbstractBinderC0584a.C3(iBinder).C2();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                this.a.a(false);
                this.b.unbindService(this);
                throw th;
            }
            this.a.a(z);
            this.b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public interface b extends g.c {
    }

    @FunctionalInterface
    /* renamed from: com.waze.sdk.c$c  reason: collision with other inner class name */
    public interface AbstractC0586c {
        void a(boolean z);
    }

    private c(Context context, d dVar, h hVar) {
        super(context, dVar, hVar);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x005e: APUT  (r6v2 java.lang.Object[]), (0 ??[int, short, byte, char]), (r4v3 java.lang.String) */
    public static c t(Context context, d dVar, h hVar) {
        int i;
        String str;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        if (i == 0) {
            throw new IllegalStateException("Waze not installed.");
        } else if (i >= 1021549) {
            WeakReference<c> weakReference = n;
            if (!(weakReference == null || weakReference.get() == null || !super.g())) {
                n.get().f(5);
            }
            WeakReference<c> weakReference2 = new WeakReference<>(new c(context, dVar, hVar));
            n = weakReference2;
            return weakReference2.get();
        } else {
            Object[] objArr = new Object[2];
            try {
                str = context.getPackageManager().getPackageInfo("com.waze", 0).versionName;
            } catch (PackageManager.NameNotFoundException unused2) {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = "1.0.0.9";
            throw new IllegalStateException(String.format("Waze version %s does not support Audio SDK version %s.", objArr));
        }
    }

    public static void u(Context context, AbstractC0586c cVar) {
        int i;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        if (!(i >= 1021549)) {
            cVar.a(false);
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(g.l);
        context.bindService(intent, new a(cVar, context), 1);
    }

    public void s() {
        f(5);
    }

    public void v(b bVar) {
        q(bVar);
    }
}
