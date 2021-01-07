package com.spotify.music.features.navigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.NavigationItem;
import java.util.ArrayList;
import java.util.List;

public class BottomNavigationView extends LinearLayout {
    private final float a = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
    private final List<BottomNavigationItemView> b = new ArrayList(5);
    private boolean c;
    private BottomNavigationItemView f;
    private Paint n;

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private BottomNavigationItemView e(BottomTab bottomTab) {
        for (BottomNavigationItemView bottomNavigationItemView : this.b) {
            if (bottomTab == bottomNavigationItemView.getBottomTab()) {
                return bottomNavigationItemView;
            }
        }
        return null;
    }

    private boolean k() {
        return this.c || getResources().getBoolean(C0707R.bool.show_bottom_navigation_items_text);
    }

    public BottomNavigationItemView a(NavigationItem.NavigationGroup navigationGroup, int i, int i2, BottomTab bottomTab, int i3, int i4, int i5, boolean z) {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) LayoutInflater.from(getContext()).inflate(i5, (ViewGroup) this, false);
        bottomNavigationItemView.setNavigationGroup(navigationGroup);
        bottomNavigationItemView.setItemUri(bottomTab.g().toString());
        bottomNavigationItemView.setBottomTab(bottomTab);
        bottomNavigationItemView.setAdaptiveUiEnabled(this.c);
        String string = getResources().getString(i3);
        bottomNavigationItemView.setText(string);
        if (!k() || !z) {
            bottomNavigationItemView.b(i, i2, 26.0f);
            bottomNavigationItemView.a();
            bottomNavigationItemView.setOnLongClickListener(new zc0());
        } else {
            bottomNavigationItemView.b(i, i2, 24.0f);
        }
        bottomNavigationItemView.setId(i4);
        bottomNavigationItemView.setContentDescription(string);
        this.b.add(bottomNavigationItemView);
        addView(bottomNavigationItemView);
        int dimension = getChildCount() == 3 ? (int) getResources().getDimension(C0707R.dimen.bottom_navigation_padding) : 0;
        setPadding(dimension, 0, dimension, 0);
        return bottomNavigationItemView;
    }

    public BottomNavigationItemView b(NavigationItem.NavigationGroup navigationGroup, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, BottomTab bottomTab, int i, int i2, int i3, boolean z) {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) LayoutInflater.from(getContext()).inflate(i3, (ViewGroup) this, false);
        bottomNavigationItemView.setNavigationGroup(navigationGroup);
        bottomNavigationItemView.setItemUri(bottomTab.g().toString());
        bottomNavigationItemView.setBottomTab(bottomTab);
        bottomNavigationItemView.setAdaptiveUiEnabled(this.c);
        String string = getResources().getString(i);
        bottomNavigationItemView.setText(string);
        if (!k() || !z) {
            bottomNavigationItemView.c(spotifyIconV2, spotifyIconV22, 26.0f);
            bottomNavigationItemView.a();
            bottomNavigationItemView.setOnLongClickListener(new zc0());
        } else {
            bottomNavigationItemView.c(spotifyIconV2, spotifyIconV22, 24.0f);
        }
        bottomNavigationItemView.setId(i2);
        bottomNavigationItemView.setContentDescription(string);
        this.b.add(bottomNavigationItemView);
        addView(bottomNavigationItemView);
        int dimension = getChildCount() == 3 ? (int) getResources().getDimension(C0707R.dimen.bottom_navigation_padding) : 0;
        setPadding(dimension, 0, dimension, 0);
        return bottomNavigationItemView;
    }

    public void c() {
        setPadding(0, 0, 0, 0);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setOnClickListener(null);
        }
        removeAllViews();
        this.b.clear();
    }

    public int d(BottomTab bottomTab) {
        for (int i = 0; i < this.b.size(); i++) {
            if (bottomTab == this.b.get(i).getBottomTab()) {
                return i;
            }
        }
        return -1;
    }

    public boolean f(BottomTab bottomTab) {
        for (BottomNavigationItemView bottomNavigationItemView : this.b) {
            if (bottomTab == bottomNavigationItemView.getBottomTab()) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        int i = 0;
        while (i < this.b.size()) {
            i++;
            this.b.get(i).setTabContentDescription(String.format(getContext().getString(C0707R.string.tab_content_description), Integer.valueOf(i), Integer.valueOf(this.b.size())));
        }
    }

    public BottomTab h(BottomTab bottomTab) {
        bottomTab.getClass();
        BottomNavigationItemView e = e(bottomTab);
        if (e == null) {
            Logger.n("Tab %s is not present in navigation bar. Can't be set to active", bottomTab);
            BottomNavigationItemView bottomNavigationItemView = this.f;
            return bottomNavigationItemView != null ? bottomNavigationItemView.getBottomTab() : BottomTab.UNKNOWN;
        }
        BottomNavigationItemView bottomNavigationItemView2 = this.f;
        if (bottomNavigationItemView2 != null) {
            bottomNavigationItemView2.setActivated(false);
            this.f.setSelected(false);
        }
        e.setActivated(true);
        e.setSelected(true);
        this.f = e;
        return bottomTab;
    }

    public void i(BottomTab bottomTab, boolean z) {
        BottomNavigationItemView e = e(bottomTab);
        if (e != null) {
            e.e(z);
        }
    }

    public boolean j(BottomTab bottomTab, View.OnLongClickListener onLongClickListener) {
        BottomNavigationItemView e = e(bottomTab);
        if (e == null) {
            return false;
        }
        e.setOnLongClickListener(onLongClickListener);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect((float) getLeft(), (float) getTop(), (float) getRight(), ((float) getTop()) + this.a, this.n);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(a.b(getContext(), R.color.gray_7));
    }

    public void setAdaptiveUiEnabled(boolean z) {
        this.c = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
