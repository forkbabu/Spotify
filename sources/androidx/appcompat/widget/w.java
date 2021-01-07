package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

public class w extends ListPopupWindow implements v {
    private static Method N;
    private v M;

    public static class a extends r {
        final int w;
        final int x;
        private v y;
        private MenuItem z;

        public a(Context context, boolean z2) {
            super(context, z2);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.w = 22;
                this.x = 21;
                return;
            }
            this.w = 21;
            this.x = 22;
        }

        @Override // androidx.appcompat.widget.r, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            f fVar;
            int pointToPosition;
            int i2;
            if (this.y != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.z;
                if (menuItem != iVar) {
                    g b = fVar.b();
                    if (menuItem != null) {
                        this.y.n(b, menuItem);
                    }
                    this.z = iVar;
                    if (iVar != null) {
                        this.y.d(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.w) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.x) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((f) getAdapter()).b().e(false);
                return true;
            }
        }

        public void setHoverListener(v vVar) {
            this.y = vVar;
        }

        @Override // androidx.appcompat.widget.r, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                N = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public w(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    public void I(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setEnterTransition(null);
        }
    }

    public void J(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.I.setExitTransition(null);
        }
    }

    public void K(v vVar) {
        this.M = vVar;
    }

    public void L(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = N;
            if (method != null) {
                try {
                    method.invoke(this.I, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        } else {
            this.I.setTouchModal(z);
        }
    }

    @Override // androidx.appcompat.widget.v
    public void d(g gVar, MenuItem menuItem) {
        v vVar = this.M;
        if (vVar != null) {
            vVar.d(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.v
    public void n(g gVar, MenuItem menuItem) {
        v vVar = this.M;
        if (vVar != null) {
            vVar.n(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.ListPopupWindow
    public r q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
