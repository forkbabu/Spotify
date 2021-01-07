package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {
    g a;
    private int b = -1;
    private boolean c;
    private final boolean f;
    private final LayoutInflater n;
    private final int o;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f = z;
        this.n = layoutInflater;
        this.a = gVar;
        this.o = i;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i o2 = this.a.o();
        if (o2 != null) {
            ArrayList<i> p = this.a.p();
            int size = p.size();
            for (int i = 0; i < size; i++) {
                if (p.get(i) == o2) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public g b() {
        return this.a;
    }

    /* renamed from: c */
    public i getItem(int i) {
        ArrayList<i> p = this.f ? this.a.p() : this.a.r();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return p.get(i);
    }

    public void d(boolean z) {
        this.c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> p = this.f ? this.a.p() : this.a.r();
        if (this.b < 0) {
            return p.size();
        }
        return p.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.n.inflate(this.o, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.a.s() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
