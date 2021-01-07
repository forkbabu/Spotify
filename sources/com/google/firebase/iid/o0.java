package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.iid.i;
import com.google.firebase.iid.t;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public class o0 {
    private static int h;
    private static PendingIntent i;
    private final t1<String, h<Bundle>> a = new t1<>();
    private final Context b;
    private final e0 c;
    private final ScheduledExecutorService d;
    private Messenger e;
    private Messenger f;
    private i g;

    class a extends du {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            o0.a(o0.this, message);
        }
    }

    public o0(Context context, e0 e0Var) {
        this.b = context;
        this.c = e0Var;
        this.e = new Messenger(new a(Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    static void a(o0 o0Var, Message message) {
        o0Var.getClass();
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new i.b());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        o0Var.g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        o0Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(AppProtocol.LogMessage.SEVERITY_ERROR);
                        if (stringExtra2 == null) {
                            String.valueOf(intent2.getExtras()).length();
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            if (stringExtra2.length() != 0) {
                                "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                new String("Received InstanceID error ");
                            }
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(":")) {
                                    str2 = str2.substring(1);
                                }
                                o0Var.f(str, intent2.putExtra(AppProtocol.LogMessage.SEVERITY_ERROR, str2).getExtras());
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            } else {
                                new String("Unexpected structured response ");
                            }
                        } else {
                            synchronized (o0Var.a) {
                                for (int i2 = 0; i2 < o0Var.a.size(); i2++) {
                                    o0Var.f(o0Var.a.i(i2), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            o0Var.f(group, extras);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            if (stringExtra.length() != 0) {
                                "Unexpected response string: ".concat(stringExtra);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        "Unexpected response action: ".concat(valueOf);
                    } else {
                        new String("Unexpected response action: ");
                    }
                }
            }
        }
    }

    private g<Bundle> e(Bundle bundle) {
        String num;
        synchronized (o0.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        h<Bundle> hVar = new h<>();
        synchronized (this.a) {
            this.a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.e() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (o0.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", i);
        }
        intent.putExtra("kid", je.j0(je.N0(num, 5), "|ID|", num, "|"));
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(intent.getExtras()).length();
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    i iVar = this.g;
                    Messenger messenger2 = iVar.a;
                    if (messenger2 != null) {
                        messenger2.send(obtain);
                    } else {
                        ((t.a) iVar.b).T(obtain);
                    }
                }
            } catch (RemoteException unused) {
                Log.isLoggable("FirebaseInstanceId", 3);
            }
            ScheduledFuture<?> schedule = this.d.schedule(new l0(hVar), 30, TimeUnit.SECONDS);
            g<Bundle> a2 = hVar.a();
            int i3 = h.b;
            a2.c(g.a, new m0(this, num, schedule));
            return hVar.a();
        }
        if (this.c.e() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.d.schedule(new l0(hVar), 30, TimeUnit.SECONDS);
        g<Bundle> a22 = hVar.a();
        int i32 = h.b;
        a22.c(g.a, new m0(this, num, schedule2));
        return hVar.a();
    }

    private void f(String str, Bundle bundle) {
        synchronized (this.a) {
            h<Bundle> remove = this.a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                } else {
                    new String("Missing callback for ");
                }
                return;
            }
            remove.c(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str, ScheduledFuture scheduledFuture) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* access modifiers changed from: package-private */
    public final g c(Bundle bundle, g gVar) {
        if (!gVar.r()) {
            return gVar;
        }
        Bundle bundle2 = (Bundle) gVar.n();
        if (!(bundle2 != null && bundle2.containsKey("google.messenger"))) {
            return gVar;
        }
        g<Bundle> e2 = e(bundle);
        int i2 = h.b;
        return e2.t(g.a, n0.a);
    }

    /* access modifiers changed from: package-private */
    public g<Bundle> d(Bundle bundle) {
        Executor executor = g.a;
        if (this.c.d() >= 12000000) {
            g<Bundle> f2 = MessengerIpcClient.c(this.b).f(1, bundle);
            int i2 = h.b;
            return f2.k(executor, j0.a);
        } else if (!this.c.g()) {
            return j.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        } else {
            g<Bundle> e2 = e(bundle);
            int i3 = h.b;
            return e2.l(executor, new k0(this, bundle));
        }
    }
}
