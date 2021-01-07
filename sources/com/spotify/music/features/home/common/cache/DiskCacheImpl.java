package com.spotify.music.features.home.common.cache;

import android.content.Context;
import io.reactivex.l;
import io.reactivex.o;
import java.io.File;
import java.io.IOException;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class DiskCacheImpl implements a<byte[]> {
    private final d a = kotlin.a.b(new DiskCacheImpl$cacheFolder$2(this));
    private final Context b;
    private final String c;
    private final String d;
    private final String e;

    static final class a<T> implements o<byte[]> {
        final /* synthetic */ DiskCacheImpl a;

        a(DiskCacheImpl diskCacheImpl) {
            this.a = diskCacheImpl;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            defpackage.yif.j(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            throw r2;
         */
        @Override // io.reactivex.o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(io.reactivex.m<byte[]> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "emitter"
                kotlin.jvm.internal.h.e(r8, r0)
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0042, all -> 0x003d }
                com.spotify.music.features.home.common.cache.DiskCacheImpl r1 = r7.a     // Catch:{ IOException -> 0x0042, all -> 0x003d }
                java.io.File r1 = r1.e()     // Catch:{ IOException -> 0x0042, all -> 0x003d }
                r0.<init>(r1)     // Catch:{ IOException -> 0x0042, all -> 0x003d }
                java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0042, all -> 0x003d }
                r1 = 0
                long r2 = r0.size()     // Catch:{ all -> 0x0036 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0032
                long r2 = r0.size()     // Catch:{ all -> 0x0036 }
                int r3 = (int) r2     // Catch:{ all -> 0x0036 }
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x0036 }
                r0.read(r2)     // Catch:{ all -> 0x0036 }
                byte[] r2 = r2.array()     // Catch:{ all -> 0x0036 }
                r8.onSuccess(r2)     // Catch:{ all -> 0x0036 }
            L_0x0032:
                defpackage.yif.j(r0, r1)
                goto L_0x0042
            L_0x0036:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0038 }
            L_0x0038:
                r2 = move-exception
                defpackage.yif.j(r0, r1)
                throw r2
            L_0x003d:
                r0 = move-exception
                r8.onComplete()
                throw r0
            L_0x0042:
                r8.onComplete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.home.common.cache.DiskCacheImpl.a.subscribe(io.reactivex.m):void");
        }
    }

    public DiskCacheImpl(Context context, String str, String str2, String str3) {
        h.e(context, "context");
        h.e(str, "username");
        h.e(str2, "relativePath");
        h.e(str3, "filename");
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    private final File d() {
        return (File) this.a.getValue();
    }

    public final File e() {
        if (d().exists()) {
            if (!d().isDirectory()) {
                throw new IOException();
            }
        } else if (!d().mkdirs()) {
            throw new IOException();
        }
        File file = new File(d(), this.e);
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        throw new IOException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        defpackage.yif.j(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        throw r1;
     */
    @Override // com.spotify.music.features.home.common.cache.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(byte[] r3) {
        /*
            r2 = this;
            byte[] r3 = (byte[]) r3
            java.lang.String r0 = "body"
            kotlin.jvm.internal.h.e(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ OverlappingFileLockException -> 0x003e, IOException -> 0x002a }
            java.io.File r1 = r2.e()     // Catch:{ OverlappingFileLockException -> 0x003e, IOException -> 0x002a }
            r0.<init>(r1)     // Catch:{ OverlappingFileLockException -> 0x003e, IOException -> 0x002a }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ OverlappingFileLockException -> 0x003e, IOException -> 0x002a }
            r1 = 0
            r0.lock()     // Catch:{ all -> 0x0023 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ all -> 0x0023 }
            r0.write(r3)     // Catch:{ all -> 0x0023 }
            defpackage.yif.j(r0, r1)
            goto L_0x0056
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            defpackage.yif.j(r0, r3)
            throw r1
        L_0x002a:
            r3 = move-exception
            java.lang.String r0 = "Failed to cache "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.spotify.mobile.android.util.Assertion.i(r0, r3)
            goto L_0x0056
        L_0x003e:
            r3 = move-exception
            java.lang.String r0 = "Cache file "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = " is locked by other thread"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.spotify.mobile.android.util.Assertion.i(r0, r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.home.common.cache.DiskCacheImpl.n(java.lang.Object):void");
    }

    @Override // com.spotify.music.features.home.common.cache.a
    public l<byte[]> read() {
        l<byte[]> d2 = l.d(new a(this));
        h.d(d2, "Maybe.create { emitter: …)\n            }\n        }");
        return d2;
    }
}
