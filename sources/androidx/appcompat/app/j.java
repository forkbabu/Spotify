package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.s;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import defpackage.q0;
import defpackage.u0;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class j extends i implements g.a, LayoutInflater.Factory2 {
    private static final t1<String, Integer> j0 = new t1<>();
    private static final boolean k0;
    private static final int[] l0 = {16842836};
    private static final boolean m0 = (!"robolectric".equals(Build.FINGERPRINT));
    private static final boolean n0;
    private static boolean o0 = true;
    Runnable A;
    x4 B;
    private boolean C;
    private boolean D;
    ViewGroup E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    private boolean O;
    private k[] P;
    private k Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    boolean V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private g a0;
    private g b0;
    boolean c0;
    int d0;
    private final Runnable e0;
    final Object f;
    private boolean f0;
    private Rect g0;
    private Rect h0;
    private q i0;
    final Context n;
    Window o;
    private e p;
    final h q;
    ActionBar r;
    MenuInflater s;
    private CharSequence t;
    private o u;
    private c v;
    private l w;
    q0 x;
    ActionBarContextView y;
    PopupWindow z;

    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if ((jVar.d0 & 1) != 0) {
                jVar.K(0);
            }
            j jVar2 = j.this;
            if ((jVar2.d0 & 4096) != 0) {
                jVar2.K(108);
            }
            j jVar3 = j.this;
            jVar3.c0 = false;
            jVar3.d0 = 0;
        }
    }

    /* access modifiers changed from: private */
    public final class c implements m.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            j.this.F(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback Q = j.this.Q();
            if (Q == null) {
                return true;
            }
            Q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements q0.a {
        private q0.a a;

        class a extends z4 {
            a() {
            }

            @Override // defpackage.y4
            public void b(View view) {
                j.this.y.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.y.getParent() instanceof View) {
                    q4.F((View) j.this.y.getParent());
                }
                j.this.y.removeAllViews();
                j.this.B.f(null);
                j jVar2 = j.this;
                jVar2.B = null;
                q4.F(jVar2.E);
            }
        }

        public d(q0.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.q0.a
        public void a(q0 q0Var) {
            this.a.a(q0Var);
            j jVar = j.this;
            if (jVar.z != null) {
                jVar.o.getDecorView().removeCallbacks(j.this.A);
            }
            j jVar2 = j.this;
            if (jVar2.y != null) {
                jVar2.L();
                j jVar3 = j.this;
                x4 a2 = q4.a(jVar3.y);
                a2.a(0.0f);
                jVar3.B = a2;
                j.this.B.f(new a());
            }
            j jVar4 = j.this;
            h hVar = jVar4.q;
            if (hVar != null) {
                hVar.b0(jVar4.x);
            }
            j jVar5 = j.this;
            jVar5.x = null;
            q4.F(jVar5.E);
        }

        @Override // defpackage.q0.a
        public boolean b(q0 q0Var, Menu menu) {
            return this.a.b(q0Var, menu);
        }

        @Override // defpackage.q0.a
        public boolean c(q0 q0Var, MenuItem menuItem) {
            return this.a.c(q0Var, menuItem);
        }

        @Override // defpackage.q0.a
        public boolean d(q0 q0Var, Menu menu) {
            q4.F(j.this.E);
            return this.a.d(q0Var, menu);
        }
    }

    /* access modifiers changed from: private */
    public class f extends g {
        private final PowerManager c;

        f(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.j.g
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.g
        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !this.c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        @Override // androidx.appcompat.app.j.g
        public void d() {
            j.this.B();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class g {
        private BroadcastReceiver a;

        /* access modifiers changed from: package-private */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        g() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    j.this.n.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                j.this.n.registerReceiver(this.a, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class h extends g {
        private final s c;

        h(s sVar) {
            super();
            this.c = sVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.j.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.g
        public int c() {
            return this.c.b() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.j.g
        public void d() {
            j.this.B();
        }
    }

    /* access modifiers changed from: package-private */
    public static class i {
        private static Field a;
        private static boolean b;
        private static Class<?> c;
        private static boolean d;
        private static Field e;
        private static boolean f;
        private static Field g;
        private static boolean h;

        static void a(Resources resources) {
            Object obj;
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                Map map = null;
                r3 = null;
                r3 = null;
                Object obj2 = null;
                Object obj3 = null;
                if (i >= 24) {
                    if (!h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                        }
                        h = true;
                    }
                    Field field = g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                }
                                b = true;
                            }
                            Field field2 = a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                }
                            }
                            if (obj2 != null) {
                                b(obj2);
                            }
                        }
                    }
                } else if (i >= 23) {
                    if (!b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                        }
                        b = true;
                    }
                    Field field3 = a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                        }
                    }
                    if (obj3 != null) {
                        b(obj3);
                    }
                } else if (i >= 21) {
                    if (!b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e8) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
                        }
                        b = true;
                    }
                    Field field4 = a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
        }

        private static void b(Object obj) {
            if (!d) {
                try {
                    c = Class.forName("android.content.res.ThemedResourceCache");
                } catch (ClassNotFoundException e2) {
                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
                }
                d = true;
            }
            Class<?> cls = c;
            if (cls != null) {
                if (!f) {
                    try {
                        Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                        e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                    }
                    f = true;
                }
                Field field = e;
                if (field != null) {
                    LongSparseArray longSparseArray = null;
                    try {
                        longSparseArray = (LongSparseArray) field.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    }
                    if (longSparseArray != null) {
                        longSparseArray.clear();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$j  reason: collision with other inner class name */
    public class C0016j extends ContentFrameLayout {
        public C0016j(Context context) {
            super(context, null);
        }

        @Override // android.view.View, android.view.ViewGroup
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    j jVar = j.this;
                    jVar.G(jVar.P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(i0.b(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    public static final class k {
        int a;
        int b;
        int c;
        int d;
        ViewGroup e;
        View f;
        View g;
        androidx.appcompat.view.menu.g h;
        androidx.appcompat.view.menu.e i;
        Context j;
        boolean k;
        boolean l;
        boolean m;
        public boolean n;
        boolean o = false;
        boolean p;
        Bundle q;

        k(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public void a(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.h;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.B(this.i);
                }
                this.h = gVar;
                if (gVar != null && (eVar = this.i) != null) {
                    gVar.b(eVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final class l implements m.a {
        l() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g q = gVar.q();
            boolean z2 = q != gVar;
            j jVar = j.this;
            if (z2) {
                gVar = q;
            }
            k O = jVar.O(gVar);
            if (O == null) {
                return;
            }
            if (z2) {
                j.this.E(O.a, O, q);
                j.this.G(O, true);
                return;
            }
            j.this.G(O, z);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback Q;
            if (gVar != gVar.q()) {
                return true;
            }
            j jVar = j.this;
            if (!jVar.J || (Q = jVar.Q()) == null || j.this.V) {
                return true;
            }
            Q.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        boolean z3 = i2 < 21;
        k0 = z3;
        if (i2 >= 17) {
            z2 = true;
        }
        n0 = z2;
        if (z3 && !o0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    j(Activity activity, h hVar) {
        this(activity, null, hVar, activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean C(boolean r11) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.C(boolean):boolean");
    }

    private void D(Window window) {
        if (this.o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.p = eVar;
                window.setCallback(eVar);
                h0 u2 = h0.u(this.n, null, l0);
                Drawable h2 = u2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                u2.w();
                this.o = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private Configuration H(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private void M() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        int[] iArr = h0.k;
        if (!this.D) {
            TypedArray obtainStyledAttributes = this.n.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(115)) {
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    v(1);
                } else if (obtainStyledAttributes.getBoolean(115, false)) {
                    v(108);
                }
                if (obtainStyledAttributes.getBoolean(116, false)) {
                    v(109);
                }
                if (obtainStyledAttributes.getBoolean(117, false)) {
                    v(10);
                }
                this.M = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                N();
                this.o.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.n);
                if (this.N) {
                    viewGroup = this.L ? (ViewGroup) from.inflate(C0707R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C0707R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.M) {
                    viewGroup = (ViewGroup) from.inflate(C0707R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.K = false;
                    this.J = false;
                } else if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    this.n.getTheme().resolveAttribute(C0707R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new s0(this.n, typedValue.resourceId);
                    } else {
                        context = this.n;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0707R.layout.abc_screen_toolbar, (ViewGroup) null);
                    o oVar = (o) viewGroup.findViewById(C0707R.id.decor_content_parent);
                    this.u = oVar;
                    oVar.setWindowCallback(Q());
                    if (this.K) {
                        this.u.h(109);
                    }
                    if (this.H) {
                        this.u.h(2);
                    }
                    if (this.I) {
                        this.u.h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        q4.P(viewGroup, new k(this));
                    } else if (viewGroup instanceof s) {
                        ((s) viewGroup).setOnFitSystemWindowsListener(new l(this));
                    }
                    if (this.u == null) {
                        this.F = (TextView) viewGroup.findViewById(C0707R.id.title);
                    }
                    int i2 = o0.b;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0707R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.o.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.o.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new m(this));
                    this.E = viewGroup;
                    Object obj = this.f;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.t;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        o oVar2 = this.u;
                        if (oVar2 != null) {
                            oVar2.setWindowTitle(charSequence);
                        } else {
                            ActionBar actionBar = this.r;
                            if (actionBar != null) {
                                actionBar.o(charSequence);
                            } else {
                                TextView textView = this.F;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(16908290);
                    View decorView = this.o.getDecorView();
                    contentFrameLayout2.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    TypedArray obtainStyledAttributes2 = this.n.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(118)) {
                        obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(119)) {
                        obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.D = true;
                    k P2 = P(0);
                    if (!this.V && P2.h == null) {
                        S(108);
                        return;
                    }
                    return;
                }
                StringBuilder V0 = je.V0("AppCompat does not support the current theme features: { windowActionBar: ");
                V0.append(this.J);
                V0.append(", windowActionBarOverlay: ");
                V0.append(this.K);
                V0.append(", android:windowIsFloating: ");
                V0.append(this.M);
                V0.append(", windowActionModeOverlay: ");
                V0.append(this.L);
                V0.append(", windowNoTitle: ");
                throw new IllegalArgumentException(je.P0(V0, this.N, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    private void N() {
        if (this.o == null) {
            Object obj = this.f;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void R() {
        M();
        if (this.J && this.r == null) {
            Object obj = this.f;
            if (obj instanceof Activity) {
                this.r = new t((Activity) this.f, this.K);
            } else if (obj instanceof Dialog) {
                this.r = new t((Dialog) this.f);
            }
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.h(this.f0);
            }
        }
    }

    private void S(int i2) {
        this.d0 = (1 << i2) | this.d0;
        if (!this.c0) {
            View decorView = this.o.getDecorView();
            Runnable runnable = this.e0;
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            decorView.postOnAnimation(runnable);
            this.c0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0134, code lost:
        if (r14 != null) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(androidx.appcompat.app.j.k r13, android.view.KeyEvent r14) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.Y(androidx.appcompat.app.j$k, android.view.KeyEvent):void");
    }

    private boolean Z(k kVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.k || a0(kVar, keyEvent)) && (gVar = kVar.h) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.u == null) {
            G(kVar, true);
        }
        return z2;
    }

    private boolean a0(k kVar, KeyEvent keyEvent) {
        o oVar;
        o oVar2;
        o oVar3;
        Resources.Theme theme;
        o oVar4;
        if (this.V) {
            return false;
        }
        if (kVar.k) {
            return true;
        }
        k kVar2 = this.Q;
        if (!(kVar2 == null || kVar2 == kVar)) {
            G(kVar2, false);
        }
        Window.Callback Q2 = Q();
        if (Q2 != null) {
            kVar.g = Q2.onCreatePanelView(kVar.a);
        }
        int i2 = kVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (oVar4 = this.u) != null) {
            oVar4.f();
        }
        if (kVar.g == null) {
            androidx.appcompat.view.menu.g gVar = kVar.h;
            if (gVar == null || kVar.p) {
                if (gVar == null) {
                    Context context = this.n;
                    int i3 = kVar.a;
                    if ((i3 == 0 || i3 == 108) && this.u != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C0707R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C0707R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C0707R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            s0 s0Var = new s0(context, 0);
                            s0Var.getTheme().setTo(theme);
                            context = s0Var;
                        }
                    }
                    androidx.appcompat.view.menu.g gVar2 = new androidx.appcompat.view.menu.g(context);
                    gVar2.G(this);
                    kVar.a(gVar2);
                    if (kVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (oVar3 = this.u) != null) {
                    if (this.v == null) {
                        this.v = new c();
                    }
                    oVar3.d(kVar.h, this.v);
                }
                kVar.h.R();
                if (!Q2.onCreatePanelMenu(kVar.a, kVar.h)) {
                    kVar.a(null);
                    if (z2 && (oVar2 = this.u) != null) {
                        oVar2.d(null, this.v);
                    }
                    return false;
                }
                kVar.p = false;
            }
            kVar.h.R();
            Bundle bundle = kVar.q;
            if (bundle != null) {
                kVar.h.C(bundle);
                kVar.q = null;
            }
            if (!Q2.onPreparePanel(0, kVar.g, kVar.h)) {
                if (z2 && (oVar = this.u) != null) {
                    oVar.d(null, this.v);
                }
                kVar.h.Q();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            kVar.n = z3;
            kVar.h.setQwertyMode(z3);
            kVar.h.Q();
        }
        kVar.k = true;
        kVar.l = false;
        this.Q = kVar;
        return true;
    }

    private void d0() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.i
    public final void A(CharSequence charSequence) {
        this.t = charSequence;
        o oVar = this.u;
        if (oVar != null) {
            oVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.o(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean B() {
        return C(true);
    }

    /* access modifiers changed from: package-private */
    public void E(int i2, k kVar, Menu menu) {
        if (menu == null && kVar != null) {
            menu = kVar.h;
        }
        if ((kVar == null || kVar.m) && !this.V) {
            this.p.a().onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(androidx.appcompat.view.menu.g gVar) {
        if (!this.O) {
            this.O = true;
            this.u.i();
            Window.Callback Q2 = Q();
            if (Q2 != null && !this.V) {
                Q2.onPanelClosed(108, gVar);
            }
            this.O = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void G(k kVar, boolean z2) {
        ViewGroup viewGroup;
        o oVar;
        if (!z2 || kVar.a != 0 || (oVar = this.u) == null || !oVar.e()) {
            WindowManager windowManager = (WindowManager) this.n.getSystemService("window");
            if (!(windowManager == null || !kVar.m || (viewGroup = kVar.e) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    E(kVar.a, kVar, null);
                }
            }
            kVar.k = false;
            kVar.l = false;
            kVar.m = false;
            kVar.f = null;
            kVar.o = true;
            if (this.Q == kVar) {
                this.Q = null;
                return;
            }
            return;
        }
        F(kVar.h);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        o oVar = this.u;
        if (oVar != null) {
            oVar.i();
        }
        if (this.z != null) {
            this.o.getDecorView().removeCallbacks(this.A);
            if (this.z.isShowing()) {
                try {
                    this.z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.z = null;
        }
        L();
        androidx.appcompat.view.menu.g gVar = P(0).h;
        if (gVar != null) {
            gVar.e(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.J(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        k P2 = P(i2);
        if (P2.h != null) {
            Bundle bundle = new Bundle();
            P2.h.E(bundle);
            if (bundle.size() > 0) {
                P2.q = bundle;
            }
            P2.h.R();
            P2.h.clear();
        }
        P2.p = true;
        P2.o = true;
        if ((i2 == 108 || i2 == 0) && this.u != null) {
            k P3 = P(0);
            P3.k = false;
            a0(P3, null);
        }
    }

    /* access modifiers changed from: package-private */
    public void L() {
        x4 x4Var = this.B;
        if (x4Var != null) {
            x4Var.b();
        }
    }

    /* access modifiers changed from: package-private */
    public k O(Menu menu) {
        k[] kVarArr = this.P;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            k kVar = kVarArr[i2];
            if (kVar != null && kVar.h == menu) {
                return kVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public k P(int i2) {
        k[] kVarArr = this.P;
        if (kVarArr == null || kVarArr.length <= i2) {
            k[] kVarArr2 = new k[(i2 + 1)];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.P = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i2];
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(i2);
        kVarArr[i2] = kVar2;
        return kVar2;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback Q() {
        return this.o.getCallback();
    }

    public boolean T() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public int U(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.b0 == null) {
                            this.b0 = new f(context);
                        }
                        return this.b0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                if (this.a0 == null) {
                    this.a0 = new h(s.a(context));
                }
                return this.a0.c();
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean V(int i2, KeyEvent keyEvent) {
        R();
        ActionBar actionBar = this.r;
        if (actionBar != null && actionBar.g(i2, keyEvent)) {
            return true;
        }
        k kVar = this.Q;
        if (kVar == null || !Z(kVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.Q == null) {
                k P2 = P(0);
                a0(P2, keyEvent);
                boolean Z2 = Z(P2, keyEvent.getKeyCode(), keyEvent, 1);
                P2.k = false;
                if (Z2) {
                    return true;
                }
            }
            return false;
        }
        k kVar2 = this.Q;
        if (kVar2 != null) {
            kVar2.l = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void W(int i2) {
        if (i2 == 108) {
            R();
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void X(int i2) {
        if (i2 == 108) {
            R();
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.b(false);
            }
        } else if (i2 == 0) {
            k P2 = P(i2);
            if (P2.m) {
                G(P2, false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        k O2;
        Window.Callback Q2 = Q();
        if (Q2 == null || this.V || (O2 = O(gVar.q())) == null) {
            return false;
        }
        return Q2.onMenuItemSelected(O2.a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        o oVar = this.u;
        if (oVar == null || !oVar.a() || (ViewConfiguration.get(this.n).hasPermanentMenuKey() && !this.u.g())) {
            k P2 = P(0);
            P2.o = true;
            G(P2, false);
            Y(P2, null);
            return;
        }
        Window.Callback Q2 = Q();
        if (this.u.e()) {
            this.u.b();
            if (!this.V) {
                Q2.onPanelClosed(108, P(0).h);
            }
        } else if (Q2 != null && !this.V) {
            if (this.c0 && (1 & this.d0) != 0) {
                this.o.getDecorView().removeCallbacks(this.e0);
                this.e0.run();
            }
            k P3 = P(0);
            androidx.appcompat.view.menu.g gVar2 = P3.h;
            if (gVar2 != null && !P3.p && Q2.onPreparePanel(0, P3.g, gVar2)) {
                Q2.onMenuOpened(108, P3.h);
                this.u.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b0() {
        ViewGroup viewGroup;
        return this.D && (viewGroup = this.E) != null && q4.w(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.q0 c0(defpackage.q0.a r8) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.c0(q0$a):q0");
    }

    @Override // androidx.appcompat.app.i
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.p.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.i
    public Context e(Context context) {
        int i2;
        boolean z2 = true;
        this.S = true;
        int i3 = this.W;
        if (i3 == -100) {
            i3 = -100;
        }
        int U2 = U(context, i3);
        Configuration configuration = null;
        if (n0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(H(context, U2, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof s0) {
            try {
                ((s0) context).a(H(context, U2, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!m0) {
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (!(configuration3 == null || configuration2.diff(configuration3) == 0)) {
                    float f2 = configuration2.fontScale;
                    float f3 = configuration3.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i4 = configuration2.mcc;
                    int i5 = configuration3.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration2.mnc;
                    int i7 = configuration3.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 24) {
                        LocaleList locales = configuration2.getLocales();
                        LocaleList locales2 = configuration3.getLocales();
                        if (!locales.equals(locales2)) {
                            configuration.setLocales(locales2);
                            configuration.locale = configuration3.locale;
                        }
                    } else if (!e2.g(configuration2.locale, configuration3.locale)) {
                        configuration.locale = configuration3.locale;
                    }
                    int i9 = configuration2.touchscreen;
                    int i10 = configuration3.touchscreen;
                    if (i9 != i10) {
                        configuration.touchscreen = i10;
                    }
                    int i11 = configuration2.keyboard;
                    int i12 = configuration3.keyboard;
                    if (i11 != i12) {
                        configuration.keyboard = i12;
                    }
                    int i13 = configuration2.keyboardHidden;
                    int i14 = configuration3.keyboardHidden;
                    if (i13 != i14) {
                        configuration.keyboardHidden = i14;
                    }
                    int i15 = configuration2.navigation;
                    int i16 = configuration3.navigation;
                    if (i15 != i16) {
                        configuration.navigation = i16;
                    }
                    int i17 = configuration2.navigationHidden;
                    int i18 = configuration3.navigationHidden;
                    if (i17 != i18) {
                        configuration.navigationHidden = i18;
                    }
                    int i19 = configuration2.orientation;
                    int i20 = configuration3.orientation;
                    if (i19 != i20) {
                        configuration.orientation = i20;
                    }
                    int i21 = configuration2.screenLayout & 15;
                    int i22 = configuration3.screenLayout & 15;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration2.screenLayout & 192;
                    int i24 = configuration3.screenLayout & 192;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration2.screenLayout & 48;
                    int i26 = configuration3.screenLayout & 48;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration2.screenLayout & 768;
                    int i28 = configuration3.screenLayout & 768;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    if (i8 >= 26) {
                        int i29 = configuration2.colorMode & 3;
                        int i30 = configuration3.colorMode & 3;
                        if (i29 != i30) {
                            configuration.colorMode |= i30;
                        }
                        int i31 = configuration2.colorMode & 12;
                        int i32 = configuration3.colorMode & 12;
                        if (i31 != i32) {
                            configuration.colorMode |= i32;
                        }
                    }
                    int i33 = configuration2.uiMode & 15;
                    int i34 = configuration3.uiMode & 15;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration2.uiMode & 48;
                    int i36 = configuration3.uiMode & 48;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration2.screenWidthDp;
                    int i38 = configuration3.screenWidthDp;
                    if (i37 != i38) {
                        configuration.screenWidthDp = i38;
                    }
                    int i39 = configuration2.screenHeightDp;
                    int i40 = configuration3.screenHeightDp;
                    if (i39 != i40) {
                        configuration.screenHeightDp = i40;
                    }
                    int i41 = configuration2.smallestScreenWidthDp;
                    int i42 = configuration3.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration.smallestScreenWidthDp = i42;
                    }
                    if (i8 >= 17 && configuration2.densityDpi != (i2 = configuration3.densityDpi)) {
                        configuration.densityDpi = i2;
                    }
                }
            }
            Configuration H2 = H(context, U2, configuration);
            s0 s0Var = new s0(context, C0707R.style.res_2132083475_theme_appcompat_empty);
            s0Var.a(H2);
            boolean z3 = false;
            try {
                if (context.getTheme() == null) {
                    z2 = false;
                }
                z3 = z2;
            } catch (NullPointerException unused3) {
            }
            if (z3) {
                i2.s(s0Var.getTheme());
            }
            return s0Var;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int e0(b5 b5Var, Rect rect) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        int i7 = 0;
        if (b5Var != null) {
            i2 = b5Var.j();
        } else {
            i2 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            boolean z4 = true;
            if (this.y.isShown()) {
                if (this.g0 == null) {
                    this.g0 = new Rect();
                    this.h0 = new Rect();
                }
                Rect rect2 = this.g0;
                Rect rect3 = this.h0;
                if (b5Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(b5Var.h(), b5Var.j(), b5Var.i(), b5Var.g());
                }
                o0.a(this.E, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                ViewGroup viewGroup = this.E;
                int i11 = q4.g;
                b5 p2 = Build.VERSION.SDK_INT >= 23 ? b5.p(viewGroup.getRootWindowInsets()) : null;
                if (p2 == null) {
                    i3 = 0;
                } else {
                    i3 = p2.h();
                }
                if (p2 == null) {
                    i4 = 0;
                } else {
                    i4 = p2.i();
                }
                if (marginLayoutParams2.topMargin == i8 && marginLayoutParams2.leftMargin == i9 && marginLayoutParams2.rightMargin == i10) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i8;
                    marginLayoutParams2.leftMargin = i9;
                    marginLayoutParams2.rightMargin = i10;
                    z3 = true;
                }
                if (i8 <= 0 || this.G != null) {
                    View view = this.G;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i6 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4))) {
                        marginLayoutParams.height = i6;
                        marginLayoutParams.leftMargin = i3;
                        marginLayoutParams.rightMargin = i4;
                        this.G.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.n);
                    this.G = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i3;
                    layoutParams.rightMargin = i4;
                    this.E.addView(this.G, -1, layoutParams);
                }
                View view3 = this.G;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.G;
                    if ((q4.t(view4) & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        i5 = androidx.core.content.a.b(this.n, C0707R.color.abc_decor_view_status_guard_light);
                    } else {
                        i5 = androidx.core.content.a.b(this.n, C0707R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i5);
                }
                if (!this.L && z2) {
                    i2 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.y.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.G;
        if (view5 != null) {
            if (!z2) {
                i7 = 8;
            }
            view5.setVisibility(i7);
        }
        return i2;
    }

    @Override // androidx.appcompat.app.i
    public <T extends View> T f(int i2) {
        M();
        return (T) this.o.findViewById(i2);
    }

    @Override // androidx.appcompat.app.i
    public int g() {
        return this.W;
    }

    @Override // androidx.appcompat.app.i
    public MenuInflater h() {
        if (this.s == null) {
            R();
            ActionBar actionBar = this.r;
            this.s = new v0(actionBar != null ? actionBar.d() : this.n);
        }
        return this.s;
    }

    @Override // androidx.appcompat.app.i
    public ActionBar i() {
        R();
        return this.r;
    }

    @Override // androidx.appcompat.app.i
    public void j() {
        LayoutInflater from = LayoutInflater.from(this.n);
        if (from.getFactory() == null) {
            e4.c(from, this);
        } else {
            boolean z2 = from.getFactory2() instanceof j;
        }
    }

    @Override // androidx.appcompat.app.i
    public void k() {
        R();
        ActionBar actionBar = this.r;
        S(0);
    }

    @Override // androidx.appcompat.app.i
    public void l(Configuration configuration) {
        if (this.J && this.D) {
            R();
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.f(configuration);
            }
        }
        androidx.appcompat.widget.g.b().g(this.n);
        C(false);
    }

    @Override // androidx.appcompat.app.i
    public void m(Bundle bundle) {
        this.S = true;
        C(false);
        N();
        Object obj = this.f;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = e2.n(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.r;
                if (actionBar == null) {
                    this.f0 = true;
                } else {
                    actionBar.h(true);
                }
            }
            i.c(this);
        }
        this.T = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r3 = this;
            t1<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.j.j0
            java.lang.Object r1 = r3.f
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x000b
            androidx.appcompat.app.i.t(r3)
        L_0x000b:
            boolean r1 = r3.c0
            if (r1 == 0) goto L_0x001a
            android.view.Window r1 = r3.o
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r3.e0
            r1.removeCallbacks(r2)
        L_0x001a:
            r1 = 0
            r3.U = r1
            r1 = 1
            r3.V = r1
            int r1 = r3.W
            r2 = -100
            if (r1 == r2) goto L_0x0048
            java.lang.Object r1 = r3.f
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0048
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r3.f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0055
        L_0x0048:
            java.lang.Object r1 = r3.f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0055:
            androidx.appcompat.app.ActionBar r0 = r3.r
            if (r0 == 0) goto L_0x005c
            r0.getClass()
        L_0x005c:
            androidx.appcompat.app.j$g r0 = r3.a0
            if (r0 == 0) goto L_0x0063
            r0.a()
        L_0x0063:
            androidx.appcompat.app.j$g r0 = r3.b0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.n():void");
    }

    @Override // androidx.appcompat.app.i
    public void o(Bundle bundle) {
        M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x005a;
     */
    @Override // android.view.LayoutInflater.Factory2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.q r0 = r11.i0
            r1 = 0
            if (r0 != 0) goto L_0x0039
            android.content.Context r0 = r11.n
            int[] r2 = defpackage.h0.k
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            androidx.appcompat.app.q r0 = new androidx.appcompat.app.q
            r0.<init>()
            r11.i0 = r0
            goto L_0x0039
        L_0x001d:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ all -> 0x0032 }
            androidx.appcompat.app.q r0 = (androidx.appcompat.app.q) r0     // Catch:{ all -> 0x0032 }
            r11.i0 = r0     // Catch:{ all -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            androidx.appcompat.app.q r0 = new androidx.appcompat.app.q
            r0.<init>()
            r11.i0 = r0
        L_0x0039:
            boolean r0 = androidx.appcompat.app.j.k0
            if (r0 == 0) goto L_0x0073
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L_0x004c
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0071
            goto L_0x005a
        L_0x004c:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x0052
            goto L_0x0071
        L_0x0052:
            android.view.Window r3 = r11.o
            android.view.View r3 = r3.getDecorView()
        L_0x0058:
            if (r0 != 0) goto L_0x005c
        L_0x005a:
            r1 = 1
            goto L_0x0071
        L_0x005c:
            if (r0 == r3) goto L_0x0071
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x0071
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = defpackage.q4.v(r4)
            if (r4 == 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0058
        L_0x0071:
            r7 = r1
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            androidx.appcompat.app.q r2 = r11.i0
            boolean r8 = androidx.appcompat.app.j.k0
            r9 = 1
            int r0 = androidx.appcompat.widget.n0.a
            r10 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // androidx.appcompat.app.i
    public void p() {
        R();
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.m(true);
        }
    }

    @Override // androidx.appcompat.app.i
    public void q(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.i
    public void r() {
        this.U = true;
        B();
    }

    @Override // androidx.appcompat.app.i
    public void s() {
        this.U = false;
        R();
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.m(false);
        }
    }

    @Override // androidx.appcompat.app.i
    public boolean v(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.N && i2 == 108) {
            return false;
        }
        if (this.J && i2 == 1) {
            this.J = false;
        }
        if (i2 == 1) {
            d0();
            this.N = true;
            return true;
        } else if (i2 == 2) {
            d0();
            this.H = true;
            return true;
        } else if (i2 == 5) {
            d0();
            this.I = true;
            return true;
        } else if (i2 == 10) {
            d0();
            this.L = true;
            return true;
        } else if (i2 == 108) {
            d0();
            this.J = true;
            return true;
        } else if (i2 != 109) {
            return this.o.requestFeature(i2);
        } else {
            d0();
            this.K = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.i
    public void w(int i2) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.n).inflate(i2, viewGroup);
        this.p.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.i
    public void x(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.p.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.i
    public void y(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.p.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.i
    public void z(int i2) {
        this.X = i2;
    }

    j(Dialog dialog, h hVar) {
        this(dialog.getContext(), dialog.getWindow(), hVar, dialog);
    }

    private j(Context context, Window window, h hVar, Object obj) {
        t1<String, Integer> t1Var;
        Integer orDefault;
        g gVar;
        this.B = null;
        this.C = true;
        this.W = -100;
        this.e0 = new b();
        this.n = context;
        this.q = hVar;
        this.f = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof g)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        gVar = (g) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            gVar = null;
            if (gVar != null) {
                this.W = gVar.H0().g();
            }
        }
        if (this.W == -100 && (orDefault = (t1Var = j0).getOrDefault(this.f.getClass().getName(), null)) != null) {
            this.W = orDefault.intValue();
            t1Var.remove(this.f.getClass().getName());
        }
        if (window != null) {
            D(window);
        }
        androidx.appcompat.widget.g.h();
    }

    /* access modifiers changed from: package-private */
    public class e extends x0 {
        e(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            u0.a aVar = new u0.a(j.this.n, callback);
            q0 c0 = j.this.c0(aVar);
            if (c0 != null) {
                return aVar.e(c0);
            }
            return null;
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || j.this.V(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            j.this.W(i);
            return true;
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            j.this.X(i);
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.P(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.P(false);
            }
            return onPreparePanel;
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar = j.this.P(0).h;
            if (gVar != null) {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (j.this.T()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!j.this.T() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return b(callback);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
