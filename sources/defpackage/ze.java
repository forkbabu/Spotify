package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.c;
import com.facebook.appevents.internal.d;
import defpackage.bf;
import defpackage.ve;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* renamed from: ze  reason: default package */
public class ze {
    private static final String f = "ze";
    private static ze g;
    private final Handler a = new Handler(Looper.getMainLooper());
    private Set<Activity> b = Collections.newSetFromMap(new WeakHashMap());
    private Set<b> c = new HashSet();
    private HashSet<String> d = new HashSet<>();
    private HashMap<Integer, HashSet<String>> e = new HashMap<>();

    /* renamed from: ze$a */
    public static class a {
        private WeakReference<View> a;
        private String b;

        public a(View view, String str) {
            this.a = new WeakReference<>(view);
            this.b = str;
        }

        public View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public String b() {
            return this.b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ze$b */
    public static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        private WeakReference<View> a;
        private List<EventBinding> b;
        private final Handler c;
        private HashSet<String> f;
        private final String n;

        public b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.a = new WeakReference<>(view);
            this.c = handler;
            this.f = hashSet;
            this.n = str;
            handler.postDelayed(this, 200);
        }

        private void a(a aVar, View view, EventBinding eventBinding) {
            View a2 = aVar.a();
            if (a2 != null) {
                String b2 = aVar.b();
                View.OnClickListener f2 = c.f(a2);
                boolean z = (f2 instanceof ve.b) && ((ve.b) f2).a();
                if (!this.f.contains(b2) && !z) {
                    ve.b bVar = null;
                    if (!uf.c(ve.class)) {
                        try {
                            bVar = new ve.b(eventBinding, view, a2, null);
                        } catch (Throwable th) {
                            uf.b(th, ve.class);
                        }
                    }
                    a2.setOnClickListener(bVar);
                    this.f.add(b2);
                }
            }
        }

        private void b(a aVar, View view, EventBinding eventBinding) {
            AdapterView adapterView = (AdapterView) aVar.a();
            if (adapterView != null) {
                String b2 = aVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                boolean z = (onItemClickListener instanceof ve.c) && ((ve.c) onItemClickListener).a();
                if (!this.f.contains(b2) && !z) {
                    ve.c cVar = null;
                    if (!uf.c(ve.class)) {
                        try {
                            cVar = new ve.c(eventBinding, view, adapterView, null);
                        } catch (Throwable th) {
                            uf.b(th, ve.class);
                        }
                    }
                    adapterView.setOnItemClickListener(cVar);
                    this.f.add(b2);
                }
            }
        }

        private void c(a aVar, View view, EventBinding eventBinding) {
            View a2 = aVar.a();
            if (a2 != null) {
                String b2 = aVar.b();
                View.OnTouchListener g = c.g(a2);
                boolean z = (g instanceof bf.a) && ((bf.a) g).a();
                if (!this.f.contains(b2) && !z) {
                    bf.a aVar2 = null;
                    if (!uf.c(bf.class)) {
                        try {
                            aVar2 = new bf.a(eventBinding, view, a2);
                        } catch (Throwable th) {
                            uf.b(th, bf.class);
                        }
                    }
                    a2.setOnTouchListener(aVar2);
                    this.f.add(b2);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
            if (r9.getClass().getSimpleName().equals(r12[r12.length - 1]) == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
            if (r12.equals(r4) == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
            if (r12.equals(r4) == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x014f, code lost:
            if (r12.equals(r4) == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0181, code lost:
            if (r12.equals(r0) == false) goto L_0x0183;
         */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0188 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0189  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<defpackage.ze.a> d(com.facebook.appevents.codeless.internal.EventBinding r8, android.view.View r9, java.util.List<com.facebook.appevents.codeless.internal.PathComponent> r10, int r11, int r12, java.lang.String r13) {
            /*
            // Method dump skipped, instructions count: 452
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ze.b.d(com.facebook.appevents.codeless.internal.EventBinding, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
        }

        private static List<View> e(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00a2 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void f() {
            /*
            // Method dump skipped, instructions count: 236
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ze.b.f():void");
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ IllegalArgumentException | JSONException -> 0x003a }] */
        @Override // java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                boolean r0 = defpackage.uf.c(r5)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.String r0 = com.facebook.k.e()     // Catch:{ all -> 0x005d }
                com.facebook.internal.n r0 = com.facebook.internal.FetchedAppSettingsManager.j(r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x005c
                boolean r1 = r0.b()     // Catch:{ all -> 0x005d }
                if (r1 != 0) goto L_0x0018
                goto L_0x005c
            L_0x0018:
                org.json.JSONArray r0 = r0.e()     // Catch:{ all -> 0x005d }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
                r1.<init>()     // Catch:{ all -> 0x005d }
                r2 = 0
                if (r0 == 0) goto L_0x0029
                int r3 = r0.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r2 >= r3) goto L_0x003a
                org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
                com.facebook.appevents.codeless.internal.EventBinding r4 = com.facebook.appevents.codeless.internal.EventBinding.c(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
                r1.add(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
                int r2 = r2 + 1
                goto L_0x002a
            L_0x003a:
                r5.b = r1
                if (r1 == 0) goto L_0x005c
                java.lang.ref.WeakReference<android.view.View> r0 = r5.a
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 != 0) goto L_0x0049
                return
            L_0x0049:
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                boolean r1 = r0.isAlive()
                if (r1 == 0) goto L_0x0059
                r0.addOnGlobalLayoutListener(r5)
                r0.addOnScrollChangedListener(r5)
            L_0x0059:
                r5.f()
            L_0x005c:
                return
            L_0x005d:
                r0 = move-exception
                defpackage.uf.b(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ze.b.run():void");
        }
    }

    private ze() {
    }

    static /* synthetic */ void a(ze zeVar) {
        if (!uf.c(ze.class)) {
            try {
                zeVar.g();
            } catch (Throwable th) {
                uf.b(th, ze.class);
            }
        }
    }

    static /* synthetic */ String b() {
        if (uf.c(ze.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            uf.b(th, ze.class);
            return null;
        }
    }

    public static synchronized ze e() {
        synchronized (ze.class) {
            if (uf.c(ze.class)) {
                return null;
            }
            try {
                if (g == null) {
                    g = new ze();
                }
                return g;
            } catch (Throwable th) {
                uf.b(th, ze.class);
                return null;
            }
        }
    }

    public static Bundle f(EventBinding eventBinding, View view, View view2) {
        List<com.facebook.appevents.codeless.internal.a> d2;
        List<a> list;
        if (uf.c(ze.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (!(eventBinding == null || (d2 = eventBinding.d()) == null)) {
                for (com.facebook.appevents.codeless.internal.a aVar : d2) {
                    String str = aVar.b;
                    if (str != null && str.length() > 0) {
                        bundle.putString(aVar.a, aVar.b);
                    } else if (aVar.c.size() > 0) {
                        if (aVar.d.equals("relative")) {
                            list = b.d(eventBinding, view2, aVar.c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = b.d(eventBinding, view, aVar.c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<a> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            a next = it.next();
                            if (next.a() != null) {
                                String j = c.j(next.a());
                                if (j.length() > 0) {
                                    bundle.putString(aVar.a, j);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            uf.b(th, ze.class);
            return null;
        }
    }

    private void g() {
        if (!uf.c(this)) {
            try {
                for (Activity activity : this.b) {
                    if (activity != null) {
                        this.c.add(new b(d.b(activity), this.a, this.d, activity.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    public void c(Activity activity) {
        if (!uf.c(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.add(activity);
                    this.d.clear();
                    if (this.e.containsKey(Integer.valueOf(activity.hashCode()))) {
                        this.d = this.e.get(Integer.valueOf(activity.hashCode()));
                    }
                    if (!uf.c(this)) {
                        try {
                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                g();
                            } else {
                                this.a.post(new ye(this));
                            }
                        } catch (Throwable th) {
                            uf.b(th, this);
                        }
                    }
                } else {
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th2) {
                uf.b(th2, this);
            }
        }
    }

    public void d(Activity activity) {
        if (!uf.c(this)) {
            try {
                this.e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    public void h(Activity activity) {
        if (!uf.c(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.remove(activity);
                    this.c.clear();
                    this.e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.d.clone());
                    this.d.clear();
                    return;
                }
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
