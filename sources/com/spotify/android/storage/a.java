package com.spotify.android.storage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.b;

public class a {
    private final File a;
    private final File b;
    private final f c;
    private final AtomicBoolean d;

    public a(File file, File file2, f fVar) {
        if (!file.exists() || !file.isDirectory() || !file.canRead()) {
            throw new SyncError("Unable to access source directory: " + file);
        } else if (!file2.exists() || !file2.isDirectory() || !file2.canWrite()) {
            throw new SyncError("Unable to access destination directory: " + file2);
        } else {
            this.a = file;
            this.b = file2;
            this.c = fVar;
            this.d = new AtomicBoolean(false);
        }
    }

    private boolean c(File file, File file2) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = false;
        for (File file3 : listFiles) {
            boolean z2 = true;
            if (!file3.isDirectory()) {
                File file4 = new File(file2, file3.getName());
                if (!file3.getName().equals(".tag") && (!file4.exists() || file3.length() != file4.length() || file3.lastModified() > file4.lastModified())) {
                    try {
                        b.d(file3, file4, false);
                        this.c.a(file4);
                    } catch (IOException unused) {
                        throw new SyncError("Unable to copy file " + file3 + " to " + file4);
                    }
                } else {
                    this.c.a(file4);
                    z2 = false;
                }
                z |= z2;
            } else if (!this.d.get()) {
                return false;
            } else {
                File file5 = new File(file2, file3.getName());
                if (file5.exists() || file5.mkdir()) {
                    if (file5.isFile()) {
                        if (!file5.delete() || !file5.mkdir()) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new SyncError("Unable to replace existed file with folder " + file5);
                        }
                    }
                    if (!file5.isDirectory() || !file5.canWrite()) {
                        throw new SyncError(file5 + " is not writable folder");
                    }
                    z |= c(file3, file5);
                } else {
                    throw new SyncError("Unable to create nested folder " + file5);
                }
            }
        }
        return z;
    }

    public void a() {
        this.d.compareAndSet(true, false);
    }

    public boolean b() {
        this.d.set(true);
        return c(this.a, this.b);
    }
}
