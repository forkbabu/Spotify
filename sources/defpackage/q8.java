package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import defpackage.p8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: q8  reason: default package */
public final class q8 implements t8 {
    private static volatile q8 d;
    private static final Object e = new Object();
    private p8 a;
    private final List<b> b = new CopyOnWriteArrayList();
    private final HashMap<IBinder, u8> c = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: q8$b */
    public static class b {
        final Executor a;
        final s3<l8> b;

        b(Executor executor, s3<l8> s3Var) {
            this.a = executor;
            this.b = s3Var;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q8$c */
    public class c implements p8.a {
        c(q8 q8Var, a aVar) {
        }
    }

    private q8() {
        new CopyOnWriteArrayList();
    }

    public static q8 b(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new q8();
                    q8 q8Var = d;
                    Context applicationContext = context.getApplicationContext();
                    q8Var.getClass();
                    p8 a2 = o8.a(applicationContext);
                    q8Var.a = a2;
                    if (a2 != null) {
                        a2.b(new c(q8Var, null));
                    }
                }
            }
        }
        return d;
    }

    public l8 a() {
        l8 a2;
        synchronized (e) {
            p8 p8Var = this.a;
            a2 = p8Var != null ? p8Var.a() : new l8(0);
        }
        return a2;
    }

    public u8 c(Context context) {
        u8 c2;
        Activity a2 = v8.a(context);
        if (a2 != null) {
            IBinder iBinder = a2.getWindow().getAttributes().token;
            if (iBinder != null) {
                synchronized (e) {
                    p8 p8Var = this.a;
                    c2 = p8Var != null ? p8Var.c(iBinder) : new u8(new ArrayList());
                    this.c.put(iBinder, c2);
                }
                return c2;
            }
            throw new IllegalStateException("Activity does not have a window attached.");
        }
        throw new IllegalArgumentException("Used non-visual Context with WindowManager. Please use an Activity or a ContextWrapper around an Activity instead.");
    }

    public void d(Executor executor, s3<l8> s3Var) {
        synchronized (e) {
            if (this.a != null) {
                if (this.b.isEmpty()) {
                    this.a.d(false);
                }
                this.b.add(new b(executor, s3Var));
            }
        }
    }

    public void e(s3<l8> s3Var) {
        synchronized (e) {
            if (this.a != null) {
                for (b bVar : this.b) {
                    if (bVar.b.equals(s3Var)) {
                        this.b.remove(bVar);
                        if (this.b.isEmpty()) {
                            this.a.d(true);
                        }
                        return;
                    }
                }
            }
        }
    }
}
