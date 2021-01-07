package com.google.firebase.crashlytics.internal.proto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class b extends FileOutputStream {
    public static final FilenameFilter f = new a();
    private final String a;
    private File b;
    private boolean c = false;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public b(File file, String str) {
        super(new File(file, je.x0(str, ".cls_temp")));
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String I0 = je.I0(sb, File.separator, str);
        this.a = I0;
        this.b = new File(je.x0(I0, ".cls_temp"));
    }

    public void a() {
        if (!this.c) {
            this.c = true;
            flush();
            super.close();
        }
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.c) {
            this.c = true;
            flush();
            super.close();
            File file = new File(this.a + ".cls");
            if (this.b.renameTo(file)) {
                this.b = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.b.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.b + " -> " + file + str);
        }
    }
}
