package com.spotify.music.features.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class u1 {
    private final WeakReference<Activity> a;
    private final i80 b;
    private final Uri c;
    private final gl0<u> d;
    private final cqe e;
    private Handler f;
    private final f1 g = new a();

    class a extends f1 {
        a() {
        }

        @Override // defpackage.f1
        public void a(int i, Bundle bundle) {
            long d = u1.this.e.d();
            InAppBrowserEvent.b n = InAppBrowserEvent.n();
            n.p(d);
            n.n("");
            if (i == 2) {
                n.o(InAppBrowserLogEvent.PAGE_LOADED.d());
            } else if (i == 3) {
                n.o(InAppBrowserLogEvent.ERROR.d());
            } else if (i == 5) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("browserType", "customTabs");
                } catch (JSONException e) {
                    Logger.e(e, "Unable to create json data", new Object[0]);
                }
                n.o(InAppBrowserLogEvent.OPENED.d());
                n.n(jSONObject.toString());
            } else if (i == 6) {
                n.o(InAppBrowserLogEvent.CLOSED.d());
            }
            if (!TextUtils.isEmpty(n.m())) {
                u1.this.d.c(n.build());
            }
            Logger.b("[AdBrowser] CustomTabsCallBack: %d", Integer.valueOf(i));
        }
    }

    public u1(Activity activity, i80 i80, Uri uri, gl0<u> gl0, cqe cqe) {
        this.a = new WeakReference<>(activity);
        this.b = i80;
        this.c = uri;
        this.d = gl0;
        this.e = cqe;
    }

    public boolean c() {
        Uri uri = this.c;
        PackageManager packageManager = this.a.get().getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
        ArrayList arrayList = new ArrayList(0);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveInfo);
            }
        }
        return !arrayList.isEmpty();
    }

    public /* synthetic */ void d(Activity activity) {
        this.b.c(activity, this.c);
    }

    public void e() {
        Activity activity = this.a.get();
        int b2 = androidx.core.content.a.b(activity, C0707R.color.webview_toolbar_color);
        this.b.a(q80.b());
        this.b.a(r80.b(b2));
        this.b.d(this.g);
        this.b.f(this.c);
        this.f.postDelayed(new c0(this, activity), 500);
    }

    public void f(Handler handler) {
        this.f = handler;
    }
}
