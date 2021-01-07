package android.support.wearable.view.drawer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.drawer.WearableActionDrawer;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
@Deprecated
public class c implements Menu {
    private final Context a;
    private final List<b> b = new ArrayList();
    private final AbstractC0014c c;
    private final b.a d = new a();

    /* access modifiers changed from: package-private */
    public class a implements b.a {
        a() {
        }

        public void a(b bVar) {
            for (int i = 0; i < c.this.b.size(); i++) {
                if (c.this.b.get(i) == bVar) {
                    WearableActionDrawer.a aVar = (WearableActionDrawer.a) c.this.c;
                    if (WearableActionDrawer.t(WearableActionDrawer.this) != null) {
                        WearableActionDrawer.t(WearableActionDrawer.this).A(i);
                    }
                    if (i == 0) {
                        WearableActionDrawer.u(WearableActionDrawer.this);
                    }
                }
            }
        }
    }

    public static final class b implements MenuItem {
        private final int a;
        private final Context b;
        private CharSequence c;
        private Drawable d;
        private MenuItem.OnMenuItemClickListener e;
        private final a f;

        /* access modifiers changed from: private */
        public interface a {
        }

        public b(Context context, int i, CharSequence charSequence, a aVar) {
            this.b = context;
            this.a = i;
            this.c = charSequence;
            this.f = aVar;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.e;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this);
        }

        @Override // android.view.MenuItem
        public boolean collapseActionView() {
            throw new UnsupportedOperationException("collapseActionView is not implemented");
        }

        @Override // android.view.MenuItem
        public boolean expandActionView() {
            throw new UnsupportedOperationException("expandActionView is not implemented");
        }

        @Override // android.view.MenuItem
        public ActionProvider getActionProvider() {
            return null;
        }

        @Override // android.view.MenuItem
        public View getActionView() {
            return null;
        }

        @Override // android.view.MenuItem
        public char getAlphabeticShortcut() {
            return 0;
        }

        @Override // android.view.MenuItem
        public int getGroupId() {
            return 0;
        }

        @Override // android.view.MenuItem
        public Drawable getIcon() {
            return this.d;
        }

        @Override // android.view.MenuItem
        public Intent getIntent() {
            return null;
        }

        @Override // android.view.MenuItem
        public int getItemId() {
            return this.a;
        }

        @Override // android.view.MenuItem
        public ContextMenu.ContextMenuInfo getMenuInfo() {
            return null;
        }

        @Override // android.view.MenuItem
        public char getNumericShortcut() {
            return 0;
        }

        @Override // android.view.MenuItem
        public int getOrder() {
            return 0;
        }

        @Override // android.view.MenuItem
        public SubMenu getSubMenu() {
            return null;
        }

        @Override // android.view.MenuItem
        public CharSequence getTitle() {
            return this.c;
        }

        @Override // android.view.MenuItem
        public CharSequence getTitleCondensed() {
            return null;
        }

        @Override // android.view.MenuItem
        public boolean hasSubMenu() {
            return false;
        }

        @Override // android.view.MenuItem
        public boolean isActionViewExpanded() {
            throw new UnsupportedOperationException("isActionViewExpanded is not implemented");
        }

        @Override // android.view.MenuItem
        public boolean isCheckable() {
            return false;
        }

        @Override // android.view.MenuItem
        public boolean isChecked() {
            return false;
        }

        @Override // android.view.MenuItem
        public boolean isEnabled() {
            return false;
        }

        @Override // android.view.MenuItem
        public boolean isVisible() {
            return false;
        }

        @Override // android.view.MenuItem
        public MenuItem setActionProvider(ActionProvider actionProvider) {
            throw new UnsupportedOperationException("setActionProvider is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setActionView(View view) {
            throw new UnsupportedOperationException("setActionView is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setAlphabeticShortcut(char c2) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setCheckable(boolean z) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setChecked(boolean z) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setEnabled(boolean z) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setIcon(Drawable drawable) {
            this.d = drawable;
            a aVar = this.f;
            if (aVar != null) {
                ((a) aVar).a(this);
            }
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setIntent(Intent intent) {
            throw new UnsupportedOperationException("setIntent is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setNumericShortcut(char c2) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
            throw new UnsupportedOperationException("setOnActionExpandListener is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.e = onMenuItemClickListener;
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setShortcut(char c2, char c3) {
            throw new UnsupportedOperationException("setShortcut is not implemented");
        }

        @Override // android.view.MenuItem
        public void setShowAsAction(int i) {
            throw new UnsupportedOperationException("setShowAsAction is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setShowAsActionFlags(int i) {
            throw new UnsupportedOperationException("setShowAsActionFlags is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setTitle(CharSequence charSequence) {
            this.c = charSequence;
            a aVar = this.f;
            if (aVar != null) {
                ((a) aVar).a(this);
            }
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setTitleCondensed(CharSequence charSequence) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setVisible(boolean z) {
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setActionView(int i) {
            throw new UnsupportedOperationException("setActionView is not implemented");
        }

        @Override // android.view.MenuItem
        public MenuItem setIcon(int i) {
            setIcon(this.b.getResources().getDrawable(i));
            return this;
        }

        @Override // android.view.MenuItem
        public MenuItem setTitle(int i) {
            setTitle(this.b.getResources().getString(i));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.wearable.view.drawer.c$c  reason: collision with other inner class name */
    public interface AbstractC0014c {
    }

    public c(Context context, AbstractC0014c cVar) {
        this.a = context;
        this.c = cVar;
    }

    private int c(int i) {
        List<b> list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return add(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        throw new UnsupportedOperationException("addIntentOptions is not implemented");
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        throw new UnsupportedOperationException("addSubMenu is not implemented");
    }

    @Override // android.view.Menu
    public void clear() {
        this.b.clear();
        WearableActionDrawer.a aVar = (WearableActionDrawer.a) this.c;
        if (WearableActionDrawer.t(WearableActionDrawer.this) != null) {
            WearableActionDrawer.t(WearableActionDrawer.this).z();
        }
        WearableActionDrawer.u(WearableActionDrawer.this);
    }

    @Override // android.view.Menu
    public void close() {
        throw new UnsupportedOperationException("close is not implemented");
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        int c2 = c(i);
        if (c2 < 0 || c2 >= this.b.size()) {
            return null;
        }
        return this.b.get(c2);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        throw new UnsupportedOperationException("performIdentifierAction is not implemented");
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        throw new UnsupportedOperationException("performShortcut is not implemented");
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int c2 = c(i);
        if (c2 >= 0 && c2 < this.b.size()) {
            this.b.remove(c2);
            WearableActionDrawer.a aVar = (WearableActionDrawer.a) this.c;
            if (WearableActionDrawer.t(WearableActionDrawer.this) != null) {
                WearableActionDrawer.t(WearableActionDrawer.this).A(c2);
            }
            if (c2 <= 1) {
                WearableActionDrawer.u(WearableActionDrawer.this);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        throw new UnsupportedOperationException("setGroupCheckable is not implemented");
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        throw new UnsupportedOperationException("setGroupEnabled is not implemented");
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        throw new UnsupportedOperationException("setGroupVisible is not implemented");
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
    }

    @Override // android.view.Menu
    public int size() {
        return this.b.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return add(0, 0, 0, i);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        throw new UnsupportedOperationException("addSubMenu is not implemented");
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return add(i, i2, i3, this.a.getResources().getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("addSubMenu is not implemented");
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        b bVar = new b(this.a, i2, charSequence, this.d);
        this.b.add(bVar);
        AbstractC0014c cVar = this.c;
        int size = this.b.size() - 1;
        WearableActionDrawer.a aVar = (WearableActionDrawer.a) cVar;
        if (WearableActionDrawer.t(WearableActionDrawer.this) != null) {
            WearableActionDrawer.t(WearableActionDrawer.this).A(size);
        }
        if (size <= 1) {
            WearableActionDrawer.u(WearableActionDrawer.this);
        }
        return bVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("addSubMenu is not implemented");
    }
}
