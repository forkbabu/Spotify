package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.core.app.h;
import androidx.core.app.j;
import androidx.core.app.k;
import androidx.fragment.app.c;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Arrays;

public class d extends e {
    private static final Object c = new Object();
    private static final d d = new d();
    public static final int e = e.a;

    /* access modifiers changed from: private */
    public class a extends qt {
        private final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                int g = d.this.g(this.a);
                if (d.this.h(g)) {
                    d.this.j(this.a, g);
                }
            }
        }
    }

    public static d f() {
        return d;
    }

    @RecentlyNonNull
    public static Dialog k(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(w.f(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        n(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    static Dialog l(Context context, int i, v vVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(w.f(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            str = resources.getString(C0707R.string.common_google_play_services_install_button);
        } else if (i == 2) {
            str = resources.getString(C0707R.string.common_google_play_services_update_button);
        } else if (i != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(C0707R.string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, vVar);
        }
        String a2 = w.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    static void n(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof c) {
            SupportErrorDialogFragment.a5(dialog, onCancelListener).Y4(((c) activity).v0(), str);
            return;
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void o(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String e2 = w.e(context, i);
            String g = w.g(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            g.l(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            k kVar = new k(context, null);
            kVar.s(true);
            kVar.d(true);
            kVar.j(e2);
            j jVar = new j();
            jVar.j(g);
            kVar.B(jVar);
            if (e.f(context)) {
                g.o(Build.VERSION.SDK_INT >= 20);
                kVar.z(context.getApplicationInfo().icon);
                kVar.w(2);
                if (e.g(context)) {
                    kVar.b.add(new h(C0707R.drawable.common_full_open_on_phone, resources.getString(C0707R.string.common_open_on_phone), pendingIntent));
                } else {
                    kVar.h(pendingIntent);
                }
            } else {
                kVar.z(17301642);
                kVar.D(resources.getString(C0707R.string.common_google_play_services_notification_ticker));
                kVar.G(System.currentTimeMillis());
                kVar.h(pendingIntent);
                kVar.i(g);
            }
            if (e.c()) {
                g.o(e.c());
                synchronized (c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C0707R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                kVar.f("com.google.android.gms.availability");
            }
            Notification a2 = kVar.a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                g.c.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        }
    }

    @Override // com.google.android.gms.common.e
    @RecentlyNullable
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    @Override // com.google.android.gms.common.e
    public int c(@RecentlyNonNull Context context, int i) {
        return super.c(context, i);
    }

    public com.google.android.gms.tasks.g<Void> d(@RecentlyNonNull b<?> bVar, @RecentlyNonNull b<?>... bVarArr) {
        g.k(bVar, "Requested API must not be null.");
        for (b<?> bVar2 : bVarArr) {
            g.k(bVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(bVarArr.length + 1);
        arrayList.add(bVar);
        arrayList.addAll(Arrays.asList(bVarArr));
        return com.google.android.gms.common.api.internal.g.e().i(arrayList).s(i.a);
    }

    public final String e(int i) {
        int i2 = g.e;
        return ConnectionResult.r2(i);
    }

    public int g(@RecentlyNonNull Context context) {
        return c(context, e.a);
    }

    public final boolean h(int i) {
        int i2 = g.e;
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public boolean i(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l = l(activity, i, v.a(activity, super.a(activity, i, "d"), i2), onCancelListener);
        if (l == null) {
            return false;
        }
        n(activity, l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void j(@RecentlyNonNull Context context, int i) {
        PendingIntent pendingIntent;
        Intent a2 = super.a(context, i, "n");
        if (a2 == null) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
        }
        o(context, i, pendingIntent);
    }

    public final d0 m(Context context, f0 f0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        d0 d0Var = new d0(f0Var);
        context.registerReceiver(d0Var, intentFilter);
        d0Var.b(context);
        if (g.c(context, "com.google.android.gms")) {
            return d0Var;
        }
        f0Var.a();
        d0Var.a();
        return null;
    }

    public final boolean p(@RecentlyNonNull Activity activity, @RecentlyNonNull com.google.android.gms.common.api.internal.j jVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l = l(activity, i, v.b(jVar, super.a(activity, i, "d")), onCancelListener);
        if (l == null) {
            return false;
        }
        n(activity, l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean q(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        if (connectionResult.p2()) {
            pendingIntent = connectionResult.o2();
        } else {
            Intent a2 = a(context, connectionResult.I1(), null);
            if (a2 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int I1 = connectionResult.I1();
        int i2 = GoogleApiActivity.b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        o(context, I1, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }
}
