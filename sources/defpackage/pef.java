package defpackage;

import android.content.Context;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: pef  reason: default package */
public class pef implements sef {
    private final List<ByteBuffer> a = new ArrayList();
    private final p b = new p();
    private final y c;
    private final Context d;

    public pef(Context context, y yVar) {
        this.d = context;
        this.c = yVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r8.d
            r2 = 0
            java.io.File r1 = r1.getExternalFilesDir(r2)
            java.lang.String r2 = "superbird-records"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0023
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "Failed to create a record directory."
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.d(r0, r1)
            return
        L_0x0023:
            java.util.List<java.nio.ByteBuffer> r1 = r8.a
            monitor-enter(r1)
            java.util.List<java.nio.ByteBuffer> r3 = r8.a     // Catch:{ all -> 0x00d1 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00d1 }
            if (r3 == 0) goto L_0x0030
            monitor-exit(r1)     // Catch:{ all -> 0x00d1 }
            return
        L_0x0030:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00d1 }
            java.lang.String r4 = "yyyy-MM-dd'T'HH_mm_ss'Z'"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00d1 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00d1 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0089 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0089 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0089 }
            r6.<init>()     // Catch:{ IOException -> 0x0089 }
            java.util.Date r7 = new java.util.Date     // Catch:{ IOException -> 0x0089 }
            r7.<init>()     // Catch:{ IOException -> 0x0089 }
            java.lang.String r3 = r3.format(r7)     // Catch:{ IOException -> 0x0089 }
            r6.append(r3)     // Catch:{ IOException -> 0x0089 }
            java.lang.String r3 = ".opus"
            r6.append(r3)     // Catch:{ IOException -> 0x0089 }
            java.lang.String r3 = r6.toString()     // Catch:{ IOException -> 0x0089 }
            r5.<init>(r0, r3)     // Catch:{ IOException -> 0x0089 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0089 }
            java.util.List<java.nio.ByteBuffer> r3 = r8.a     // Catch:{ all -> 0x0082 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0065:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0082 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ all -> 0x0082 }
            byte[] r5 = r5.array()     // Catch:{ all -> 0x0082 }
            r4.write(r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0065
        L_0x0079:
            java.util.List<java.nio.ByteBuffer> r3 = r8.a     // Catch:{ all -> 0x0082 }
            r3.clear()     // Catch:{ all -> 0x0082 }
            r4.close()
            goto L_0x0091
        L_0x0082:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r3
        L_0x0089:
            r3 = move-exception
            java.lang.String r4 = "Failed to write a record file."
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r3, r4, r5)
        L_0x0091:
            monitor-exit(r1)
            java.io.File[] r0 = r0.listFiles()
            java.util.List r0 = java.util.Arrays.asList(r0)
            int r1 = r0.size()
            r3 = 40
            if (r1 <= r3) goto L_0x00d0
            nef r1 = defpackage.nef.a
            java.util.Collections.sort(r0, r1)
        L_0x00a7:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x00d0
            java.lang.Object r1 = r0.get(r3)
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x00cd
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r4 = r0.get(r3)
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getName()
            r1[r2] = r4
            java.lang.String r4 = "Failed to delete a record file. %s"
            com.spotify.base.java.logging.Logger.d(r4, r1)
        L_0x00cd:
            int r3 = r3 + 1
            goto L_0x00a7
        L_0x00d0:
            return
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x00d5
        L_0x00d4:
            throw r0
        L_0x00d5:
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pef.c():void");
    }

    @Override // defpackage.sef
    public void a(ByteBuffer byteBuffer) {
        synchronized (this.a) {
            this.a.add(byteBuffer);
        }
        this.b.b(a.L(5, TimeUnit.SECONDS, io.reactivex.schedulers.a.a()).A(this.c).d(a.u(new oef(this))).subscribe());
    }

    @Override // defpackage.sef
    public void flush() {
        this.b.a();
        c();
    }
}
