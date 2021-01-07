package com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.PageIndicator;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;

public class ShelfView extends ConstraintLayout {
    private TextView a = ((TextView) findViewById(C0707R.id.shelf_title));
    private ShelfGridRecyclerView b = ((ShelfGridRecyclerView) findViewById(C0707R.id.shelf_recycler_view));
    private PageIndicator c = ((PageIndicator) findViewById(C0707R.id.page_indicator));
    private qo8 f;
    private a n;

    public interface a {
    }

    public ShelfView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.inflate(getContext(), C0707R.layout.view_shelf, this);
    }

    public /* synthetic */ void C(int i) {
        if (this.n != null && i > 0) {
            this.b.scrollBy(i, 0);
            ((PageIndicator) this.n).c();
        }
    }

    public void D() {
        this.c.d(this.b, this.f);
        setScrollXStateListener(this.c);
    }

    public void E(int i) {
        GridLayoutManager layoutManager = this.b.getLayoutManager();
        layoutManager.getClass();
        layoutManager.t2(i, 40);
    }

    public int getShelfScrollX() {
        return this.b.computeHorizontalScrollOffset();
    }

    public void setAdapter(fl8 fl8) {
        ShelfGridRecyclerView shelfGridRecyclerView = this.b;
        fl8.getClass();
        shelfGridRecyclerView.setAdapter(fl8);
    }

    public void setOnScrollListener(com.spotify.mobile.android.spotlets.common.recyclerview.a aVar) {
        this.b.u();
        this.b.n(aVar);
    }

    public void setScrollXStateListener(a aVar) {
        this.n = aVar;
    }

    public void setShelfScrollX(int i) {
        this.b.post(new a(this, i));
    }

    public void setSnapHelper(qo8 qo8) {
        this.f = qo8;
        qo8.a(this.b);
    }

    public void setTitle(String str) {
        this.a.setText(str);
    }
}
