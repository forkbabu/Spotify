package defpackage;

import android.app.Activity;
import android.content.Context;

/* renamed from: ux0  reason: default package */
public class ux0 {
    private final Context a;
    private final boolean b;

    public ux0(Activity activity, boolean z) {
        this.a = activity;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.base.Optional<com.spotify.pses.v1.proto.ConfigurationResponse> a() {
        /*
            r5 = this;
            boolean r0 = r5.b
            if (r0 != 0) goto L_0x0009
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
        L_0x0009:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r5.a
            java.lang.String r2 = ""
            java.io.File r1 = r1.getExternalFilesDir(r2)
            java.lang.String r2 = "presignup.experiment.override.proto"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002d }
            com.spotify.pses.v1.proto.ConfigurationResponse r0 = com.spotify.pses.v1.proto.ConfigurationResponse.u(r1)     // Catch:{ IOException -> 0x002d }
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)     // Catch:{ IOException -> 0x002d }
            return r0
        L_0x002d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Could not parse configuration response from file"
            com.spotify.base.java.logging.Logger.e(r0, r2, r1)
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
        L_0x003a:
            android.content.Context r0 = r5.a
            java.io.File r0 = r0.getFilesDir()
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "settings/presignup.experiment.override"
            r1.<init>(r0, r3)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x0097
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x008f }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x008f }
            r4.<init>(r1)     // Catch:{ IOException -> 0x008f }
            r3.<init>(r4)     // Catch:{ IOException -> 0x008f }
        L_0x005c:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0070
            java.lang.String r4 = ":"
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ all -> 0x0088 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0088 }
            r0.addAll(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x005c
        L_0x0070:
            com.spotify.pses.v1.proto.ConfigurationResponse$b r1 = com.spotify.pses.v1.proto.ConfigurationResponse.s()     // Catch:{ all -> 0x0088 }
            r1.m(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "-1"
            r1.o(r0)     // Catch:{ all -> 0x0088 }
            com.google.protobuf.GeneratedMessageLite r0 = r1.build()     // Catch:{ all -> 0x0088 }
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)     // Catch:{ all -> 0x0088 }
            r3.close()
            return r0
        L_0x0088:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0
        L_0x008f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "could not read pre signup override flags"
            com.spotify.base.java.logging.Logger.e(r0, r2, r1)
        L_0x0097:
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux0.a():com.google.common.base.Optional");
    }
}
