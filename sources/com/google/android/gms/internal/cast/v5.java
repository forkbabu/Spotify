package com.google.android.gms.internal.cast;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.cast.r5;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class v5 {
    static final Charset a = Charset.forName(Constants.ENCODING);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            new f5(bArr, length).a(length);
        } catch (zzmo e) {
            throw new IllegalArgumentException(e);
        }
    }

    static Object a(Object obj, Object obj2) {
        z6 z6Var = (z6) obj2;
        s4 s4Var = (s4) ((z6) obj).b();
        s4Var.getClass();
        r5.b bVar = (r5.b) s4Var;
        if (bVar.c().getClass().isInstance(z6Var)) {
            bVar.j((r5) ((q4) z6Var));
            return bVar.m();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
