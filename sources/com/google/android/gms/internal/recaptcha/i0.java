package com.google.android.gms.internal.recaptcha;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.recaptcha.g0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class i0 {
    static final Charset a = Charset.forName(Constants.ENCODING);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            new x(bArr, 0, length, false, null).a(length);
        } catch (zzeo e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static Object b(Object obj, Object obj2) {
        return ((g0.b) ((q) ((f1) obj).d()).b((f1) obj2)).e();
    }
}
