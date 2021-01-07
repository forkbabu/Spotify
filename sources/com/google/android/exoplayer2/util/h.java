package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class h {
    private final File a;
    private final File b;

    private static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) {
            this.a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b) {
                this.b = true;
                this.a.flush();
                try {
                    this.a.getFD().sync();
                } catch (IOException unused) {
                }
                this.a.close();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }
    }

    public h(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.a.delete();
        this.b.delete();
    }

    public void b(OutputStream outputStream) {
        outputStream.close();
        this.b.delete();
    }

    public boolean c() {
        return this.a.exists() || this.b.exists();
    }

    public InputStream d() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }

    public OutputStream e() {
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                StringBuilder V0 = je.V0("Couldn't rename file ");
                V0.append(this.a);
                V0.append(" to backup file ");
                V0.append(this.b);
                V0.toString();
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder V02 = je.V0("Couldn't create ");
                V02.append(this.a);
                throw new IOException(V02.toString(), e);
            }
            try {
                return new a(this.a);
            } catch (FileNotFoundException e2) {
                StringBuilder V03 = je.V0("Couldn't create ");
                V03.append(this.a);
                throw new IOException(V03.toString(), e2);
            }
        }
    }
}
