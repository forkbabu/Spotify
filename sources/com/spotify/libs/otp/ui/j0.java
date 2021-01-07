package com.spotify.libs.otp.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.music.C0707R;
import io.reactivex.y;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class j0<H extends Parcelable> extends i0<H> {
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    private final Context c;
    private final br0 d;
    private final y e;
    private final y f;
    private final c g;
    private final b<H> h;
    private ViewGroup i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private CallingCode n;
    private boolean o;
    private boolean p;
    private final TextWatcher q = new a();

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView = j0.this.m;
            textView.getClass();
            textView.setEnabled(j0.this.s());
            j0.this.g.z(j0.this.h());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public interface b<H> {
        H a(CallingCode callingCode, String str);
    }

    public interface c {
        void i();

        void q();

        void r(String str);

        @Override // com.spotify.libs.otp.ui.l0.d
        void reset();

        void z(String str);
    }

    public j0(Context context, br0 br0, y yVar, y yVar2, c cVar, b<H> bVar) {
        this.c = context;
        this.e = yVar;
        this.f = yVar2;
        this.d = br0;
        this.g = cVar;
        this.h = bVar;
    }

    public static void i(j0 j0Var, List list) {
        j0Var.g.i();
        j0Var.r(list, j0Var.n);
    }

    public static void j(j0 j0Var, Map map) {
        CallingCode callingCode;
        CallingCode callingCode2;
        j0Var.getClass();
        boolean z = map.size() > 1;
        int i2 = z ? 0 : 8;
        int[] iArr = {C0707R.id.horizontal_divider, C0707R.id.calling_code_country};
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            ViewGroup viewGroup = j0Var.i;
            viewGroup.getClass();
            viewGroup.findViewById(i4).setVisibility(i2);
        }
        o oVar = z ? new o(j0Var) : null;
        TextView textView = j0Var.j;
        textView.getClass();
        textView.setOnClickListener(oVar);
        TextView textView2 = j0Var.k;
        textView2.getClass();
        textView2.setOnClickListener(oVar);
        ViewGroup viewGroup2 = j0Var.i;
        viewGroup2.getClass();
        viewGroup2.findViewById(C0707R.id.phone_number_root).setVisibility(0);
        CallingCode callingCode3 = j0Var.n;
        if (callingCode3 == null || !map.containsValue(callingCode3)) {
            Context context = j0Var.c;
            String simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
            String country = context.getResources().getConfiguration().locale.getCountry();
            MoreObjects.checkState(true ^ map.isEmpty());
            if (TextUtils.isEmpty(simCountryIso) || (callingCode2 = (CallingCode) map.get(simCountryIso.toUpperCase(Locale.US))) == null) {
                CallingCode callingCode4 = (CallingCode) map.get(country);
                if (callingCode4 != null) {
                    callingCode = callingCode4;
                } else {
                    callingCode = (CallingCode) map.values().iterator().next();
                }
            } else {
                callingCode = callingCode2;
            }
        } else {
            callingCode = j0Var.n;
        }
        j0Var.q(callingCode);
        h0<H> h0Var = j0Var.a;
        h0Var.getClass();
        h0Var.h();
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 26) {
            TextView textView = this.l;
            textView.getClass();
            textView.setAutofillHints("phoneNational");
            this.l.setImportantForAutofill(1);
            AutofillManager autofillManager = (AutofillManager) this.l.getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyViewEntered(this.l);
            }
        }
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void a(boolean z) {
        TextView textView = this.m;
        textView.getClass();
        textView.setEnabled(s());
        TextView textView2 = this.l;
        textView2.getClass();
        textView2.addTextChangedListener(this.q);
        ViewGroup viewGroup = this.i;
        viewGroup.getClass();
        viewGroup.findViewById(C0707R.id.phone_number_root).setVisibility(8);
        this.b.b(this.d.b().H(this.e).B(this.f).subscribe(new j(this), k.a));
        this.g.reset();
        ViewGroup viewGroup2 = this.i;
        viewGroup2.getClass();
        AnimatorHelper.f(viewGroup2, z, new l(this));
    }

    @Override // com.spotify.libs.otp.ui.f0
    public int b() {
        return C0707R.id.request_otp;
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void c(boolean z) {
        ViewGroup viewGroup = this.i;
        viewGroup.getClass();
        AnimatorHelper.c(viewGroup, z);
        TextView textView = this.l;
        textView.getClass();
        textView.removeTextChangedListener(this.q);
        this.b.f();
    }

    @Override // com.spotify.libs.otp.ui.f0
    public void d(ViewGroup viewGroup) {
        this.a.getClass();
        this.i = viewGroup;
        View findViewById = viewGroup.findViewById(C0707R.id.calling_code_country);
        findViewById.getClass();
        this.j = (TextView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0707R.id.calling_code);
        findViewById2.getClass();
        this.k = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0707R.id.phone_number);
        findViewById3.getClass();
        this.l = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0707R.id.request_otp_button);
        findViewById4.getClass();
        this.m = (TextView) findViewById4;
        AnimatorHelper.d(this.j, SpotifyIconV2.CHEVRON_RIGHT);
        this.l.setOnEditorActionListener(new c(new b(this.m)));
        this.m.setOnClickListener(new n(this));
    }

    @Override // com.spotify.libs.otp.ui.i0
    public void e(boolean z) {
        TextView textView = this.j;
        textView.getClass();
        textView.setEnabled(z);
        TextView textView2 = this.k;
        textView2.getClass();
        textView2.setEnabled(z);
        TextView textView3 = this.l;
        textView3.getClass();
        textView3.setEnabled(z);
        TextView textView4 = this.m;
        textView4.getClass();
        textView4.setEnabled(z && s());
        if (z) {
            if (this.o) {
                p();
            }
            this.p = true;
        }
    }

    /* access modifiers changed from: package-private */
    public String h() {
        TextView textView = this.l;
        textView.getClass();
        return textView.getText().toString();
    }

    public void k(View view) {
        b<H> bVar = this.h;
        CallingCode callingCode = this.n;
        callingCode.getClass();
        this.g.q();
        h0<H> h0Var = this.a;
        h0Var.getClass();
        h0Var.f(bVar.a(callingCode, h()));
    }

    public void l(View view) {
        this.b.f();
        this.b.b(this.d.a().H(this.e).B(this.f).subscribe(new i(this), m.a));
    }

    public /* synthetic */ void m() {
        if (this.p) {
            p();
        }
        this.o = true;
    }

    /* access modifiers changed from: protected */
    public void n(Bundle bundle) {
        if (bundle != null) {
            this.n = (CallingCode) bundle.getParcelable("selected-calling-code");
        }
    }

    /* access modifiers changed from: protected */
    public void o(Bundle bundle) {
        bundle.putParcelable("selected-calling-code", this.n);
    }

    /* access modifiers changed from: protected */
    public void q(CallingCode callingCode) {
        callingCode.getClass();
        TextView textView = this.j;
        textView.getClass();
        textView.setText(callingCode.c());
        TextView textView2 = this.k;
        textView2.getClass();
        textView2.setText(callingCode.a());
        this.n = callingCode;
        if ("BR".equals(callingCode.b())) {
            TextView textView3 = this.l;
            textView3.getClass();
            textView3.setHint(C0707R.string.hint_phone_number_br);
        } else {
            TextView textView4 = this.l;
            textView4.getClass();
            textView4.setHint(C0707R.string.hint_phone_number);
        }
        this.g.r(this.k.getText().toString());
    }

    /* access modifiers changed from: protected */
    public abstract void r(List<CallingCode> list, CallingCode callingCode);

    /* access modifiers changed from: package-private */
    public boolean s() {
        return this.n != null && !h().isEmpty();
    }
}
