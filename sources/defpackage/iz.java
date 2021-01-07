package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: iz  reason: default package */
public class iz implements Closeable {
    private static final Logger p = Logger.getLogger(iz.class.getName());
    private final RandomAccessFile a;
    int b;
    private int c;
    private b f;
    private b n;
    private final byte[] o = new byte[16];

    /* access modifiers changed from: package-private */
    /* renamed from: iz$a */
    public class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(iz izVar, StringBuilder sb) {
            this.b = sb;
        }

        @Override // defpackage.iz.d
        public void a(InputStream inputStream, int i) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: iz$b */
    public static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return je.B0(sb, this.b, "]");
        }
    }

    /* renamed from: iz$d */
    public interface d {
        void a(InputStream inputStream, int i);
    }

    /* JADX INFO: finally extract failed */
    public iz(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    C(bArr, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(this.o);
        int p2 = p(this.o, 0);
        this.b = p2;
        if (((long) p2) <= randomAccessFile2.length()) {
            this.c = p(this.o, 4);
            int p3 = p(this.o, 8);
            int p4 = p(this.o, 12);
            this.f = m(p3);
            this.n = m(p4);
            return;
        }
        StringBuilder V0 = je.V0("File is truncated. Expected length: ");
        V0.append(this.b);
        V0.append(", Actual length: ");
        V0.append(randomAccessFile2.length());
        throw new IOException(V0.toString());
    }

    private void B(int i, int i2, int i3, int i4) {
        byte[] bArr = this.o;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            C(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.a.seek(0);
        this.a.write(this.o);
    }

    private static void C(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    static int a(iz izVar, int i) {
        int i2 = izVar.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void h(int i) {
        int i2 = i + 4;
        int v = this.b - v();
        if (v < i2) {
            int i3 = this.b;
            do {
                v += i3;
                i3 <<= 1;
            } while (v < i2);
            this.a.setLength((long) i3);
            this.a.getChannel().force(true);
            b bVar = this.n;
            int w = w(bVar.a + 4 + bVar.b);
            if (w < this.f.a) {
                FileChannel channel = this.a.getChannel();
                channel.position((long) this.b);
                long j = (long) (w - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.n.a;
            int i5 = this.f.a;
            if (i4 < i5) {
                int i6 = (this.b + i4) - 16;
                B(i3, this.c, i5, i6);
                this.n = new b(i6, this.n.b);
            } else {
                B(i3, this.c, i5, i4);
            }
            this.b = i3;
        }
    }

    private b m(int i) {
        if (i == 0) {
            return b.c;
        }
        this.a.seek((long) i);
        return new b(i, this.a.readInt());
    }

    private static int p(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.a.seek((long) i);
            this.a.readFully(bArr, i2, i3);
            return;
        }
        int i5 = i4 - i;
        this.a.seek((long) i);
        this.a.readFully(bArr, i2, i5);
        this.a.seek(16);
        this.a.readFully(bArr, i2 + i5, i3 - i5);
    }

    private void s(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.a.seek((long) i);
            this.a.write(bArr, i2, i3);
            return;
        }
        int i5 = i4 - i;
        this.a.seek((long) i);
        this.a.write(bArr, i2, i5);
        this.a.seek(16);
        this.a.write(bArr, i2 + i5, i3 - i5);
    }

    private int w(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.a.close();
    }

    public void f(byte[] bArr) {
        int i;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    h(length);
                    boolean l = l();
                    if (l) {
                        i = 16;
                    } else {
                        b bVar = this.n;
                        i = w(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(i, length);
                    C(this.o, 0, length);
                    s(bVar2.a, this.o, 0, 4);
                    s(bVar2.a + 4, bArr, 0, length);
                    B(this.b, this.c + 1, l ? bVar2.a : this.f.a, bVar2.a);
                    this.n = bVar2;
                    this.c++;
                    if (l) {
                        this.f = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void g() {
        B(4096, 0, 0, 0);
        this.c = 0;
        b bVar = b.c;
        this.f = bVar;
        this.n = bVar;
        if (this.b > 4096) {
            this.a.setLength((long) 4096);
            this.a.getChannel().force(true);
        }
        this.b = 4096;
    }

    public synchronized void i(d dVar) {
        int i = this.f.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b m = m(i);
            dVar.a(new c(m, null), m.b);
            i = w(m.a + 4 + m.b);
        }
    }

    public synchronized boolean l() {
        return this.c == 0;
    }

    public synchronized void q() {
        if (l()) {
            throw new NoSuchElementException();
        } else if (this.c == 1) {
            g();
        } else {
            b bVar = this.f;
            int w = w(bVar.a + 4 + bVar.b);
            r(w, this.o, 0, 4);
            int p2 = p(this.o, 0);
            B(this.b, this.c - 1, w, this.n.a);
            this.c--;
            this.f = new b(w, p2);
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(iz.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.f);
        sb.append(", last=");
        sb.append(this.n);
        sb.append(", element lengths=[");
        try {
            i(new a(this, sb));
        } catch (IOException e) {
            p.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int v() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.n;
        int i = bVar.a;
        int i2 = this.f.a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.b + 16;
        }
        return (((i + 4) + bVar.b) + this.b) - i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: iz$c */
    public final class c extends InputStream {
        private int a;
        private int b;

        c(b bVar, a aVar) {
            int i = bVar.a + 4;
            int i2 = iz.this.b;
            this.a = i >= i2 ? (i + 16) - i2 : i;
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                iz.this.r(this.a, bArr, i, i2);
                this.a = iz.a(iz.this, this.a + i2);
                this.b -= i2;
                return i2;
            }
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.b == 0) {
                return -1;
            }
            iz.this.a.seek((long) this.a);
            int read = iz.this.a.read();
            this.a = iz.a(iz.this, this.a + 1);
            this.b--;
            return read;
        }
    }
}
