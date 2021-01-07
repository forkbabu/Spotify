package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

final class r extends q {
    private int[] i;
    private int[] j;

    r() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                k.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.q
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.a.e;
        }
        if (aVar.c == 2) {
            boolean z = aVar.b != iArr.length;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < aVar.b) {
                    z |= i3 != i2;
                    i2++;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            return z ? new AudioProcessor.a(aVar.a, iArr.length, 2) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void h() {
        this.j = this.i;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.q
    public void j() {
        this.j = null;
        this.i = null;
    }

    public void l(int[] iArr) {
        this.i = iArr;
    }
}
