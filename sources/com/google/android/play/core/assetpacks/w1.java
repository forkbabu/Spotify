package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class w1 {
    private static final a b = new a("MergeSliceTaskHandler");
    private final z a;

    w1(z zVar) {
        this.a = zVar;
    }

    private static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                throw new bv(je.I0(new StringBuilder(valueOf.length() + 28), "Unable to delete directory: ", valueOf));
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            throw new bv(je.I0(new StringBuilder(valueOf2.length() + 51), "File clashing with existing file from other slice: ", valueOf2));
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            throw new bv(je.I0(new StringBuilder(valueOf3.length() + 21), "Unable to move file: ", valueOf3));
        }
    }

    public final void a(v1 v1Var) {
        File h = this.a.h(v1Var.b, v1Var.c, v1Var.d, v1Var.e);
        if (h.exists()) {
            File j = this.a.j(v1Var.b, v1Var.c, v1Var.d);
            if (!j.exists()) {
                j.mkdirs();
            }
            b(h, j);
            try {
                this.a.d(v1Var.b, v1Var.c, v1Var.d, this.a.n(v1Var.b, v1Var.c, v1Var.d) + 1);
            } catch (IOException e) {
                b.e("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new bv("Writing merge checkpoint failed.", e, v1Var.a);
            }
        } else {
            throw new bv(String.format("Cannot find verified files for slice %s.", v1Var.e), v1Var.a);
        }
    }
}
