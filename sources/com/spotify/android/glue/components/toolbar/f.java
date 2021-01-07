package com.spotify.android.glue.components.toolbar;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class f implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener, AdapterView.OnItemClickListener {
    private final Context a;
    private final List<MenuItem> b = new ArrayList();
    private View c;
    private ListPopupWindow f;
    private ViewTreeObserver n;
    private final b o = new b(null);

    private class b extends BaseAdapter {
        b(a aVar) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return f.this.b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return (MenuItem) f.this.b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            t90 t90 = (t90) l70.p(view, t90.class);
            if (t90 == null) {
                t90 = e90.d().c(viewGroup.getContext(), viewGroup);
            }
            MenuItem menuItem = (MenuItem) f.this.b.get(i);
            t90.setText(menuItem.getTitle());
            t90.getView().setEnabled(menuItem.isEnabled());
            return t90.getView();
        }
    }

    public f(Context context) {
        this.a = context;
    }

    public void b(MenuItem menuItem) {
        this.b.add(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.c = null;
        this.b.clear();
    }

    public void d() {
        if (e()) {
            this.f.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        ListPopupWindow listPopupWindow = this.f;
        return listPopupWindow != null && listPopupWindow.b();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        ListPopupWindow listPopupWindow = new ListPopupWindow(this.a, null);
        this.f = listPopupWindow;
        listPopupWindow.E(this);
        this.f.F(this);
        this.f.m(this.o);
        boolean z = true;
        this.f.D(true);
        View view = this.c;
        view.getClass();
        if (this.n != null) {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.n = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        this.f.x(view);
        this.f.A(8388613);
        this.f.z(nud.f(220.0f, this.a.getResources()));
        this.f.C(2);
        this.f.a();
        ListView o2 = this.f.o();
        o2.getClass();
        o2.setOnKeyListener(this);
    }

    public void g(View view) {
        this.c = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f = null;
        ViewTreeObserver viewTreeObserver = this.n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.n = this.c.getViewTreeObserver();
            }
            this.n.removeOnGlobalLayoutListener(this);
            this.n = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e()) {
            View view = this.c;
            if (view == null || !view.isShown()) {
                if (e()) {
                    this.f.dismiss();
                }
            } else if (e()) {
                this.f.a();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MenuItem menuItem = (MenuItem) adapterView.getAdapter().getItem(i);
        ListPopupWindow listPopupWindow = this.f;
        if (listPopupWindow != null && listPopupWindow.b() && menuItem.isEnabled()) {
            this.f.dismiss();
        }
        if (menuItem.isEnabled()) {
            ((i) menuItem).j();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        this.f.dismiss();
        return true;
    }
}
