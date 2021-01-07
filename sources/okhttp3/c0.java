package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import okio.f;
import okio.o;

public abstract class c0 {

    class a extends c0 {
        final /* synthetic */ w a;
        final /* synthetic */ File b;

        a(w wVar, File file) {
            this.a = wVar;
            this.b = file;
        }

        @Override // okhttp3.c0
        public long a() {
            return this.b.length();
        }

        @Override // okhttp3.c0
        public w b() {
            return this.a;
        }

        @Override // okhttp3.c0
        public void f(f fVar) {
            Closeable closeable = null;
            try {
                File file = this.b;
                int i = o.b;
                if (file != null) {
                    closeable = o.i(new FileInputStream(file));
                    fVar.n0(closeable);
                    return;
                }
                throw new IllegalArgumentException("file == null");
            } finally {
                rnf.g(closeable);
            }
        }
    }

    public static c0 c(w wVar, File file) {
        if (file != null) {
            return new a(wVar, file);
        }
        throw new NullPointerException("file == null");
    }

    public static c0 d(w wVar, String str) {
        Charset charset = rnf.i;
        if (wVar != null) {
            Charset a2 = wVar.a();
            if (a2 == null) {
                wVar = w.d(wVar + "; charset=utf-8");
            } else {
                charset = a2;
            }
        }
        return e(wVar, str.getBytes(charset));
    }

    public static c0 e(w wVar, byte[] bArr) {
        int length = bArr.length;
        rnf.f((long) bArr.length, (long) 0, (long) length);
        return new b0(wVar, length, bArr, 0);
    }

    public long a() {
        return -1;
    }

    public abstract w b();

    public abstract void f(f fVar);
}
