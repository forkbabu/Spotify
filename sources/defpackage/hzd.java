package defpackage;

/* renamed from: hzd  reason: default package */
public class hzd implements zyd {
    private final xyd a;
    private String b = "";
    private String c = "";
    private boolean d;
    private boolean e;

    public hzd(xyd xyd, sg0<String, String> sg0) {
        this.a = xyd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if ((!r0.isEmpty() && !r4.c.isEmpty()) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.e     // Catch:{ all -> 0x0064 }
            r1 = 1
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "ro.odm.csc.spotify.music.partnerid"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.lang.String r0 = ""
        L_0x0011:
            r4.b = r0     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "ro.odm.csc.spotify.music.referrerid"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = ""
        L_0x001e:
            r4.c = r0     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r4.b     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            r2 = 0
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = r4.c     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x005d
            xyd r0 = r4.a     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "ro.odm.csc.spotify.music.referrerid"
            java.lang.String r0 = r0.a(r3)     // Catch:{ all -> 0x0064 }
            r4.c = r0     // Catch:{ all -> 0x0064 }
            xyd r0 = r4.a     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "ro.odm.csc.spotify.music.partnerid"
            java.lang.String r0 = r0.a(r3)     // Catch:{ all -> 0x0064 }
            r4.b = r0     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = r4.c     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x005e
        L_0x005d:
            r2 = 1
        L_0x005e:
            r4.d = r2     // Catch:{ all -> 0x0064 }
        L_0x0060:
            r4.e = r1     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzd.e():void");
    }

    @Override // defpackage.zyd
    public String a() {
        e();
        return this.b;
    }

    @Override // defpackage.zyd
    public String b() {
        e();
        return this.c;
    }

    @Override // defpackage.zyd
    public boolean c() {
        e();
        return true;
    }

    @Override // defpackage.zyd
    public boolean d() {
        e();
        return this.d;
    }
}
