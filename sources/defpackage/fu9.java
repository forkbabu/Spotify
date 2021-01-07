package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.h;

/* renamed from: fu9  reason: default package */
public final class fu9 implements eu9 {
    private final Context a;
    private final String b;

    public fu9(Context context, String str) {
        h.e(context, "context");
        h.e(str, "packageName");
        this.a = context;
        this.b = str;
    }

    private final RectF d(RectF rectF, int i) {
        RectF rectF2 = new RectF(rectF);
        switch (i) {
            case 1:
                break;
            case 2:
                float f = (float) 1;
                rectF2.set(f - rectF2.right, rectF2.top, f - rectF2.left, rectF2.bottom);
                break;
            case 3:
                float f2 = (float) 1;
                rectF2.set(f2 - rectF2.right, f2 - rectF2.bottom, f2 - rectF2.left, f2 - rectF2.top);
                break;
            case 4:
                float f3 = (float) 1;
                rectF2.set(rectF2.left, f3 - rectF2.bottom, rectF2.right, f3 - rectF2.top);
                break;
            case 5:
                rectF2.set(rectF2.top, rectF2.left, rectF2.bottom, rectF2.right);
                break;
            case 6:
                float f4 = (float) 1;
                rectF2.set(rectF2.top, f4 - rectF2.right, rectF2.bottom, f4 - rectF2.left);
                break;
            case 7:
                float f5 = (float) 1;
                rectF2.set(f5 - rectF2.bottom, f5 - rectF2.right, f5 - rectF2.top, f5 - rectF2.left);
                break;
            case 8:
                float f6 = (float) 1;
                rectF2.set(f6 - rectF2.bottom, rectF2.left, f6 - rectF2.top, rectF2.right);
                break;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                break;
        }
        return rectF2;
    }

    private final BitmapFactory.Options e(BitmapFactory.Options options) {
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i = options.outWidth / 2;
        int i2 = 1;
        while (true) {
            if ((i / i2) * ((options.outHeight / 2) / i2) >= 4000000) {
                i2 *= 2;
            } else {
                options2.inSampleSize = i2;
                return options2;
            }
        }
    }

    private final File f(boolean z) {
        File file = new File(this.a.getCacheDir(), "imagepicker");
        if (file.exists() || file.mkdirs()) {
            try {
                return File.createTempFile("imagepicker_", z ? ".png" : ".jpg", file);
            } catch (IOException unused) {
                return null;
            }
        } else {
            Logger.d("Could not make output directory: %s", file.toString());
            return null;
        }
    }

    private final Rect g(RectF rectF, boolean z, BitmapFactory.Options options) {
        int i;
        int i2;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        float f = (float) i3;
        int b2 = anf.b(rectF.left * f);
        float f2 = (float) i4;
        int b3 = anf.b(rectF.top * f2);
        if (z) {
            int b4 = anf.b(rectF.width() * f);
            int b5 = anf.b(rectF.height() * f2);
            if (b4 > b5) {
                b4 = b5;
            }
            i2 = b2 + b4;
            i = b4 + b3;
        } else {
            int b6 = anf.b(rectF.right * f);
            i = anf.b(rectF.bottom * f2);
            i2 = b6;
        }
        return new Rect(b2, b3, i2, i);
    }

    private final Bitmap h(Uri uri, Rect rect) {
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        h.d(openInputStream, "context.contentResolver.…tream(uri) ?: return null");
        BitmapFactory.Options options = new BitmapFactory.Options();
        int width = rect.width();
        int height = rect.height();
        int i = 1;
        while (true) {
            if ((height / i) * (width / i) >= 9000000) {
                i *= 2;
            } else {
                options.inSampleSize = i;
                this.a.getContentResolver().openInputStream(uri);
                return BitmapRegionDecoder.newInstance(openInputStream, false).decodeRegion(rect, options);
            }
        }
    }

    private final v5 i(Uri uri) {
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        h.d(openInputStream, "context.contentResolver.…tream(uri) ?: return null");
        v5 v5Var = new v5(openInputStream);
        openInputStream.close();
        return v5Var;
    }

    private final BitmapFactory.Options j(Uri uri) {
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        h.d(openInputStream, "context.contentResolver.…tream(uri) ?: return null");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        return options;
    }

    private final Matrix k(Matrix matrix, int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(-90.0f);
                break;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                break;
        }
        return matrix;
    }

    private final Uri l(Bitmap bitmap, int i) {
        Uri uri;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        k(matrix, i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (createBitmap != null) {
            File f = f(false);
            if (f != null) {
                uri = Uri.fromFile(f);
                h.d(uri, "Uri.fromFile(outputFile)");
            } else {
                uri = Uri.EMPTY;
                h.d(uri, "Uri.EMPTY");
            }
            if (h.a(Uri.EMPTY, uri)) {
                Logger.d("Error creating image", new Object[0]);
                uri = Uri.EMPTY;
                h.d(uri, "Uri.EMPTY");
            } else {
                try {
                    OutputStream openOutputStream = this.a.getContentResolver().openOutputStream(uri);
                    if (openOutputStream == null) {
                        Logger.d("Error opening image", new Object[0]);
                        Uri uri2 = Uri.EMPTY;
                        h.d(uri2, "Uri.EMPTY");
                        uri = uri2;
                    } else {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, openOutputStream);
                        openOutputStream.close();
                    }
                } catch (IOException e) {
                    Logger.e(e, "Error writing image", new Object[0]);
                }
            }
            createBitmap.recycle();
            return uri;
        }
        Uri uri3 = Uri.EMPTY;
        h.d(uri3, "Uri.EMPTY");
        return uri3;
    }

    @Override // defpackage.eu9
    public Uri a() {
        File f = f(false);
        if (f == null) {
            return null;
        }
        String path = f.getPath();
        h.d(path, "outputFile.path");
        String format = String.format("%s.%s", Arrays.copyOf(new Object[]{this.b, "imagepicker"}, 2));
        h.d(format, "java.lang.String.format(format, *args)");
        Uri b2 = FileProvider.b(this.a, format, new File(path));
        h.d(b2, "FileProvider.getUriForFi…ity, File(imageFilePath))");
        return b2;
    }

    @Override // defpackage.eu9
    public Uri b(Uri uri) {
        Bitmap bitmap;
        int i;
        h.e(uri, "uri");
        BitmapFactory.Options j = j(uri);
        if (j != null) {
            BitmapFactory.Options e = e(j);
            InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
            File file = null;
            if (openInputStream != null) {
                h.d(openInputStream, "context.contentResolver.…tream(uri) ?: return null");
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, e(e));
                openInputStream.close();
                bitmap = decodeStream;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                v5 i2 = i(uri);
                if (i2 != null) {
                    int k = i2.k("Orientation", 1);
                    Matrix matrix = new Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i3 = SnackbarUtilsKt.SNACKBAR_ACTION_DURATION;
                    if (width > 2000 || height > 2000) {
                        float f = (float) width;
                        float f2 = (float) height;
                        float f3 = f / f2;
                        if (1.0f > f3) {
                            i3 = anf.b(((float) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) * f3);
                            i = SnackbarUtilsKt.SNACKBAR_ACTION_DURATION;
                        } else {
                            i = anf.b(((float) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) / f3);
                        }
                        matrix.setScale(((float) i3) / f, ((float) i) / f2);
                    }
                    k(matrix, k);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    h.d(createBitmap, "Bitmap.createBitmap(\n   …t, matrix, true\n        )");
                    File f4 = f(true);
                    if (f4 != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(f4);
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        file = f4;
                    }
                    if (file != null) {
                        Uri fromFile = Uri.fromFile(file);
                        h.d(fromFile, "Uri.fromFile(processed)");
                        return fromFile;
                    }
                    Uri uri2 = Uri.EMPTY;
                    h.d(uri2, "Uri.EMPTY");
                    return uri2;
                }
                Uri uri3 = Uri.EMPTY;
                h.d(uri3, "Uri.EMPTY");
                return uri3;
            }
            Uri uri4 = Uri.EMPTY;
            h.d(uri4, "Uri.EMPTY");
            return uri4;
        }
        Uri uri5 = Uri.EMPTY;
        h.d(uri5, "Uri.EMPTY");
        return uri5;
    }

    @Override // defpackage.eu9
    public Uri c(Uri uri, RectF rectF, boolean z) {
        h.e(uri, "uri");
        h.e(rectF, "cropRect");
        Uri uri2 = Uri.EMPTY;
        try {
            BitmapFactory.Options j = j(uri);
            if (j != null) {
                v5 i = i(uri);
                if (i != null) {
                    int k = i.k("Orientation", 1);
                    Bitmap h = h(uri, g(d(rectF, k), z, j));
                    if (h != null) {
                        uri2 = l(h, k);
                        h.recycle();
                        h.d(uri2, "imageUri");
                        return uri2;
                    }
                    Uri uri3 = Uri.EMPTY;
                    h.d(uri3, "Uri.EMPTY");
                    return uri3;
                }
                Uri uri4 = Uri.EMPTY;
                h.d(uri4, "Uri.EMPTY");
                return uri4;
            }
            Uri uri5 = Uri.EMPTY;
            h.d(uri5, "Uri.EMPTY");
            return uri5;
        } catch (IOException e) {
            Logger.e(e, "Failed to create image", new Object[0]);
        }
    }
}
