package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.qhe;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: rie  reason: default package */
public class rie implements sie, g<phe, ohe>, wme {
    private final Context a;
    private final EditText b;
    private final TextView c;
    private final Button f;
    private final ProgressBar n;
    private io.reactivex.disposables.b o = EmptyDisposable.INSTANCE;
    y p = io.reactivex.android.schedulers.a.b();
    private da2<ohe> q;

    /* access modifiers changed from: package-private */
    /* renamed from: rie$a */
    public class a extends vme {
        final /* synthetic */ da2 a;

        a(rie rie, da2 da2) {
            this.a = da2;
        }

        @Override // defpackage.vme
        public void a(CharSequence charSequence) {
            this.a.accept(ohe.d(charSequence.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rie$b */
    public class b implements h<phe> {
        final /* synthetic */ da2 a;
        final /* synthetic */ TextWatcher b;

        b(da2 da2, TextWatcher textWatcher) {
            this.a = da2;
            this.b = textWatcher;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            phe phe = (phe) obj;
            phe.b().d(new kie(this, phe), new mie(this, phe), new oie(this, phe, this.a), jie.a, new nie(this), new pie(this));
            if (!phe.c()) {
                rie.this.c.setText(C0707R.string.signup_email_no_connection);
                rie.this.f.setEnabled(false);
            }
            rie rie = rie.this;
            qhe b2 = phe.b();
            b2.getClass();
            rie.o(b2 instanceof qhe.f);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            rie.this.b.removeTextChangedListener(this.b);
            rie.this.b.setOnEditorActionListener(null);
            rie.this.b.setOnClickListener(null);
            rie.this.b.setOnFocusChangeListener(null);
            rie.this.o.dispose();
        }
    }

    public rie(View view) {
        this.a = view.getContext();
        this.b = (EditText) view.findViewById(C0707R.id.email);
        this.c = (TextView) view.findViewById(C0707R.id.email_error_message);
        this.f = (Button) view.findViewById(C0707R.id.email_next_button);
        this.n = (ProgressBar) view.findViewById(C0707R.id.email_verification_loader);
    }

    static void j(rie rie, qhe.e eVar) {
        rie.o(false);
        rie.f.setEnabled(false);
        rie.p(false);
        String i = eVar.i();
        if (!MoreObjects.isNullOrEmpty(i)) {
            rie.c.setText(i);
        } else {
            rie.c.setText(C0707R.string.signup_error_generic_title);
        }
        rie.c.sendAccessibilityEvent(32768);
    }

    static void k(rie rie) {
        rie.o(false);
        rie.p(true);
        rie.f.setEnabled(true);
        rie.c.setText(C0707R.string.signup_email_hint);
    }

    static void l(rie rie, boolean z) {
        rie.c.setText(C0707R.string.signup_email_hint);
        if (z) {
            rie.f.setEnabled(false);
        } else {
            rie.f.setEnabled(true);
        }
    }

    static void m(rie rie, qhe.b bVar, boolean z) {
        rie.o(false);
        rie.f.setEnabled(false);
        if (z) {
            rie.p(false);
            if (bVar.i() == 20) {
                rie.p(true);
                rie.f.setEnabled(true);
                rie.c.setText(rie.a.getString(C0707R.string.signup_email_error_email_already_taken_title) + ' ' + rie.a.getString(C0707R.string.signup_email_error_email_already_taken_message));
            } else {
                rie.c.setText(C0707R.string.signup_email_invalid);
            }
            rie.c.sendAccessibilityEvent(32768);
            return;
        }
        rie.c.setText(C0707R.string.signup_email_hint);
    }

    static void n(rie rie, boolean z) {
        rie.o(false);
        rie.p(true);
        if (z) {
            rie.c.setText(C0707R.string.signup_email_empty);
        } else {
            rie.c.setText(C0707R.string.signup_email_hint);
        }
        rie.f.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o(boolean z) {
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C0707R.dimen.login_text_input_padding);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(C0707R.dimen.login_text_input_height);
        EditText editText = this.b;
        if (!z) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        int i = 0;
        q4.Q(editText, dimensionPixelSize, 0, dimensionPixelSize2, 0);
        ProgressBar progressBar = this.n;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    private void p(boolean z) {
        if (z) {
            EditText editText = this.b;
            Drawable d = androidx.core.content.a.d(this.a, C0707R.drawable.bg_login_text_input);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            editText.setBackground(d);
            this.b.setTextColor(androidx.core.content.a.b(this.a, C0707R.color.login_text_input_text));
            return;
        }
        EditText editText2 = this.b;
        Drawable d2 = androidx.core.content.a.d(this.a, C0707R.drawable.bg_login_text_input_error);
        int i3 = q4.g;
        int i4 = Build.VERSION.SDK_INT;
        editText2.setBackground(d2);
        this.b.setTextColor(androidx.core.content.a.b(this.a, C0707R.color.login_text_input_text_error));
    }

    @Override // defpackage.sie
    public void a(String str) {
        this.b.setText(str);
        this.b.setSelection(str.length());
    }

    @Override // defpackage.sie
    public void b() {
        gf0.p(this.b);
    }

    @Override // defpackage.wme
    public void c() {
        if (MoreObjects.isNullOrEmpty(this.b.getText().toString())) {
            this.q.accept(ohe.b());
        }
        gf0.p(this.b);
    }

    @Override // com.spotify.mobius.g
    public h<phe> t(da2<ohe> da2) {
        this.q = da2;
        a aVar = new a(this, da2);
        this.b.setOnEditorActionListener(new qie(da2));
        this.b.addTextChangedListener(aVar);
        this.b.clearFocus();
        this.f.setOnClickListener(new iie(da2));
        return new b(da2, aVar);
    }
}
