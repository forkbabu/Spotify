package com.spotify.libs.connect.sorting.hashing;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.p;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.h;
import kotlin.text.a;

public final class b implements a {
    private final d a;
    private final p b;

    public b(d dVar, p pVar) {
        h.e(dVar, "algorithm");
        h.e(pVar, "localDeviceProvider");
        this.a = dVar;
        this.b = pVar;
    }

    @Override // com.spotify.libs.connect.sorting.hashing.a
    public String a(String str) {
        String str2;
        h.e(str, "input");
        MessageDigest instance = MessageDigest.getInstance(this.a.a());
        StringBuilder sb = new StringBuilder();
        GaiaDevice b2 = this.b.b();
        if (b2 == null || (str2 = b2.getPhysicalIdentifier()) == null) {
            str2 = "";
        }
        String I0 = je.I0(sb, str2, str);
        Charset charset = a.a;
        if (I0 != null) {
            byte[] bytes = I0.getBytes(charset);
            h.d(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] digest = instance.digest();
            h.d(digest, "digest()");
            DeviceSortingHasherImpl$toHexString$1 deviceSortingHasherImpl$toHexString$1 = DeviceSortingHasherImpl$toHexString$1.a;
            h.e(digest, "$this$joinToString");
            h.e("", "separator");
            h.e("", "prefix");
            h.e("", "postfix");
            h.e("...", "truncated");
            StringBuilder sb2 = new StringBuilder();
            h.e(digest, "$this$joinTo");
            h.e(sb2, "buffer");
            h.e("", "separator");
            h.e("", "prefix");
            h.e("", "postfix");
            h.e("...", "truncated");
            sb2.append((CharSequence) "");
            int i = 0;
            for (byte b3 : digest) {
                i++;
                if (i > 1) {
                    sb2.append((CharSequence) "");
                }
                if (deviceSortingHasherImpl$toHexString$1 != null) {
                    sb2.append((CharSequence) deviceSortingHasherImpl$toHexString$1.invoke(Byte.valueOf(b3)));
                } else {
                    sb2.append((CharSequence) String.valueOf((int) b3));
                }
            }
            sb2.append((CharSequence) "");
            String sb3 = sb2.toString();
            h.d(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb3;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
