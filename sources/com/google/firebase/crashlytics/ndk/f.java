package com.google.firebase.crashlytics.ndk;

import java.io.File;

class f {
    private final File a;

    f(File file) {
        this.a = file;
    }

    private static void d(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                d(file2);
            }
        }
        file.delete();
    }

    public void a(String str) {
        d(new File(this.a, str));
    }

    public File b(String str) {
        File file = new File(this.a, str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public boolean c(String str) {
        return new File(this.a, str).exists();
    }
}
