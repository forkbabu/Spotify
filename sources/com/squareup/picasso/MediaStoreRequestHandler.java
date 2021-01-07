package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;

/* access modifiers changed from: package-private */
public class MediaStoreRequestHandler extends i {
    private static final String[] b = {"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.i, com.squareup.picasso.a0
    public boolean c(y yVar) {
        Uri uri = yVar.c;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r3 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r3 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cf  */
    @Override // com.squareup.picasso.i, com.squareup.picasso.a0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.picasso.a0.a f(com.squareup.picasso.y r18, int r19) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.f(com.squareup.picasso.y, int):com.squareup.picasso.a0$a");
    }
}
