package com.coremedia.iso.boxes.fragment;

import java.nio.ByteBuffer;

public class a {
    private byte a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private boolean g;
    private int h;

    public a() {
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) (((long) (this.a << 28)) | 0 | ((long) (this.b << 26)) | ((long) (this.c << 24)) | ((long) (this.d << 22)) | ((long) (this.e << 20)) | ((long) (this.f << 17)) | ((long) ((this.g ? 1 : 0) << 16)) | ((long) this.h)));
    }

    public boolean b() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.a == aVar.a && this.h == aVar.h && this.c == aVar.c && this.e == aVar.e && this.d == aVar.d && this.g == aVar.g && this.f == aVar.f;
    }

    public int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31) + this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SampleFlags{reserved=");
        sb.append((int) this.a);
        sb.append(", isLeading=");
        sb.append((int) this.b);
        sb.append(", depOn=");
        sb.append((int) this.c);
        sb.append(", isDepOn=");
        sb.append((int) this.d);
        sb.append(", hasRedundancy=");
        sb.append((int) this.e);
        sb.append(", padValue=");
        sb.append((int) this.f);
        sb.append(", isDiffSample=");
        sb.append(this.g);
        sb.append(", degradPrio=");
        return je.A0(sb, this.h, '}');
    }

    public a(ByteBuffer byteBuffer) {
        long n = h7.n(byteBuffer);
        this.a = (byte) ((int) ((-268435456 & n) >> 28));
        this.b = (byte) ((int) ((201326592 & n) >> 26));
        this.c = (byte) ((int) ((50331648 & n) >> 24));
        this.d = (byte) ((int) ((12582912 & n) >> 22));
        this.e = (byte) ((int) ((3145728 & n) >> 20));
        this.f = (byte) ((int) ((917504 & n) >> 17));
        this.g = ((65536 & n) >> 16) > 0;
        this.h = (int) (n & 65535);
    }
}
