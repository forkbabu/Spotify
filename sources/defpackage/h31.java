package defpackage;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.magiclink.setpassword.MagiclinkSetPasswordActivity;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.o21;
import defpackage.p21;
import defpackage.s21;

/* renamed from: h31  reason: default package */
public class h31 implements g31, g<t21, r21> {
    private final EditText a;
    private final Button b;
    private final ProgressBar c;
    private final TextView f;
    private final MagiclinkSetPasswordActivity n;

    /* renamed from: h31$a */
    class a implements TextWatcher {
        final /* synthetic */ da2 a;

        a(h31 h31, da2 da2) {
            this.a = da2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.a.accept(r21.d(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: h31$b */
    class b implements h<t21> {
        final /* synthetic */ TextWatcher a;

        b(TextWatcher textWatcher) {
            this.a = textWatcher;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            t21 t21 = (t21) obj;
            p21 e = t21.e();
            e.getClass();
            if (!(e instanceof p21.g) || h31.this.b.isEnabled()) {
                p21 e2 = t21.e();
                e2.getClass();
                if (!(e2 instanceof p21.g) && h31.this.b.isEnabled()) {
                    h31.this.b.setEnabled(false);
                }
            } else {
                h31.this.b.setEnabled(true);
            }
            o21 a2 = t21.a();
            a2.getClass();
            if (a2 instanceof o21.a) {
                o21 a3 = t21.a();
                a3.getClass();
                s21 a4 = ((o21.a) a3).a();
                a4.getClass();
                if (a4 instanceof s21.a) {
                    h31 h31 = h31.this;
                    o21 a5 = t21.a();
                    a5.getClass();
                    s21 a6 = ((o21.a) a5).a();
                    a6.getClass();
                    h31.b(h31, ((s21.a) a6).e());
                } else {
                    h31.c(h31.this, C0707R.string.magiclink_set_password_connection_error);
                }
            } else {
                h31.d(h31.this);
            }
            if (t21.b() && h31.this.c.getVisibility() != 0) {
                h31.this.c.setVisibility(0);
            } else if (!t21.b() && h31.this.c.getVisibility() == 0) {
                h31.this.c.setVisibility(8);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            h31.this.b.setOnClickListener(null);
            h31.this.a.removeTextChangedListener(this.a);
        }
    }

    public h31(MagiclinkSetPasswordActivity magiclinkSetPasswordActivity) {
        this.n = magiclinkSetPasswordActivity;
        View findViewById = magiclinkSetPasswordActivity.findViewById(C0707R.id.input_password);
        findViewById.getClass();
        this.a = (EditText) findViewById;
        View findViewById2 = magiclinkSetPasswordActivity.findViewById(C0707R.id.password_save);
        findViewById2.getClass();
        this.b = (Button) findViewById2;
        View findViewById3 = magiclinkSetPasswordActivity.findViewById(C0707R.id.progressBar);
        findViewById3.getClass();
        this.c = (ProgressBar) findViewById3;
        View findViewById4 = magiclinkSetPasswordActivity.findViewById(C0707R.id.password_error_message);
        findViewById4.getClass();
        this.f = (TextView) findViewById4;
    }

    static void b(h31 h31, String str) {
        h31.f.setVisibility(0);
        h31.f.setText(str);
    }

    static void c(h31 h31, int i) {
        h31.f.setVisibility(0);
        h31.f.setText(i);
    }

    static void d(h31 h31) {
        h31.f.setVisibility(8);
    }

    public void g(boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("REASON", str);
        this.n.setResult(z ? -1 : 0, intent);
        this.n.finish();
    }

    @Override // com.spotify.mobius.g
    public h<t21> t(da2<r21> da2) {
        a aVar = new a(this, da2);
        this.b.setOnClickListener(new f31(da2));
        this.a.addTextChangedListener(aVar);
        return new b(aVar);
    }
}
