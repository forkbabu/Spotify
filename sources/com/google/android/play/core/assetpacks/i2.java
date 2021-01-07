package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.w;
import com.spotify.music.features.ads.model.Ad;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class i2 {
    private static final a h = new a("SliceMetadataManager");
    private final byte[] a = new byte[8192];
    private final z b;
    private final String c;
    private final int d;
    private final long e;
    private final String f;
    private int g;

    i2(z zVar, String str, int i, long j, String str2) {
        this.b = zVar;
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = str2;
        this.g = -1;
    }

    private final File n() {
        File t = this.b.t(this.c, this.d, this.e, this.f);
        if (!t.exists()) {
            t.mkdirs();
        }
        return t;
    }

    private final File o() {
        File k = this.b.k(this.c, this.d, this.e, this.f);
        k.getParentFile().mkdirs();
        k.createNewFile();
        return k;
    }

    /* access modifiers changed from: package-private */
    public final h2 a() {
        File k = this.b.k(this.c, this.d, this.e, this.f);
        if (k.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(k);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new bv("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", Ad.DEFAULT_SKIPPABLE_AD_DELAY));
                    return new h2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new bv("Slice checkpoint file corrupt.", e2);
                }
            } catch (Throwable th) {
                w.a(th, th);
            }
        } else {
            throw new bv("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void c(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.a);
                if (read > 0) {
                    randomAccessFile.write(this.a, 0, read);
                }
            } while (read == this.a.length);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void e(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void f(byte[] bArr) {
        this.g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                w.a(th, th);
            }
            throw th;
        } catch (IOException e2) {
            throw new bv("Could not write metadata file.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            z zVar = this.b;
            String str = this.c;
            int i2 = this.d;
            long j = this.e;
            String str2 = this.f;
            zVar.getClass();
            File file = new File(zVar.t(str, i2, j, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                w.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            w.a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(byte[] bArr, InputStream inputStream) {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.a);
            while (read > 0) {
                fileOutputStream.write(this.a, 0, read);
                read = inputStream.read(this.a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File i() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.g)));
    }

    /* access modifiers changed from: package-private */
    public final void j(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void k(byte[] bArr, int i) {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        File k = this.b.k(this.c, this.d, this.e, this.f);
        if (!k.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(k);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bv("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        File k = this.b.k(this.c, this.d, this.e, this.f);
        if (!k.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(k);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                h.e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                w.a(th, th);
            }
        } catch (IOException e2) {
            h.e("Could not read checkpoint while checking if extraction finished. %s", e2);
            return false;
        }
        throw th;
    }
}
