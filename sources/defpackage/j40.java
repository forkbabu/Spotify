package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@l40(tags = {4})
/* renamed from: j40  reason: default package */
public class j40 extends g40 {
    private static Logger n = Logger.getLogger(j40.class.getName());
    int d;
    int e;
    int f;
    int g;
    long h;
    long i;
    k40 j;
    f40 k;
    List<r40> l = new ArrayList();
    byte[] m;

    public j40() {
        this.a = 4;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        f40 f40 = this.k;
        int i2 = 0;
        int b = (f40 == null ? 0 : f40.b()) + 13;
        k40 k40 = this.j;
        if (k40 != null) {
            i2 = k40.b();
        }
        int i3 = b + i2;
        for (r40 r40 : this.l) {
            i3 += r40.b();
        }
        return i3;
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.d = i2;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        this.e = i3 >>> 2;
        this.f = (i3 >> 1) & 1;
        this.g = h7.m(byteBuffer);
        this.h = h7.n(byteBuffer);
        this.i = h7.n(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            g40 a = q40.a(this.d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = n;
            logger.finer(a + " - DecoderConfigDescr1 read: " + position2 + ", size: " + Integer.valueOf(a.b()));
            int b = a.b();
            if (position2 < b) {
                byte[] bArr = new byte[(b - position2)];
                this.m = bArr;
                byteBuffer.get(bArr);
            }
            if (a instanceof k40) {
                this.j = (k40) a;
            } else if (a instanceof f40) {
                this.k = (f40) a;
            } else if (a instanceof r40) {
                this.l.add((r40) a);
            }
        }
    }

    public f40 g() {
        return this.k;
    }

    public long h() {
        return this.i;
    }

    public k40 i() {
        return this.j;
    }

    public long j() {
        return this.h;
    }

    public int k() {
        return this.d;
    }

    public List<r40> l() {
        return this.l;
    }

    public int m() {
        return this.e;
    }

    public int n() {
        return this.f;
    }

    public void o(long j2) {
        this.i = j2;
    }

    public void p(long j2) {
        this.h = j2;
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("DecoderConfigDescriptor", "{objectTypeIndication=");
        Z0.append(this.d);
        Z0.append(", streamType=");
        Z0.append(this.e);
        Z0.append(", upStream=");
        Z0.append(this.f);
        Z0.append(", bufferSizeDB=");
        Z0.append(this.g);
        Z0.append(", maxBitRate=");
        Z0.append(this.h);
        Z0.append(", avgBitRate=");
        Z0.append(this.i);
        Z0.append(", decoderSpecificInfo=");
        Z0.append(this.j);
        Z0.append(", audioSpecificInfo=");
        Z0.append(this.k);
        Z0.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        Z0.append(me.a(bArr));
        Z0.append(", profileLevelIndicationDescriptors=");
        List<r40> list = this.l;
        return je.H0(Z0, list == null ? "null" : Arrays.asList(list).toString(), '}');
    }
}
