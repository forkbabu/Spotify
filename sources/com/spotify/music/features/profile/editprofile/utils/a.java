package com.spotify.music.features.profile.editprofile.utils;

import android.app.Activity;
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

public class a {
    private final Activity a;
    private final String b;

    public a(Activity activity, String str) {
        this.a = activity;
        this.b = str;
    }

    private File a(boolean z) {
        File file = new File(this.a.getCacheDir(), "profile");
        if (file.exists() || file.mkdirs()) {
            try {
                return File.createTempFile("profile_", z ? ".png" : ".jpg", file);
            } catch (IOException unused) {
                return null;
            }
        } else {
            Logger.d("Could not make output directory: %s", file.toString());
            return null;
        }
    }

    private Uri c(Bitmap bitmap) {
        Uri uri;
        File a2 = a(false);
        if (a2 == null) {
            uri = null;
        } else {
            uri = Uri.fromFile(a2);
        }
        if (uri == null) {
            Logger.d("Error creating profile image", new Object[0]);
            return null;
        }
        try {
            OutputStream openOutputStream = this.a.getContentResolver().openOutputStream(uri);
            if (openOutputStream == null) {
                Logger.d("Error opening profile image", new Object[0]);
                return null;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, openOutputStream);
            openOutputStream.close();
            return uri;
        } catch (IOException e) {
            Logger.e(e, "Error writing profile image", new Object[0]);
        }
    }

    public Uri b() {
        File a2 = a(false);
        if (a2 == null) {
            return null;
        }
        return FileProvider.b(this.a, String.format("%s.%s", this.b, "profile"), new File(a2.getPath()));
    }

    public Uri d(Uri uri, RectF rectF, boolean z) {
        int i;
        int i2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i3 = 1;
            options.inJustDecodeBounds = true;
            InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            BitmapFactory.decodeStream(openInputStream, null, options);
            openInputStream.close();
            InputStream openInputStream2 = this.a.getContentResolver().openInputStream(uri);
            if (openInputStream2 == null) {
                return null;
            }
            v5 v5Var = new v5(openInputStream2);
            openInputStream2.close();
            int k = v5Var.k("Orientation", 1);
            RectF a2 = c.a(rectF, k);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            float f = (float) i4;
            int round = Math.round(a2.left * f);
            float f2 = (float) i5;
            int round2 = Math.round(a2.top * f2);
            if (z) {
                int min = Math.min(Math.round(a2.width() * f), Math.round(a2.height() * f2));
                i = round + min;
                i2 = min + round2;
            } else {
                i = Math.round(a2.right * f);
                i2 = Math.round(a2.bottom * f2);
            }
            Rect rect = new Rect(round, round2, i, i2);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int width = rect.width();
            int height = rect.height();
            while (true) {
                if ((height / i3) * (width / i3) < 9000000) {
                    break;
                }
                i3 *= 2;
            }
            options2.inSampleSize = i3;
            InputStream openInputStream3 = this.a.getContentResolver().openInputStream(uri);
            if (openInputStream3 == null) {
                return null;
            }
            Bitmap decodeRegion = BitmapRegionDecoder.newInstance(openInputStream3, false).decodeRegion(rect, options2);
            openInputStream3.close();
            if (decodeRegion == null) {
                return null;
            }
            int width2 = decodeRegion.getWidth();
            int height2 = decodeRegion.getHeight();
            Matrix matrix = new Matrix();
            c.b(matrix, k);
            Bitmap createBitmap = Bitmap.createBitmap(decodeRegion, 0, 0, width2, height2, matrix, true);
            if (createBitmap == null) {
                return null;
            }
            Uri c = c(createBitmap);
            decodeRegion.recycle();
            createBitmap.recycle();
            return c;
        } catch (IOException e) {
            Logger.e(e, "Failed to create profile image", new Object[0]);
            return null;
        }
    }

    public Uri e(Uri uri) {
        InputStream openInputStream;
        int i;
        InputStream openInputStream2 = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream2 == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(openInputStream2, null, options);
        openInputStream2.close();
        InputStream openInputStream3 = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream3 == null) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i2 = 1;
        while (true) {
            if (((options.outWidth / 2) / i2) * ((options.outHeight / 2) / i2) < 4000000) {
                break;
            }
            i2 *= 2;
        }
        options2.inSampleSize = i2;
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream3, null, options2);
        openInputStream3.close();
        if (decodeStream == null || (openInputStream = this.a.getContentResolver().openInputStream(uri)) == null) {
            return null;
        }
        v5 v5Var = new v5(openInputStream);
        openInputStream.close();
        int k = v5Var.k("Orientation", 1);
        Matrix matrix = new Matrix();
        int width = decodeStream.getWidth();
        int height = decodeStream.getHeight();
        int i3 = SnackbarUtilsKt.SNACKBAR_ACTION_DURATION;
        if (width > 2000 || height > 2000) {
            float f = (float) width;
            float f2 = (float) height;
            float f3 = f / f2;
            if (1.0f > f3) {
                i3 = Math.round(((float) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) * f3);
                i = SnackbarUtilsKt.SNACKBAR_ACTION_DURATION;
            } else {
                i = Math.round(((float) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) / f3);
            }
            matrix.setScale(((float) i3) / f, ((float) i) / f2);
        }
        c.b(matrix, k);
        Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
        if (createBitmap == null) {
            return null;
        }
        File a2 = a(true);
        if (a2 == null) {
            a2 = null;
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(a2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        }
        if (a2 == null) {
            return null;
        }
        return Uri.fromFile(a2);
    }

    public void f() {
        try {
            File file = new File(this.a.getCacheDir(), "profile");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file2 : listFiles) {
                if (!file2.delete()) {
                    Logger.n("Error deleting file: %s", file2.getName());
                }
            }
            if (!file.delete()) {
                Logger.d("Error deleting directory: %s", file.getName());
            }
        } catch (Exception e) {
            Logger.d("Error deleting directory: %s: %s", e.getClass().getCanonicalName(), e.getMessage());
        }
    }
}
