package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

public class r extends g implements SubMenu {
    private i A;
    private g z;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.z = gVar;
        this.A = iVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public void G(g.a aVar) {
        this.z.G(aVar);
    }

    public Menu S() {
        return this.z;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean f(i iVar) {
        return this.z.f(iVar);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.g
    public boolean g(g gVar, MenuItem menuItem) {
        return super.g(gVar, menuItem) || this.z.g(gVar, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(i iVar) {
        return this.z.h(iVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public String m() {
        i iVar = this.A;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + itemId;
    }

    @Override // androidx.appcompat.view.menu.g
    public g q() {
        return this.z.q();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean s() {
        return this.z.s();
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        K(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        N(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        O(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.z.setQwertyMode(z2);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean t() {
        return this.z.t();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean u() {
        return this.z.u();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        J(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        M(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
