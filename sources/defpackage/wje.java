package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.signup.splitflow.agreements.KoreanAgreementsView;
import com.spotify.termsandconditions.TermsAndConditionsView;
import com.spotify.termsandconditions.k;
import defpackage.ce0;
import defpackage.ge0;
import defpackage.ie0;
import defpackage.je0;
import defpackage.tje;

/* renamed from: wje  reason: default package */
public class wje implements g<sje, rje>, wme, xje {
    private final View a;
    private final Context b;
    private final EditText c;
    private final Button f;
    private final ProgressBar n;
    private final TermsAndConditionsView o;
    private final KoreanAgreementsView p;
    private Optional<Boolean> q = Optional.absent();

    /* renamed from: wje$a */
    class a implements k {
        final /* synthetic */ ae0 a;

        a(wje wje, ae0 ae0) {
            this.a = ae0;
        }

        @Override // com.spotify.termsandconditions.k
        public void a() {
            this.a.a(new ce0.e(je0.h.b, ge0.h.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void b() {
            this.a.a(new ce0.h(je0.h.b, ie0.h.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void c() {
            this.a.a(new ce0.e(je0.h.b, ge0.i.b));
        }

        @Override // com.spotify.termsandconditions.k
        public void d() {
            this.a.a(new ce0.h(je0.h.b, ie0.i.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wje$b */
    public class b extends vme {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        @Override // defpackage.vme
        public void a(CharSequence charSequence) {
            this.a.accept(rje.d(charSequence.toString(), wje.this.c.hasFocus()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wje$c */
    public class c implements h<sje> {
        final /* synthetic */ TextWatcher a;

        c(TextWatcher textWatcher) {
            this.a = textWatcher;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            wje.d(wje.this, (sje) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            wje.this.f.setOnClickListener(null);
            wje.this.c.removeTextChangedListener(this.a);
        }
    }

    public wje(View view, ae0 ae0) {
        this.a = view;
        this.b = view.getContext();
        this.c = (EditText) view.findViewById(C0707R.id.name);
        this.f = (Button) view.findViewById(C0707R.id.name_next_button);
        this.n = (ProgressBar) view.findViewById(C0707R.id.progressBar);
        TermsAndConditionsView termsAndConditionsView = (TermsAndConditionsView) view.findViewById(C0707R.id.terms_conditions);
        this.o = termsAndConditionsView;
        this.p = (KoreanAgreementsView) view.findViewById(C0707R.id.korean_agreements);
        termsAndConditionsView.setTermsAndConditionClickListener(new a(this, ae0));
    }

    static void d(wje wje, sje sje) {
        wje.getClass();
        boolean z = true;
        if (sje.c() && wje.n.getVisibility() != 0) {
            wje.n.setVisibility(0);
            wje.f.setVisibility(4);
            wje.o.setEnabled(false);
            wje.p.setEnabled(false);
        } else if (!sje.c() && wje.n.getVisibility() == 0) {
            wje.n.setVisibility(8);
            wje.f.setVisibility(0);
            wje.o.setEnabled(true);
            wje.p.setEnabled(true);
        }
        if (sje.h()) {
            boolean j = sje.j();
            wje.o.setVisibility(8);
            wje.p.setVisibility(0);
            wje.p.b(j);
        }
        tje g = sje.g();
        g.getClass();
        boolean z2 = g instanceof tje.b;
        if (sje.h()) {
            wje.f.setEnabled(z2 && sje.b());
        } else {
            wje.f.setEnabled(z2);
        }
        if (z2) {
            EditText editText = wje.c;
            Drawable d = androidx.core.content.a.d(wje.b, C0707R.drawable.bg_login_text_input);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            editText.setBackground(d);
            wje.c.setTextColor(androidx.core.content.a.b(wje.b, C0707R.color.login_text_input_text));
        } else {
            EditText editText2 = wje.c;
            Drawable d2 = androidx.core.content.a.d(wje.b, C0707R.drawable.bg_login_text_input_error);
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            editText2.setBackground(d2);
            wje.c.setTextColor(androidx.core.content.a.b(wje.b, R.color.red));
        }
        if (wje.q.isPresent() && wje.q.get().booleanValue() == sje.i()) {
            z = false;
        }
        if (z) {
            if (sje.i()) {
                wje.o.k();
            } else {
                wje.o.j();
            }
        }
        wje.q = Optional.of(Boolean.valueOf(sje.i()));
    }

    @Override // defpackage.xje
    public void a(String str) {
        this.c.setText(str);
    }

    @Override // defpackage.wme
    public void c() {
    }

    public void f(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    @Override // com.spotify.mobius.g
    public h<sje> t(da2<rje> da2) {
        b bVar = new b(da2);
        this.c.addTextChangedListener(bVar);
        this.p.setValidationListener(new vje(da2));
        return new c(bVar);
    }
}
