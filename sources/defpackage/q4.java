package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.spotify.music.C0707R;
import defpackage.d5;
import defpackage.z3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q4  reason: default package */
public class q4 {
    private static final AtomicInteger a = new AtomicInteger(1);
    private static WeakHashMap<View, String> b;
    private static WeakHashMap<View, x4> c = null;
    private static Field d;
    private static boolean e = false;
    private static ThreadLocal<Rect> f;
    public static final /* synthetic */ int g = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: q4$a */
    public class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ m4 a;

        a(m4 m4Var) {
            this.a = m4Var;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.a.onApplyWindowInsets(view, b5.p(windowInsets)).o();
        }
    }

    /* renamed from: q4$b */
    static class b implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                View key = entry.getKey();
                boolean booleanValue = entry.getValue().booleanValue();
                boolean z = key.getVisibility() == 0;
                if (booleanValue != z) {
                    if (z) {
                        q4.y(key, 16);
                    }
                    this.a.put(key, Boolean.valueOf(z));
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: q4$d */
    public interface d {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* renamed from: q4$e */
    static class e {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public static final /* synthetic */ int e = 0;
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        e() {
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0707R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((d) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                Boolean bool = Boolean.TRUE;
                WeakHashMap<View, Boolean> weakHashMap = this.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList<WeakReference<View>> arrayList = d;
                if (!arrayList.isEmpty()) {
                    synchronized (arrayList) {
                        if (this.a == null) {
                            this.a = new WeakHashMap<>();
                        }
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ArrayList<WeakReference<View>> arrayList2 = d;
                            View view2 = arrayList2.get(size).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.a.put(view2, bool);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.a.put((View) parent, bool);
                                }
                            }
                        }
                    }
                }
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (this.b == null) {
                        this.b = new SparseArray<>();
                    }
                    this.b.put(keyCode, new WeakReference<>(b2));
                }
            }
            return b2 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean d(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            SparseArray<WeakReference<View>> sparseArray = this.b;
            if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && q4.v(view)) {
                c(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new b();
    }

    public static void A(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect l = l();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                l.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !l.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i);
            if (z && l.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(l);
            }
        } else {
            c(view, i);
        }
    }

    public static b5 B(View view, b5 b5Var) {
        WindowInsets o;
        if (Build.VERSION.SDK_INT >= 21 && (o = b5Var.o()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(o);
            if (!onApplyWindowInsets.equals(o)) {
                return b5.p(onApplyWindowInsets);
            }
        }
        return b5Var;
    }

    public static void C(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            D(i, view);
            y(view, 0);
        }
    }

    private static void D(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0707R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C0707R.id.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((d5.a) arrayList.get(i2)).b() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    public static void E(View view, d5.a aVar, CharSequence charSequence, f5 f5Var) {
        if (f5Var == null && charSequence == null) {
            C(view, aVar.b());
            return;
        }
        d5.a a2 = aVar.a(charSequence, f5Var);
        if (Build.VERSION.SDK_INT >= 21) {
            z3 g2 = g(view);
            if (g2 == null) {
                g2 = new z3();
            }
            I(view, g2);
            D(a2.b(), view);
            ArrayList arrayList = (ArrayList) view.getTag(C0707R.id.tag_accessibility_actions);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(C0707R.id.tag_accessibility_actions, arrayList);
            }
            arrayList.add(a2);
            y(view, 0);
        }
    }

    public static void F(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static <T extends View> T G(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void H(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void I(View view, z3 z3Var) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (z3Var == null && (h(view) instanceof z3.a)) {
            z3Var = new z3();
        }
        if (z3Var == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = z3Var.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void J(View view, boolean z) {
        new t4(C0707R.id.tag_accessibility_heading, Boolean.class, 28).e(view, Boolean.valueOf(z));
    }

    public static void K(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static void L(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof p4) {
            ((p4) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void M(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void N(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void O(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
            return;
        }
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public static void P(View view, m4 m4Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (m4Var == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(m4Var));
        }
    }

    public static void Q(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    public static void R(View view, o4 o4Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (o4Var != null ? o4Var.a() : null));
        }
    }

    public static void S(View view, boolean z) {
        new r4(C0707R.id.tag_screen_reader_focusable, Boolean.class, 28).e(view, Boolean.valueOf(z));
    }

    public static void T(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (b == null) {
            b = new WeakHashMap<>();
        }
        b.put(view, str);
    }

    public static void U(View view, int i) {
        if (view instanceof f4) {
            ((f4) view).r(i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof g4) {
                ((g4) view).stopNestedScroll();
            }
        }
    }

    private static void V(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static x4 a(View view) {
        if (c == null) {
            c = new WeakHashMap<>();
        }
        x4 x4Var = c.get(view);
        if (x4Var != null) {
            return x4Var;
        }
        x4 x4Var2 = new x4(view);
        c.put(view, x4Var2);
        return x4Var2;
    }

    private static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                V((View) parent);
            }
        }
    }

    private static void c(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                V((View) parent);
            }
        }
    }

    public static b5 d(View view, b5 b5Var) {
        WindowInsets o;
        return (Build.VERSION.SDK_INT < 21 || (o = b5Var.o()) == null || view.dispatchApplyWindowInsets(o).equals(o)) ? b5Var : b5.p(o);
    }

    static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i = e.e;
        e eVar = (e) view.getTag(C0707R.id.tag_unhandled_key_event_manager);
        if (eVar == null) {
            eVar = new e();
            view.setTag(C0707R.id.tag_unhandled_key_event_manager, eVar);
        }
        return eVar.a(view, keyEvent);
    }

    public static int f() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static z3 g(View view) {
        View.AccessibilityDelegate h = h(view);
        if (h == null) {
            return null;
        }
        if (h instanceof z3.a) {
            return ((z3.a) h).a;
        }
        return new z3(h);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (e) {
            return null;
        }
        if (d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                e = true;
                return null;
            }
        }
        try {
            Object obj = d.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            e = true;
            return null;
        }
    }

    public static ColorStateList i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof p4) {
            return ((p4) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static Rect j(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static float k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    private static Rect l() {
        if (f == null) {
            f = new ThreadLocal<>();
        }
        Rect rect = f.get();
        if (rect == null) {
            rect = new Rect();
            f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean m(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    public static int n(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static String s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int t(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    public static float u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean v(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean w(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean x(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof g4) {
            return ((g4) view).isNestedScrollingEnabled();
        }
        return false;
    }

    static void y(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            int i2 = 0;
            boolean z = ((CharSequence) new s4(C0707R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view)) != null;
            if (Build.VERSION.SDK_INT >= 19) {
                i2 = view.getAccessibilityLiveRegion();
            }
            if (i2 != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void z(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect l = l();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                l.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !l.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            b(view, i);
            if (z && l.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(l);
            }
        } else {
            b(view, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q4$c */
    public static abstract class c<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        c(int i, Class<T> cls, int i2) {
            this.a = i;
            this.b = cls;
            this.c = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract T b(View view);

        /* access modifiers changed from: package-private */
        public abstract void c(View view, T t);

        /* access modifiers changed from: package-private */
        public T d(View view) {
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= this.c) {
                return b(view);
            }
            if (i >= 19) {
                z = true;
            }
            if (!z) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void e(View view, T t) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i >= this.c) {
                c(view, t);
                return;
            }
            if (i < 19) {
                z = false;
            }
            if (z && f(d(view), t)) {
                z3 g = q4.g(view);
                if (g == null) {
                    g = new z3();
                }
                q4.I(view, g);
                view.setTag(this.a, t);
                q4.y(view, 0);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean f(T t, T t2);

        c(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.c = i3;
        }
    }
}
