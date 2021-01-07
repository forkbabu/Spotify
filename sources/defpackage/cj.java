package defpackage;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.f0;

/* renamed from: cj  reason: default package */
public final class cj {
    public byte[] a;
    public int[] b;
    public int[] c;
    private final MediaCodec.CryptoInfo d;
    private final b e;

    /* renamed from: cj$b */
    private static final class b {
        private final MediaCodec.CryptoInfo a;
        private final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.a = cryptoInfo;
        }

        static void a(b bVar, int i, int i2) {
            bVar.b.set(i, i2);
            bVar.a.setPattern(bVar.b);
        }
    }

    public cj() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.d = cryptoInfo;
        this.e = f0.a >= 24 ? new b(cryptoInfo, null) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.d;
    }

    public void b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.b = iArr;
        this.c = iArr2;
        this.a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.d;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (f0.a >= 24) {
            b.a(this.e, i3, i4);
        }
    }
}
