package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    private static final String[] c = {"*", "FCM", "GCM", ""};
    private final SharedPreferences a;
    private final String b;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.google.firebase.c r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.g()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.a = r0
            com.google.firebase.d r0 = r4.j()
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            com.google.firebase.d r4 = r4.j()
            java.lang.String r0 = r4.c()
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0034
            goto L_0x004a
        L_0x0034:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            r3.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.b.<init>(com.google.firebase.c):void");
    }

    private String b() {
        PublicKey publicKey;
        synchronized (this.a) {
            String str = null;
            String string = this.a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                String str2 = "Invalid key stored " + e;
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & BitmapRenderer.ALPHA_VISIBLE);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }

    public String a() {
        String string;
        synchronized (this.a) {
            synchronized (this.a) {
                string = this.a.getString("|S|id", null);
            }
            if (string != null) {
                return string;
            }
            return b();
        }
    }

    public String c() {
        synchronized (this.a) {
            String[] strArr = c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    return null;
                }
                String str2 = strArr[i];
                String str3 = this.b;
                String string = this.a.getString("|T|" + str3 + "|" + str2, null);
                if (string == null || string.isEmpty()) {
                    i++;
                } else {
                    if (string.startsWith("{")) {
                        try {
                            str = new JSONObject(string).getString("token");
                        } catch (JSONException unused) {
                        }
                        string = str;
                    }
                    return string;
                }
            }
        }
    }
}
