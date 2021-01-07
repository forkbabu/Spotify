package com.spotify.music.features.localfilesimport.activity;

import android.net.Uri;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ LocalFilesImportActivity a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ c(LocalFilesImportActivity localFilesImportActivity, Uri uri) {
        this.a = localFilesImportActivity;
        this.b = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        throw r1;
     */
    @Override // java.util.concurrent.Callable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity r0 = r7.a
            android.net.Uri r2 = r7.b
            android.content.ContentResolver r1 = r0.b0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r4 = "is_music != 0"
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0019
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0055 }
            r1.<init>()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0054
            goto L_0x0051
        L_0x0019:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0055 }
            int r2 = r0.getCount()     // Catch:{ all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ all -> 0x0055 }
        L_0x0022:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = "_data"
            java.lang.String r3 = ""
            int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x003e
            int r4 = r2.length()     // Catch:{ all -> 0x0055 }
            if (r4 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r3 = r2
        L_0x003e:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0055 }
            r2.<init>(r3)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x0055 }
            boolean r3 = com.google.common.base.MoreObjects.isNullOrEmpty(r2)     // Catch:{ all -> 0x0055 }
            if (r3 != 0) goto L_0x0022
            r1.add(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0022
        L_0x0051:
            r0.close()
        L_0x0054:
            return r1
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            goto L_0x005f
        L_0x005e:
            throw r1
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.activity.c.call():java.lang.Object");
    }
}
