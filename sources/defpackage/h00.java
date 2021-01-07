package defpackage;

import com.google.firebase.crashlytics.internal.common.DataTransportState;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h00  reason: default package */
public class h00 {
    private static final short[] h = {10, 20, 30, 60, 120, 300};
    private final j00 a;
    private final String b;
    private final String c;
    private final DataTransportState d;
    private final g00 e;
    private final a f;
    private Thread g;

    /* renamed from: h00$a */
    public interface a {
        boolean a();
    }

    /* renamed from: h00$b */
    public interface b {
    }

    /* renamed from: h00$c */
    public interface c {
        File[] a();

        File[] b();
    }

    /* renamed from: h00$d */
    private class d extends com.google.firebase.crashlytics.internal.common.d {
        private final List<Report> a;
        private final boolean b;
        private final float c;

        d(List<Report> list, boolean z, float f2) {
            this.a = list;
            this.b = z;
            this.c = f2;
        }

        private void b(List<Report> list, boolean z) {
            ty f2 = ty.f();
            StringBuilder V0 = je.V0("Starting report processing in ");
            V0.append(this.c);
            V0.append(" second(s)...");
            f2.b(V0.toString());
            float f3 = this.c;
            if (f3 > 0.0f) {
                try {
                    Thread.sleep((long) (f3 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!h00.this.f.a()) {
                int i = 0;
                while (list.size() > 0 && !h00.this.f.a()) {
                    ty f4 = ty.f();
                    StringBuilder V02 = je.V0("Attempting to send ");
                    V02.append(list.size());
                    V02.append(" report(s)");
                    f4.b(V02.toString());
                    ArrayList arrayList = new ArrayList();
                    for (Report report : list) {
                        if (!h00.this.d(report, z)) {
                            arrayList.add(report);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int i2 = i + 1;
                        long j = (long) h00.h[Math.min(i, h00.h.length - 1)];
                        ty f5 = ty.f();
                        f5.b("Report submission: scheduling delayed retry in " + j + " seconds");
                        try {
                            Thread.sleep(j * 1000);
                            i = i2;
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    list = arrayList;
                }
            }
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            try {
                b(this.a, this.b);
            } catch (Exception e) {
                ty.f().e("An unexpected error occurred while attempting to upload crash reports.", e);
            }
            h00.this.g = null;
        }
    }

    public h00(String str, String str2, DataTransportState dataTransportState, g00 g00, j00 j00, a aVar) {
        this.a = j00;
        this.b = str;
        this.c = str2;
        this.d = dataTransportState;
        this.e = g00;
        this.f = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f A[Catch:{ Exception -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(com.google.firebase.crashlytics.internal.report.model.Report r5, boolean r6) {
        /*
            r4 = this;
            r0 = 1
            com.google.firebase.crashlytics.internal.report.model.a r1 = new com.google.firebase.crashlytics.internal.report.model.a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r4.b     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = r4.c     // Catch:{ Exception -> 0x0068 }
            r1.<init>(r2, r3, r5)     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r2 = r4.d     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = com.google.firebase.crashlytics.internal.common.DataTransportState.ALL     // Catch:{ Exception -> 0x0068 }
            if (r2 != r3) goto L_0x001a
            ty r6 = defpackage.ty.f()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
            r6.b(r1)     // Catch:{ Exception -> 0x0068 }
            goto L_0x002f
        L_0x001a:
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = com.google.firebase.crashlytics.internal.common.DataTransportState.JAVA_ONLY     // Catch:{ Exception -> 0x0068 }
            if (r2 != r3) goto L_0x0031
            com.google.firebase.crashlytics.internal.report.model.Report$Type r2 = r5.getType()     // Catch:{ Exception -> 0x0068 }
            com.google.firebase.crashlytics.internal.report.model.Report$Type r3 = com.google.firebase.crashlytics.internal.report.model.Report.Type.JAVA     // Catch:{ Exception -> 0x0068 }
            if (r2 != r3) goto L_0x0031
            ty r6 = defpackage.ty.f()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            r6.b(r1)     // Catch:{ Exception -> 0x0068 }
        L_0x002f:
            r6 = 1
            goto L_0x005d
        L_0x0031:
            j00 r2 = r4.a     // Catch:{ Exception -> 0x0068 }
            boolean r6 = r2.a(r1, r6)     // Catch:{ Exception -> 0x0068 }
            ty r1 = defpackage.ty.f()     // Catch:{ Exception -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            r2.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch:{ Exception -> 0x0068 }
            if (r6 == 0) goto L_0x004a
            java.lang.String r3 = "complete: "
            goto L_0x004c
        L_0x004a:
            java.lang.String r3 = "FAILED: "
        L_0x004c:
            r2.append(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = r5.b()     // Catch:{ Exception -> 0x0068 }
            r2.append(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0068 }
            r1.g(r2)     // Catch:{ Exception -> 0x0068 }
        L_0x005d:
            if (r6 == 0) goto L_0x0081
            g00 r6 = r4.e     // Catch:{ Exception -> 0x0068 }
            r6.getClass()     // Catch:{ Exception -> 0x0068 }
            r5.remove()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0082
        L_0x0068:
            r6 = move-exception
            ty r0 = defpackage.ty.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error occurred sending report "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.e(r5, r6)
        L_0x0081:
            r0 = 0
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.d(com.google.firebase.crashlytics.internal.report.model.Report, boolean):boolean");
    }

    public synchronized void e(List<Report> list, boolean z, float f2) {
        if (this.g != null) {
            ty.f().b("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new d(list, z, f2), "Crashlytics Report Uploader");
        this.g = thread;
        thread.start();
    }
}
