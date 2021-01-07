package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import defpackage.i3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w2  reason: default package */
class w2 extends b3 {
    private static Class<?> b = null;
    private static Constructor<?> c = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    w2() {
    }

    private static boolean i(Object obj, String str, int i, boolean z) {
        k();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            c = constructor;
            b = cls;
            d = method;
            e = method2;
        }
    }

    @Override // defpackage.b3
    public Typeface a(Context context, l2 l2Var, Resources resources, int i) {
        k();
        try {
            Object newInstance = c.newInstance(new Object[0]);
            m2[] a = l2Var.a();
            for (m2 m2Var : a) {
                File h = r2.h(context);
                if (h == null) {
                    return null;
                }
                try {
                    if (!r2.c(h, resources, m2Var.b())) {
                        h.delete();
                        return null;
                    } else if (!i(newInstance, h.getPath(), m2Var.e(), m2Var.f())) {
                        return null;
                    } else {
                        h.delete();
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    h.delete();
                }
            }
            k();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.b3
    public Typeface b(Context context, CancellationSignal cancellationSignal, i3.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        i3.f f2 = f(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f2.c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j = j(openFileDescriptor);
                if (j != null) {
                    if (j.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(j);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface c2 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c2;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
            return null;
        }
        throw th;
        throw th;
    }
}
