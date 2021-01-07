package com.spotify.music.features.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.view.u;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.paste.graphics.drawable.BadgedDrawable;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class BottomNavigationItemView extends LinearLayout implements zud {
    private TextView a;
    private ImageView b;
    private NavigationItem.NavigationGroup c;
    private StateListDrawable f;
    private StateListDrawable n;
    private ColorStateList o;
    private String p;
    private BottomTab q;
    private boolean r;
    private boolean s;
    private final int t;
    private final yud u;

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void d(Drawable drawable, Drawable drawable2, int i) {
        int i2 = i / 3;
        BadgedDrawable.a aVar = new BadgedDrawable.a();
        aVar.b = i2;
        aVar.c = i2;
        aVar.a = BadgedDrawable.BadgePosition.TOP_RIGHT;
        aVar.e = nud.g(-1.0f, getResources());
        u uVar = new u(a.b(getContext(), R.color.green), a.b(getContext(), R.color.gray_15), i2 / 4);
        BadgedDrawable badgedDrawable = new BadgedDrawable(drawable, uVar, aVar);
        BadgedDrawable badgedDrawable2 = new BadgedDrawable(drawable2, uVar, aVar);
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.n = stateListDrawable;
        stateListDrawable.addState(new int[]{16843518}, badgedDrawable2);
        this.n.addState(StateSet.WILD_CARD, badgedDrawable);
    }

    public void a() {
        this.a.setVisibility(8);
    }

    public void b(int i, int i2, float f2) {
        Drawable d = a.d(getContext(), i);
        int g = (int) ((float) nud.g(f2, getResources()));
        d.setBounds(0, 0, g, g);
        Drawable d2 = a.d(getContext(), i2);
        d2.setBounds(0, 0, g, g);
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f = stateListDrawable;
        stateListDrawable.addState(new int[]{16843518}, d2);
        this.f.addState(StateSet.WILD_CARD, d);
        d(d, d2, g);
        e(this.r);
    }

    public void c(SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, float f2) {
        float g = (float) nud.g(f2, getResources());
        Context context = getContext();
        spotifyIconV2.getClass();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, g);
        Context context2 = getContext();
        spotifyIconV22.getClass();
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, spotifyIconV22, g);
        spotifyIconDrawable.s(this.o);
        spotifyIconDrawable2.s(this.o);
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f = stateListDrawable;
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable2);
        this.f.addState(StateSet.WILD_CARD, spotifyIconDrawable);
        d(spotifyIconDrawable, spotifyIconDrawable2, (int) g);
        e(this.r);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.u.a();
        this.f.setState(getDrawableState());
        this.n.setState(getDrawableState());
    }

    public void e(boolean z) {
        this.r = z;
        this.b.setImageDrawable(z ? this.n : this.f);
    }

    public BottomTab getBottomTab() {
        return this.q;
    }

    public String getItemUri() {
        return this.p;
    }

    public NavigationItem.NavigationGroup getNavigationGroup() {
        return this.c;
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.u.b();
    }

    public StateListDrawable getTabIcon() {
        return this.f;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.u.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(C0707R.id.bottom_navigation_item_title);
        this.b = (ImageView) findViewById(C0707R.id.bottom_navigation_item_icon);
        this.o = a.c(getContext(), C0707R.color.nav_tab_bar_items_color);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.s) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.t), View.MeasureSpec.getMode(i)), i2);
        }
    }

    public void setAdaptiveUiEnabled(boolean z) {
        this.s = z;
    }

    public void setBottomTab(BottomTab bottomTab) {
        bottomTab.getClass();
        this.q = bottomTab;
    }

    public void setItemUri(String str) {
        str.getClass();
        this.p = str;
    }

    public void setNavigationGroup(NavigationItem.NavigationGroup navigationGroup) {
        this.c = navigationGroup;
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.u.d(lVar);
    }

    public void setTabContentDescription(String str) {
        String charSequence = this.b.getContentDescription().toString();
        setContentDescription(charSequence + ", " + str);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.b.setContentDescription(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.u = new yud(this);
        this.t = getResources().getDimensionPixelSize(C0707R.dimen.bottom_navigation_item_max_width);
        dvd.a(this).a();
    }
}
