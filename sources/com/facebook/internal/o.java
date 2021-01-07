package com.facebook.internal;

import com.facebook.LoggingBehavior;
import com.facebook.k;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {
    static final String g = "o";
    private static final AtomicLong h = new AtomicLong();
    private final String a;
    private final f b;
    private final File c;
    private boolean d;
    private final Object e;
    private AtomicLong f = new AtomicLong(0);

    class a implements h {
        final /* synthetic */ long a;
        final /* synthetic */ File b;
        final /* synthetic */ String c;

        a(long j, File file, String str) {
            this.a = j;
            this.b = file;
            this.c = str;
        }

        public void a() {
            if (this.a < o.this.f.get()) {
                this.b.delete();
            } else {
                o.b(o.this, this.c, this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ File[] a;

        b(o oVar, File[] fileArr) {
            this.a = fileArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    for (File file : this.a) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private static class c {
        private static final FilenameFilter a = new a();
        private static final FilenameFilter b = new b();

        static class a implements FilenameFilter {
            a() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        }

        static class b implements FilenameFilter {
            b() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        }

        static void a(File file) {
            File[] listFiles = file.listFiles(b);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        static FilenameFilter b() {
            return a;
        }
    }

    private static class d extends OutputStream {
        final OutputStream a;
        final h b;

        d(OutputStream outputStream, h hVar) {
            this.a = outputStream;
            this.b = hVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.a.close();
            } finally {
                ((a) this.b).a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
        }
    }

    public static final class f {
    }

    private static final class g implements Comparable<g> {
        private final File a;
        private final long b;

        g(File file) {
            this.a = file;
            this.b = file.lastModified();
        }

        /* renamed from: d */
        public int compareTo(g gVar) {
            long j = this.b;
            long j2 = gVar.b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.a.compareTo(gVar.a);
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            return (obj instanceof g) && compareTo((g) obj) == 0;
        }

        /* access modifiers changed from: package-private */
        public File g() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public long h() {
            return this.b;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return ((this.a.hashCode() + 1073) * 37) + ((int) (this.b % 2147483647L));
        }
    }

    private interface h {
    }

    public o(String str, f fVar) {
        this.a = str;
        this.b = fVar;
        File file = new File(k.h(), str);
        this.c = file;
        this.e = new Object();
        if (file.mkdirs() || file.isDirectory()) {
            c.a(file);
        }
    }

    static void b(o oVar, String str, File file) {
        oVar.getClass();
        if (!file.renameTo(new File(oVar.c, f0.I(str)))) {
            file.delete();
        }
        synchronized (oVar.e) {
            if (!oVar.d) {
                oVar.d = true;
                k.l().execute(new p(oVar));
            }
        }
    }

    static void c(o oVar) {
        int i;
        long j;
        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
        synchronized (oVar.e) {
            oVar.d = false;
        }
        try {
            int i2 = y.e;
            k.v(loggingBehavior);
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = oVar.c.listFiles(c.b());
            long j2 = 0;
            if (listFiles != null) {
                j = 0;
                for (File file : listFiles) {
                    g gVar = new g(file);
                    priorityQueue.add(gVar);
                    String str = "  trim considering time=" + Long.valueOf(gVar.h()) + " name=" + gVar.g().getName();
                    k.v(loggingBehavior);
                    j2 += file.length();
                    j++;
                }
            } else {
                j = 0;
            }
            while (true) {
                oVar.b.getClass();
                if (j2 <= ((long) 1048576)) {
                    oVar.b.getClass();
                    if (j <= ((long) 1024)) {
                        synchronized (oVar.e) {
                            oVar.e.notifyAll();
                        }
                        return;
                    }
                }
                File g2 = ((g) priorityQueue.remove()).g();
                g2.getName();
                k.v(loggingBehavior);
                j2 -= g2.length();
                j--;
                g2.delete();
            }
        } catch (Throwable th) {
            synchronized (oVar.e) {
                oVar.e.notifyAll();
                throw th;
            }
        }
    }

    public void e() {
        File[] listFiles = this.c.listFiles(c.b());
        this.f.set(System.currentTimeMillis());
        if (listFiles != null) {
            k.l().execute(new b(this, listFiles));
        }
    }

    public InputStream f(String str, String str2) {
        File file = new File(this.c, f0.I(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject c2 = h.c(bufferedInputStream);
                if (c2 == null) {
                    return null;
                }
                String optString = c2.optString("key");
                if (optString == null || !optString.equals(str)) {
                    bufferedInputStream.close();
                    return null;
                }
                String optString2 = c2.optString("tag", null);
                if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                    long time = new Date().getTime();
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str3 = "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName();
                    int i = y.e;
                    k.v(loggingBehavior);
                    file.setLastModified(time);
                    return bufferedInputStream;
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public OutputStream g(String str, String str2) {
        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
        File file = this.c;
        StringBuilder V0 = je.V0("buffer");
        V0.append(Long.valueOf(h.incrementAndGet()).toString());
        File file2 = new File(file, V0.toString());
        file2.delete();
        if (file2.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new d(new FileOutputStream(file2), new a(System.currentTimeMillis(), file2, str)), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!f0.C(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    h.g(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    String str3 = "Error creating JSON header for cache file: " + e2;
                    int i = y.e;
                    k.v(loggingBehavior);
                    throw new IOException(e2.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                String str4 = "Error creating buffer output stream: " + e3;
                int i2 = y.e;
                k.v(loggingBehavior);
                throw new IOException(e3.getMessage());
            }
        } else {
            StringBuilder V02 = je.V0("Could not create file at ");
            V02.append(file2.getAbsolutePath());
            throw new IOException(V02.toString());
        }
    }

    public String toString() {
        StringBuilder V0 = je.V0("{FileLruCache: tag:");
        V0.append(this.a);
        V0.append(" file:");
        V0.append(this.c.getName());
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: private */
    public static final class e extends InputStream {
        final InputStream a;
        final OutputStream b;

        e(InputStream inputStream, OutputStream outputStream) {
            this.a = inputStream;
            this.b = outputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.a.close();
            } finally {
                this.b.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            int read = this.a.read(bArr);
            if (read > 0) {
                this.b.write(bArr, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = this.a.read(bArr, 0, (int) Math.min(j - j2, (long) 1024));
                if (read > 0) {
                    this.b.write(bArr, 0, read);
                }
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read() {
            int read = this.a.read();
            if (read >= 0) {
                this.b.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.a.read(bArr, i, i2);
            if (read > 0) {
                this.b.write(bArr, i, read);
            }
            return read;
        }
    }
}
