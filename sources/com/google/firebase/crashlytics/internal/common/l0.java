package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPOutputStream;

public final class l0 {
    public static ExecutorService a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new j0(str, new AtomicLong(1)));
        Runtime.getRuntime().addShutdownHook(new Thread(new k0(str, newSingleThreadExecutor, 2, TimeUnit.SECONDS), je.x0("Crashlytics Shutdown Hook for ", str)));
        return newSingleThreadExecutor;
    }

    private static void b(InputStream inputStream, File file) {
        Throwable th;
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        CommonUtils.d(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.d(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.d(gZIPOutputStream);
            throw th;
        }
    }

    static void c(File file, List<s0> list) {
        for (s0 s0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = s0Var.g();
                if (inputStream != null) {
                    b(inputStream, new File(file, s0Var.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.d(null);
                throw th;
            }
            CommonUtils.d(inputStream);
        }
    }
}
