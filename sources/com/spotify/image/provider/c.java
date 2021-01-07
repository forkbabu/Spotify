package com.spotify.image.provider;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.adjust.sdk.Constants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import com.spotify.image.provider.MediaUriUtil;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;

public class c {
    private final Picasso a;
    private final MediaUriUtil b;

    public c(Picasso picasso, MediaUriUtil mediaUriUtil) {
        this.a = picasso;
        this.b = mediaUriUtil;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.graphics.Bitmap r5, java.io.File r6) {
        /*
            r0 = 1
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0025 }
            boolean r3 = r5.isRecycled()     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            com.google.common.base.MoreObjects.checkArgument(r3)     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x001e }
            r4 = 100
            r5.compress(r3, r4, r2)     // Catch:{ all -> 0x001e }
            r2.close()
            goto L_0x0033
        L_0x001e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r5 = move-exception
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r5
        L_0x0025:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = r6.getAbsolutePath()
            r0[r1] = r6
            java.lang.String r6 = "Couldn't write image to file \"%s\"."
            com.spotify.base.java.logging.Logger.e(r5, r6, r0)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.image.provider.c.c(android.graphics.Bitmap, java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    public z a(Uri uri) {
        Uri uri2;
        MediaUriUtil.Transformation transformation;
        MediaUriUtil.ImageDimension imageDimension;
        this.b.getClass();
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            uri2 = Uri.EMPTY;
        } else {
            if (!path.isEmpty() && '/' == path.charAt(0)) {
                path = path.substring(1);
            }
            if (path.startsWith("spotify:")) {
                uri2 = Uri.parse(path);
            } else {
                String queryParameter = uri.getQueryParameter("cdn");
                if (queryParameter == null) {
                    queryParameter = "i";
                }
                Uri.Builder scheme = new Uri.Builder().scheme(Constants.SCHEME);
                uri2 = scheme.authority(queryParameter + ".scdn.co").path(path).build();
            }
        }
        this.b.getClass();
        String queryParameter2 = uri.getQueryParameter("transformation");
        if (queryParameter2 == null || queryParameter2.isEmpty()) {
            transformation = MediaUriUtil.Transformation.NONE;
        } else {
            transformation = MediaUriUtil.Transformation.valueOf(queryParameter2.toUpperCase(Locale.getDefault()));
        }
        z l = this.a.l(uri2);
        if (transformation == MediaUriUtil.Transformation.CIRCULAR) {
            l.x(new b());
        } else if (transformation == MediaUriUtil.Transformation.ROUNDED_CORNER) {
            l.x(new e());
        }
        this.b.getClass();
        String queryParameter3 = uri.getQueryParameter("dimension");
        if (MoreObjects.isNullOrEmpty(queryParameter3)) {
            imageDimension = null;
        } else {
            imageDimension = MediaUriUtil.ImageDimension.valueOf(queryParameter3.toUpperCase(Locale.getDefault()));
        }
        if (imageDimension != null) {
            l.u(imageDimension.d(), imageDimension.d());
        }
        return l;
    }

    public ParcelFileDescriptor b(Uri uri, File file, Optional<Executor> optional) {
        boolean z;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        if (optional.isPresent()) {
            Executor executor = optional.get();
            try {
                parcelFileDescriptorArr = ParcelFileDescriptor.createPipe();
            } catch (IOException unused) {
                parcelFileDescriptorArr = null;
            }
            if (parcelFileDescriptorArr != null) {
                executor.execute(new a(a(uri), parcelFileDescriptorArr));
                return parcelFileDescriptorArr[0];
            }
            throw new FileNotFoundException("Couldn't create file descriptors");
        }
        File file2 = new File(file, Hashing.sha256().hashUnencodedChars(uri.toString()).toString());
        if (file2.exists()) {
            return ParcelFileDescriptor.open(file2, 268435456);
        }
        z a2 = a(uri);
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                c(a2.j(), file2);
            } catch (Exception e) {
                Logger.e(e, "Exception while trying to load the image.", new Object[0]);
            }
        } else {
            Logger.d("Couldn't create directories for \"%s\".", file2);
        }
        return ParcelFileDescriptor.open(file2, 268435456);
    }
}
