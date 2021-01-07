package com.spotify.core.jni;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public final class NativeHelpers {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    protected NativeHelpers() {
        throw new UnsupportedOperationException("This class should not be directly instantiated");
    }

    public static Map<String, String> byteArrayToMap(byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr == null) {
            return hashMap;
        }
        int i = 0;
        while (i < bArr.length) {
            int nextNull = nextNull(bArr, i);
            Charset charset = UTF_8;
            String str = new String(bArr, i, nextNull - i, charset);
            int i2 = nextNull + 1;
            int nextNull2 = nextNull(bArr, i2);
            i = nextNull2 + 1;
            hashMap.put(str, new String(bArr, i2, nextNull2 - i2, charset));
        }
        return hashMap;
    }

    public static byte[] mapToByteArray(Map<String, String> map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writeStringToStream(byteArrayOutputStream, entry.getKey());
                writeStringToStream(byteArrayOutputStream, entry.getValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int nextNull(byte[] bArr, int i) {
        while (bArr[i] != 0) {
            try {
                i++;
            } catch (Exception unused) {
                throw new IndexOutOfBoundsException(je.p0("Invalid character found at offset ", i));
            }
        }
        return i;
    }

    private static void writeStringToStream(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byteArrayOutputStream.write(str.getBytes(UTF_8));
        byteArrayOutputStream.write(0);
    }
}
