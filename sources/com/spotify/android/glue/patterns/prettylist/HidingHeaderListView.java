package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HidingHeaderListView extends ListView {
    private final View a;
    private final AbsListView.LayoutParams b;
    private boolean c;
    private final DataSetObserver f;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (HidingHeaderListView.this.c) {
                HidingHeaderListView.this.requestLayout();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            if (HidingHeaderListView.this.c) {
                HidingHeaderListView.this.requestLayout();
            }
        }
    }

    public HidingHeaderListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    private boolean b() {
        return getAdapter().getCount() == 2;
    }

    private boolean c() {
        if (getAdapter().getCount() > 2 && getFirstVisiblePosition() <= 1 && 1 <= getLastVisiblePosition()) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int count = getAdapter().getCount() - 2;
        if (count > 0 && getFirstVisiblePosition() <= count && count <= getLastVisiblePosition()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        return getLastVisiblePosition() == getAdapter().getCount() - 1;
    }

    private int getContentHeight() {
        int i = 0;
        if (b()) {
            return 0;
        }
        if (getFirstVisiblePosition() == 0) {
            i = 1;
        }
        return getLastChildExcludingFooter().getBottom() - getChildAt(i).getTop();
    }

    private View getLastChild() {
        return getChildAt(getChildCount() - 1);
    }

    private View getLastChildExcludingFooter() {
        return getChildAt(getChildCountExludingFooter() - 1);
    }

    public int getChildCountExludingFooter() {
        int childCount = getChildCount();
        int i = childCount - 1;
        return getChildAt(i) == this.a ? i : childCount;
    }

    /* access modifiers changed from: package-private */
    public int getLastVisiblePositionExludingFooter() {
        int lastVisiblePosition = getLastVisiblePosition();
        return getLastChild() == this.a ? lastVisiblePosition - 1 : lastVisiblePosition;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        int i;
        if (!this.c || getAdapter() == null || getAdapter().getCount() < 2) {
            this.b.height = 0;
            super.layoutChildren();
            return;
        }
        boolean z = getFirstVisiblePosition() > 0 && b();
        this.b.height = getHeight();
        super.layoutChildren();
        boolean z2 = !c() && (d() || e()) && !b();
        if (z2) {
            setSelectionFromTop(1, 0);
            super.layoutChildren();
        }
        int bottom = getChildCountExludingFooter() > 0 ? getLastChildExcludingFooter().getBottom() : 0;
        boolean c2 = c();
        boolean d = d();
        if ((!c2 || !d) && !b()) {
            i = 0;
        } else {
            i = ((getHeight() - getPaddingTop()) - getPaddingBottom()) - getContentHeight();
        }
        this.b.height = i;
        if (e() && !z && !z2) {
            this.a.layout(getLeft(), bottom, getRight(), i + bottom);
        }
        if (z) {
            setSelectionFromTop(0, -getChildAt(0).getHeight());
            super.layoutChildren();
        } else if (z2) {
            setSelectionFromTop(getAdapter().getCount() - 2, 0);
            super.layoutChildren();
        }
    }

    public void setCanAlwaysHideHeader(boolean z) {
        this.c = z;
    }

    public HidingHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, 0);
        this.b = layoutParams;
        this.f = new a();
        View view = new View(context);
        this.a = view;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            addFooterView(this.a, null, false);
        } else {
            adapter.unregisterDataSetObserver(this.f);
        }
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f);
        }
        super.setAdapter(listAdapter);
    }
}
