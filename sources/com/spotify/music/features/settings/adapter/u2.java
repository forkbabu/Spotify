package com.spotify.music.features.settings.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class u2 extends BaseAdapter {
    private final DataSetObserver a;
    private final Context b;
    private final List<String> c = new ArrayList();
    private ListAdapter f;
    private int[] n;
    private int o;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            u2.this.e();
            u2.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            u2.this.e();
            u2.this.notifyDataSetInvalidated();
        }
    }

    protected u2(Context context, ListAdapter listAdapter) {
        a aVar = new a();
        this.a = aVar;
        this.b = context;
        this.f = listAdapter;
        listAdapter.registerDataSetObserver(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        if (!(this.f == null || this.c.isEmpty())) {
            int size = this.c.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = 0;
            }
            for (int i2 = 0; i2 < this.f.getCount(); i2++) {
                int c2 = c(i2);
                iArr[c2] = iArr[c2] + 1;
            }
            this.o = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (iArr[i3] > 0) {
                    iArr[i3] = iArr[i3] + 1;
                    this.o++;
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                int i6 = iArr[i5];
                iArr[i5] = i4;
                i4 += i6;
            }
            this.n = new int[(i4 + 1)];
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                this.n[iArr[i7]] = -i8;
                iArr[i7] = iArr[i7] + 1;
                i7 = i8;
            }
            for (int i9 = 0; i9 < this.f.getCount(); i9++) {
                int c3 = c(i9);
                this.n[iArr[c3]] = i9;
                iArr[c3] = iArr[c3] + 1;
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return this.o == 0 && this.f.areAllItemsEnabled();
    }

    public void b(String[] strArr) {
        Collections.addAll(this.c, strArr);
        e();
        notifyDataSetChanged();
    }

    public abstract int c(int i);

    public boolean d(String[] strArr) {
        if (strArr.length != this.c.size()) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            this.c.set(i, strArr[i]);
        }
        notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f.getCount() + this.o;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int[] iArr = this.n;
        int i2 = iArr[i];
        if (i2 >= 0) {
            return this.f.getItem(iArr[i]);
        }
        return this.c.get((i2 * -1) - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        int i2;
        if (i >= 0 && (i2 = this.n[i]) >= 0) {
            return this.f.getItemId(i2);
        }
        return -1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        int[] iArr = this.n;
        if (i > iArr.length) {
            return -1;
        }
        int i2 = iArr[i];
        if (i2 < 0) {
            return 0;
        }
        return this.f.getItemViewType(i2) + 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        MoreObjects.checkElementIndex(i, this.n.length, "index");
        int i2 = this.n[i];
        if (i2 >= 0) {
            return this.f.getView(i2, view, viewGroup);
        }
        boolean z = true;
        String str = this.c.get((i2 * -1) - 1);
        int i3 = e90.i;
        ia0 ia0 = (ia0) l70.p(view, ia0.class);
        if (ia0 == null) {
            ia0 = e90.e().d(this.b, viewGroup);
        }
        if (i != 0) {
            z = false;
        }
        ia0.V1(z);
        ia0.setTitle(str);
        return ia0.getView();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f.getViewTypeCount() + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        int i2;
        int[] iArr = this.n;
        if (i <= iArr.length && (i2 = iArr[i]) >= 0) {
            return this.f.isEnabled(i2);
        }
        return false;
    }
}
