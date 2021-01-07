package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.tagreader.SPTTagReader;
import com.spotify.music.spotlets.scannables.ScannablesException;
import java.util.concurrent.Callable;

/* renamed from: chd  reason: default package */
public final /* synthetic */ class chd implements Callable {
    public final /* synthetic */ ContentResolver a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ chd(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        int i3;
        int i4;
        ContentResolver contentResolver = this.a;
        Uri uri = this.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        if (i5 > 1024 || i6 > 1024) {
            float f = (float) 1024;
            int min = Math.min(Math.round(((float) i5) / f), Math.round(((float) i6) / f));
            float f2 = (float) (i6 * i5);
            while (f2 / ((float) (min * min)) > ((float) 2097152)) {
                min++;
            }
            i = min;
        } else {
            i = 1;
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        Bitmap decodeStream = BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        int width = decodeStream.getWidth();
        int height = decodeStream.getHeight();
        int i7 = width * height;
        int[] iArr = new int[i7];
        int i8 = 0;
        decodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[(i7 * 3)];
        int i9 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            int i11 = 0;
            while (i11 < width) {
                int red = Color.red(iArr[i9]);
                int green = Color.green(iArr[i9]);
                int blue = Color.blue(iArr[i9]);
                int V = (je.V(blue, 25, (green * 129) + (red * 66), 128) >> 8) + 16;
                int V2 = (je.V(blue, 112, (red * -38) - (green * 74), 128) >> 8) + 128;
                int i12 = (((((red * 112) - (green * 94)) - (blue * 18)) + 128) >> 8) + 128;
                int i13 = i8 + 1;
                if (V < 0) {
                    i2 = 0;
                } else {
                    i2 = Math.min(V, (int) BitmapRenderer.ALPHA_VISIBLE);
                }
                bArr[i8] = (byte) i2;
                if (i10 % 2 == 0 && i9 % 2 == 0) {
                    int i14 = i7 + 1;
                    if (i12 < 0) {
                        i3 = 0;
                    } else {
                        i3 = Math.min(i12, (int) BitmapRenderer.ALPHA_VISIBLE);
                    }
                    bArr[i7] = (byte) i3;
                    i7 = i14 + 1;
                    if (V2 < 0) {
                        i4 = 0;
                    } else {
                        i4 = Math.min(V2, (int) BitmapRenderer.ALPHA_VISIBLE);
                    }
                    bArr[i14] = (byte) i4;
                }
                i9++;
                i11++;
                i8 = i13;
                width = width;
            }
        }
        decodeStream.recycle();
        int width2 = decodeStream.getWidth();
        String[] decodeWaveformTag = SPTTagReader.decodeWaveformTag(bArr, 0, width2, decodeStream.getHeight(), width2);
        if (decodeWaveformTag != null && decodeWaveformTag.length > 0) {
            return decodeWaveformTag[0];
        }
        throw new ScannablesException(1);
    }
}
