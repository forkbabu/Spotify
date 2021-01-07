package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeConverter;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class a {
    private static Method a;
    private static Method b;
    private static boolean c;
    private static LayoutTransition d;
    private static Field e;
    private static boolean f;
    private static Method g;
    private static boolean h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.transition.a$a  reason: collision with other inner class name */
    public interface AbstractC0048a {
        @Override // android.animation.Animator.AnimatorPauseListener, androidx.transition.a.AbstractC0048a
        void onAnimationPause(Animator animator);

        @Override // android.animation.Animator.AnimatorPauseListener, androidx.transition.a.AbstractC0048a
        void onAnimationResume(Animator animator);
    }

    static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(t)) {
            arrayList.add(t);
        }
        return arrayList;
    }

    static void b(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    static Animator c(View view, x xVar, int i, int i2, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator, Transition transition) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) xVar.b.getTag(C0707R.id.transition_position);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f7 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int round = Math.round(f6 - translationX) + i;
        int round2 = Math.round(f7 - translationY) + i2;
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f7, f5));
        z zVar = new z(view, xVar.b, round, round2, translationX, translationY);
        transition.b(zVar);
        ofPropertyValuesHolder.addListener(zVar);
        b(ofPropertyValuesHolder, zVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    static void d(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 29) {
                if (z) {
                    canvas.enableZ();
                } else {
                    canvas.disableZ();
                }
            } else if (i != 28) {
                if (!c) {
                    try {
                        Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                        a = declaredMethod;
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                        b = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    c = true;
                }
                if (z) {
                    try {
                        Method method2 = a;
                        if (method2 != null) {
                            method2.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                }
                if (!z && (method = b) != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } else {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
        }
    }

    static <T> ObjectAnimator e(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new l(property, path), 0.0f, 1.0f);
    }

    static PropertyValuesHolder f(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new l(property, path), 0.0f, 1.0f);
    }

    static <T> ArrayList<T> g(ArrayList<T> arrayList, T t) {
        if (arrayList == null) {
            return arrayList;
        }
        arrayList.remove(t);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    static void h(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (d == null) {
            e0 e0Var = new e0();
            d = e0Var;
            e0Var.setAnimator(2, null);
            d.setAnimator(0, null);
            d.setAnimator(1, null);
            d.setAnimator(3, null);
            d.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!h) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            g = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        h = true;
                    }
                    Method method = g;
                    if (method != null) {
                        try {
                            method.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (layoutTransition != d) {
                    viewGroup.setTag(C0707R.id.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(d);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        e.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused5) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(C0707R.id.transition_layout_save);
        if (layoutTransition2 != null) {
            viewGroup.setTag(C0707R.id.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
