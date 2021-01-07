package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.o;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.di9;
import defpackage.gi9;

/* renamed from: hi9  reason: default package */
public class hi9 implements gi9, ui9 {
    private final Context a;
    private final o b;
    private final si9 c;
    private final Drawable d;
    private gi9.a e;
    private View f;
    private EditText g;
    private Button h;
    private ImageButton i;
    private ImageButton j;
    private boolean k;
    private final l62 l = new a();

    /* renamed from: hi9$a */
    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            hi9.this.c.e(charSequence.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hi9$b */
    public class b implements FilterAndSortBottomSheetFragment.a {
        b() {
        }

        @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
        public void J(ane ane, int i) {
            hi9.this.c.g(ane, i);
        }

        @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
        public void X0(di9.b bVar, int i) {
            hi9.this.c.d(bVar, i);
        }

        @Override // com.spotify.music.filterandsort.bottomsheet.FilterAndSortBottomSheetFragment.a
        public void c0() {
            hi9.this.c.a();
        }
    }

    public hi9(Context context, o oVar, si9 si9) {
        this.a = context;
        this.b = oVar;
        this.c = si9;
        this.d = context.getResources().getDrawable(C0707R.drawable.find_and_filter_background);
    }

    private SpotifyIconDrawable n(SpotifyIconV2 spotifyIconV2, int i2, int i3) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) nud.g((float) i2, this.a.getResources()));
        spotifyIconDrawable.r(androidx.core.content.a.b(this.a, i3));
        return spotifyIconDrawable;
    }

    /* access modifiers changed from: private */
    public void o() {
        this.g.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.g.getWindowToken(), 0);
        }
    }

    @Override // defpackage.gi9
    public void a(ane ane) {
        this.c.i(ane);
    }

    @Override // defpackage.gi9
    public void b() {
        this.c.h();
        this.g.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager != null && !inputMethodManager.showSoftInput(this.g, 1)) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }

    @Override // defpackage.gi9
    public void c() {
        this.c.f();
    }

    @Override // defpackage.gi9
    public void d(di9 di9) {
        this.c.j(di9);
    }

    @Override // defpackage.gi9
    public void e(String str) {
        if (!str.equals(this.g.getText().toString())) {
            this.g.setText(str);
        }
    }

    @Override // defpackage.gi9
    public void f() {
        this.g.clearFocus();
        o();
    }

    @Override // defpackage.gi9
    public void g(boolean z) {
        this.k = z;
        if (z) {
            this.h.setBackground(null);
            this.h.setText(C0707R.string.cancel_text_filter_button);
            return;
        }
        this.h.setBackground(this.d);
        this.h.setText(C0707R.string.filter_button);
    }

    @Override // defpackage.gi9
    public View h(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2, di9 di9, gi9.a aVar) {
        this.e = aVar;
        this.c.k(this);
        this.c.j(di9);
        View inflate = layoutInflater.inflate(C0707R.layout.filter_and_sort_view, viewGroup, false);
        this.f = inflate;
        EditText editText = (EditText) inflate.findViewById(C0707R.id.edit_text_filter);
        this.g = editText;
        editText.setHint(di9.i());
        this.g.addTextChangedListener(this.l);
        this.g.setOnClickListener(new wh9(this));
        this.g.setOnFocusChangeListener(new zh9(this));
        ((ImageView) this.f.findViewById(C0707R.id.edit_text_search_icon)).setImageDrawable(n(SpotifyIconV2.SEARCH, 16, R.color.white_70));
        this.h = (Button) this.f.findViewById(C0707R.id.button_filters);
        if (di9.e()) {
            this.h.setVisibility(0);
            this.h.setOnClickListener(new vh9(this));
        }
        if (di9.c()) {
            ImageButton imageButton = (ImageButton) this.f.findViewById(C0707R.id.button_cancel);
            this.j = imageButton;
            imageButton.setVisibility(0);
            this.j.setImageDrawable(n(SpotifyIconV2.ARROW_LEFT, 24, R.color.white));
            this.j.setOnClickListener(new xh9(this));
        }
        ImageButton imageButton2 = (ImageButton) this.f.findViewById(C0707R.id.button_clear);
        this.i = imageButton2;
        imageButton2.setImageDrawable(n(SpotifyIconV2.X, 16, R.color.white));
        this.i.setOnClickListener(new yh9(this));
        View view = new View(this.a);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup2.addView(view);
        view.setOnTouchListener(new ii9(this));
        return this.f;
    }

    public void l() {
        this.g.setText("");
        this.e.b();
        o();
    }

    public void m() {
        this.g.setText("");
    }

    public /* synthetic */ void p(View view) {
        this.c.h();
    }

    public /* synthetic */ void q(View view, boolean z) {
        this.e.f(z);
    }

    public void r(View view) {
        if (this.k) {
            this.e.b();
            this.c.b();
            return;
        }
        this.e.c();
        this.c.f();
    }

    public /* synthetic */ void s(View view) {
        this.c.b();
    }

    public /* synthetic */ void t(View view) {
        this.c.c();
    }

    public void u(ane ane) {
        this.e.d(ane.b(ane, null, false, null, 7));
    }

    public void v(di9.b bVar) {
        this.e.e(bVar);
    }

    public void w(String str) {
        this.e.a(str);
    }

    public void x(di9 di9, ane ane) {
        FilterAndSortBottomSheetFragment filterAndSortBottomSheetFragment = new FilterAndSortBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("BottomSheetDialogFragment.filterAndSortConfiguration", di9);
        bundle.putParcelable("BottomSheetDialogFragment.activeSortOrder", ane);
        filterAndSortBottomSheetFragment.r4(bundle);
        filterAndSortBottomSheetFragment.d5(new b());
        filterAndSortBottomSheetFragment.Y4(this.b, filterAndSortBottomSheetFragment.X2());
    }

    public void y(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }
}
