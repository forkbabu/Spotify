package com.spotify.music.features.profile.editprofile.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.spotify.base.java.logging.Logger;

/* access modifiers changed from: package-private */
public final class c {
    static RectF a(RectF rectF, int i) {
        RectF rectF2 = new RectF(rectF);
        switch (i) {
            case 1:
                break;
            case 2:
                rectF2.set(1.0f - rectF2.right, rectF2.top, 1.0f - rectF2.left, rectF2.bottom);
                break;
            case 3:
                rectF2.set(1.0f - rectF2.right, 1.0f - rectF2.bottom, 1.0f - rectF2.left, 1.0f - rectF2.top);
                break;
            case 4:
                rectF2.set(rectF2.left, 1.0f - rectF2.bottom, rectF2.right, 1.0f - rectF2.top);
                break;
            case 5:
                rectF2.set(rectF2.top, rectF2.left, rectF2.bottom, rectF2.right);
                break;
            case 6:
                rectF2.set(rectF2.top, 1.0f - rectF2.right, rectF2.bottom, 1.0f - rectF2.left);
                break;
            case 7:
                rectF2.set(1.0f - rectF2.bottom, 1.0f - rectF2.right, 1.0f - rectF2.top, 1.0f - rectF2.left);
                break;
            case 8:
                rectF2.set(1.0f - rectF2.bottom, rectF2.left, 1.0f - rectF2.top, rectF2.right);
                break;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                break;
        }
        return rectF2;
    }

    static Matrix b(Matrix matrix, int i) {
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
}
