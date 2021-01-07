package com.squareup.picasso;

import java.io.PrintWriter;

public class e0 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    public final long n;

    public e0(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
        this.j = j9;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = j10;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.b) / ((float) this.a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StatsSnapshot{maxSize=");
        V0.append(this.a);
        V0.append(", size=");
        V0.append(this.b);
        V0.append(", cacheHits=");
        V0.append(this.c);
        V0.append(", cacheMisses=");
        V0.append(this.d);
        V0.append(", downloadCount=");
        V0.append(this.k);
        V0.append(", totalDownloadSize=");
        V0.append(this.e);
        V0.append(", averageDownloadSize=");
        V0.append(this.h);
        V0.append(", totalOriginalBitmapSize=");
        V0.append(this.f);
        V0.append(", totalTransformedBitmapSize=");
        V0.append(this.g);
        V0.append(", averageOriginalBitmapSize=");
        V0.append(this.i);
        V0.append(", averageTransformedBitmapSize=");
        V0.append(this.j);
        V0.append(", originalBitmapCount=");
        V0.append(this.l);
        V0.append(", transformedBitmapCount=");
        V0.append(this.m);
        V0.append(", timeStamp=");
        return je.D0(V0, this.n, '}');
    }
}
