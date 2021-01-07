package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import com.spotify.music.C0707R;
import defpackage.a4;

public final class i implements f3 {
    private a4 A;
    private MenuItem.OnActionExpandListener B;
    private boolean C = false;
    private ContextMenu.ContextMenuInfo D;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    g n;
    private r o;
    private MenuItem.OnMenuItemClickListener p;
    private CharSequence q;
    private CharSequence r;
    private ColorStateList s = null;
    private PorterDuff.Mode t = null;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private int x = 16;
    private int y = 0;
    private View z;

    class a implements a4.b {
        a() {
        }

        @Override // defpackage.a4.b
        public void onActionProviderVisibilityChanged(boolean z) {
            i.this.n.w();
        }
    }

    i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = gVar;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.d = i5;
        this.e = charSequence;
        this.y = i6;
    }

    private static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (this.u) {
                androidx.core.graphics.drawable.a.i(drawable, this.s);
            }
            if (this.v) {
                androidx.core.graphics.drawable.a.j(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    @Override // defpackage.f3
    public a4 a() {
        return this.A;
    }

    @Override // defpackage.f3
    public f3 b(a4 a4Var) {
        a4 a4Var2 = this.A;
        if (a4Var2 != null) {
            a4Var2.j();
        }
        this.z = null;
        this.A = a4Var;
        this.n.x(true);
        a4 a4Var3 = this.A;
        if (a4Var3 != null) {
            a4Var3.l(new a());
        }
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public int e() {
        return this.d;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.h(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public char f() {
        return this.n.t() ? this.j : this.h;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        char f2 = f();
        if (f2 == 0) {
            return "";
        }
        Resources resources = this.n.n().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.n()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0707R.string.abc_prepend_shortcut_label));
        }
        int i2 = this.n.t() ? this.k : this.i;
        c(sb, i2, 65536, resources.getString(C0707R.string.abc_menu_meta_shortcut_label));
        c(sb, i2, 4096, resources.getString(C0707R.string.abc_menu_ctrl_shortcut_label));
        c(sb, i2, 2, resources.getString(C0707R.string.abc_menu_alt_shortcut_label));
        c(sb, i2, 1, resources.getString(C0707R.string.abc_menu_shift_shortcut_label));
        c(sb, i2, 4, resources.getString(C0707R.string.abc_menu_sym_shortcut_label));
        c(sb, i2, 8, resources.getString(C0707R.string.abc_menu_function_shortcut_label));
        if (f2 == '\b') {
            sb.append(resources.getString(C0707R.string.abc_menu_delete_shortcut_label));
        } else if (f2 == '\n') {
            sb.append(resources.getString(C0707R.string.abc_menu_enter_shortcut_label));
        } else if (f2 != ' ') {
            sb.append(f2);
        } else {
            sb.append(resources.getString(C0707R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.f3, android.view.MenuItem
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        a4 a4Var = this.A;
        if (a4Var == null) {
            return null;
        }
        View e2 = a4Var.e(this);
        this.z = e2;
        return e2;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable b2 = i0.b(this.n.n(), this.m);
        this.m = 0;
        this.l = b2;
        return d(b2);
    }

    @Override // defpackage.f3, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // defpackage.f3, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public CharSequence h(n.a aVar) {
        if (aVar.h()) {
            return getTitleCondensed();
        }
        return this.e;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public boolean i() {
        a4 a4Var;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (a4Var = this.A) != null) {
            this.z = a4Var.e(this);
        }
        if (this.z != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        a4 a4Var = this.A;
        if (a4Var == null || !a4Var.h()) {
            if ((this.x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.x & 8) != 0 || !this.A.c()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.p;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.g(gVar, this)) {
            return true;
        }
        if (this.g != null) {
            try {
                this.n.n().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        a4 a4Var = this.A;
        if (a4Var == null || !a4Var.f()) {
            return false;
        }
        return true;
    }

    public boolean k() {
        return (this.x & 32) == 32;
    }

    public boolean l() {
        return (this.x & 4) != 0;
    }

    public boolean m() {
        return (this.y & 1) == 1;
    }

    public boolean n() {
        return (this.y & 2) == 2;
    }

    public f3 o(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.v();
        return this;
    }

    public void p(boolean z2) {
        this.C = z2;
        this.n.x(false);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.x = i3;
        if (i2 != i3) {
            this.n.x(false);
        }
    }

    public void r(boolean z2) {
        this.x = (z2 ? 4 : 0) | (this.x & -5);
    }

    public void s(boolean z2) {
        if (z2) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.f3, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        o(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & -2);
        this.x = i3;
        if (i2 != i3) {
            this.n.x(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.x & 4) != 0) {
            this.n.I(this);
        } else {
            q(z2);
        }
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    /* renamed from: setContentDescription */
    public MenuItem mo1setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.y = i2;
            this.n.v();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.x(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.N(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    /* renamed from: setTooltipText */
    public MenuItem mo2setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (u(z2)) {
            this.n.w();
        }
        return this;
    }

    public void t(r rVar) {
        this.o = rVar;
        rVar.setHeaderTitle(this.e);
    }

    @Override // java.lang.Object
    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean u(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.x = i3;
        if (i2 != i3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.n.u() && f() != 0;
    }

    public boolean w() {
        return (this.y & 4) == 4;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context n2 = this.n.n();
        o(LayoutInflater.from(n2).inflate(i2, (ViewGroup) new LinearLayout(n2), false));
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public f3 mo3setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public f3 mo4setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.h == c2 && this.i == i2) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.n.x(false);
        return this;
    }

    @Override // defpackage.f3, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.w = true;
        this.n.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.n().getString(i2));
        return this;
    }
}
