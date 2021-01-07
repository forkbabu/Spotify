package com.airbnb.lottie.network;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class a {
    private final Context a;

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    private static String b(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder V0 = je.V0("lottie_cache_");
        V0.append(str.replaceAll("\\W+", ""));
        if (z) {
            fileExtension.getClass();
            str2 = ".temp" + fileExtension.extension;
        } else {
            str2 = fileExtension.extension;
        }
        V0.append(str2);
        return V0.toString();
    }

    private File c() {
        File file = new File(this.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: package-private */
    public u3<FileExtension, InputStream> a(String str) {
        FileExtension fileExtension = FileExtension.ZIP;
        try {
            File c = c();
            FileExtension fileExtension2 = FileExtension.JSON;
            File file = new File(c, b(str, fileExtension2, false));
            if (!file.exists()) {
                file = new File(c(), b(str, fileExtension, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (!file.getAbsolutePath().endsWith(".zip")) {
                fileExtension = fileExtension2;
            }
            StringBuilder a1 = je.a1("Cache hit for ", str, " at ");
            a1.append(file.getAbsolutePath());
            ae.a(a1.toString());
            return new u3<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str, FileExtension fileExtension) {
        File file = new File(c(), b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        ae.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            StringBuilder V0 = je.V0("Unable to rename cache file ");
            V0.append(file.getAbsolutePath());
            V0.append(" to ");
            V0.append(file2.getAbsolutePath());
            V0.append(".");
            ae.c(V0.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public File e(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(c(), b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
