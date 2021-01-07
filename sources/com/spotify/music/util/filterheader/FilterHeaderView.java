package com.spotify.music.util.filterheader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.util.filterheader.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

public class FilterHeaderView extends RelativeLayout {
    public static final /* synthetic */ int A = 0;
    private ImageButton a;
    private TextView b;
    private g c;
    private boolean f;
    private boolean n;
    private Drawable o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private InteractionLogger s;
    private c t;
    private final c.b u;
    private final View.OnTouchListener v = new b();
    private final View.OnClickListener w = new c();
    private final TextWatcher x = new d();
    private final TextView.OnEditorActionListener y = new e();
    private final View.OnFocusChangeListener z = new f();

    class a implements c.b {
        a() {
        }

        @Override // com.spotify.music.util.filterheader.c.b
        public void a(SortOption sortOption) {
            if (FilterHeaderView.this.c != null) {
                FilterHeaderView.this.c.a(sortOption);
            }
            if (FilterHeaderView.this.s != null) {
                FilterHeaderView.this.s.a(null, "sort", 0, InteractionLogger.InteractionType.HIT, "sort-changed");
            }
            FilterHeaderView.this.n(sortOption);
        }
    }

    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Drawable drawable;
            if (motionEvent.getAction() != 1 || (drawable = FilterHeaderView.this.b.getCompoundDrawables()[2]) == null || motionEvent.getX() < ((float) (((FilterHeaderView.this.b.getWidth() - FilterHeaderView.this.b.getPaddingRight()) - FilterHeaderView.this.b.getCompoundPaddingRight()) - drawable.getBounds().width()))) {
                return false;
            }
            FilterHeaderView.this.b.setText("");
            FilterHeaderView.this.k();
            FilterHeaderView.this.b.clearFocus();
            return false;
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FilterHeaderView.this.s != null) {
                FilterHeaderView.this.s.a(null, "sort", 0, InteractionLogger.InteractionType.HIT, "show-sort-options");
            }
            FilterHeaderView.this.t.j(FilterHeaderView.this.a);
        }
    }

    class d extends l62 {
        d() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (FilterHeaderView.this.c != null) {
                FilterHeaderView.this.c.d(editable.toString());
            }
            FilterHeaderView.g(FilterHeaderView.this);
            if (FilterHeaderView.this.c != null && !FilterHeaderView.this.l()) {
                FilterHeaderView.this.c.b();
            }
        }
    }

    class e implements TextView.OnEditorActionListener {
        e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & BitmapRenderer.ALPHA_VISIBLE) == 0) {
                return false;
            }
            FilterHeaderView.this.k();
            return true;
        }
    }

    class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                FilterHeaderView.this.setFilterFocused(true);
            }
        }
    }

    public interface g {
        void a(SortOption sortOption);

        void b();

        void c(boolean z);

        void d(String str);
    }

    public FilterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.u = aVar;
        this.t = new c(getContext(), LayoutInflater.from(getContext()), aVar);
        this.p = j(SpotifyIcon.SORT_32);
        this.q = j(SpotifyIcon.SORTDOWN_32);
        this.r = j(SpotifyIcon.SORTUP_32);
        this.o = new SpotifyIconDrawable(getContext(), SpotifyIcon.X_16);
    }

    static void g(FilterHeaderView filterHeaderView) {
        boolean l = filterHeaderView.l();
        if (l) {
            filterHeaderView.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, filterHeaderView.o, (Drawable) null);
        } else {
            filterHeaderView.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        InteractionLogger interactionLogger = filterHeaderView.s;
        if (!(interactionLogger == null || filterHeaderView.f == l)) {
            interactionLogger.a(null, "filter", 0, InteractionLogger.InteractionType.HIT, l ? "set-text-filter" : "clear-text-filter");
        }
        filterHeaderView.f = l;
    }

    public static FilterHeaderView i(LayoutInflater layoutInflater, String str, List<SortOption> list, SortOption sortOption, g gVar) {
        FilterHeaderView filterHeaderView = (FilterHeaderView) layoutInflater.inflate(C0707R.layout.header_filter, (ViewGroup) null);
        filterHeaderView.setFilter(str);
        filterHeaderView.t.i(list, sortOption);
        filterHeaderView.n(sortOption);
        filterHeaderView.setObserver(gVar);
        return filterHeaderView;
    }

    private Drawable j(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), spotifyIcon);
        spotifyIconDrawable.r(androidx.core.content.a.b(getContext(), R.color.white));
        spotifyIconDrawable.w((float) nud.g(24.0f, getResources()));
        return spotifyIconDrawable;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n(SortOption sortOption) {
        if (sortOption == null || !sortOption.g()) {
            this.a.setImageDrawable(this.p);
        } else if (sortOption.f()) {
            this.a.setImageDrawable(this.r);
        } else {
            this.a.setImageDrawable(this.q);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFilterFocused(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            g gVar = this.c;
            if (gVar != null) {
                gVar.c(z2);
            }
        }
    }

    public c getFilterSortPopup() {
        return this.t;
    }

    public TextView getFilterTextView() {
        return this.b;
    }

    public ImageButton getSortButton() {
        return this.a;
    }

    public void k() {
        this.b.clearFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        setFilterFocused(false);
    }

    public boolean l() {
        return !this.b.getText().toString().isEmpty();
    }

    public void m(com.spotify.music.libs.viewuri.c cVar, com.spotify.instrumentation.a aVar, jz1 jz1) {
        this.s = new InteractionLogger(jz1, cVar, aVar, fqe.a);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        this.t.f();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            this.a = (ImageButton) findViewById(C0707R.id.button_sort);
            this.b = (TextView) findViewById(C0707R.id.filter);
            this.a.setOnClickListener(this.w);
            this.b.addTextChangedListener(this.x);
            this.b.setOnEditorActionListener(this.y);
            this.b.setOnFocusChangeListener(this.z);
            this.f = false;
            this.n = false;
            this.b.setOnTouchListener(this.v);
            n(null);
        }
    }

    public void setCurrentSortOption(SortOption sortOption) {
        this.t.g(sortOption);
        n(sortOption);
    }

    public void setFilter(String str) {
        if (!TextUtils.equals(str, this.b.getText())) {
            TextView textView = this.b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            this.f = l();
        }
    }

    public void setFilterParams(List<b> list) {
        this.t.h(list);
    }

    public void setHint(int i) {
        this.b.setHint(i);
    }

    public void setObserver(g gVar) {
        this.c = gVar;
    }
}
