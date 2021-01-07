package com.waze.sdk;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class b {
    static byte[] a = {105, -35, -88, 69, 92, 125, -44, 37, 75, -13, 83, -73, 115, 48, 78, -20};

    public static String a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
        Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
        try {
            instance.init(2, new SecretKeySpec(Base64.decode(str, 0), "AES"), ivParameterSpec);
        } catch (InvalidAlgorithmParameterException unused) {
        } catch (InvalidKeyException unused2) {
            return null;
        }
        try {
            return new String(instance.doFinal(bArr));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused3) {
            return null;
        }
    }
}
