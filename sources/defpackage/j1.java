package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.n;

/* renamed from: j1  reason: default package */
public abstract class j1 implements ServiceConnection {
    private Context a;

    /* renamed from: j1$a */
    class a extends g1 {
        a(j1 j1Var, n nVar, ComponentName componentName, Context context) {
            super(nVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, g1 g1Var);

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a != null) {
            a(componentName, new a(this, n.a.C3(iBinder), componentName, this.a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
