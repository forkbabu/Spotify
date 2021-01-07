package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.f0;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.k;
import com.facebook.m;
import com.facebook.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    private static boolean a = false;

    public static void a() {
        File[] fileArr;
        a = true;
        if (k.g() && !f0.A()) {
            File c = InstrumentData.b.c();
            if (c == null) {
                fileArr = new File[0];
            } else {
                fileArr = c.listFiles(new e());
                if (fileArr == null) {
                    fileArr = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList();
            for (File file : fileArr) {
                InstrumentData instrumentData = new InstrumentData(file, (InstrumentData.a) null);
                if (instrumentData.c()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", instrumentData.toString());
                        arrayList.add(m.s(null, String.format("%s/instruments", k.e()), jSONObject, new a(instrumentData)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new p(arrayList).e();
            }
        }
    }

    public static void b(Throwable th) {
        if (a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                FeatureManager.Feature c = FeatureManager.c(stackTraceElement.getClassName());
                if (c != FeatureManager.Feature.Unknown) {
                    FeatureManager.b(c);
                    hashSet.add(c.toString());
                }
            }
            if (k.g() && !hashSet.isEmpty()) {
                new InstrumentData(new JSONArray((Collection) hashSet), (InstrumentData.a) null).d();
            }
        }
    }
}
