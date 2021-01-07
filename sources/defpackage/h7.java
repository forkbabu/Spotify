package defpackage;

import android.database.Cursor;
import com.adjust.sdk.Constants;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: h7  reason: default package */
public final class h7 {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    public static int c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndex("`" + str + "`");
    }

    public static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static String e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static double g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static float h(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((float) ((short) (((short) (0 | ((bArr[0] << 8) & 65280))) | (bArr[1] & 255)))) / 256.0f;
    }

    public static String i(ByteBuffer byteBuffer) {
        int l = l(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((l >> ((2 - i) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    public static String j(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == 0) {
                return a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    public static String k(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return a(bArr);
    }

    public static int l(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        int i2 = (i << 8) + 0;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        return i2 + i3;
    }

    public static int m(ByteBuffer byteBuffer) {
        int l = (l(byteBuffer) << 8) + 0;
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        return l + i;
    }

    public static long n(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long o(ByteBuffer byteBuffer) {
        long l = ((long) l(byteBuffer)) << 32;
        if (l >= 0) {
            return n(byteBuffer) + l;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static long p(ByteBuffer byteBuffer) {
        long n = (n(byteBuffer) << 32) + 0;
        if (n >= 0) {
            return n(byteBuffer) + n;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(Constants.ENCODING).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static void r(long j, ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            byteBuffer.put((byte) (((int) (j & 255)) & BitmapRenderer.ALPHA_VISIBLE));
        } else if (i == 2) {
            pe.e(byteBuffer, (int) (j & 65535));
        } else if (i == 3) {
            pe.f(byteBuffer, (int) (j & 16777215));
        } else if (i == 4) {
            byteBuffer.putInt((int) j);
        } else if (i == 8) {
            byteBuffer.putLong(j);
        } else {
            throw new RuntimeException("I don't know how to read " + i + " bytes");
        }
    }
}
