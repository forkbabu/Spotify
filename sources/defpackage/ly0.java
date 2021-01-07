package defpackage;

import com.google.common.base.Optional;
import com.spotify.pses.v1.proto.ConfigurationResponse;

/* renamed from: ly0  reason: default package */
public class ly0 implements ky0 {
    private final ajf<hy0> a;
    private Optional<ConfigurationResponse> b = Optional.absent();

    public ly0(ajf<hy0> ajf) {
        this.a = ajf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        throw r3;
     */
    @Override // defpackage.ky0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.spotify.pses.v1.proto.ConfigurationResponse r3) {
        /*
            r2 = this;
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r3)
            r2.b = r0
            ajf<hy0> r0 = r2.a     // Catch:{ IOException -> 0x0024 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0024 }
            hy0 r0 = (defpackage.hy0) r0     // Catch:{ IOException -> 0x0024 }
            java.io.OutputStream r0 = r0.b()     // Catch:{ IOException -> 0x0024 }
            r3.writeTo(r0)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x002f
            r0.close()
            goto L_0x002f
        L_0x001b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001d }
        L_0x001d:
            r3 = move-exception
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r3
        L_0x0024:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r3, r0, r1)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly0.a(com.spotify.pses.v1.proto.ConfigurationResponse):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        throw r3;
     */
    @Override // defpackage.ky0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.base.Optional<com.spotify.pses.v1.proto.ConfigurationResponse> get() {
        /*
            r4 = this;
            com.google.common.base.Optional<com.spotify.pses.v1.proto.ConfigurationResponse> r0 = r4.b
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x000b
            com.google.common.base.Optional<com.spotify.pses.v1.proto.ConfigurationResponse> r0 = r4.b
            return r0
        L_0x000b:
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            ajf<hy0> r1 = r4.a
            java.lang.Object r1 = r1.get()
            hy0 r1 = (defpackage.hy0) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0054
            r1 = 0
            ajf<hy0> r2 = r4.a     // Catch:{ IOException -> 0x004a }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x004a }
            hy0 r2 = (defpackage.hy0) r2     // Catch:{ IOException -> 0x004a }
            java.io.InputStream r2 = r2.c()     // Catch:{ IOException -> 0x004a }
            int r3 = r2.available()     // Catch:{ all -> 0x0041 }
            if (r3 > 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003d
            com.spotify.pses.v1.proto.ConfigurationResponse r3 = com.spotify.pses.v1.proto.ConfigurationResponse.u(r2)     // Catch:{ all -> 0x0041 }
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r3)     // Catch:{ all -> 0x0041 }
        L_0x003d:
            r2.close()
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r3 = move-exception
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r3
        L_0x004a:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r2, r3, r1)
        L_0x0054:
            r4.b = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly0.get():com.google.common.base.Optional");
    }
}
