package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.il;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: hl  reason: default package */
final class hl extends il {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean n;

    hl() {
    }

    private void j(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean k(v vVar) {
        int a = vVar.a();
        byte[] bArr = o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        vVar.g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public long e(v vVar) {
        byte[] bArr = vVar.a;
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (!(i2 == 1 || i2 == 2)) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return b(((long) i3) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5)));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public boolean g(v vVar, long j, il.b bVar) {
        boolean z = true;
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(vVar.a, vVar.c());
            int i = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            j(arrayList, ((copyOf[11] & BitmapRenderer.ALPHA_VISIBLE) << 8) | (copyOf[10] & BitmapRenderer.ALPHA_VISIBLE));
            j(arrayList, 3840);
            bVar.a = d0.o(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.n = true;
            return true;
        }
        if (vVar.h() != 1332770163) {
            z = false;
        }
        vVar.K(0);
        return z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public void h(boolean z) {
        super.h(z);
        if (z) {
            this.n = false;
        }
    }
}
