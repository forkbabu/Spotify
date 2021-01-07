package com.spotify.music.features.updateemail;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.email.f;
import com.spotify.rxjava2.q;
import defpackage.fv8;
import defpackage.gv8;
import defpackage.hv8;
import defpackage.iv8;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class d implements e {
    private final q a = new q();
    private TextWatcher b;
    private View c;
    private final androidx.fragment.app.c d;
    private final jod e;
    private final lv8 f;
    private final jv8 g;
    private final y h;
    private final y i;

    static final class a<T> implements g<iv8> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(iv8 iv8) {
            iv8 iv82 = iv8;
            if (h.a(iv82, iv8.c.a)) {
                ProgressBar progressBar = this.a.e.d;
                h.d(progressBar, "binding.progressBar");
                progressBar.setVisibility(8);
            } else if (h.a(iv82, iv8.b.a)) {
                ProgressBar progressBar2 = this.a.e.d;
                h.d(progressBar2, "binding.progressBar");
                progressBar2.setVisibility(0);
                View view = this.a.c;
                if (view != null) {
                    view.setEnabled(false);
                }
                EditText editText = this.a.e.b;
                h.d(editText, "binding.email");
                editText.setEnabled(false);
            } else if (h.a(iv82, iv8.a.a)) {
                ProgressBar progressBar3 = this.a.e.d;
                h.d(progressBar3, "binding.progressBar");
                progressBar3.setVisibility(8);
                EditText editText2 = this.a.e.b;
                h.d(editText2, "binding.email");
                editText2.setEnabled(true);
            }
        }
    }

    public static final class b extends l62 {
        final /* synthetic */ d a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                this.a.f.d(editable.toString());
                this.a.f.c(gv8.b.a);
            }
        }
    }

    public static final class c implements com.spotify.mobius.h<yu8> {
        final /* synthetic */ d a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.a = dVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            String str;
            yu8 yu8 = (yu8) obj;
            h.e(yu8, "value");
            if (yu8.b().isPresent() && (yu8.b().get() instanceof fv8.b)) {
                ((kv8) this.a.g).d(500);
            } else if (yu8.f().isPresent() && (yu8.f().get() instanceof hv8.b)) {
                ((kv8) this.a.g).d(500);
            } else if (yu8.b().isPresent() || yu8.f().isPresent()) {
                ((kv8) this.a.g).b();
            }
            View view = this.a.c;
            boolean z = false;
            if (view != null) {
                view.setEnabled(yu8.g().isPresent() && (yu8.g().get() instanceof f.b));
            }
            fv8 orNull = yu8.b().orNull();
            if (orNull != null) {
                if (orNull instanceof fv8.c) {
                    fv8.c cVar = (fv8.c) orNull;
                    if (cVar.a().length() > 0) {
                        EditText editText = this.a.e.b;
                        h.d(editText, "binding.email");
                        if (editText.getText().toString().length() == 0) {
                            z = true;
                        }
                        if (z && !(yu8.c().orNull() instanceof gv8.b)) {
                            this.a.e.b.removeTextChangedListener(d.h(this.a));
                            this.a.e.b.setText(cVar.a());
                            this.a.e.b.addTextChangedListener(d.h(this.a));
                            this.a.f.c(gv8.a.a);
                        }
                    }
                }
                this.a.e.b.removeTextChangedListener(d.h(this.a));
                this.a.e.b.addTextChangedListener(d.h(this.a));
            }
            f orNull2 = yu8.g().orNull();
            if (orNull2 != null) {
                TextView textView = this.a.e.c;
                h.d(textView, "binding.inputError");
                if (orNull2 instanceof f.b) {
                    str = "";
                } else if (orNull2 instanceof f.a.C0212a) {
                    str = this.a.d.getString(C0707R.string.error_message_improper_format);
                } else if (orNull2 instanceof f.a.b) {
                    str = this.a.d.getString(C0707R.string.error_message_duplicate_email);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(str);
            }
            hv8 orNull3 = yu8.f().orNull();
            if (orNull3 != null && (orNull3 instanceof hv8.c)) {
                this.a.d.onBackPressed();
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public d(androidx.fragment.app.c cVar, jod jod, lv8 lv8, jv8 jv8, y yVar, y yVar2) {
        h.e(cVar, "activity");
        h.e(jod, "binding");
        h.e(lv8, "uiEventDelegate");
        h.e(jv8, "delayedProgressTimer");
        h.e(yVar, "subscribeScheduler");
        h.e(yVar2, "observeScheduler");
        this.d = cVar;
        this.e = jod;
        this.f = lv8;
        this.g = jv8;
        this.h = yVar;
        this.i = yVar2;
    }

    public static final /* synthetic */ TextWatcher h(d dVar) {
        TextWatcher textWatcher = dVar.b;
        if (textWatcher != null) {
            return textWatcher;
        }
        h.k("textWatcher");
        throw null;
    }

    @Override // com.spotify.music.features.updateemail.e
    public void b() {
        this.f.b();
    }

    @Override // com.spotify.music.features.updateemail.e
    public void c(View view) {
        h.e(view, "save");
        this.c = view;
    }

    @Override // com.spotify.music.features.updateemail.e
    public void d() {
        this.a.c();
        EditText editText = this.e.b;
        TextWatcher textWatcher = this.b;
        if (textWatcher != null) {
            editText.removeTextChangedListener(textWatcher);
        } else {
            h.k("textWatcher");
            throw null;
        }
    }

    @Override // com.spotify.music.features.updateemail.e
    public com.spotify.mobius.h<yu8> t(da2<ev8> da2) {
        h.e(da2, "consumer");
        this.a.a(((kv8) this.g).c().I0(this.h).o0(this.i).subscribe(new a(this)));
        this.b = new b(this);
        return new c(this);
    }
}
