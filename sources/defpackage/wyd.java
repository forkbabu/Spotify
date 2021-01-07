package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: wyd  reason: default package */
public class wyd implements zyd {
    private final xyd a;
    private final fzd b;
    private String c = "";
    private String d = "";
    private String e = "";
    private boolean f;
    private boolean g;

    public wyd(xyd xyd, fzd fzd, sg0<String, String> sg0, String str, String str2) {
        this.a = xyd;
        this.b = fzd;
    }

    public static wyd e() {
        return new wyd(new xyd(), new fzd("/system/etc/spotify.preload", "/oem/etc/spotify.preload"), uyd.a, "ro.csc.spotify.music.referrerid", "ro.csc.spotify.music.partnerid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (g() == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.g     // Catch:{ all -> 0x006e }
            r1 = 1
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "ro.csc.spotify.music.referrerid"
            java.lang.String r2 = "ro.csc.spotify.music.partnerid"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r2 = ""
        L_0x0013:
            r5.c = r2     // Catch:{ all -> 0x006e }
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = ""
        L_0x001e:
            r5.d = r0     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r5.c     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            r2 = 0
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = r5.d     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            java.lang.String r3 = "true"
            r5.e = r3     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "ro.csc.spotify.music.referrerid"
            java.lang.String r3 = "ro.csc.spotify.music.partnerid"
            xyd r4 = r5.a     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r4.a(r0)     // Catch:{ all -> 0x006e }
            r5.d = r0     // Catch:{ all -> 0x006e }
            xyd r0 = r5.a     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r0.a(r3)     // Catch:{ all -> 0x006e }
            r5.c = r0     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = r5.d     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 != 0) goto L_0x0067
            boolean r0 = r5.g()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r2 = 1
        L_0x0068:
            r5.f = r2     // Catch:{ all -> 0x006e }
        L_0x006a:
            r5.g = r1     // Catch:{ all -> 0x006e }
            monitor-exit(r5)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g() {
        /*
            r5 = this;
            fzd r0 = r5.b
            r0.getClass()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/oem/etc/spotify.preload"
            r1.<init>(r2)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = "/system/etc/spotify.preload"
        L_0x001a:
            r1 = 1
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003b, IOException -> 0x0031 }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x003b, IOException -> 0x0031 }
            r0.load(r4)     // Catch:{ all -> 0x002a }
            r4.close()     // Catch:{ FileNotFoundException -> 0x003c, IOException -> 0x0028 }
            goto L_0x003c
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0
        L_0x0031:
            r0 = move-exception
            r1 = 0
        L_0x0033:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = ""
            com.spotify.base.java.logging.Logger.e(r0, r3, r2)
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r5.f = r1
            if (r1 == 0) goto L_0x005e
            fzd r0 = r5.b
            java.lang.String r1 = "partner"
            java.lang.String r0 = r0.a(r1)
            r5.c = r0
            fzd r0 = r5.b
            java.lang.String r1 = "referrer"
            java.lang.String r0 = r0.a(r1)
            r5.d = r0
            fzd r0 = r5.b
            java.lang.String r1 = "allow_get_premium"
            java.lang.String r0 = r0.a(r1)
            r5.e = r0
        L_0x005e:
            boolean r0 = r5.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.g():boolean");
    }

    @Override // defpackage.zyd
    public String a() {
        f();
        return this.c;
    }

    @Override // defpackage.zyd
    public String b() {
        f();
        return this.d;
    }

    @Override // defpackage.zyd
    public boolean c() {
        f();
        return !MoreObjects.isNullOrEmpty(this.e) && !"false".equalsIgnoreCase(this.e);
    }

    @Override // defpackage.zyd
    public boolean d() {
        f();
        return this.f;
    }
}
