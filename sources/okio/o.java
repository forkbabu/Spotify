package okio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class o {
    static final Logger a = Logger.getLogger(o.class.getName());
    public static final /* synthetic */ int b = 0;

    /* access modifiers changed from: package-private */
    public class a implements v {
        final /* synthetic */ x a;
        final /* synthetic */ OutputStream b;

        a(x xVar, OutputStream outputStream) {
            this.a = xVar;
            this.b = outputStream;
        }

        @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // okio.v, java.io.Flushable
        public void flush() {
            this.b.flush();
        }

        @Override // okio.v
        public x k() {
            return this.a;
        }

        @Override // okio.v
        public void l0(e eVar, long j) {
            y.b(eVar.b, 0, j);
            while (j > 0) {
                this.a.f();
                t tVar = eVar.a;
                int min = (int) Math.min(j, (long) (tVar.c - tVar.b));
                this.b.write(tVar.a, tVar.b, min);
                int i = tVar.b + min;
                tVar.b = i;
                long j2 = (long) min;
                j -= j2;
                eVar.b -= j2;
                if (i == tVar.c) {
                    eVar.a = tVar.a();
                    u.a(tVar);
                }
            }
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("sink(");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements w {
        final /* synthetic */ x a;
        final /* synthetic */ InputStream b;

        b(x xVar, InputStream inputStream) {
            this.a = xVar;
            this.b = inputStream;
        }

        @Override // okio.w
        public long c2(e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.a.f();
                    t D = eVar.D(1);
                    int read = this.b.read(D.a, D.c, (int) Math.min(j, (long) (8192 - D.c)));
                    if (read != -1) {
                        D.c += read;
                        long j2 = (long) read;
                        eVar.b += j2;
                        return j2;
                    } else if (D.b != D.c) {
                        return -1;
                    } else {
                        eVar.a = D.a();
                        u.a(D);
                        return -1;
                    }
                } catch (AssertionError e) {
                    if (o.e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // okio.w
        public x k() {
            return this.a;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("source(");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    class c implements v {
        c() {
        }

        @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.v, java.io.Flushable
        public void flush() {
        }

        @Override // okio.v
        public x k() {
            return x.d;
        }

        @Override // okio.v
        public void l0(e eVar, long j) {
            eVar.skip(j);
        }
    }

    private o() {
    }

    public static v a(File file) {
        if (file != null) {
            return g(new FileOutputStream(file, true), new x());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static v b() {
        return new c();
    }

    public static f c(v vVar) {
        return new r(vVar);
    }

    public static g d(w wVar) {
        return new s(wVar);
    }

    static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static v f(File file) {
        if (file != null) {
            return g(new FileOutputStream(file), new x());
        }
        throw new IllegalArgumentException("file == null");
    }

    private static v g(OutputStream outputStream, x xVar) {
        if (outputStream != null) {
            return new a(xVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static v h(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            p pVar = new p(socket);
            return new a(pVar, g(socket.getOutputStream(), pVar));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static w i(InputStream inputStream) {
        return j(inputStream, new x());
    }

    private static w j(InputStream inputStream, x xVar) {
        if (inputStream != null) {
            return new b(xVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static w k(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            p pVar = new p(socket);
            return new b(pVar, j(socket.getInputStream(), pVar));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
