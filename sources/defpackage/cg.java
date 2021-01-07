package defpackage;

import android.os.Build;
import com.facebook.internal.f0;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.a;
import com.facebook.internal.logging.b;
import com.facebook.k;
import com.facebook.m;
import com.facebook.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cg  reason: default package */
public class cg implements b {
    private static final Integer d = 100;
    private static cg e;
    private static String f = Build.VERSION.RELEASE;
    private static String g = Build.MODEL;
    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    private a b;
    private eg c;

    private cg(a aVar, eg egVar) {
        if (this.b == null) {
            this.b = aVar;
        }
        if (this.c == null) {
            this.c = egVar;
        }
    }

    public static synchronized cg c(a aVar, eg egVar) {
        cg cgVar;
        synchronized (cg.class) {
            if (e == null) {
                e = new cg(aVar, egVar);
            }
            cgVar = e;
        }
        return cgVar;
    }

    public void a() {
        a aVar = this.b;
        ArrayList arrayList = new ArrayList();
        if (!f0.C(k.e())) {
            while (true) {
                dg dgVar = (dg) aVar;
                if (!dgVar.d()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < d.intValue() && !dgVar.d(); i++) {
                        arrayList2.add(dgVar.b());
                    }
                    String packageName = k.d().getPackageName();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((ExternalLog) it.next()).I1());
                    }
                    m mVar = null;
                    if (jSONArray.length() != 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("device_os_version", f);
                            jSONObject.put("device_model", g);
                            jSONObject.put("unique_application_identifier", packageName);
                            jSONObject.put("entries", jSONArray);
                            mVar = m.s(null, String.format("%s/monitorings", k.e()), jSONObject, null);
                        } catch (JSONException unused) {
                        }
                    }
                    if (mVar != null) {
                        arrayList.add(mVar);
                    }
                }
            }
        }
        try {
            new p(arrayList).e();
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Collection] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[SYNTHETIC, Splitter:B:18:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[SYNTHETIC, Splitter:B:27:0x0047] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r7 = this;
            eg r0 = r7.c
            r0.getClass()
            java.lang.String r0 = "facebooksdk.monitoring.persistedlogs"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Context r2 = com.facebook.k.d()
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            java.lang.Object r3 = r5.readObject()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r5.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            java.io.File r0 = r2.getFileStreamPath(r0)     // Catch:{ Exception -> 0x002f }
            r0.delete()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r1 = r3
            goto L_0x0051
        L_0x0031:
            r1 = move-exception
            r3 = r5
            goto L_0x0037
        L_0x0034:
            r3 = r5
            goto L_0x0045
        L_0x0036:
            r1 = move-exception
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            java.io.File r0 = r2.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0043 }
            r0.delete()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            throw r1
        L_0x0044:
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            java.io.File r0 = r2.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0051 }
            r0.delete()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            com.facebook.internal.logging.a r0 = r7.b
            dg r0 = (defpackage.dg) r0
            r0.a(r1)
            r7.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.b():void");
    }
}
