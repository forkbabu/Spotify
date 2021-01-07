package com.squareup.picasso;

import android.graphics.Bitmap;
import android.util.LruCache;

public final class t implements f {
    final LruCache<String, b> a;

    class a extends LruCache<String, b> {
        a(t tVar, int i) {
            super(i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        final Bitmap a;
        final int b;

        b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public t(int i) {
        this.a = new a(this, i);
    }

    @Override // com.squareup.picasso.f
    public int a() {
        return this.a.maxSize();
    }

    @Override // com.squareup.picasso.f
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int c = j0.c(bitmap);
        if (c > a()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new b(bitmap, c));
        }
    }

    @Override // com.squareup.picasso.f
    public void c(String str) {
        for (String str2 : this.a.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.a.remove(str2);
            }
        }
    }

    @Override // com.squareup.picasso.f
    public Bitmap get(String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // com.squareup.picasso.f
    public int size() {
        return this.a.size();
    }
}
