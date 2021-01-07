package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import defpackage.n6;
import java.util.ArrayList;
import java.util.Collections;

/* access modifiers changed from: package-private */
/* renamed from: z6  reason: default package */
public final class z6 {
    private final Context a;
    private final c b;
    private final Handler c;
    private final PackageManager d;
    private final ArrayList<y6> e = new ArrayList<>();
    private boolean f;
    private final BroadcastReceiver g = new a();
    private final Runnable h = new b();

    /* renamed from: z6$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z6.this.a();
        }
    }

    /* renamed from: z6$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z6.this.a();
        }
    }

    /* renamed from: z6$c */
    public interface c {
    }

    public z6(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
        this.c = new Handler();
        this.d = context.getPackageManager();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f) {
            int i = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.e.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        } else if (this.e.get(i2).C(str, str2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 < 0) {
                        y6 y6Var = new y6(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        y6Var.L();
                        this.e.add(i, y6Var);
                        ((n6.d) this.b).a(y6Var);
                        i++;
                    } else if (i2 >= i) {
                        y6 y6Var2 = this.e.get(i2);
                        y6Var2.L();
                        y6Var2.J();
                        Collections.swap(this.e, i2, i);
                        i++;
                    }
                }
            }
            if (i < this.e.size()) {
                for (int size2 = this.e.size() - 1; size2 >= i; size2--) {
                    y6 y6Var3 = this.e.get(size2);
                    ((n6.d) this.b).p(y6Var3);
                    this.e.remove(y6Var3);
                    y6Var3.M();
                }
            }
        }
    }

    public void b() {
        if (!this.f) {
            this.f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.a.registerReceiver(this.g, intentFilter, null, this.c);
            this.c.post(this.h);
        }
    }
}
