package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class m {
    private final String a;
    private o b;
    private int c;
    private String f;
    private CharSequence n;
    private ArrayList<k> o;
    private u1<c> p;
    private HashMap<String, g> q;

    static class a implements Comparable<a> {
        private final m a;
        private final Bundle b;
        private final boolean c;
        private final boolean f;
        private final int n;

        a(m mVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.a = mVar;
            this.b = bundle;
            this.c = z;
            this.f = z2;
            this.n = i;
        }

        /* renamed from: d */
        public int compareTo(a aVar) {
            boolean z = this.c;
            if (z && !aVar.c) {
                return 1;
            }
            if (!z && aVar.c) {
                return -1;
            }
            Bundle bundle = this.b;
            if (bundle != null && aVar.b == null) {
                return 1;
            }
            if (bundle == null && aVar.b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.b.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f;
            if (z2 && !aVar.f) {
                return 1;
            }
            if (z2 || !aVar.f) {
                return this.n - aVar.n;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public m g() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Bundle h() {
            return this.b;
        }
    }

    static {
        new HashMap();
    }

    public m(v<? extends m> vVar) {
        this.a = w.b(vVar.getClass());
    }

    static String j(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public final void c(String str, g gVar) {
        if (this.q == null) {
            this.q = new HashMap<>();
        }
        this.q.put(str, gVar);
    }

    public final void d(k kVar) {
        if (this.o == null) {
            this.o = new ArrayList<>();
        }
        this.o.add(kVar);
    }

    /* access modifiers changed from: package-private */
    public Bundle e(Bundle bundle) {
        HashMap<String, g> hashMap;
        if (bundle == null && ((hashMap = this.q) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, g> hashMap2 = this.q;
        if (hashMap2 != null) {
            for (Map.Entry<String, g> entry : hashMap2.entrySet()) {
                entry.getValue().e(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, g> hashMap3 = this.q;
            if (hashMap3 != null) {
                for (Map.Entry<String, g> entry2 : hashMap3.entrySet()) {
                    if (!entry2.getValue().f(entry2.getKey(), bundle)) {
                        StringBuilder V0 = je.V0("Wrong argument type for '");
                        V0.append(entry2.getKey());
                        V0.append("' in argument bundle. ");
                        V0.append(entry2.getValue().b().b());
                        V0.append(" expected.");
                        throw new IllegalArgumentException(V0.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public int[] f() {
        ArrayDeque arrayDeque = new ArrayDeque();
        o oVar = this;
        while (true) {
            o oVar2 = oVar.b;
            if (oVar2 == null || oVar2.I() != oVar.c) {
                arrayDeque.addFirst(oVar);
            }
            if (oVar2 == null) {
                break;
            }
            oVar = oVar2;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((m) it.next()).c;
            i++;
        }
        return iArr;
    }

    public final c h(int i) {
        c cVar;
        u1<c> u1Var = this.p;
        if (u1Var == null) {
            cVar = null;
        } else {
            cVar = u1Var.g(i, null);
        }
        if (cVar != null) {
            return cVar;
        }
        o oVar = this.b;
        if (oVar != null) {
            return oVar.h(i);
        }
        return null;
    }

    public String i() {
        if (this.f == null) {
            this.f = Integer.toString(this.c);
        }
        return this.f;
    }

    public final int k() {
        return this.c;
    }

    public final String l() {
        return this.a;
    }

    public final o n() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public a o(l lVar) {
        Bundle bundle;
        Map<String, g> map;
        ArrayList<k> arrayList = this.o;
        if (arrayList == null) {
            return null;
        }
        Iterator<k> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            k next = it.next();
            Uri c2 = lVar.c();
            if (c2 != null) {
                HashMap<String, g> hashMap = this.q;
                if (hashMap == null) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(hashMap);
                }
                bundle = next.c(c2, map);
            } else {
                bundle = null;
            }
            String a2 = lVar.a();
            boolean z = a2 != null && a2.equals(next.b());
            String b2 = lVar.b();
            int d = b2 != null ? next.d(b2) : -1;
            if (bundle != null || z || d > -1) {
                a aVar2 = new a(this, bundle, next.e(), z, d);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void t(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c7.e);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.c = resourceId;
        this.f = null;
        this.f = j(context, resourceId);
        this.n = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.c));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.n != null) {
            sb.append(" label=");
            sb.append(this.n);
        }
        return sb.toString();
    }

    public final void u(int i, c cVar) {
        if (!y()) {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i != 0) {
            if (this.p == null) {
                this.p = new u1<>(10);
            }
            this.p.n(i, cVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(o oVar) {
        this.b = oVar;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return true;
    }
}
