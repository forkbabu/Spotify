package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@l40(tags = {3})
/* renamed from: m40  reason: default package */
public class m40 extends g40 {
    int d;
    int e;
    int f;
    int g;
    int h;
    int i = 0;
    String j;
    int k;
    int l;
    j40 m;
    s40 n;
    List<g40> o = new ArrayList();

    static {
        Logger.getLogger(m40.class.getName());
    }

    public m40() {
        this.a = 3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        int i2 = this.e > 0 ? 5 : 3;
        if (this.f > 0) {
            i2 += this.i + 1;
        }
        if (this.g > 0) {
            i2 += 2;
        }
        int b = this.n.b() + this.m.b() + i2;
        if (this.o.size() <= 0) {
            return b;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        this.d = h7.l(byteBuffer);
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = i2 >>> 7;
        this.e = i3;
        this.f = (i2 >>> 6) & 1;
        this.g = (i2 >>> 5) & 1;
        this.h = i2 & 31;
        if (i3 == 1) {
            this.k = h7.l(byteBuffer);
        }
        if (this.f == 1) {
            int i4 = byteBuffer.get();
            if (i4 < 0) {
                i4 += 256;
            }
            this.i = i4;
            this.j = h7.k(byteBuffer, i4);
        }
        if (this.g == 1) {
            this.l = h7.l(byteBuffer);
        }
        while (byteBuffer.remaining() > 1) {
            g40 a = q40.a(-1, byteBuffer);
            if (a instanceof j40) {
                this.m = (j40) a;
            } else if (a instanceof s40) {
                this.n = (s40) a;
            } else {
                this.o.add(a);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m40.class != obj.getClass()) {
            return false;
        }
        m40 m40 = (m40) obj;
        if (this.f != m40.f || this.i != m40.i || this.k != m40.k || this.d != m40.d || this.l != m40.l || this.g != m40.g || this.e != m40.e || this.h != m40.h) {
            return false;
        }
        String str = this.j;
        if (str == null ? m40.j != null : !str.equals(m40.j)) {
            return false;
        }
        j40 j40 = this.m;
        if (j40 == null ? m40.m != null : !j40.equals(m40.m)) {
            return false;
        }
        List<g40> list = this.o;
        if (list == null ? m40.o != null : !list.equals(m40.o)) {
            return false;
        }
        s40 s40 = this.n;
        s40 s402 = m40.n;
        return s40 == null ? s402 == null : s40.equals(s402);
    }

    public j40 g() {
        return this.m;
    }

    public int h() {
        return this.k;
    }

    public int hashCode() {
        int i2 = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int i3 = 0;
        int hashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + 0) * 31) + this.k) * 31) + this.l) * 31;
        j40 j40 = this.m;
        int hashCode2 = (hashCode + (j40 != null ? j40.hashCode() : 0)) * 31;
        s40 s40 = this.n;
        int i4 = (hashCode2 + (s40 != null ? s40.d : 0)) * 31;
        List<g40> list = this.o;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i4 + i3;
    }

    public int i() {
        return this.d;
    }

    public List<g40> j() {
        return this.o;
    }

    public s40 k() {
        return this.n;
    }

    public int l() {
        return this.e;
    }

    public int m() {
        return this.f;
    }

    public String n() {
        return this.j;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.g;
    }

    public ByteBuffer q() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[b()]);
        pe.h(wrap, 3);
        f(wrap, a());
        pe.e(wrap, this.d);
        wrap.put((byte) (((this.e << 7) | (this.f << 6) | (this.g << 5) | (this.h & 31)) & BitmapRenderer.ALPHA_VISIBLE));
        if (this.e > 0) {
            pe.e(wrap, this.k);
        }
        if (this.f > 0) {
            wrap.put((byte) (this.i & BitmapRenderer.ALPHA_VISIBLE));
            pe.i(wrap, this.j);
        }
        if (this.g > 0) {
            pe.e(wrap, this.l);
        }
        j40 j40 = this.m;
        ByteBuffer allocate = ByteBuffer.allocate(j40.b());
        pe.h(allocate, j40.a);
        j40.f(allocate, j40.a());
        allocate.put((byte) (j40.d & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (((j40.e << 2) | (j40.f << 1) | 1) & BitmapRenderer.ALPHA_VISIBLE));
        pe.f(allocate, j40.g);
        allocate.putInt((int) j40.h);
        allocate.putInt((int) j40.i);
        k40 k40 = j40.j;
        if (k40 != null) {
            ByteBuffer allocate2 = ByteBuffer.allocate(k40.b());
            pe.h(allocate2, k40.a);
            k40.f(allocate2, k40.d.length);
            allocate2.put(k40.d);
            allocate.put((ByteBuffer) allocate2.rewind());
        }
        f40 f40 = j40.k;
        if (f40 != null) {
            allocate.put(f40.h());
        }
        for (r40 r40 : j40.l) {
            ByteBuffer allocate3 = ByteBuffer.allocate(r40.b());
            pe.h(allocate3, 20);
            r40.f(allocate3, 1);
            allocate3.put((byte) (r40.d & BitmapRenderer.ALPHA_VISIBLE));
            allocate.put(allocate3);
        }
        s40 s40 = this.n;
        ByteBuffer allocate4 = ByteBuffer.allocate(s40.b());
        pe.h(allocate4, 6);
        s40.f(allocate4, 1);
        allocate4.put((byte) (s40.d & BitmapRenderer.ALPHA_VISIBLE));
        wrap.put(((ByteBuffer) allocate.rewind()).array());
        wrap.put(allocate4.array());
        return wrap;
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("ESDescriptor", "{esId=");
        Z0.append(this.d);
        Z0.append(", streamDependenceFlag=");
        Z0.append(this.e);
        Z0.append(", URLFlag=");
        Z0.append(this.f);
        Z0.append(", oCRstreamFlag=");
        Z0.append(this.g);
        Z0.append(", streamPriority=");
        Z0.append(this.h);
        Z0.append(", URLLength=");
        Z0.append(this.i);
        Z0.append(", URLString='");
        Z0.append(this.j);
        Z0.append('\'');
        Z0.append(", remoteODFlag=");
        Z0.append(0);
        Z0.append(", dependsOnEsId=");
        Z0.append(this.k);
        Z0.append(", oCREsId=");
        Z0.append(this.l);
        Z0.append(", decoderConfigDescriptor=");
        Z0.append(this.m);
        Z0.append(", slConfigDescriptor=");
        Z0.append(this.n);
        Z0.append('}');
        return Z0.toString();
    }
}
