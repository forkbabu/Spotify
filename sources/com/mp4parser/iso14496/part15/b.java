package com.mp4parser.iso14496.part15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class b {
    boolean A;
    int a;
    int b;
    boolean c;
    int d;
    long e;
    long f;
    int g;
    int h = 15;
    int i;
    int j = 63;
    int k;
    int l = 63;
    int m;
    int n = 31;
    int o;
    int p = 31;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    int v;
    List<a> w = new ArrayList();
    boolean x;
    boolean y;
    boolean z;

    public static class a {
        public boolean a;
        public boolean b;
        public int c;
        public List<byte[]> d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.c != aVar.c || this.b != aVar.b) {
                return false;
            }
            ListIterator<byte[]> listIterator = this.d.listIterator();
            ListIterator<byte[]> listIterator2 = aVar.d.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                byte[] next = listIterator.next();
                byte[] next2 = listIterator2.next();
                if (next == null) {
                    if (next2 != null) {
                    }
                } else if (!Arrays.equals(next, next2)) {
                }
                return false;
            }
            if (listIterator.hasNext() || listIterator2.hasNext()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
            List<byte[]> list = this.d;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.c + ", reserved=" + this.b + ", array_completeness=" + this.a + ", num_nals=" + this.d.size() + '}';
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.r != bVar.r || this.q != bVar.q || this.o != bVar.o || this.m != bVar.m || this.a != bVar.a || this.s != bVar.s || this.f != bVar.f || this.g != bVar.g || this.e != bVar.e || this.d != bVar.d || this.b != bVar.b || this.c != bVar.c || this.v != bVar.v || this.i != bVar.i || this.t != bVar.t || this.k != bVar.k || this.h != bVar.h || this.j != bVar.j || this.l != bVar.l || this.n != bVar.n || this.p != bVar.p || this.u != bVar.u) {
            return false;
        }
        List<a> list = this.w;
        List<a> list2 = bVar.w;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        long j2 = this.e;
        long j3 = this.f;
        int i2 = ((((((((((((((((((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + this.v) * 31;
        List<a> list = this.w;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.a);
        sb.append(", general_profile_space=");
        sb.append(this.b);
        sb.append(", general_tier_flag=");
        sb.append(this.c);
        sb.append(", general_profile_idc=");
        sb.append(this.d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f);
        sb.append(", general_level_idc=");
        sb.append(this.g);
        String str5 = "";
        if (this.h != 15) {
            str = ", reserved1=" + this.h;
        } else {
            str = str5;
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.i);
        if (this.j != 63) {
            str2 = ", reserved2=" + this.j;
        } else {
            str2 = str5;
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.k);
        if (this.l != 63) {
            str3 = ", reserved3=" + this.l;
        } else {
            str3 = str5;
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.m);
        if (this.n != 31) {
            str4 = ", reserved4=" + this.n;
        } else {
            str4 = str5;
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.o);
        if (this.p != 31) {
            str5 = ", reserved5=" + this.p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.q);
        sb.append(", avgFrameRate=");
        sb.append(this.r);
        sb.append(", constantFrameRate=");
        sb.append(this.s);
        sb.append(", numTemporalLayers=");
        sb.append(this.t);
        sb.append(", temporalIdNested=");
        sb.append(this.u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.v);
        sb.append(", arrays=");
        sb.append(this.w);
        sb.append('}');
        return sb.toString();
    }
}
