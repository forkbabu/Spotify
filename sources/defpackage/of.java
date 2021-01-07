package defpackage;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: of  reason: default package */
public class of implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ nf f;

    of(nf nfVar, JSONObject jSONObject, String str, String str2) {
        this.f = nfVar;
        this.a = jSONObject;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        defpackage.uf.b(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0007] */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            boolean r0 = defpackage.uf.c(r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r0 = com.facebook.k.d()     // Catch:{ Exception -> 0x006e, all -> 0x006a }
            java.lang.String r1 = com.facebook.k.f()     // Catch:{ Exception -> 0x0027, all -> 0x006a }
            if (r1 == 0) goto L_0x0012
            goto L_0x0029
        L_0x0012:
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()     // Catch:{ Exception -> 0x0027, all -> 0x006a }
            int r2 = r1.labelRes     // Catch:{ Exception -> 0x0027, all -> 0x006a }
            if (r2 != 0) goto L_0x0021
            java.lang.CharSequence r0 = r1.nonLocalizedLabel     // Catch:{ Exception -> 0x0027, all -> 0x006a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0027, all -> 0x006a }
            goto L_0x0025
        L_0x0021:
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0027, all -> 0x006a }
        L_0x0025:
            r1 = r0
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = ""
        L_0x0029:
            java.lang.String r0 = r1.toLowerCase()
            org.json.JSONObject r1 = r6.a
            float[] r1 = defpackage.C0706if.a(r1, r0)
            java.lang.String r2 = r6.b
            nf r3 = r6.f
            java.lang.String r3 = defpackage.nf.b(r3)
            java.lang.String r0 = defpackage.C0706if.c(r2, r3, r0)
            if (r1 != 0) goto L_0x0042
            return
        L_0x0042:
            com.facebook.appevents.ml.ModelManager$Task r2 = com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION
            r3 = 1
            float[][] r4 = new float[r3][]
            r5 = 0
            r4[r5] = r1
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r5] = r0
            java.lang.String[] r0 = com.facebook.appevents.ml.ModelManager.j(r2, r4, r3)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            r0 = r0[r5]
            java.lang.String r2 = r6.c
            defpackage.jf.a(r2, r0)
            java.lang.String r2 = "other"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x006e
            java.lang.String r2 = r6.b
            defpackage.nf.a(r0, r2, r1)
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            defpackage.uf.b(r0, r6)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.run():void");
    }
}
