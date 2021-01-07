package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.util.g;
import java.util.Arrays;

public final class a {
    public static final a e = new a(new long[0]);
    public final int a;
    public final long[] b;
    public final C0088a[] c;
    public final long d;

    /* renamed from: com.google.android.exoplayer2.source.ads.a$a  reason: collision with other inner class name */
    public static final class C0088a {
        public final int a = -1;
        public final Uri[] b = new Uri[0];
        public final int[] c = new int[0];
        public final long[] d = new long[0];

        public C0088a() {
            g.a(true);
        }

        public int a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        public boolean b() {
            return this.a == -1 || a(-1) < this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0088a.class != obj.getClass()) {
                return false;
            }
            C0088a aVar = (C0088a) obj;
            if (this.a != aVar.a || !Arrays.equals(this.b, aVar.b) || !Arrays.equals(this.c, aVar.c) || !Arrays.equals(this.d, aVar.d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.c);
            return Arrays.hashCode(this.d) + ((hashCode + (((this.a * 31) + Arrays.hashCode(this.b)) * 31)) * 31);
        }
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.a = length;
        this.b = Arrays.copyOf(jArr, length);
        this.c = new C0088a[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = new C0088a();
        }
        this.d = -9223372036854775807L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a || this.d != aVar.d || !Arrays.equals(this.b, aVar.b) || !Arrays.equals(this.c, aVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + ((hashCode + (((((this.a * 31) + ((int) 0)) * 31) + ((int) this.d)) * 31)) * 31);
    }
}
