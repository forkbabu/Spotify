package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.i;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hr8  reason: default package */
public class hr8 extends i {
    private final ToolbarSearchFieldView g;

    public hr8(Context context, ToolbarSearchFieldView toolbarSearchFieldView) {
        toolbarSearchFieldView.getClass();
        this.g = toolbarSearchFieldView;
        toolbarSearchFieldView.getLayoutParams().width = -1;
        toolbarSearchFieldView.getLayoutParams().height = d.c(context);
        Resources resources = context.getResources();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) resources.getDimensionPixelSize(C0707R.dimen.free_tier_taste_onboarding_artist_search_bar_icon_size));
        Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        layoutParams.gravity = 8388611;
        searchPlaceHolder.setLayoutParams(layoutParams);
        searchPlaceHolder.setText(resources.getText(C0707R.string.free_tier_taste_onboarding_search_bar_hint));
        c.n(searchPlaceHolder, R.style.TextAppearance_Encore_MestoBold);
        searchPlaceHolder.setTextColor(resources.getColor(C0707R.color.free_tier_taste_onboarding_stockholm_black_searchbar_hint_text));
        spotifyIconDrawable.r(resources.getColor(C0707R.color.free_tier_taste_onboarding_stockholm_black_searchbar_hint_text));
        c.h(searchPlaceHolder, spotifyIconDrawable, null, null, null);
        if (Build.VERSION.SDK_INT >= 21) {
            toolbarSearchFieldView.findViewById(C0707R.id.search_toolbar).setTransitionName("search_field");
        }
        toolbarSearchFieldView.setToolbarSearchFieldRightButtonListener(new fr8(this));
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new gr8(this));
        a();
    }

    public void A() {
        this.g.getSearchPlaceHolder().setVisibility(8);
    }

    @Override // com.spotify.music.libs.search.view.i
    public void b() {
        if (TextUtils.isEmpty(this.g.getQueryEditText().getText())) {
            this.g.p().f();
        }
        super.b();
    }

    @Override // com.spotify.music.libs.search.view.i
    public void c() {
        if (f()) {
            super.c();
        } else {
            this.g.p().f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public EditText d() {
        return this.g.getQueryEditText();
    }

    @Override // com.spotify.music.libs.search.view.l
    public void j(String str) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            this.g.p().c();
        } else if (!f()) {
            this.g.p().f();
        }
        k(str, true);
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void l(int i) {
        super.l(i);
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void m() {
        super.m();
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.l
    public void o() {
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public void s(boolean z) {
        if (z) {
            this.g.p().b();
        } else if (TextUtils.isEmpty(this.g.getQueryEditText().getText())) {
            this.g.p().g();
        }
        super.s(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public void t(String str) {
        super.t(str);
        boolean isNullOrEmpty = MoreObjects.isNullOrEmpty(str);
        if (!this.g.k()) {
            this.g.setRightButtonVisible(!isNullOrEmpty);
        }
    }

    public View z() {
        return this.g;
    }
}
