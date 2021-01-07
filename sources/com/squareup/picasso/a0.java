package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import okio.w;

public abstract class a0 {
    static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, y yVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                d = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (yVar.j) {
                    i5 = Math.max(floor, floor2);
                } else {
                    i5 = Math.min(floor, floor2);
                }
            }
            i5 = (int) d;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    static void b(int i, int i2, BitmapFactory.Options options, y yVar) {
        a(i, i2, options.outWidth, options.outHeight, options, yVar);
    }

    static BitmapFactory.Options d(y yVar) {
        boolean a2 = yVar.a();
        boolean z = yVar.q != null;
        BitmapFactory.Options options = null;
        if (a2 || z || yVar.p) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a2;
            boolean z2 = yVar.p;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = yVar.q;
            }
        }
        return options;
    }

    public abstract boolean c(y yVar);

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(y yVar, int i);

    /* access modifiers changed from: package-private */
    public boolean g(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public static final class a {
        private final Picasso.LoadedFrom a;
        private final Bitmap b;
        private final w c;
        private final int d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this(bitmap, null, loadedFrom, 0);
            StringBuilder sb = j0.a;
        }

        public Bitmap a() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.d;
        }

        public Picasso.LoadedFrom c() {
            return this.a;
        }

        public w d() {
            return this.c;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(w wVar, Picasso.LoadedFrom loadedFrom) {
            this(null, wVar, loadedFrom, 0);
            StringBuilder sb = j0.a;
            if (wVar != null) {
                return;
            }
            throw new NullPointerException("source == null");
        }

        a(Bitmap bitmap, w wVar, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (wVar == null ? false : true)) {
                this.b = bitmap;
                this.c = wVar;
                StringBuilder sb = j0.a;
                if (loadedFrom != null) {
                    this.a = loadedFrom;
                    this.d = i;
                    return;
                }
                throw new NullPointerException("loadedFrom == null");
            }
            throw new AssertionError();
        }
    }
}
