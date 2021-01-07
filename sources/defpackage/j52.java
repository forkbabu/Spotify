package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: j52  reason: default package */
public final class j52 implements i52 {
    public static final j52 b = new j52();

    private j52() {
    }

    @Override // defpackage.i52
    public boolean a(String str) {
        return !str.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    @Override // defpackage.i52
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = android.net.Uri.decode(r6)
            java.lang.String r0 = "://"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x004b
            r0 = r6[r1]
            java.lang.String r2 = "https"
            boolean r2 = r0.equals(r2)
            r3 = 1
            if (r2 != 0) goto L_0x0025
            java.lang.String r2 = "http"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x004b
            r6 = r6[r3]
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0032
        L_0x0030:
            r6 = 0
            goto L_0x0048
        L_0x0032:
            int r0 = r6.length()
            r2 = 0
        L_0x0037:
            if (r2 >= r0) goto L_0x0047
            char r4 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 == 0) goto L_0x0044
            goto L_0x0030
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0047:
            r6 = 1
        L_0x0048:
            if (r6 == 0) goto L_0x004b
            return r3
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j52.b(java.lang.String):boolean");
    }
}
