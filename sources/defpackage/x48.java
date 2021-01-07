package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;

/* renamed from: x48  reason: default package */
public class x48 implements w48 {
    private final l62 a = new a();
    private final TextView.OnEditorActionListener b = new b();
    private final Activity c;
    private final q48 d;
    private final m48 e;
    private EditText f;
    private TextView g;
    private TextView h;

    /* renamed from: x48$a */
    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            x48.this.d.c(editable.toString());
        }
    }

    /* renamed from: x48$b */
    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            x48.this.d.e(x48.this.f.getText().toString().trim());
            return true;
        }
    }

    public x48(Activity activity, m48 m48, q48 q48) {
        this.c = activity;
        this.d = q48;
        this.e = m48;
    }

    public void c() {
        this.c.finish();
    }

    public void d(boolean z) {
        this.g.setEnabled(z);
    }

    public /* synthetic */ void e(View view) {
        this.d.e(this.f.getText().toString().trim());
    }

    public /* synthetic */ void f(View view) {
        this.d.a();
    }

    public View g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.d.d(this);
        View inflate = layoutInflater.inflate(C0707R.layout.rename_playlist_activity, viewGroup, false);
        inflate.setBackgroundResource(C0707R.drawable.rename_playlist_background_gradient);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.continue_button);
        this.g = textView;
        textView.setOnClickListener(new u48(this));
        EditText editText = (EditText) inflate.findViewById(C0707R.id.edit_text);
        this.f = editText;
        editText.setOnEditorActionListener(this.b);
        this.f.addTextChangedListener(this.a);
        this.f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        if (bundle != null) {
            str = bundle.getString("input_text", "");
        } else {
            str = this.e.O();
        }
        me.grantland.widget.a.d(this.f).o(2, 14.0f);
        this.f.setText((CharSequence) x.n(str, ""));
        Editable text = this.f.getText();
        if (!MoreObjects.isNullOrEmpty(text.toString())) {
            this.f.setSelection(0, text.length());
        }
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.cancel_button);
        this.h = textView2;
        textView2.setOnClickListener(new t48(this));
        return inflate;
    }

    public void h(Bundle bundle) {
        EditText editText = this.f;
        if (editText != null) {
            bundle.putString("input_text", editText.getText().toString());
        }
    }
}
