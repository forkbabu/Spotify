package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

class j {
    private static boolean a = true;
    private static Field b;
    private static boolean c;

    static void a(ImageView imageView, Matrix matrix) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else if (i < 21) {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                Matrix matrix2 = null;
                if (!c) {
                    try {
                        Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                        b = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused) {
                    }
                    c = true;
                }
                Field field = b;
                if (field != null) {
                    try {
                        Matrix matrix3 = (Matrix) field.get(imageView);
                        if (matrix3 == null) {
                            try {
                                matrix2 = new Matrix();
                                b.set(imageView, matrix2);
                            } catch (IllegalAccessException unused2) {
                            }
                        }
                        matrix2 = matrix3;
                    } catch (IllegalAccessException unused3) {
                    }
                }
                if (matrix2 != null) {
                    matrix2.set(matrix);
                }
                imageView.invalidate();
            }
        } else if (a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused4) {
                a = false;
            }
        }
    }
}
