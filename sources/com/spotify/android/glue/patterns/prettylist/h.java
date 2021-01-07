package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

public class h extends ViewGroup implements k {
    private final ScrollView a;
    private final PrettyHeaderView b;
    private final StickyRecyclerView c;
    private u f;

    public h(Context context, View view) {
        super(context);
        PrettyHeaderView prettyHeaderView = new PrettyHeaderView(context, view);
        this.b = prettyHeaderView;
        ScrollView scrollView = new ScrollView(context);
        this.a = scrollView;
        scrollView.addView(prettyHeaderView);
        StickyRecyclerView stickyRecyclerView = new StickyRecyclerView(context, null);
        this.c = stickyRecyclerView;
        stickyRecyclerView.setId(C0707R.id.legacy_header_sticky_recycler);
        stickyRecyclerView.setPadding(0, nud.g(1.0f, context.getResources()), 0, 0);
        addView(scrollView);
        addView(stickyRecyclerView);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void a(boolean z) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void b(boolean z) {
    }

    public View getHeaderAccessory() {
        return this.b.getAccessory();
    }

    public ImageView getHeaderBackgroundView() {
        return this.b.getBackgroundView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public PrettyHeaderView getPrettyHeaderView() {
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public RecyclerView getRecyclerView() {
        return this.c.getRecyclerView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.k
    public StickyRecyclerView getStickyRecyclerView() {
        return this.c;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (nud.n(this)) {
            int measuredWidth = this.c.getMeasuredWidth() + paddingLeft;
            this.c.layout(paddingLeft, paddingTop, measuredWidth, this.c.getMeasuredHeight() + paddingTop);
            this.a.layout(measuredWidth, paddingTop, this.a.getMeasuredWidth() + measuredWidth, this.a.getMeasuredHeight() + paddingTop);
            return;
        }
        int measuredWidth2 = this.a.getMeasuredWidth() + paddingLeft;
        this.a.layout(paddingLeft, paddingTop, measuredWidth2, this.a.getMeasuredHeight() + paddingTop);
        this.c.layout(measuredWidth2, paddingTop, this.c.getMeasuredWidth() + measuredWidth2, this.c.getMeasuredHeight() + paddingTop);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i3 = paddingLeft / 3;
        this.b.setMinHeight(paddingTop);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setFilterView(View view) {
        this.c.setHeaderView(view);
        this.c.setStickyView(view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderAccessory(View view) {
        this.b.setAccessory(view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderBackgroundColor(int i) {
        this.c.setHeaderBackgroundColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderSticky(boolean z) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setTitle(String str) {
        u uVar = this.f;
        if (uVar != null) {
            uVar.setTitle(str);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setToolbarUpdater(u uVar) {
        this.f = uVar;
    }
}
