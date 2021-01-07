package defpackage;

import android.content.Context;
import com.google.gson.j;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.music.C0707R;
import io.reactivex.z;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: dr0  reason: default package */
public class dr0 implements br0 {
    private static final Type c = new a().d();
    private final j a = new j();
    private final Context b;

    /* renamed from: dr0$a */
    static class a extends z20<List<CallingCode>> {
        a() {
        }
    }

    public dr0(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.br0
    public z<List<CallingCode>> a() {
        return z.z(Integer.valueOf((int) C0707R.raw.calling_codes)).A(new uq0(this));
    }

    @Override // defpackage.br0
    public /* synthetic */ z b() {
        return ar0.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r0 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List c(java.lang.Integer r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.b
            com.google.gson.j r1 = r5.a
            int r6 = r6.intValue()
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r2 = r2.getResourceEntryName(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r4 = r4.getAbsolutePath()
            r3.append(r4)
            r4 = 47
            r3.append(r4)
            r3.append(r2)
            r2 = 46
            r3.append(r2)
            java.lang.String r2 = "json"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.exists()     // Catch:{ IOException -> 0x0072 }
            if (r2 == 0) goto L_0x0047
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0072 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0072 }
            goto L_0x004f
        L_0x0047:
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0072 }
            java.io.InputStream r0 = r0.openRawResource(r6)     // Catch:{ IOException -> 0x0072 }
        L_0x004f:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0069 }
            byte[] r3 = com.google.common.io.ByteStreams.toByteArray(r0)     // Catch:{ all -> 0x0069 }
            java.nio.charset.Charset r4 = com.google.common.base.Charsets.UTF_8     // Catch:{ all -> 0x0069 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0069 }
            r0.close()
            java.lang.reflect.Type r6 = defpackage.dr0.c
            java.lang.Object r6 = r1.b(r2, r6)
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            return r6
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r1
        L_0x0072:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to load RAW resource #"
            java.lang.String r6 = defpackage.je.p0(r2, r6)
            r1.<init>(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.c(java.lang.Integer):java.util.List");
    }
}
