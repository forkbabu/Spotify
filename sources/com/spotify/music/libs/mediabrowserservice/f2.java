package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;

public class f2 {
    private final Context a;
    private final urd b;
    private final s1 c;
    private final AndroidMediaBrowserServiceProperties d;

    public f2(Context context, urd urd, s1 s1Var, AndroidMediaBrowserServiceProperties androidMediaBrowserServiceProperties) {
        this.a = context;
        this.b = urd;
        this.c = s1Var;
        this.d = androidMediaBrowserServiceProperties;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r7, int r8, android.os.Bundle r9, com.spotify.mobile.android.sso.ClientIdentity r10) {
        /*
            r6 = this;
            com.spotify.music.libs.mediabrowserservice.s1 r0 = r6.c
            boolean r0 = r0.c(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002d
            urd r0 = r6.b
            android.content.Context r3 = r6.a
            trd$a r4 = defpackage.trd.a()
            r4.b(r7)
            r4.c(r8)
            java.lang.Class<com.spotify.music.libs.mediabrowserservice.SpotifyMediaBrowserService> r8 = com.spotify.music.libs.mediabrowserservice.SpotifyMediaBrowserService.class
            java.lang.String r8 = r8.getName()
            r4.d(r8)
            trd r8 = r4.a()
            boolean r8 = r0.a(r3, r8)
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            if (r8 == 0) goto L_0x0031
            return r7
        L_0x0031:
            com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties r8 = r6.d
            boolean r8 = r8.b()
            r0 = 0
            if (r8 == 0) goto L_0x008c
            if (r9 == 0) goto L_0x0043
            java.lang.String r8 = "com.spotify.music.extra.CLIENT_ID"
            java.lang.String r8 = r9.getString(r8, r0)
            goto L_0x0044
        L_0x0043:
            r8 = r0
        L_0x0044:
            if (r8 != 0) goto L_0x0048
            r8 = r0
            goto L_0x0067
        L_0x0048:
            java.lang.String r3 = "com.spotify.music.extra.REDIRECT_URI"
            java.lang.String r9 = r9.getString(r3, r0)
            java.lang.String r3 = "redirect_uri"
            java.lang.String r4 = "scopes"
            java.lang.String r5 = "app-remote-control"
            com.google.common.collect.ImmutableMap r9 = com.google.common.collect.ImmutableMap.of(r3, r9, r4, r5)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            if (r10 == 0) goto L_0x0063
            com.spotify.music.builtinauth.model.a r8 = com.spotify.music.builtinauth.model.a.b(r8, r9, r3, r10)
            goto L_0x0067
        L_0x0063:
            com.spotify.music.builtinauth.model.a r8 = com.spotify.music.builtinauth.model.a.a(r8, r9, r3)
        L_0x0067:
            if (r8 != 0) goto L_0x0073
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r2] = r7
            java.lang.String r7 = "MediaBrowserAuthDelegate: Caller %s could not be authorized. AuthDetails is null."
            com.spotify.base.java.logging.Logger.b(r7, r8)
            return r0
        L_0x0073:
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r7
            r7 = 45
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r8[r1] = r7
            r7 = 2
            java.lang.String r9 = "not_authorized_package"
            r8[r7] = r9
            java.lang.String r7 = "%s%s%s"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.mediabrowserservice.f2.a(java.lang.String, int, android.os.Bundle, com.spotify.mobile.android.sso.ClientIdentity):java.lang.String");
    }
}
