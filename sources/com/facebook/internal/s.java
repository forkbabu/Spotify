package com.facebook.internal;

import android.content.Context;
import android.net.Uri;

public class s {
    private Context a;
    private Uri b;
    private c c;
    private boolean d;
    private Object e;

    public static class b {
        private Context a;
        private Uri b;
        private c c;
        private boolean d;
        private Object e;

        public b(Context context, Uri uri) {
            h0.f(uri, "imageUri");
            this.a = context;
            this.b = uri;
        }

        public s f() {
            return new s(this, null);
        }

        public b g(boolean z) {
            this.d = z;
            return this;
        }

        public b h(c cVar) {
            this.c = cVar;
            return this;
        }

        public b i(Object obj) {
            this.e = obj;
            return this;
        }
    }

    public interface c {
        void a(t tVar);
    }

    s(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e == null ? new Object() : bVar.e;
    }

    public c a() {
        return this.c;
    }

    public Object b() {
        return this.e;
    }

    public Context c() {
        return this.a;
    }

    public Uri d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }
}
