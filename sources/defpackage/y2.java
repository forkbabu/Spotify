package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.i3;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y2  reason: default package */
public class y2 extends w2 {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public y2() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = r(cls2);
            method2 = s(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = t(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder V0 = je.V0("Unable to collect necessary methods for class ");
            V0.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", V0.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method2;
        this.k = method;
        this.l = method4;
        this.m = method5;
    }

    private void l(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        return this.i != null;
    }

    private Object q() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.w2, defpackage.b3
    public Typeface a(Context context, l2 l2Var, Resources resources, int i2) {
        if (!p()) {
            return super.a(context, l2Var, resources, i2);
        }
        Object q = q();
        if (q == null) {
            return null;
        }
        m2[] a = l2Var.a();
        for (m2 m2Var : a) {
            if (!m(context, q, m2Var.a(), m2Var.c(), m2Var.e(), m2Var.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(m2Var.d()))) {
                l(q);
                return null;
            }
        }
        if (!o(q)) {
            return null;
        }
        return n(q);
    }

    @Override // defpackage.w2, defpackage.b3
    public Typeface b(Context context, CancellationSignal cancellationSignal, i3.f[] fVarArr, int i2) {
        Typeface n;
        boolean z;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            i3.f f = f(fVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.d()).setItalic(f.e()).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
                return null;
            }
        } else {
            int i3 = i3.f;
            HashMap hashMap = new HashMap();
            for (i3.f fVar : fVarArr) {
                if (fVar.a() == 0) {
                    Uri c = fVar.c();
                    if (!hashMap.containsKey(c)) {
                        hashMap.put(c, r2.i(context, cancellationSignal, c));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object q = q();
            if (q == null) {
                return null;
            }
            boolean z2 = false;
            for (i3.f fVar2 : fVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(fVar2.c());
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.j.invoke(q, byteBuffer, Integer.valueOf(fVar2.b()), null, Integer.valueOf(fVar2.d()), Integer.valueOf(fVar2.e() ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z) {
                        l(q);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                l(q);
                return null;
            } else if (o(q) && (n = n(q)) != null) {
                return Typeface.create(n, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // defpackage.b3
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!p()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object q = q();
        if (q == null) {
            return null;
        }
        if (!m(context, q, str, 0, -1, -1, null)) {
            l(q);
            return null;
        } else if (!o(q)) {
            return null;
        } else {
            return n(q);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface n(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method r(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    public Method s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* access modifiers changed from: protected */
    public Method t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
