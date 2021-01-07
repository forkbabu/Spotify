package com.spotify.image.provider;

import android.os.ParcelFileDescriptor;
import com.squareup.picasso.z;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ z a;
    public final /* synthetic */ ParcelFileDescriptor[] b;

    public /* synthetic */ a(z zVar, ParcelFileDescriptor[] parcelFileDescriptorArr) {
        this.a = zVar;
        this.b = parcelFileDescriptorArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        throw r0;
     */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.squareup.picasso.z r0 = r5.a
            android.os.ParcelFileDescriptor[] r1 = r5.b
            r2 = 1
            r1 = r1[r2]
            r3 = 0
            android.graphics.Bitmap r0 = r0.j()     // Catch:{ Exception -> 0x002e }
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r4 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ IOException -> 0x0036 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0036 }
            boolean r1 = r0.isRecycled()     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            com.google.common.base.MoreObjects.checkArgument(r2)     // Catch:{ all -> 0x0027 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0027 }
            r2 = 100
            r0.compress(r1, r2, r4)     // Catch:{ all -> 0x0027 }
            r4.close()
            goto L_0x0036
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        L_0x002e:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Exception while trying to load the image."
            com.spotify.base.java.logging.Logger.e(r0, r2, r1)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.image.provider.a.run():void");
    }
}
