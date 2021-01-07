package androidx.room;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

class n implements q7 {
    private final Context a;
    private final String b;
    private final File c;
    private final int f;
    private final q7 n;
    private a o;
    private boolean p;

    /* JADX INFO: finally extract failed */
    private void a(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.b != null) {
            readableByteChannel = Channels.newChannel(this.a.getAssets().open(this.b));
        } else if (this.c != null) {
            readableByteChannel = new FileInputStream(this.c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                channel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder V0 = je.V0("Failed to create directories for ");
                V0.append(file.getAbsolutePath());
                throw new IOException(V0.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder V02 = je.V0("Failed to move intermediate file (");
                V02.append(createTempFile.getAbsolutePath());
                V02.append(") to destination (");
                V02.append(file.getAbsolutePath());
                V02.append(").");
                throw new IOException(V02.toString());
            }
        } catch (Throwable th) {
            readableByteChannel.close();
            channel.close();
            throw th;
        }
    }

    private void d() {
        String databaseName = this.n.getDatabaseName();
        File databasePath = this.a.getDatabasePath(databaseName);
        k7 k7Var = new k7(databaseName, this.a.getFilesDir(), this.o == null);
        try {
            k7Var.a();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.o == null) {
                k7Var.b();
            } else {
                try {
                    int c2 = l7.c(databasePath);
                    int i = this.f;
                    if (c2 == i) {
                        k7Var.b();
                    } else if (this.o.a(c2, i)) {
                        k7Var.b();
                    } else {
                        if (this.a.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException unused) {
                            }
                        }
                        k7Var.b();
                    }
                } catch (IOException unused2) {
                    k7Var.b();
                }
            }
        } finally {
            k7Var.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.o = aVar;
    }

    @Override // defpackage.q7, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.n.close();
        this.p = false;
    }

    @Override // defpackage.q7
    public String getDatabaseName() {
        return this.n.getDatabaseName();
    }

    @Override // defpackage.q7
    public synchronized p7 getWritableDatabase() {
        if (!this.p) {
            d();
            this.p = true;
        }
        return this.n.getWritableDatabase();
    }

    @Override // defpackage.q7
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.n.setWriteAheadLoggingEnabled(z);
    }
}
