package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.drm.l;
import java.util.Collections;
import java.util.List;

public final class f extends g {
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public final int j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final l n;
    public final List<a> o;
    public final long p;

    public static final class a implements Comparable<Long> {
        public final String a;
        public final a b;
        public final long c;
        public final int f;
        public final long n;
        public final l o;
        public final String p;
        public final String q;
        public final long r;
        public final long s;
        public final boolean t;

        public a(String str, a aVar, String str2, long j, int i, long j2, l lVar, String str3, String str4, long j3, long j4, boolean z) {
            this.a = str;
            this.b = aVar;
            this.c = j;
            this.f = i;
            this.n = j2;
            this.o = lVar;
            this.p = str3;
            this.q = str4;
            this.r = j3;
            this.s = j4;
            this.t = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            Long l2 = l;
            if (this.n > l2.longValue()) {
                return 1;
            }
            return this.n < l2.longValue() ? -1 : 0;
        }
    }

    public f(int i2, String str, List<String> list, long j2, long j3, boolean z, int i3, long j4, int i4, long j5, boolean z2, boolean z3, boolean z4, l lVar, List<a> list2) {
        super(str, list, z2);
        this.d = i2;
        this.f = j3;
        this.g = z;
        this.h = i3;
        this.i = j4;
        this.j = i4;
        this.k = j5;
        this.l = z3;
        this.m = z4;
        this.n = lVar;
        this.o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            a aVar = list2.get(list2.size() - 1);
            this.p = aVar.n + aVar.c;
        } else {
            this.p = 0;
        }
        this.e = j2 == -9223372036854775807L ? -9223372036854775807L : j2 >= 0 ? j2 : this.p + j2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.exoplayer2.offline.t
    public g a(List list) {
        return this;
    }
}
