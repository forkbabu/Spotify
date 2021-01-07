package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class h implements f {
    private static Class<?> b;
    private static boolean c;
    private static Method f;
    private static boolean n;
    private static Method o;
    private static boolean p;
    private final View a;

    private h(View view) {
        this.a = view;
    }

    static f b(View view, ViewGroup viewGroup, Matrix matrix) {
        if (!n) {
            try {
                if (!c) {
                    try {
                        b = Class.forName("android.view.GhostView");
                    } catch (ClassNotFoundException unused) {
                    }
                    c = true;
                }
                Method declaredMethod = b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            n = true;
        }
        Method method = f;
        if (method != null) {
            try {
                return new h((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused3) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    static void c(View view) {
        if (!p) {
            try {
                if (!c) {
                    try {
                        b = Class.forName("android.view.GhostView");
                    } catch (ClassNotFoundException unused) {
                    }
                    c = true;
                }
                Method declaredMethod = b.getDeclaredMethod("removeGhost", View.class);
                o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            p = true;
        }
        Method method = o;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused3) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.f
    public void setVisibility(int i) {
        this.a.setVisibility(i);
    }
}
