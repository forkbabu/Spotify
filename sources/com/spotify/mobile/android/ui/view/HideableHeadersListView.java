package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class HideableHeadersListView extends ListView {
    private LinearLayout a;
    private boolean b;
    private boolean c;
    private boolean f;

    public HideableHeadersListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        this.a.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        super.layoutChildren();
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.c = true;
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f = true;
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i != 0) {
            this.b = true;
        }
        super.setSelection(i);
    }

    @Override // android.widget.ListView
    public void setSelectionAfterHeaderView() {
        this.b = true;
        super.setSelectionAfterHeaderView();
    }

    @Override // android.widget.AbsListView
    public void setSelectionFromTop(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.setSelectionFromTop(i, i2);
    }

    @Override // android.widget.AbsListView
    public void smoothScrollBy(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollBy(i, i2);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void smoothScrollToPosition(int i) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollToPosition(i);
    }

    @Override // android.widget.AbsListView
    public void smoothScrollToPosition(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollToPosition(i, i2);
    }
}
