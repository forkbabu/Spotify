package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.boxes.mp4.samplegrouping.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;

public class e extends b {
    int a;
    int b;
    boolean c;
    int d;
    long e;
    long f;
    int g;
    int h;
    int i;
    int j;
    int k;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        pe.h(allocate, this.a);
        pe.h(allocate, (this.b << 6) + (this.c ? 32 : 0) + this.d);
        allocate.putInt((int) this.e);
        pe.g(allocate, this.f);
        allocate.put((byte) (this.g & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(allocate, this.h);
        pe.e(allocate, this.i);
        allocate.put((byte) (this.j & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(allocate, this.k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return "tscl";
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.a = i2;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        this.b = (i3 & 192) >> 6;
        this.c = (i3 & 32) > 0;
        this.d = i3 & 31;
        this.e = h7.n(byteBuffer);
        this.f = h7.o(byteBuffer);
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        this.g = i4;
        this.h = h7.l(byteBuffer);
        this.i = h7.l(byteBuffer);
        int i5 = byteBuffer.get();
        if (i5 < 0) {
            i5 += 256;
        }
        this.j = i5;
        this.k = h7.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public int d() {
        return 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.i == eVar.i && this.k == eVar.k && this.j == eVar.j && this.h == eVar.h && this.f == eVar.f && this.g == eVar.g && this.e == eVar.e && this.d == eVar.d && this.b == eVar.b && this.c == eVar.c;
    }

    public int hashCode() {
        long j2 = this.e;
        long j3 = this.f;
        return (((((((((((((((((((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(this.a);
        sb.append(", tlprofile_space=");
        sb.append(this.b);
        sb.append(", tltier_flag=");
        sb.append(this.c);
        sb.append(", tlprofile_idc=");
        sb.append(this.d);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(this.e);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(this.f);
        sb.append(", tllevel_idc=");
        sb.append(this.g);
        sb.append(", tlMaxBitRate=");
        sb.append(this.h);
        sb.append(", tlAvgBitRate=");
        sb.append(this.i);
        sb.append(", tlConstantFrameRate=");
        sb.append(this.j);
        sb.append(", tlAvgFrameRate=");
        return je.A0(sb, this.k, '}');
    }
}
