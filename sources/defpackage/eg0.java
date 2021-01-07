package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eg0  reason: default package */
public abstract class eg0<T> {
    private final ServiceConnection a;
    private final wlf<Intent> b;
    private final Set<hg0<T>> c;
    private T d;
    private boolean e;
    private final b<T> f;
    private final String g;
    private final fg0 h;

    /* renamed from: eg0$a */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!eg0.this.e) {
                eg0.this.h.c(this, eg0.this.g);
                eg0.this.getClass();
                return;
            }
            eg0 eg0 = eg0.this;
            eg0.d = eg0.f.a(iBinder);
            if (eg0.this.d != null) {
                eg0.this.e = false;
                eg0.this.n();
                return;
            }
            throw new IllegalStateException("The service was bound to, but returned a null interface. ComponentName " + componentName + ", InterfaceResolver " + eg0.this.f.getClass().getName());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            eg0.this.d = null;
            if (eg0.this.e) {
                eg0.this.e = false;
            }
            eg0.h(eg0.this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: eg0$b */
    public interface b<T> {
        T a(IBinder iBinder);
    }

    /* renamed from: eg0$c */
    private static class c<T> implements b<T> {
        c(a aVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.os.IBinder */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.eg0.b
        public T a(IBinder iBinder) {
            return iBinder;
        }
    }

    protected eg0(Context context, Class<? extends Service> cls, b<T> bVar, String str, fg0 fg0) {
        cg0 cg0 = new cg0(context, cls);
        this.a = new a();
        this.c = Collections.synchronizedSet(new HashSet());
        this.b = cg0;
        this.f = bVar;
        this.g = str;
        this.h = fg0;
    }

    static void h(eg0 eg0) {
        synchronized (eg0.c) {
            for (hg0<T> hg0 : eg0.c) {
                hg0.onDisconnected();
            }
        }
    }

    public void i() {
        z42.a("Not called on main looper");
        if (this.d == null && !this.e) {
            this.e = true;
            this.h.a(this.b.get(), this.a, this.g);
        }
    }

    public void j() {
        z42.a("Not called on main looper");
        if (this.e) {
            this.e = false;
        }
        if (this.d != null) {
            this.d = null;
            this.h.c(this.a, this.g);
        }
    }

    public T k() {
        T t = this.d;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Service is not connected. Did you forget to connect, or forgot that you called disconnect?");
    }

    public boolean l() {
        return this.d != null && !this.e;
    }

    public boolean m() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void n() {
        o();
        synchronized (this.c) {
            for (hg0<T> hg0 : this.c) {
                hg0.l(k());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    public void p(hg0<T> hg0) {
        this.c.add(hg0);
    }

    public void q(hg0<T> hg0) {
        this.c.remove(hg0);
    }

    protected eg0(Context context, Class<? extends Service> cls, String str, fg0 fg0) {
        this(context, cls, new c(null), str, fg0);
    }
}
