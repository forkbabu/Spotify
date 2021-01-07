package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.spotify.music.features.imagerecs.view.ImageRecsActivity;
import java.io.File;

/* renamed from: sl5  reason: default package */
public final class sl5 {
    private static final String[] a = {"_data"};

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.graphics.Bitmap r2, java.io.File r3) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0017 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0017 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0010 }
            r1 = 60
            r2.compress(r3, r1, r0)     // Catch:{ all -> 0x0010 }
            r0.close()
            goto L_0x001d
        L_0x0010:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r3
        L_0x0017:
            r3 = move-exception
            java.lang.String r0 = "Failed to write bitmap to file"
            com.spotify.mobile.android.util.Assertion.i(r0, r3)
        L_0x001d:
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl5.a(android.graphics.Bitmap, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(java.io.File r6) {
        /*
            long r0 = r6.length()
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r6)
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x002c }
            r6.<init>(r2)     // Catch:{ IOException -> 0x002c }
        L_0x0011:
            r3 = 0
            int r4 = r6.read(r0, r3, r1)     // Catch:{ all -> 0x0025 }
            r5 = -1
            if (r4 == r5) goto L_0x0021
            java.lang.String r4 = "Reading file"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0025 }
            com.spotify.base.java.logging.Logger.l(r4, r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0011
        L_0x0021:
            r6.close()
            goto L_0x0032
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r1
        L_0x002c:
            r6 = move-exception
            java.lang.String r1 = "Failed to read the file"
            com.spotify.mobile.android.util.Assertion.i(r1, r6)
        L_0x0032:
            r2.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl5.b(java.io.File):byte[]");
    }

    private static Bitmap c(Bitmap bitmap) {
        double d;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d2 = (double) height;
        if (d2 <= 1200.0d || height < 1200) {
            d = (double) width;
        } else {
            double d3 = (double) width;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d3 / (d2 / 1200.0d);
            d2 = 1200.0d;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) d, (int) d2, false);
    }

    public static byte[] d(Uri uri, File file, ImageRecsActivity imageRecsActivity) {
        Bitmap bitmap;
        String str;
        ParcelFileDescriptor openFileDescriptor = imageRecsActivity.getContentResolver().openFileDescriptor(uri, "r");
        if (openFileDescriptor != null) {
            bitmap = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
            openFileDescriptor.close();
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return new byte[0];
        }
        Cursor query = imageRecsActivity.getContentResolver().query(uri, a, null, null, null);
        if (query != null) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
            query.moveToFirst();
            str = query.getString(columnIndexOrThrow);
            query.close();
        } else {
            str = "";
        }
        int i = 1;
        if (str != null) {
            try {
                i = new v5(str).k("Orientation", 1);
            } catch (IllegalArgumentException unused) {
            }
        }
        a(c(bitmap), file);
        v5 v5Var = new v5(file.getAbsolutePath());
        v5Var.M("Orientation", String.valueOf(i));
        v5Var.I();
        return b(file);
    }

    public static byte[] e(File file) {
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        if (decodeFile == null) {
            return new byte[0];
        }
        v5 v5Var = new v5(file.getAbsolutePath());
        int k = v5Var.k("Orientation", 1);
        a(c(decodeFile), file);
        v5Var.M("Orientation", String.valueOf(k));
        v5Var.I();
        return b(file);
    }
}
