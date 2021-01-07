package com.mp4parser.iso14496.part15;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class a {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public List<byte[]> f;
    public List<byte[]> g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public List<byte[]> l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public a() {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = new ArrayList();
        this.m = 63;
        this.n = 7;
        this.o = 31;
        this.p = 31;
        this.q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.a & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.b & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.c & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.d & BitmapRenderer.ALPHA_VISIBLE));
        i40 i40 = new i40(byteBuffer);
        i40.a(this.m, 6);
        i40.a(this.e, 2);
        i40.a(this.n, 3);
        i40.a(this.g.size(), 5);
        for (byte[] bArr : this.f) {
            pe.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (this.g.size() & BitmapRenderer.ALPHA_VISIBLE));
        for (byte[] bArr2 : this.g) {
            pe.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.h) {
            int i2 = this.b;
            if (i2 == 100 || i2 == 110 || i2 == 122 || i2 == 144) {
                i40 i402 = new i40(byteBuffer);
                i402.a(this.o, 6);
                i402.a(this.i, 2);
                i402.a(this.p, 5);
                i402.a(this.j, 3);
                i402.a(this.q, 5);
                i402.a(this.k, 3);
                for (byte[] bArr3 : this.l) {
                    pe.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i2;
        long j2 = 6;
        for (byte[] bArr : this.f) {
            j2 = j2 + 2 + ((long) bArr.length);
        }
        long j3 = j2 + 1;
        for (byte[] bArr2 : this.g) {
            j3 = j3 + 2 + ((long) bArr2.length);
        }
        if (this.h && ((i2 = this.b) == 100 || i2 == 110 || i2 == 122 || i2 == 144)) {
            j3 += 4;
            for (byte[] bArr3 : this.l) {
                j3 = j3 + 2 + ((long) bArr3.length);
            }
        }
        return j3;
    }

    public String[] c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.g) {
            try {
                arrayList.add(a50.a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList(this.g.size());
        for (byte[] bArr : this.g) {
            arrayList.add(me.a(bArr));
        }
        return arrayList;
    }

    public String[] e() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f) {
            try {
                str = d50.a(new e40(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                str = "not parsable";
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> f() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (byte[] bArr : this.f) {
            arrayList.add(me.a(bArr));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvcDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.a);
        sb.append(", avcProfileIndication=");
        sb.append(this.b);
        sb.append(", profileCompatibility=");
        sb.append(this.c);
        sb.append(", avcLevelIndication=");
        sb.append(this.d);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.e);
        sb.append(", hasExts=");
        sb.append(this.h);
        sb.append(", chromaFormat=");
        sb.append(this.i);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.j);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.k);
        sb.append(", lengthSizeMinusOnePaddingBits=");
        sb.append(this.m);
        sb.append(", numberOfSequenceParameterSetsPaddingBits=");
        sb.append(this.n);
        sb.append(", chromaFormatPaddingBits=");
        sb.append(this.o);
        sb.append(", bitDepthLumaMinus8PaddingBits=");
        sb.append(this.p);
        sb.append(", bitDepthChromaMinus8PaddingBits=");
        return je.A0(sb, this.q, '}');
    }

    public a(ByteBuffer byteBuffer) {
        int i2;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = new ArrayList();
        this.m = 63;
        this.n = 7;
        this.o = 31;
        this.p = 31;
        this.q = 31;
        int i3 = byteBuffer.get();
        this.a = i3 < 0 ? i3 + 256 : i3;
        int i4 = byteBuffer.get();
        this.b = i4 < 0 ? i4 + 256 : i4;
        int i5 = byteBuffer.get();
        this.c = i5 < 0 ? i5 + 256 : i5;
        int i6 = byteBuffer.get();
        this.d = i6 < 0 ? i6 + 256 : i6;
        h40 h40 = new h40(byteBuffer);
        this.m = h40.a(6);
        this.e = h40.a(2);
        this.n = h40.a(3);
        int a2 = h40.a(5);
        for (int i7 = 0; i7 < a2; i7++) {
            byte[] bArr = new byte[h7.l(byteBuffer)];
            byteBuffer.get(bArr);
            this.f.add(bArr);
        }
        int i8 = byteBuffer.get();
        long j2 = (long) (i8 < 0 ? i8 + 256 : i8);
        for (int i9 = 0; ((long) i9) < j2; i9++) {
            byte[] bArr2 = new byte[h7.l(byteBuffer)];
            byteBuffer.get(bArr2);
            this.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.h = false;
        }
        if (!this.h || !((i2 = this.b) == 100 || i2 == 110 || i2 == 122 || i2 == 144)) {
            this.i = -1;
            this.j = -1;
            this.k = -1;
            return;
        }
        h40 h402 = new h40(byteBuffer);
        this.o = h402.a(6);
        this.i = h402.a(2);
        this.p = h402.a(5);
        this.j = h402.a(3);
        this.q = h402.a(5);
        this.k = h402.a(3);
        int i10 = byteBuffer.get();
        long j3 = (long) (i10 < 0 ? i10 + 256 : i10);
        for (int i11 = 0; ((long) i11) < j3; i11++) {
            byte[] bArr3 = new byte[h7.l(byteBuffer)];
            byteBuffer.get(bArr3);
            this.l.add(bArr3);
        }
    }
}
