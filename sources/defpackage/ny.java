package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ny  reason: default package */
public abstract class ny<StateT> {
    protected final a a;
    private final IntentFilter b;
    private final Context c;
    protected final Set<ly<StateT>> d = new HashSet();
    private my e = null;
    private volatile boolean f = false;

    protected ny(a aVar, IntentFilter intentFilter, Context context) {
        this.a = aVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    private final void e() {
        my myVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            my myVar2 = new my(this);
            this.e = myVar2;
            this.c.registerReceiver(myVar2, this.b);
        }
        if (!this.f && this.d.isEmpty() && (myVar = this.e) != null) {
            this.c.unregisterReceiver(myVar);
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateT statet) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((ly) it.next()).a(statet);
        }
    }

    public final synchronized void c(boolean z) {
        this.f = z;
        e();
    }

    public final synchronized boolean d() {
        return this.e != null;
    }
}
