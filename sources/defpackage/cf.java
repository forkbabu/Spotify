package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.LoggingBehavior;
import com.facebook.internal.y;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cf  reason: default package */
public class cf {
    private static final String e = "cf";
    private final Handler a = new Handler(Looper.getMainLooper());
    private WeakReference<Activity> b;
    private Timer c;
    private String d = null;

    /* access modifiers changed from: package-private */
    /* renamed from: cf$a */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) cf.a(cf.this).get();
                View b = com.facebook.appevents.internal.d.b(activity);
                if (activity == null) {
                    return;
                }
                if (b != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (we.j()) {
                        FutureTask futureTask = new FutureTask(new d(b));
                        cf.b(cf.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            Log.e(cf.c(), "Failed to take screenshot.", e);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(com.facebook.appevents.codeless.internal.c.c(b));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(cf.c(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        cf cfVar = cf.this;
                        if (!uf.c(cf.class)) {
                            try {
                                cfVar.getClass();
                                if (!uf.c(cfVar)) {
                                    try {
                                        k.l().execute(new df(cfVar, jSONObject2));
                                    } catch (Throwable th) {
                                        uf.b(th, cfVar);
                                    }
                                }
                            } catch (Throwable th2) {
                                uf.b(th2, cf.class);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.e(cf.c(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cf$b */
    public class b implements Runnable {
        final /* synthetic */ TimerTask a;

        b(TimerTask timerTask) {
            this.a = timerTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    if (cf.d(cf.this) != null) {
                        cf.d(cf.this).cancel();
                    }
                    cf.g(cf.this, null);
                    cf.e(cf.this, new Timer());
                    cf.d(cf.this).scheduleAtFixedRate(this.a, 0, 1000);
                } catch (Exception e) {
                    Log.e(cf.c(), "Error scheduling indexing job", e);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cf$c */
    public static class c implements m.c {
        c() {
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            cf.c();
            int i = y.e;
            k.v(loggingBehavior);
        }
    }

    /* renamed from: cf$d */
    private static class d implements Callable<String> {
        private WeakReference<View> a;

        d(View view) {
            this.a = new WeakReference<>(view);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public String call() {
            View view = this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public cf(Activity activity) {
        this.b = new WeakReference<>(activity);
    }

    static /* synthetic */ WeakReference a(cf cfVar) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            return cfVar.b;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ Handler b(cf cfVar) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            return cfVar.a;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ String c() {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ Timer d(cf cfVar) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            return cfVar.c;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ Timer e(cf cfVar, Timer timer) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            cfVar.c = timer;
            return timer;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ String f(cf cfVar) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            return cfVar.d;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    static /* synthetic */ String g(cf cfVar, String str) {
        if (uf.c(cf.class)) {
            return null;
        }
        try {
            cfVar.d = str;
            return str;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    public static m h(String str, com.facebook.a aVar, String str2, String str3) {
        String str4;
        if (uf.c(cf.class) || str == null) {
            return null;
        }
        try {
            m s = m.s(aVar, String.format(Locale.US, "%s/app_indexing", str2), null, null);
            Bundle n = s.n();
            if (n == null) {
                n = new Bundle();
            }
            n.putString("tree", str);
            Context d2 = k.d();
            try {
                str4 = d2.getPackageManager().getPackageInfo(d2.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str4 = "";
            }
            n.putString("app_version", str4);
            n.putString("platform", "android");
            n.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                n.putString("device_session_id", we.i());
            }
            s.C(n);
            s.A(new c());
            return s;
        } catch (Throwable th) {
            uf.b(th, cf.class);
            return null;
        }
    }

    public void i() {
        if (!uf.c(this)) {
            try {
                try {
                    k.l().execute(new b(new a()));
                } catch (RejectedExecutionException e2) {
                    Log.e(e, "Error scheduling indexing job", e2);
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    public void j() {
        Timer timer;
        if (!uf.c(this)) {
            try {
                if (this.b.get() != null && (timer = this.c) != null) {
                    try {
                        timer.cancel();
                        this.c = null;
                    } catch (Exception e2) {
                        Log.e(e, "Error unscheduling indexing job", e2);
                    }
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
