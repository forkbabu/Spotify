package com.google.android.exoplayer2.audio;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.util.u;
import java.util.Arrays;

public final class s {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static d0 a(byte[] bArr, String str, String str2, l lVar) {
        u uVar;
        int i = 0;
        if (bArr[0] == Byte.MAX_VALUE) {
            uVar = new u(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            if (copyOf[0] == -2 || copyOf[0] == -1) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b2 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b2;
                }
            }
            uVar = new u(copyOf);
            if (copyOf[0] == 31) {
                u uVar2 = new u(copyOf);
                while (uVar2.b() >= 16) {
                    uVar2.o(2);
                    uVar.f(uVar2.h(14), 14);
                }
            }
            uVar.k(copyOf);
        }
        uVar.o(60);
        int i4 = a[uVar.h(6)];
        int i5 = b[uVar.h(4)];
        int h = uVar.h(5);
        int[] iArr = c;
        int i6 = h >= iArr.length ? -1 : (iArr[h] * Constants.ONE_SECOND) / 2;
        uVar.o(10);
        if (uVar.h(2) > 0) {
            i = 1;
        }
        return d0.o(str, "audio/vnd.dts", null, i6, -1, i4 + i, i5, null, null, 0, str2);
    }
}
