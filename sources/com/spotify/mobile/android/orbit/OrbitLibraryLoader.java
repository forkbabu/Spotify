package com.spotify.mobile.android.orbit;

import android.content.Context;
import android.os.Build;
import com.getkeepsafe.relinker.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.net.URL;
import java.util.Random;

public class OrbitLibraryLoader {
    private static final String[] ABIS = {ARM64_ABI, X86_64_ABI, ARMV7_ABI, X86_ABI};
    static final String ARM64_ABI = "arm64-v8a";
    static final String ARMV7_ABI = "armeabi-v7a";
    private static final String LIB_BASE_FOLDER = "lib";
    static final String ORBIT_JNI_LIBRARY_NAME = "orbit-jni-spotify";
    static final String X86_64_ABI = "x86_64";
    static final String X86_ABI = "x86";
    private Thread mLibraryLoadingThread;
    private final Random mRandom;
    private final b.c mReLinkerLogger = new b.c() {
        /* class com.spotify.mobile.android.orbit.OrbitLibraryLoader.AnonymousClass1 */

        @Override // com.getkeepsafe.relinker.b.c
        public void log(String str) {
            Logger.b(str, new Object[0]);
        }
    };

    public static class LibraryLoader {
        public String[] getABIs() {
            return Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI};
        }

        public URL getResource(String str) {
            return LibraryLoader.class.getResource(str);
        }

        public void load(String str) {
            System.load(str);
        }

        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    public OrbitLibraryLoader(Random random) {
        this.mRandom = random;
    }

    private static File buildNativeLibPath(Context context, String str) {
        return new File(new File(new File(context.getFilesDir(), je.I0(new StringBuilder(), File.separator, LIB_BASE_FOLDER)), str), "liborbit-jni-spotify.so");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0030 A[SYNTHETIC, Splitter:B:26:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0037 A[SYNTHETIC, Splitter:B:30:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x003d A[SYNTHETIC, Splitter:B:35:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0044 A[SYNTHETIC, Splitter:B:39:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean copyLibFromApk(java.net.URL r4, java.io.File r5) {
        /*
            r0 = 0
            java.io.InputStream r4 = r4.openStream()     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x001d }
            r1.<init>(r5)     // Catch:{ IOException -> 0x001d }
            com.google.common.io.ByteStreams.copy(r4, r1)     // Catch:{ IOException -> 0x0018, all -> 0x0015 }
            r1.close()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r4.close()     // Catch:{ IOException -> 0x0013 }
        L_0x0013:
            r4 = 1
            return r4
        L_0x0015:
            r5 = move-exception
            r0 = r1
            goto L_0x003b
        L_0x0018:
            r5 = move-exception
            r0 = r1
            goto L_0x0024
        L_0x001b:
            r5 = move-exception
            goto L_0x003b
        L_0x001d:
            r5 = move-exception
            goto L_0x0024
        L_0x001f:
            r5 = move-exception
            r4 = r0
            goto L_0x003b
        L_0x0022:
            r5 = move-exception
            r4 = r0
        L_0x0024:
            java.lang.String r1 = r5.getMessage()     // Catch:{ all -> 0x001b }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x001b }
            com.spotify.base.java.logging.Logger.e(r5, r1, r3)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r2
        L_0x003b:
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r4 == 0) goto L_0x0047
            r4.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.orbit.OrbitLibraryLoader.copyLibFromApk(java.net.URL, java.io.File):boolean");
    }

    private static void createLibDirIfNeeded(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    Logger.d("Failed to create directory for native library extraction", new Object[0]);
                    throw new UnsatisfiedLinkError("Failed to create directory for native library extraction");
                }
            } else if (!parentFile.isDirectory()) {
                Logger.d("Unexpected file where native lib dir expected!", new Object[0]);
                throw new UnsatisfiedLinkError("Unexpected file where native lib dir expected!");
            }
        } else if (!file.delete()) {
            Logger.d("Failed to delete old (possibly stale) native library", new Object[0]);
            throw new UnsatisfiedLinkError("Failed to delete old (possibly stale) native library");
        }
    }

    private boolean fallbackNativeLoading(Context context, LibraryLoader libraryLoader) {
        String str;
        String[] aBIs = libraryLoader.getABIs();
        for (String str2 : aBIs) {
            String[] strArr = ABIS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                str = strArr[i];
                if (str2.contains(str)) {
                    break;
                }
                i++;
            }
            if (!str.isEmpty()) {
                try {
                    File buildNativeLibPath = buildNativeLibPath(context, str);
                    createLibDirIfNeeded(buildNativeLibPath);
                    String str3 = "/lib/" + str + "/lib" + ORBIT_JNI_LIBRARY_NAME + ".so";
                    URL resource = libraryLoader.getResource(str3);
                    if (resource == null) {
                        Logger.d("Cannot find native library in APK - fallback extraction failed!", new Object[0]);
                        Logger.d("Looked for '%s'. ABI: %s", str3, str);
                    } else if (copyLibFromApk(resource, buildNativeLibPath)) {
                        libraryLoader.load(buildNativeLibPath.getAbsolutePath());
                        return true;
                    }
                } catch (UnsatisfiedLinkError e) {
                    Logger.e(e, e.getMessage(), new Object[0]);
                }
            }
        }
        return false;
    }

    static void reportThrottledSuccess(Random random) {
        if (((double) random.nextFloat()) >= 0.99d) {
            Assertion.g("Successfully loaded native lib with fallback method (Throttled 99%).");
        }
    }

    /* access modifiers changed from: package-private */
    public void loadLibrary(Context context, LibraryLoader libraryLoader) {
        try {
            libraryLoader.loadLibrary(ORBIT_JNI_LIBRARY_NAME);
        } catch (UnsatisfiedLinkError e) {
            Logger.e(e, "Error while performing regular native lib load", new Object[0]);
            if (!fallbackNativeLoading(context, libraryLoader)) {
                Logger.e(e, "Error performing native lib fallback extraction. Trying with ReLinker.", new Object[0]);
                try {
                    b.b(this.mReLinkerLogger).c(context, ORBIT_JNI_LIBRARY_NAME);
                } catch (Exception e2) {
                    Logger.e(e2, e2.getMessage(), new Object[0]);
                    if (com.google.android.play.core.missingsplits.b.a(context).b()) {
                        Logger.d("Installation is missing apk splits.", new Object[0]);
                    }
                    throw e;
                }
            } else {
                reportThrottledSuccess(this.mRandom);
            }
        }
    }

    public void startLibraryLoading(final Context context, final LibraryLoader libraryLoader) {
        AnonymousClass2 r0 = new Thread("Library Loader") {
            /* class com.spotify.mobile.android.orbit.OrbitLibraryLoader.AnonymousClass2 */

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                OrbitLibraryLoader.this.loadLibrary(context, libraryLoader);
            }
        };
        this.mLibraryLoadingThread = r0;
        r0.start();
    }

    public void waitForLibraryLoaded() {
        this.mLibraryLoadingThread.getClass();
        try {
            this.mLibraryLoadingThread.join(0);
        } catch (InterruptedException e) {
            Assertion.o(e);
        }
    }
}
