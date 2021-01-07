package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.f4;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class h4 {
    static final Charset a = Charset.forName(Constants.ENCODING);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            new p3(bArr, length).c(length);
        } catch (zzig e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    static Object c(Object obj, Object obj2) {
        l5 l5Var = (l5) obj2;
        b3 b3Var = (b3) ((l5) obj).e();
        b3Var.getClass();
        f4.b bVar = (f4.b) b3Var;
        if (bVar.j().getClass().isInstance(l5Var)) {
            bVar.n((f4) ((z2) l5Var));
            return bVar.r();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
