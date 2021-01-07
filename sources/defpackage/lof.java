package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.o;
import okio.v;
import okio.w;

/* renamed from: lof  reason: default package */
public interface lof {
    public static final lof a = new a();

    /* renamed from: lof$a */
    class a implements lof {
        a() {
        }

        @Override // defpackage.lof
        public void a(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // defpackage.lof
        public boolean b(File file) {
            return file.exists();
        }

        @Override // defpackage.lof
        public v c(File file) {
            try {
                return o.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return o.a(file);
            }
        }

        @Override // defpackage.lof
        public long d(File file) {
            return file.length();
        }

        @Override // defpackage.lof
        public w e(File file) {
            int i = o.b;
            if (file != null) {
                return o.i(new FileInputStream(file));
            }
            throw new IllegalArgumentException("file == null");
        }

        @Override // defpackage.lof
        public v f(File file) {
            try {
                return o.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return o.f(file);
            }
        }

        @Override // defpackage.lof
        public void g(File file, File file2) {
            h(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        @Override // defpackage.lof
        public void h(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }

    void a(File file);

    boolean b(File file);

    v c(File file);

    long d(File file);

    w e(File file);

    v f(File file);

    void g(File file, File file2);

    void h(File file);
}
