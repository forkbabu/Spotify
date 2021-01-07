package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.google.android.play.core.internal.w;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

public final class s1 {
    private static n0 a;

    static synchronized n0 a(Context context) {
        n0 n0Var;
        synchronized (s1.class) {
            if (a == null) {
                m0 m0Var = new m0();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                m0Var.b(new w2(context));
                a = m0Var.a();
            }
            n0Var = a;
        }
        return n0Var;
    }

    static String b(List<File> list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    w.a(th, th);
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    static boolean c(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    static long d(byte[] bArr, int i) {
        return ((long) ((f(bArr, i + 2) << 16) | f(bArr, i))) & 4294967295L;
    }

    public static boolean e(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    static int f(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static boolean g(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
