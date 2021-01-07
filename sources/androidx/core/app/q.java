package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class q {
    private static final Object c = new Object();
    private static String d;
    private static Set<String> e = new HashSet();
    private static final Object f = new Object();
    private static d g;
    private final Context a;
    private final NotificationManager b;

    private static class a implements e {
        final String a;
        final int b;
        final String c;

        a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        @Override // androidx.core.app.q.e
        public void a(android.support.v4.app.a aVar) {
            aVar.Q0(this.a, this.b, this.c);
        }

        public String toString() {
            return "CancelTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + ", all:false]";
        }
    }

    private static class b implements e {
        final String a;
        final int b;
        final String c;
        final Notification d;

        b(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // androidx.core.app.q.e
        public void a(android.support.v4.app.a aVar) {
            aVar.v3(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            return je.I0(sb, this.c, "]");
        }
    }

    private static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* access modifiers changed from: private */
    public static class d implements Handler.Callback, ServiceConnection {
        private final Context a;
        private final HandlerThread b;
        private final Handler c;
        private final Map<ComponentName, a> f = new HashMap();
        private Set<String> n = new HashSet();

        /* access modifiers changed from: private */
        public static class a {
            final ComponentName a;
            boolean b = false;
            android.support.v4.app.a c;
            ArrayDeque<e> d = new ArrayDeque<>();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper(), this);
        }

        private void a(a aVar) {
            boolean z;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder V0 = je.V0("Processing component ");
                V0.append(aVar.a);
                V0.append(", ");
                V0.append(aVar.d.size());
                V0.append(" queued tasks");
                V0.toString();
            }
            if (!aVar.d.isEmpty()) {
                if (aVar.b) {
                    z = true;
                } else {
                    boolean bindService = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
                    aVar.b = bindService;
                    if (bindService) {
                        aVar.e = 0;
                    } else {
                        StringBuilder V02 = je.V0("Unable to bind to listener ");
                        V02.append(aVar.a);
                        V02.toString();
                        this.a.unbindService(this);
                    }
                    z = aVar.b;
                }
                if (!z || aVar.c == null) {
                    c(aVar);
                    return;
                }
                while (true) {
                    e peek = aVar.d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            String str = "Sending task " + peek;
                        }
                        peek.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder V03 = je.V0("Remote service has died: ");
                            V03.append(aVar.a);
                            V03.toString();
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder V04 = je.V0("RemoteException communicating with ");
                        V04.append(aVar.a);
                        V04.toString();
                    }
                }
                if (!aVar.d.isEmpty()) {
                    c(aVar);
                }
            }
        }

        private void c(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                int i = aVar.e + 1;
                aVar.e = i;
                if (i > 6) {
                    StringBuilder V0 = je.V0("Giving up on delivering ");
                    V0.append(aVar.d.size());
                    V0.append(" tasks to ");
                    V0.append(aVar.a);
                    V0.append(" after ");
                    V0.append(aVar.e);
                    V0.append(" retries");
                    V0.toString();
                    aVar.d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * Constants.ONE_SECOND;
                Log.isLoggable("NotifManCompat", 3);
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i2);
            }
        }

        public void b(e eVar) {
            this.c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                e eVar = (e) message.obj;
                Set<String> f2 = q.f(this.a);
                if (!f2.equals(this.n)) {
                    this.n = f2;
                    List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (f2.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                String str = "Permission present on component " + componentName + ", not adding listener record.";
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.f.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                String str2 = "Adding listener record for " + componentName2;
                            }
                            this.f.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, a>> it2 = this.f.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<ComponentName, a> next = it2.next();
                        if (!hashSet.contains(next.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                StringBuilder V0 = je.V0("Removing listener record for ");
                                V0.append(next.getKey());
                                V0.toString();
                            }
                            a value = next.getValue();
                            if (value.b) {
                                this.a.unbindService(this);
                                value.b = false;
                            }
                            value.c = null;
                            it2.remove();
                        }
                    }
                }
                for (a aVar : this.f.values()) {
                    aVar.d.add(eVar);
                    a(aVar);
                }
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                ComponentName componentName3 = cVar.a;
                IBinder iBinder = cVar.b;
                a aVar2 = this.f.get(componentName3);
                if (aVar2 != null) {
                    aVar2.c = a.AbstractBinderC0004a.C3(iBinder);
                    aVar2.e = 0;
                    a(aVar2);
                }
                return true;
            } else if (i == 2) {
                a aVar3 = this.f.get((ComponentName) message.obj);
                if (aVar3 != null) {
                    if (aVar3.b) {
                        this.a.unbindService(this);
                        aVar3.b = false;
                    }
                    aVar3.c = null;
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                a aVar4 = this.f.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    a(aVar4);
                }
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                String str = "Connected to service " + componentName;
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                String str = "Disconnected from service " + componentName;
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* access modifiers changed from: private */
    public interface e {
        void a(android.support.v4.app.a aVar);
    }

    private q(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static q e(Context context) {
        return new q(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                if (!string.equals(d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    e = hashSet;
                    d = string;
                }
            }
            set = e;
        }
        return set;
    }

    private void i(e eVar) {
        synchronized (f) {
            if (g == null) {
                g = new d(this.a.getApplicationContext());
            }
            g.b(eVar);
        }
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i) {
        this.b.cancel(null, i);
        if (Build.VERSION.SDK_INT <= 19) {
            i(new a(this.a.getPackageName(), i, null));
        }
    }

    public void c(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannel(notificationChannel);
        }
    }

    public void d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.deleteNotificationChannel(str);
        }
    }

    public NotificationChannel g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.getNotificationChannel(str);
        }
        return null;
    }

    public void h(int i, Notification notification) {
        Bundle b2 = d.b(notification);
        if (b2 != null && b2.getBoolean("android.support.useSideChannel")) {
            i(new b(this.a.getPackageName(), i, null, notification));
            this.b.cancel(null, i);
            return;
        }
        this.b.notify(null, i, notification);
    }
}
