package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public int a = -1;
    Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i = null;

    public IconCompat() {
    }

    static Bitmap c(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat e(Context context, int i2) {
        if (context != null) {
            return f(context.getResources(), context.getPackageName(), i2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat f(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static Resources i(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    private InputStream l(Context context) {
        Uri k = k();
        String scheme = k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(k);
            } catch (Exception unused) {
                String str = "Unable to load image from URI: " + k;
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException unused2) {
                String str2 = "Unable to load image from path: " + k;
                return null;
            }
        }
    }

    public void a(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmap;
        b(context);
        int i2 = this.a;
        if (i2 == 1) {
            bitmap = (Bitmap) this.b;
        } else if (i2 == 2) {
            try {
                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(h(), 0), this.e));
                return;
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder V0 = je.V0("Can't find package ");
                V0.append(this.b);
                throw new IllegalArgumentException(V0.toString(), e2);
            }
        } else if (i2 == 5) {
            bitmap = c((Bitmap) this.b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public void b(Context context) {
        if (this.a == 2) {
            String str = (String) this.b;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = i(context, str5).getIdentifier(str4, str3, str5);
                if (this.e != identifier) {
                    this.e = identifier;
                }
            }
        }
    }

    public int g() {
        int i2;
        int i3 = this.a;
        if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.b;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
            }
        } else if (i3 == 2) {
            return this.e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return 0;
    }

    public String h() {
        int i2;
        int i3 = this.a;
        if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.b;
            if (i2 >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
            }
        } else if (i3 == 2) {
            return ((String) this.b).split(":", -1)[0];
        } else {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return null;
    }

    public int j() {
        int i2;
        int i3 = this.a;
        if (i3 != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            return i3;
        }
        Icon icon = (Icon) this.b;
        if (i2 >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    public Uri k() {
        int i2;
        int i3 = this.a;
        if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.b;
            if (i2 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
            }
        } else if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return null;
    }

    public Drawable m(Context context) {
        b(context);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return n(context).loadDrawable(context);
        }
        Drawable drawable = null;
        switch (this.a) {
            case 1:
                drawable = new BitmapDrawable(context.getResources(), (Bitmap) this.b);
                break;
            case 2:
                String h2 = h();
                if (TextUtils.isEmpty(h2)) {
                    h2 = context.getPackageName();
                }
                try {
                    drawable = i2.d(i(context, h2), this.e, context.getTheme());
                    break;
                } catch (RuntimeException e2) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.e), this.b), e2);
                    break;
                }
            case 3:
                drawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.b, this.e, this.f));
                break;
            case 4:
                InputStream l = l(context);
                if (l != null) {
                    drawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(l));
                    break;
                }
                break;
            case 5:
                drawable = new BitmapDrawable(context.getResources(), c((Bitmap) this.b, false));
                break;
            case 6:
                InputStream l2 = l(context);
                if (l2 != null) {
                    if (i2 < 26) {
                        drawable = new BitmapDrawable(context.getResources(), c(BitmapFactory.decodeStream(l2), false));
                        break;
                    } else {
                        drawable = new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(l2)));
                        break;
                    }
                }
                break;
        }
        if (!(drawable == null || (this.g == null && this.h == j))) {
            drawable.mutate();
            a.i(drawable, this.g);
            a.j(drawable, this.h);
        }
        return drawable;
    }

    public Icon n(Context context) {
        Icon icon;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                icon = Icon.createWithResource(h(), this.e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(c((Bitmap) this.b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.b);
                    break;
                }
            case 6:
                if (context != null) {
                    InputStream l = l(context);
                    if (l != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(c(BitmapFactory.decodeStream(l), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(l));
                            break;
                        }
                    } else {
                        StringBuilder V0 = je.V0("Cannot load adaptive icon from uri: ");
                        V0.append(k());
                        throw new IllegalStateException(V0.toString());
                    }
                } else {
                    StringBuilder V02 = je.V0("Context is required to resolve the file uri of the icon: ");
                    V02.append(k());
                    throw new IllegalArgumentException(V02.toString());
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != j) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(h());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != j) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i2) {
        this.a = i2;
    }
}
