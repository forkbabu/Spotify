package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fg0  reason: default package */
public class fg0 {
    private final Context a;
    private final boolean b;
    private final a c = new a();
    private final AtomicInteger d = new AtomicInteger();

    /* access modifiers changed from: protected */
    /* renamed from: fg0$a */
    public static class a {
        private final Map<String, Integer> a = new ConcurrentHashMap();

        public synchronized int a(String str, int i) {
            Integer valueOf;
            Integer num = 0;
            if (this.a.containsKey(str)) {
                num = this.a.remove(str);
            }
            valueOf = Integer.valueOf(num.intValue() + i);
            if (valueOf.intValue() > 0) {
                this.a.put(str, valueOf);
            }
            return valueOf.intValue();
        }

        public String toString() {
            StringBuilder T0 = je.T0(512, "{ ");
            for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    T0.append(entry.getKey());
                    T0.append('=');
                    T0.append(entry.getValue());
                    T0.append(' ');
                }
            }
            T0.append('}');
            return T0.toString();
        }
    }

    public fg0(Context context, boolean z) {
        context.getClass();
        MoreObjects.checkArgument(context instanceof Application, "Not an application context.");
        this.a = context;
        this.b = z;
    }

    private static String b(ServiceConnection serviceConnection, String str) {
        String simpleName = serviceConnection.getClass().getSimpleName();
        return str + ':' + simpleName + ':' + serviceConnection.hashCode();
    }

    public void a(Intent intent, ServiceConnection serviceConnection, String str) {
        if (this.a.bindService(intent, serviceConnection, 65)) {
            int a2 = this.c.a(b(serviceConnection, str), 1);
            int incrementAndGet = this.d.incrementAndGet();
            if (this.b) {
                Logger.g("[%s] Bind | # of active connections %d, # of all connections %d", b(serviceConnection, str), Integer.valueOf(a2), Integer.valueOf(incrementAndGet));
                return;
            }
            return;
        }
        try {
            ServiceInfo[] serviceInfoArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 4).services;
            Joiner on = Joiner.on(", ");
            Iterator<?> it = FluentIterable.from(Arrays.asList(serviceInfoArr)).transform(dg0.a).iterator();
            StringBuilder sb = new StringBuilder();
            try {
                on.appendTo(sb, it);
                throw new RuntimeException(String.format(Locale.US, "Failed binding to the service. Intent: %s\nRegistered services: %s", intent, sb.toString()));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0041: APUT  
      (r0v4 java.lang.Object[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: java.lang.String : 0x003d: INVOKE  (r1v4 java.lang.String) = (r1v3 java.lang.StringBuilder) type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String)
     */
    public void c(ServiceConnection serviceConnection, String str) {
        this.c.a(b(serviceConnection, str), -1);
        this.d.decrementAndGet();
        if (this.b) {
            Object[] objArr = new Object[2];
            objArr[0] = b(serviceConnection, str);
            StringBuilder T0 = je.T0(30, "# of active connections = ");
            T0.append(this.d);
            if (this.d.get() > 0) {
                T0.append(", refs = ");
                T0.append(this.c);
            }
            objArr[1] = T0.toString();
            Logger.g("[%s] Unbind | %s", objArr);
        }
        this.a.unbindService(serviceConnection);
    }
}
