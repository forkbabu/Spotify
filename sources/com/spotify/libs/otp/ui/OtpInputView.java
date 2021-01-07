package com.spotify.libs.otp.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import io.reactivex.internal.operators.observable.x;
import io.reactivex.s;

public class OtpInputView extends FrameLayout {
    private final TextWatcher a;
    private final HiddenOtpEditText b;
    private final HorizontalScrollView c;
    private final ViewGroup f;
    private final Rect n = new Rect();
    private TextView[] o;
    private b p;
    private com.jakewharton.rxrelay2.b<CharSequence> q;
    private final ClipboardManager r = ((ClipboardManager) getContext().getSystemService("clipboard"));
    private int s;
    private int t = -1;

    public interface b {
        boolean a();

        void b(boolean z);

        void c();
    }

    private class c implements ActionMode.Callback {
        c(a aVar) {
        }

        private String a() {
            if (!OtpInputView.this.r.hasPrimaryClip()) {
                return null;
            }
            String charSequence = OtpInputView.this.r.getPrimaryClip().getItemAt(0).getText().toString();
            if (charSequence.length() != OtpInputView.this.s) {
                return null;
            }
            boolean z = true;
            for (int i = 0; i < charSequence.length(); i++) {
                z &= OtpInputView.this.m(String.valueOf(charSequence.charAt(i)));
            }
            if (!z) {
                return null;
            }
            return charSequence;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            String a2 = a();
            if (a2 == null) {
                return false;
            }
            OtpInputView otpInputView = OtpInputView.this;
            otpInputView.g(otpInputView.s - 1);
            for (int i = 0; i < OtpInputView.this.s; i++) {
                OtpInputView.this.s(i, String.valueOf(a2.charAt(i)));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (a() == null) {
                return false;
            }
            menu.clear();
            menu.add(17039371);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    private class d implements TextWatcher {
        d(a aVar) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 > i2) {
                OtpInputView.a(OtpInputView.this, charSequence.toString().substring(i2 + i, i + i3));
            }
        }
    }

    public OtpInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d dVar = new d(null);
        this.a = dVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        HiddenOtpEditText hiddenOtpEditText = (HiddenOtpEditText) from.inflate(C0707R.layout.otp_input_hidden, (ViewGroup) this, false);
        this.b = hiddenOtpEditText;
        hiddenOtpEditText.setOnFocusChangeListener(new f(this));
        hiddenOtpEditText.addTextChangedListener(dVar);
        hiddenOtpEditText.setOnDeleteListener(new h(this));
        hiddenOtpEditText.setOnEditorActionListener(new c(new g(this)));
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) from.inflate(C0707R.layout.otp_input_container, (ViewGroup) this, false);
        this.c = horizontalScrollView;
        this.f = (ViewGroup) horizontalScrollView.findViewById(C0707R.id.input_container);
        addView(hiddenOtpEditText);
        addView(horizontalScrollView);
    }

    static void a(OtpInputView otpInputView, String str) {
        if (otpInputView.t >= 0 && otpInputView.m(str)) {
            otpInputView.s(otpInputView.t, str);
            if (otpInputView.j() && !otpInputView.l()) {
                otpInputView.g(otpInputView.t + 1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g(int i) {
        b bVar;
        if (i >= 0 && (bVar = this.p) != null) {
            bVar.c();
        }
        MoreObjects.checkState(i < this.s);
        if (i != this.t) {
            this.o.getClass();
            if (j()) {
                this.o[this.t].setActivated(false);
            }
            if (i >= 0) {
                this.o[i].setActivated(true);
            }
            this.t = i;
            if (i >= 0) {
                gf0.p(this.b);
                HorizontalScrollView horizontalScrollView = this.c;
                ViewGroup viewGroup = this.f;
                TextView textView = this.o[i];
                this.n.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
                horizontalScrollView.requestChildRectangleOnScreen(viewGroup, this.n, false);
                return;
            }
            gf0.h(this.b);
        } else if (i >= 0 && isEnabled()) {
            gf0.p(this.b);
        }
    }

    private int getFirstIncompleteDigit() {
        int i = 0;
        while (true) {
            int i2 = this.s;
            if (i >= i2) {
                return -1;
            }
            MoreObjects.checkState(i >= 0 && i < i2);
            this.o.getClass();
            if (!m(this.o[i].getText().toString())) {
                return i;
            }
            i++;
        }
    }

    private String getOtpInternal() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.s; i++) {
            sb.append(i(i));
        }
        return sb.toString();
    }

    private String i(int i) {
        MoreObjects.checkState(i >= 0 && i < this.s);
        this.o.getClass();
        return this.o[i].getText().toString();
    }

    private boolean j() {
        return this.t >= 0;
    }

    private boolean l() {
        return j() && this.t == this.s - 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean m(String str) {
        return str.matches("\\d");
    }

    public void f() {
        for (int i = 0; i < this.s; i++) {
            s(i, " ");
        }
        g(-1);
    }

    public s<CharSequence> getObservable() {
        if (this.q == null) {
            this.q = com.jakewharton.rxrelay2.b.g1();
        }
        com.jakewharton.rxrelay2.b<CharSequence> bVar = this.q;
        bVar.getClass();
        return new x(bVar);
    }

    public String getOtp() {
        if (!k()) {
            return null;
        }
        return getOtpInternal();
    }

    public void h() {
        int firstIncompleteDigit;
        if (isEnabled() && (firstIncompleteDigit = getFirstIncompleteDigit()) >= 0) {
            g(firstIncompleteDigit);
        }
    }

    public boolean k() {
        return this.s > 0 && getFirstIncompleteDigit() < 0;
    }

    public /* synthetic */ void n(View view, boolean z) {
        if (!z) {
            g(-1);
        }
    }

    public boolean o(HiddenOtpEditText hiddenOtpEditText) {
        int i = this.t;
        boolean z = false;
        if (i < 0) {
            return false;
        }
        if (i >= 0 && i < this.s) {
            z = true;
        }
        MoreObjects.checkState(z);
        if (i(i).equals(" ")) {
            int i2 = this.t;
            if (i2 > 0) {
                g(i2 - 1);
                s(this.t, " ");
            }
        } else {
            s(this.t, " ");
        }
        return true;
    }

    public boolean p() {
        if (this.p == null || !k()) {
            return true;
        }
        b bVar = this.p;
        bVar.getClass();
        bVar.a();
        g(-1);
        return false;
    }

    public /* synthetic */ void q(int i, View view) {
        g(i);
    }

    public void r(Bundle bundle) {
        int i = this.s;
        if (i > 0) {
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                strArr[i2] = i(i2);
            }
            bundle.putStringArray("key-otp", strArr);
            bundle.putInt("num-digits", this.s);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i, String str) {
        boolean k = k();
        MoreObjects.checkState(i >= 0 && i < this.s);
        this.o.getClass();
        this.o[i].setText(str);
        if (k != k()) {
            b bVar = this.p;
            if (bVar != null) {
                bVar.b(!k);
            }
            if (!k && l()) {
                b bVar2 = this.p;
                if (bVar2 != null) {
                    bVar2.a();
                }
                g(-1);
            }
        }
        com.jakewharton.rxrelay2.b<CharSequence> bVar3 = this.q;
        if (bVar3 != null) {
            bVar3.accept(getOtpInternal());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int firstIncompleteDigit;
        MoreObjects.checkState(this.s > 0);
        super.setEnabled(z);
        this.b.setEnabled(z);
        TextView[] textViewArr = this.o;
        textViewArr.getClass();
        for (TextView textView : textViewArr) {
            textView.setEnabled(z);
        }
        if (!z) {
            g(-1);
        } else if (isEnabled() && (firstIncompleteDigit = getFirstIncompleteDigit()) >= 0) {
            g(firstIncompleteDigit);
        }
    }

    public void setListener(b bVar) {
        this.p = bVar;
    }

    public void setNumDigits(int i) {
        MoreObjects.checkState(i >= 0);
        if (this.s != i) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i2 = 0; i2 < this.s; i2++) {
                s(i2, " ");
            }
            g(-1);
            this.f.removeAllViews();
            this.o = new TextView[i];
            c cVar = new c(null);
            for (int i3 = 0; i3 < i; i3++) {
                TextView textView = (TextView) from.inflate(C0707R.layout.otp_input_field, this.f, false);
                textView.setActivated(false);
                textView.setText(" ");
                textView.setOnClickListener(new e(this, i3));
                textView.setTextIsSelectable(true);
                textView.setCursorVisible(false);
                textView.setCustomSelectionActionModeCallback(cVar);
                this.f.addView(textView);
                TextView[] textViewArr = this.o;
                textViewArr.getClass();
                textViewArr[i3] = textView;
            }
            this.s = i;
        }
    }

    public void setOtp(String str) {
        int length = str.length();
        int i = 0;
        while (i < this.s) {
            s(i, i < length ? String.valueOf(str.charAt(i)) : " ");
            i++;
        }
    }

    public void setOtpMismatch(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C0707R.drawable.bg_otp_input_field_mismatch;
            i2 = R.color.red;
        } else {
            i = C0707R.drawable.bg_otp_input_field;
            i2 = R.color.white;
        }
        TextView[] textViewArr = this.o;
        textViewArr.getClass();
        for (TextView textView : textViewArr) {
            textView.setTextColor(androidx.core.content.a.b(getContext(), i2));
            textView.setBackgroundResource(i);
        }
    }

    public OtpInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d dVar = new d(null);
        this.a = dVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        HiddenOtpEditText hiddenOtpEditText = (HiddenOtpEditText) from.inflate(C0707R.layout.otp_input_hidden, (ViewGroup) this, false);
        this.b = hiddenOtpEditText;
        hiddenOtpEditText.setOnFocusChangeListener(new f(this));
        hiddenOtpEditText.addTextChangedListener(dVar);
        hiddenOtpEditText.setOnDeleteListener(new h(this));
        hiddenOtpEditText.setOnEditorActionListener(new c(new g(this)));
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) from.inflate(C0707R.layout.otp_input_container, (ViewGroup) this, false);
        this.c = horizontalScrollView;
        this.f = (ViewGroup) horizontalScrollView.findViewById(C0707R.id.input_container);
        addView(hiddenOtpEditText);
        addView(horizontalScrollView);
    }
}
