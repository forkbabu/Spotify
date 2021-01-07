package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.BackKeyEditText;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.i;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ow0  reason: default package */
public final class ow0 extends i {
    public static final a h = new a(null);
    private final ToolbarSearchFieldView g;

    /* renamed from: ow0$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    public ow0(Context context, ToolbarSearchFieldView toolbarSearchFieldView, boolean z) {
        h.e(context, "context");
        h.e(toolbarSearchFieldView, "toolbarSearchFieldView");
        this.g = toolbarSearchFieldView;
        toolbarSearchFieldView.getLayoutParams().width = -1;
        toolbarSearchFieldView.getLayoutParams().height = d.c(context);
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) resources.getDimensionPixelSize(C0707R.dimen.std_24dp));
        Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
        h.d(searchPlaceHolder, "searchPlaceHolder");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        layoutParams.gravity = 8388611;
        searchPlaceHolder.setLayoutParams(layoutParams);
        c.n(searchPlaceHolder, R.style.TextAppearance_Encore_MestoBold);
        if (z) {
            searchPlaceHolder.setTextColor(androidx.core.content.a.b(searchPlaceHolder.getContext(), C0707R.color.allboarding_stockholm_black_searchbar_hint_text));
            spotifyIconDrawable.r(androidx.core.content.a.b(searchPlaceHolder.getContext(), C0707R.color.allboarding_stockholm_black_searchbar_hint_text));
        } else {
            searchPlaceHolder.setTextColor(androidx.core.content.a.b(searchPlaceHolder.getContext(), C0707R.color.allboarding_stockholm_white_searchbar_hint_text));
            spotifyIconDrawable.r(androidx.core.content.a.b(searchPlaceHolder.getContext(), C0707R.color.allboarding_stockholm_white_searchbar_hint_text));
        }
        c.h(searchPlaceHolder, spotifyIconDrawable, null, null, null);
        BackKeyEditText queryEditText = toolbarSearchFieldView.getQueryEditText();
        h.d(queryEditText, "mSearchFieldView.queryEditText");
        queryEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        q4.T(toolbarSearchFieldView.findViewById(C0707R.id.search_toolbar), "search_field");
        toolbarSearchFieldView.setToolbarSearchFieldRightButtonListener(new qw0(this));
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new pw0(this));
        a();
    }

    @Override // com.spotify.music.libs.search.view.i
    public void b() {
        BackKeyEditText queryEditText = this.g.getQueryEditText();
        h.d(queryEditText, "mSearchFieldView.queryEditText");
        if (TextUtils.isEmpty(queryEditText.getText())) {
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
        BackKeyEditText queryEditText = this.g.getQueryEditText();
        h.d(queryEditText, "mSearchFieldView.queryEditText");
        return queryEditText;
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
        } else {
            BackKeyEditText queryEditText = this.g.getQueryEditText();
            h.d(queryEditText, "mSearchFieldView.queryEditText");
            if (TextUtils.isEmpty(queryEditText.getText())) {
                this.g.p().g();
            }
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

    public final void y() {
        Button searchPlaceHolder = this.g.getSearchPlaceHolder();
        h.d(searchPlaceHolder, "mSearchFieldView.searchPlaceHolder");
        searchPlaceHolder.setVisibility(8);
    }
}
