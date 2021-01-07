package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.g;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class x {
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static x i;
    private static final c j = new c(6);
    private WeakHashMap<Context, u1<ColorStateList>> a;
    private t1<String, d> b;
    private u1<String> c;
    private final WeakHashMap<Context, q1<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private e g;

    /* access modifiers changed from: package-private */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.x.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return j0.i(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.x.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c8.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c extends r1<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    /* access modifiers changed from: private */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: package-private */
    public interface e {
    }

    /* access modifiers changed from: private */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.x.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return j8.b(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new t1<>();
        }
        this.b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        q1<WeakReference<Drawable.ConstantState>> q1Var = this.d.get(context);
        if (q1Var == null) {
            q1Var = new q1<>(10);
            this.d.put(context, q1Var);
        }
        q1Var.o(j2, new WeakReference<>(constantState));
        return true;
    }

    private Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        e eVar = this.g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            g.a aVar = (g.a) eVar;
            if (i2 == C0707R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, C0707R.drawable.abc_cab_background_internal_bg), f(context, C0707R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public static synchronized x d() {
        x xVar;
        synchronized (x.class) {
            if (i == null) {
                x xVar2 = new x();
                i = xVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    xVar2.a("vector", new f());
                    xVar2.a("animated-vector", new b());
                    xVar2.a("animated-selector", new a());
                }
            }
            xVar = i;
        }
        return xVar;
    }

    private synchronized Drawable e(Context context, long j2) {
        q1<WeakReference<Drawable.ConstantState>> q1Var = this.d.get(context);
        if (q1Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> j3 = q1Var.j(j2, null);
        if (j3 != null) {
            Drawable.ConstantState constantState = j3.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            q1Var.p(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (x.class) {
            c cVar = j;
            cVar.getClass();
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.b(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                cVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.c(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private Drawable j(Context context, int i2) {
        XmlResourceParser xml;
        int next;
        t1<String, d> t1Var = this.b;
        if (t1Var == null || t1Var.isEmpty()) {
            return null;
        }
        u1<String> u1Var = this.c;
        if (u1Var != null) {
            String g2 = u1Var.g(i2, null);
            if ("appcompat_skip_skip".equals(g2) || (g2 != null && this.b.getOrDefault(g2, null) == null)) {
                return null;
            }
        } else {
            this.c = new u1<>(10);
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                if (next == 2) {
                    String name = xml.getName();
                    this.c.b(i2, name);
                    d dVar = this.b.get(name);
                    if (dVar != null) {
                        e2 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (e2 != null) {
                        e2.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j2, e2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
        }
        if (e2 == null) {
            this.c.b(i2, "appcompat_skip_skip");
        }
        return e2;
    }

    private Drawable m(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (q.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable l = androidx.core.graphics.drawable.a.l(drawable);
            androidx.core.graphics.drawable.a.i(l, i3);
            e eVar = this.g;
            if (eVar != null) {
                g.a aVar = (g.a) eVar;
                if (i2 == C0707R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return l;
            }
            androidx.core.graphics.drawable.a.j(l, mode);
            return l;
        }
        e eVar2 = this.g;
        if (eVar2 != null && ((g.a) eVar2).e(context, i2, drawable)) {
            return drawable;
        }
        e eVar3 = this.g;
        if ((eVar3 != null && ((g.a) eVar3).f(context, i2, drawable)) || !z) {
            return drawable;
        }
        return null;
    }

    static void n(Drawable drawable, f0 f0Var, int[] iArr) {
        if (!q.a(drawable) || drawable.mutate() == drawable) {
            boolean z = f0Var.d;
            if (z || f0Var.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? f0Var.a : null;
                PorterDuff.Mode mode = f0Var.c ? f0Var.b : h;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f = r0     // Catch:{ all -> 0x0048 }
            r1 = 2131230818(0x7f080062, float:1.80777E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            boolean r3 = r1 instanceof defpackage.j8     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0048 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x004a
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.j(r5, r6)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0035:
            if (r0 != 0) goto L_0x003b
            android.graphics.drawable.Drawable r0 = androidx.core.content.a.d(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r4.m(r5, r6, r7, r0)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            androidx.appcompat.widget.q.b(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)
            return r0
        L_0x0048:
            r5 = move-exception
            goto L_0x0054
        L_0x004a:
            r4.f = r2
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)
            throw r5
        L_0x0054:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        u1<ColorStateList> u1Var;
        WeakHashMap<Context, u1<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (u1Var = weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = u1Var.g(i2, null);
        }
        if (colorStateList == null) {
            e eVar = this.g;
            if (eVar != null) {
                colorStateList2 = ((g.a) eVar).c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                u1<ColorStateList> u1Var2 = this.a.get(context);
                if (u1Var2 == null) {
                    u1Var2 = new u1<>(10);
                    this.a.put(context, u1Var2);
                }
                u1Var2.b(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public synchronized void k(Context context) {
        q1<WeakReference<Drawable.ConstantState>> q1Var = this.d.get(context);
        if (q1Var != null) {
            q1Var.c();
        }
    }

    public synchronized void l(e eVar) {
        this.g = eVar;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Context context, int i2, Drawable drawable) {
        e eVar = this.g;
        return eVar != null && ((g.a) eVar).f(context, i2, drawable);
    }
}
