package defpackage;

import android.content.Context;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import com.spotify.remoteconfig.client.model.resolve.a;
import defpackage.d0e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: j0e  reason: default package */
public final class j0e implements k0e {
    private final File a;

    public j0e(File file, f fVar) {
        this.a = file;
    }

    private final void b() {
        if (!this.a.exists()) {
            return;
        }
        if (!this.a.delete()) {
            trf.b("Can't delete file <%s>", this.a.getAbsolutePath());
        } else {
            trf.a("File <%s> deleted", this.a.getAbsolutePath());
        }
    }

    public static final j0e c(Context context, String str) {
        h.f(context, "context");
        h.f(str, "fileName");
        File dir = context.getDir("remote-config", 0);
        h.b(dir, "directory");
        h.f(dir, "directory");
        h.f(str, "fileName");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return new j0e(new File(dir, str), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        defpackage.yif.j(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] e() {
        /*
            r5 = this;
            java.io.File r0 = r5.a
            long r0 = r0.length()
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0024 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0024 }
            java.io.File r3 = r5.a     // Catch:{ IOException -> 0x0024 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0024 }
            r2 = 0
            r1.readFully(r0)     // Catch:{ all -> 0x001d }
            defpackage.yif.j(r1, r2)
            goto L_0x0036
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            defpackage.yif.j(r1, r2)
            throw r3
        L_0x0024:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.io.File r4 = r5.a
            java.lang.String r4 = r4.getAbsolutePath()
            r2[r3] = r4
            java.lang.String r3 = "Can't read from file <%s>"
            defpackage.trf.c(r1, r3, r2)
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0e.e():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        defpackage.yif.j(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g(byte[] r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f }
            java.io.File r3 = r7.a     // Catch:{ IOException -> 0x002f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x002f }
            r3 = 0
            java.lang.String r4 = "Writing <%d> bytes to file <%s>"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0028 }
            int r6 = r8.length     // Catch:{ all -> 0x0028 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0028 }
            r5[r0] = r6     // Catch:{ all -> 0x0028 }
            java.io.File r6 = r7.a     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0028 }
            r5[r1] = r6     // Catch:{ all -> 0x0028 }
            defpackage.trf.a(r4, r5)     // Catch:{ all -> 0x0028 }
            r2.write(r8)     // Catch:{ all -> 0x0028 }
            defpackage.yif.j(r2, r3)
            goto L_0x003f
        L_0x0028:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            defpackage.yif.j(r2, r8)
            throw r3
        L_0x002f:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.io.File r2 = r7.a
            java.lang.String r2 = r2.getAbsolutePath()
            r1[r0] = r2
            java.lang.String r0 = "Can't write to file <%s>"
            defpackage.trf.c(r8, r0, r1)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0e.g(byte[]):void");
    }

    public void a() {
        trf.a("Cleaning configuration store.", new Object[0]);
        b();
    }

    public synchronized d0e d() {
        d0e d0e;
        if (!this.a.exists() || this.a.length() == 0) {
            trf.d("No existing configuration. Returning the default one.", new Object[0]);
            d0e.a aVar = d0e.d;
            return d0e.c;
        }
        try {
            byte[] e = e();
            h.f(e, "configuration");
            GranularConfiguration q = GranularConfiguration.q(e);
            h.b(q, "storageProto");
            List<GranularConfiguration.AssignedPropertyValue> n = q.n();
            h.b(n, "storageProto.propertiesList");
            ArrayList arrayList = new ArrayList(d.e(n, 10));
            for (T t : n) {
                h.b(t, "it");
                arrayList.add(AssignedPropertyValue.a(t));
            }
            String m = q.m();
            h.b(m, "storageProto.configurationAssignmentId");
            a aVar2 = new a(m, q.o(), arrayList, (f) null);
            d0e.a aVar3 = d0e.d;
            d0e = d0e.a.a(aVar2);
        } catch (InvalidProtocolBufferException e2) {
            trf.c(e2, "Can't parse protobuf", new Object[0]);
            d0e.a aVar4 = d0e.d;
            d0e = d0e.c;
        }
        return d0e;
    }

    public synchronized void f(d0e d0e) {
        h.f(d0e, "configuration");
        trf.a("Storing raw configuration", new Object[0]);
        if (d0e.h()) {
            b();
        } else {
            g(d0e.c().f());
        }
    }
}
