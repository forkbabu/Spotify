package com.spotify.common.uri;

/* access modifiers changed from: package-private */
public class a {
    private static final String[] e = {"http://spotify.com/", "https://spotify.com/", "http://open.spotify.com/", "https://open.spotify.com/"};
    private byte[] a;
    private byte[] b;
    private int c;
    private String d;

    public a(String str) {
        this.d = str;
        this.a = new byte[str.length()];
        this.b = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                throw new SpotifyUriParserException("Spotify uri contained non-ASCII characters at position " + i + ": " + str);
            } else if (charAt != ' ') {
                this.a[i] = (byte) charAt;
            } else {
                throw new SpotifyUriParserException("Spotify uri contained space.");
            }
        }
        this.c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r6.c = r6.a.length;
        r0 = defpackage.je.V0("Bad hex character in Spotify uri: ");
        r0.append(r6.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        throw new com.spotify.common.uri.SpotifyUriParserException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(boolean r7) {
        /*
            r6 = this;
            int r0 = r6.c
            byte[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x009f
            r0 = 0
            r1 = 0
        L_0x0009:
            int r2 = r6.c
            byte[] r3 = r6.a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0091
            int r4 = r2 + 1
            r6.c = r4
            byte r2 = r3[r2]
            r5 = 65
            if (r2 >= r5) goto L_0x0088
            r5 = 43
            if (r2 != r5) goto L_0x0021
            r2 = 32
            goto L_0x0088
        L_0x0021:
            r5 = 37
            if (r2 != r5) goto L_0x007d
            int r2 = r4 + 2
            int r5 = r3.length
            if (r2 > r5) goto L_0x0065
            int r2 = r4 + 1
            r6.c = r2
            byte r2 = r3[r4]
            int r2 = r6.g(r2)
            byte[] r3 = r6.a
            int r4 = r6.c
            int r5 = r4 + 1
            r6.c = r5
            byte r3 = r3[r4]
            int r3 = r6.g(r3)
            if (r2 < 0) goto L_0x004b
            if (r3 < 0) goto L_0x004b
            int r2 = r2 * 16
            int r2 = r2 + r3
            byte r2 = (byte) r2
            goto L_0x0088
        L_0x004b:
            byte[] r7 = r6.a
            int r7 = r7.length
            r6.c = r7
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.String r0 = "Bad hex character in Spotify uri: "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0065:
            int r7 = r3.length
            r6.c = r7
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.String r0 = "Badly encoded character in Spotify uri: "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x007d:
            if (r7 == 0) goto L_0x0088
            r3 = 58
            if (r2 == r3) goto L_0x0091
            r3 = 47
            if (r2 != r3) goto L_0x0088
            goto L_0x0091
        L_0x0088:
            byte[] r3 = r6.b
            int r4 = r1 + 1
            r3[r1] = r2
            r1 = r4
            goto L_0x0009
        L_0x0091:
            java.lang.String r7 = new java.lang.String
            byte[] r2 = r6.b
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r7.<init>(r2, r0, r1, r3)
            return r7
        L_0x009f:
            com.spotify.common.uri.SpotifyUriParserException r7 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.String r0 = "End of Spotify uri reached unexpectedly: "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r6.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            goto L_0x00b5
        L_0x00b4:
            throw r7
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.common.uri.a.c(boolean):java.lang.String");
    }

    private int g(byte b2) {
        if (b2 >= 48 && b2 <= 57) {
            return b2 - 48;
        }
        byte b3 = 65;
        if (b2 < 65 || b2 > 70) {
            b3 = 97;
            if (b2 < 97 || b2 > 102) {
                return -1;
            }
        }
        return (b2 - b3) + 10;
    }

    public boolean a() {
        return this.c == this.a.length;
    }

    public String b() {
        return c(true);
    }

    public String d() {
        int i = this.c;
        if (i <= this.a.length) {
            String c2 = c(false);
            this.c = i;
            return c2;
        }
        StringBuilder V0 = je.V0("End of Spotify uri reached unexpectedly: ");
        V0.append(this.d);
        throw new SpotifyUriParserException(V0.toString());
    }

    public String e() {
        return c(false);
    }

    public void f() {
        if (this.c == 0) {
            String[] strArr = e;
            for (String str : strArr) {
                if (this.d.startsWith(str)) {
                    this.c = str.length();
                    return;
                }
            }
            if (this.d.startsWith("spotify:")) {
                this.c = 8;
                if (8 + 1 < this.d.length() && this.d.charAt(this.c) == '/' && this.d.charAt(this.c + 1) == '/') {
                    this.c += 2;
                    return;
                }
                return;
            }
            StringBuilder V0 = je.V0("Spotify uri doesn't start with a proper prefix: ");
            V0.append(this.d);
            throw new SpotifyUriParserException(V0.toString());
        }
        throw new RuntimeException("skipSpotifyPrefix must be the first call to SpotifyUriParser");
    }
}
