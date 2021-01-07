package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.x;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: q50  reason: default package */
public final class q50 extends m50<CharSequence> {
    private final TextView a;

    /* renamed from: q50$a */
    private static final class a extends io.reactivex.android.a implements TextWatcher {
        private final TextView b;
        private final x<? super CharSequence> c;

        public a(TextView textView, x<? super CharSequence> xVar) {
            h.f(textView, "view");
            h.f(xVar, "observer");
            this.b = textView;
            this.c = xVar;
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.a
        public void a() {
            this.b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            h.f(editable, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h.f(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h.f(charSequence, "s");
            if (!d()) {
                this.c.onNext(charSequence);
            }
        }
    }

    public q50(TextView textView) {
        h.f(textView, "view");
        this.a = textView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.m50
    public CharSequence g1() {
        return this.a.getText();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.m50
    public void h1(x<? super CharSequence> xVar) {
        h.f(xVar, "observer");
        a aVar = new a(this.a, xVar);
        xVar.onSubscribe(aVar);
        this.a.addTextChangedListener(aVar);
    }
}
