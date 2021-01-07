package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;

/* renamed from: qu4  reason: default package */
public class qu4 implements pu4 {
    private final Activity a;
    private final fu4 b;
    private final l62 c = new a();
    private final TextView.OnEditorActionListener d = new b();
    private EditText e;
    private TextView f;
    private TextView g;
    private LoadingView h;

    /* renamed from: qu4$a */
    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            qu4.this.b.c(editable.toString());
        }
    }

    /* renamed from: qu4$b */
    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            qu4.this.b.d(qu4.this.e.getText().toString().trim());
            return true;
        }
    }

    public qu4(Activity activity, fu4 fu4) {
        this.a = activity;
        this.b = fu4;
    }

    public void c(String str) {
        this.a.finish();
    }

    public void d() {
        this.g.setEnabled(false);
        this.f.setEnabled(false);
    }

    public void e() {
        this.g.setEnabled(true);
        this.f.setEnabled(true);
    }

    public void f() {
        EditText editText;
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager != null && (editText = this.e) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public /* synthetic */ void g(View view) {
        this.b.d(this.e.getText().toString().trim());
    }

    public /* synthetic */ void h(View view) {
        this.b.a();
    }

    public View i(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.b.e(this);
        View inflate = layoutInflater.inflate(C0707R.layout.create_playlist_activity, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0707R.id.container);
        relativeLayout.setBackgroundResource(C0707R.drawable.create_playlist_background_gradient);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.continue_button);
        this.f = textView;
        textView.setOnClickListener(new ou4(this));
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.cancel_button);
        this.g = textView2;
        textView2.setOnClickListener(new nu4(this));
        if (bundle != null) {
            str = bundle.getString("input_text", "");
        } else {
            str = "";
        }
        EditText editText = (EditText) inflate.findViewById(C0707R.id.edit_text);
        this.e = editText;
        editText.setOnEditorActionListener(this.d);
        this.e.addTextChangedListener(this.c);
        this.e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        me.grantland.widget.a.d(this.e).o(2, 14.0f);
        this.e.setText((CharSequence) x.n(str, ""));
        gf0.p(this.e);
        FrameLayout frameLayout = new FrameLayout(this.a);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        com.spotify.music.contentviewstate.view.b bVar = LoadingView.y;
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        this.h = loadingView;
        loadingView.setDelayBeforeShowing(0);
        frameLayout.addView(this.h);
        relativeLayout.addView(frameLayout);
        return inflate;
    }

    public void j(Bundle bundle) {
        EditText editText = this.e;
        if (editText != null) {
            bundle.putString("input_text", editText.getText().toString());
        }
    }

    public void k() {
        this.f.setText(C0707R.string.create_playlist_create_button);
    }

    public void l(boolean z) {
        if (z) {
            this.h.r();
        } else {
            this.h.n();
        }
    }

    public void m() {
        this.f.setText(C0707R.string.create_playlist_skip_button);
    }
}
