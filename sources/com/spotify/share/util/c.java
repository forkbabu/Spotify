package com.spotify.share.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.t;
import java.io.File;
import java.io.FileOutputStream;

public class c {
    private final Context a;
    private final a b;
    private final b c;
    private final t d;

    public static class a {
    }

    public static class b {
    }

    public c(Context context, a aVar, b bVar, t tVar) {
        this.a = context;
        this.b = aVar;
        this.c = bVar;
        this.d = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.graphics.Bitmap r2, java.io.OutputStream r3) {
        /*
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0010 }
            r1 = 100
            r2.compress(r0, r1, r3)     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x000f
            r3.close()     // Catch:{ Exception -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x0019
        L_0x000f:
            return
        L_0x0010:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            if (r3 == 0) goto L_0x0018
            r3.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            throw r2
        L_0x0019:
            java.lang.String r3 = r2.getMessage()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.spotify.base.java.logging.Logger.d(r3, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable to compress image "
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.share.util.c.a(android.graphics.Bitmap, java.io.OutputStream):void");
    }

    public Optional<Uri> b(Bitmap bitmap, File file) {
        try {
            this.b.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            String format = String.format("%s.%s", this.d.y(), "instagram");
            b bVar = this.c;
            Context context = this.a;
            bVar.getClass();
            return Optional.of(FileProvider.b(context, format, file));
        } catch (Exception e) {
            Logger.d(e.getMessage(), new Object[0]);
            return Optional.absent();
        }
    }

    public Uri c(Bitmap bitmap, ContentValues contentValues) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return null;
        }
        a(bitmap, contentResolver.openOutputStream(insert));
        return insert;
    }

    public void d(Bitmap bitmap, File file) {
        this.b.getClass();
        a(bitmap, new FileOutputStream(file));
    }
}
