package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: g1  reason: default package */
public class g1 {
    private final n a;
    private final ComponentName b;

    /* access modifiers changed from: package-private */
    /* renamed from: g1$a */
    public static class a extends j1 {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // defpackage.j1
        public final void a(ComponentName componentName, g1 g1Var) {
            g1Var.d(0);
            this.b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    g1(n nVar, ComponentName componentName, Context context) {
        this.a = nVar;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, j1 j1Var) {
        j1Var.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, j1Var, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public k1 c(f1 f1Var) {
        h1 h1Var = new h1(this, f1Var);
        try {
            if (!this.a.W2(h1Var)) {
                return null;
            }
            return new k1(this.a, h1Var, this.b, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean d(long j) {
        try {
            return this.a.D2(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
