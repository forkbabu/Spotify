package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements e3 {
    private static final int[] y = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;
    private boolean d;
    private a e;
    private ArrayList<i> f;
    private ArrayList<i> g;
    private boolean h;
    private ArrayList<i> i;
    private ArrayList<i> j;
    private boolean k;
    private int l = 0;
    CharSequence m;
    Drawable n;
    View o;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private ArrayList<i> t = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> u = new CopyOnWriteArrayList<>();
    private i v;
    private boolean w = false;
    private boolean x;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean d(i iVar);
    }

    public g(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = u4.b;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    private void A(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.f.size()) {
            this.f.remove(i2);
            if (z) {
                x(true);
            }
        }
    }

    private void L(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i2 > 0) {
                this.m = resources.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i3 > 0) {
                this.n = androidx.core.content.a.d(this.a, i3);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        x(false);
    }

    public void B(m mVar) {
        Iterator<WeakReference<m>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.u.remove(next);
            }
        }
    }

    public void C(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(m());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).C(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void D(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.u.isEmpty()) {
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        mVar.f(parcelable);
                    }
                }
            }
        }
    }

    public void E(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).E(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m(), sparseArray);
        }
    }

    public void F(Bundle bundle) {
        Parcelable e2;
        if (!this.u.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (e2 = mVar.e()) != null) {
                        sparseArray.put(id, e2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void G(a aVar) {
        this.e = aVar;
    }

    public g H(int i2) {
        this.l = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void I(MenuItem menuItem) {
        int groupId = ((i) menuItem).getGroupId();
        int size = this.f.size();
        R();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.getGroupId() == groupId && iVar.l() && iVar.isCheckable()) {
                iVar.q(iVar == menuItem);
            }
        }
        Q();
    }

    /* access modifiers changed from: protected */
    public g J(int i2) {
        L(0, null, i2, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g K(Drawable drawable) {
        L(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g M(int i2) {
        L(i2, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g N(CharSequence charSequence) {
        L(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g O(View view) {
        L(0, null, 0, null, view);
        return this;
    }

    public void P(boolean z) {
        this.x = z;
    }

    public void Q() {
        this.p = false;
        if (this.q) {
            this.q = false;
            x(this.r);
        }
    }

    public void R() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = y;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                i iVar = new i(this, i2, i3, i4, i7, charSequence, this.l);
                ArrayList<i> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).e() <= i7) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, iVar);
                x(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.a);
    }

    public void c(m mVar, Context context) {
        this.u.add(new WeakReference<>(mVar));
        mVar.m(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.v;
        if (iVar != null) {
            f(iVar);
        }
        this.f.clear();
        x(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        x(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void e(boolean z) {
        if (!this.s) {
            this.s = true;
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    mVar.c(this, z);
                }
            }
            this.s = false;
        }
    }

    public boolean f(i iVar) {
        boolean z = false;
        if (!this.u.isEmpty() && this.v == iVar) {
            R();
            Iterator<WeakReference<m>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    z = mVar.l(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            Q();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = ((g) iVar.getSubMenu()).findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean g(g gVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f.get(i2);
    }

    public boolean h(i iVar) {
        boolean z = false;
        if (this.u.isEmpty()) {
            return false;
        }
        R();
        Iterator<WeakReference<m>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.u.remove(next);
            } else {
                z = mVar.g(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        Q();
        if (z) {
            this.v = iVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public i i(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.t;
        arrayList.clear();
        j(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean t2 = t();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (t2) {
                c2 = iVar.getAlphabeticShortcut();
            } else {
                c2 = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (t2 && c2 == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return i(i2, keyEvent) != null;
    }

    /* access modifiers changed from: package-private */
    public void j(List<i> list, int i2, KeyEvent keyEvent) {
        boolean t2 = t();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).j(list, i2, keyEvent);
                }
                char alphabeticShortcut = t2 ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((t2 ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (t2 && alphabeticShortcut == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void k() {
        ArrayList<i> r2 = r();
        if (this.k) {
            Iterator<WeakReference<m>> it = this.u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.u.remove(next);
                } else {
                    z |= mVar.k();
                }
            }
            if (z) {
                this.i.clear();
                this.j.clear();
                int size = r2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = r2.get(i2);
                    if (iVar.k()) {
                        this.i.add(iVar);
                    } else {
                        this.j.add(iVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(r());
            }
            this.k = false;
        }
    }

    public ArrayList<i> l() {
        k();
        return this.i;
    }

    /* access modifiers changed from: protected */
    public String m() {
        return "android:menu:actionviewstates";
    }

    public Context n() {
        return this.a;
    }

    public i o() {
        return this.v;
    }

    public ArrayList<i> p() {
        k();
        return this.j;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return y(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i i4 = i(i2, keyEvent);
        boolean z = i4 != null ? z(i4, null, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return z;
    }

    public g q() {
        return this;
    }

    public ArrayList<i> r() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.isVisible()) {
                this.g.add(iVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f.get(i3).getGroupId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f.get(i3).getGroupId() != i2) {
                    break;
                }
                A(i3, false);
                i4 = i5;
            }
            x(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f.get(i3).getItemId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        A(i3, true);
    }

    public boolean s() {
        return this.w;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.r(z2);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2 && iVar.u(z)) {
                z2 = true;
            }
        }
        if (z2) {
            x(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        x(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f.size();
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return this.c;
    }

    public boolean u() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.k = true;
        x(true);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.h = true;
        x(true);
    }

    public void x(boolean z) {
        if (!this.p) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            if (!this.u.isEmpty()) {
                R();
                Iterator<WeakReference<m>> it = this.u.iterator();
                while (it.hasNext()) {
                    WeakReference<m> next = it.next();
                    m mVar = next.get();
                    if (mVar == null) {
                        this.u.remove(next);
                    } else {
                        mVar.j(z);
                    }
                }
                Q();
                return;
            }
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    public boolean y(MenuItem menuItem, int i2) {
        return z(menuItem, null, i2);
    }

    public boolean z(MenuItem menuItem, m mVar, int i2) {
        i iVar = (i) menuItem;
        boolean z = false;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean j2 = iVar.j();
        a4 a2 = iVar.a();
        boolean z2 = a2 != null && a2.b();
        if (iVar.i()) {
            j2 |= iVar.expandActionView();
            if (j2) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.t(new r(this.a, this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z2) {
                a2.g(rVar);
            }
            if (!this.u.isEmpty()) {
                if (mVar != null) {
                    z = mVar.i(rVar);
                }
                Iterator<WeakReference<m>> it = this.u.iterator();
                while (it.hasNext()) {
                    WeakReference<m> next = it.next();
                    m mVar2 = next.get();
                    if (mVar2 == null) {
                        this.u.remove(next);
                    } else if (!z) {
                        z = mVar2.i(rVar);
                    }
                }
            }
            j2 |= z;
            if (!j2) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return j2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.t(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.b.getString(i5));
    }
}
