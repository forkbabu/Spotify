package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.qke;

/* renamed from: jle  reason: default package */
public class jle implements kle, g<pke, oke>, wme {
    private final Context a;
    private final EditText b;
    private final TextView c;
    private final Button f;

    /* access modifiers changed from: package-private */
    /* renamed from: jle$a */
    public class a extends vme {
        final /* synthetic */ da2 a;

        a(jle jle, da2 da2) {
            this.a = da2;
        }

        @Override // defpackage.vme
        public void a(CharSequence charSequence) {
            this.a.accept(oke.d(charSequence.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jle$b */
    public class b implements h<pke> {
        final /* synthetic */ TextWatcher a;

        b(TextWatcher textWatcher) {
            this.a = textWatcher;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            pke pke = (pke) obj;
            jle jle = jle.this;
            jle.getClass();
            pke.c().g(new ale(jle, pke), ile.a, new fle(jle), new hle(jle), new ble(jle), new dle(jle), new cle(jle, pke), new yke(jle), new zke(jle));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            jle.this.b.setOnEditorActionListener(null);
            jle.this.b.removeTextChangedListener(this.a);
        }
    }

    public jle(View view) {
        this.a = view.getContext();
        this.b = (EditText) view.findViewById(C0707R.id.input_password);
        this.f = (Button) view.findViewById(C0707R.id.password_next_button);
        this.c = (TextView) view.findViewById(C0707R.id.password_error_message);
    }

    private void l(boolean z, boolean z2) {
        if (z) {
            EditText editText = this.b;
            Drawable d = androidx.core.content.a.d(this.a, C0707R.drawable.bg_login_text_input);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            editText.setBackground(d);
            this.b.setTextColor(androidx.core.content.a.b(this.a, C0707R.color.login_text_input_text));
        } else {
            EditText editText2 = this.b;
            Drawable d2 = androidx.core.content.a.d(this.a, C0707R.drawable.bg_login_text_input_error);
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            editText2.setBackground(d2);
            this.b.setTextColor(androidx.core.content.a.b(this.a, R.color.red));
        }
        if (z2) {
            this.c.sendAccessibilityEvent(32768);
        }
    }

    public void b() {
        gf0.h(this.b);
    }

    @Override // defpackage.wme
    public void c() {
        gf0.p(this.b);
    }

    public /* synthetic */ void d(qke.a aVar) {
        this.c.setText(C0707R.string.signup_email_no_connection);
        this.f.setEnabled(true);
        l(true, true);
    }

    public /* synthetic */ void e(pke pke, qke.b bVar) {
        if (pke.a()) {
            this.c.setText(C0707R.string.signup_password_invalid_too_short);
            l(false, true);
        }
        this.f.setEnabled(false);
    }

    public /* synthetic */ void f(qke.f fVar) {
        this.f.setEnabled(false);
    }

    public /* synthetic */ void g(qke.e eVar) {
        this.c.setText((CharSequence) null);
        this.f.setEnabled(true);
        l(true, false);
    }

    public /* synthetic */ void h(qke.g gVar) {
        this.c.setText((CharSequence) null);
        this.f.setEnabled(true);
        l(true, false);
    }

    public /* synthetic */ void i(qke.i iVar) {
        this.c.setText(C0707R.string.signup_password_invalid_too_weak);
        this.f.setEnabled(false);
        l(false, true);
    }

    public /* synthetic */ void j(pke pke, qke.h hVar) {
        if (pke.a()) {
            this.c.setText(C0707R.string.signup_password_invalid_too_short);
            l(false, true);
        }
        this.f.setEnabled(false);
    }

    public /* synthetic */ void k(qke.c cVar) {
        this.c.setText(cVar.l());
        this.f.setEnabled(false);
        l(false, true);
    }

    @Override // com.spotify.mobius.g
    public h<pke> t(da2<oke> da2) {
        a aVar = new a(this, da2);
        this.b.addTextChangedListener(aVar);
        this.b.setOnEditorActionListener(new ele(da2));
        this.f.setOnClickListener(new gle(da2));
        return new b(aVar);
    }
}
