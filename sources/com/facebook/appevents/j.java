package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.b;
import com.facebook.k;
import com.facebook.m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class j {
    private List<AppEvent> a = new ArrayList();
    private List<AppEvent> b = new ArrayList();
    private int c;
    private b d;
    private String e;

    public j(b bVar, String str) {
        this.d = bVar;
        this.e = str;
    }

    public synchronized void a(AppEvent appEvent) {
        if (this.a.size() + this.b.size() >= 1000) {
            this.c++;
        } else {
            this.a.add(appEvent);
        }
    }

    public synchronized void b(boolean z) {
        if (z) {
            this.a.addAll(this.b);
        }
        this.b.clear();
        this.c = 0;
    }

    public synchronized int c() {
        return this.a.size();
    }

    public synchronized List<AppEvent> d() {
        List<AppEvent> list;
        list = this.a;
        this.a = new ArrayList();
        return list;
    }

    public int e(m mVar, Context context, boolean z, boolean z2) {
        int i;
        JSONArray jSONArray;
        JSONObject jSONObject;
        synchronized (this) {
            i = this.c;
            ff.d(this.a);
            this.b.addAll(this.a);
            this.a.clear();
            jSONArray = new JSONArray();
            for (AppEvent appEvent : this.b) {
                if (!appEvent.e()) {
                    appEvent.toString();
                    boolean z3 = k.n;
                } else if (z || !appEvent.b()) {
                    jSONArray.put(appEvent.c());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
        }
        try {
            jSONObject = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.d, this.e, z2, context);
            if (this.c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        mVar.B(jSONObject);
        Bundle n = mVar.n();
        if (n == null) {
            n = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            n.putString("custom_events", jSONArray2);
            mVar.E(jSONArray2);
        }
        mVar.C(n);
        return jSONArray.length();
    }
}
