package com.spotify.termsandconditions;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

public class l {
    private static final b f = new a();
    private final n a = new n();
    private final Context b;
    private boolean c;
    private com.spotify.termsandconditions.model.b d;
    private b e = f;

    static class a implements b {
        a() {
        }

        @Override // com.spotify.termsandconditions.l.b
        public void a() {
        }

        @Override // com.spotify.termsandconditions.l.b
        public void b() {
        }

        @Override // com.spotify.termsandconditions.l.b
        public void c() {
        }
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    public l(Context context) {
        this.b = context;
    }

    static void b(l lVar, b bVar) {
        lVar.i(C0707R.string.terms_and_conditions_title_privacy_policy, C0707R.string.terms_and_conditions_text_privacy_policy, bVar);
    }

    private void h(b bVar) {
        Context context = this.b;
        f c2 = m.c(context, context.getString(C0707R.string.terms_and_conditions_title_terms_and_conditions), this.b.getString(C0707R.string.terms_and_conditions_text_decline));
        c2.f(this.b.getString(C0707R.string.terms_and_conditions_button_exit), new c(bVar));
        c2.e(this.b.getString(C0707R.string.terms_and_conditions_button_cancel), new b(this, bVar));
        c2.h(new d(bVar));
        c2.b().a();
    }

    private void i(int i, int i2, b bVar) {
        Context context = this.b;
        f c2 = m.c(context, context.getString(i), "");
        c2.f(this.b.getString(C0707R.string.terms_and_conditions_button_accept), new f(bVar));
        c2.e(this.b.getString(C0707R.string.terms_and_conditions_button_decline), new a(this, bVar));
        c2.h(new e(this, bVar));
        d b2 = c2.b();
        this.a.c((TextView) b2.b().findViewById(C0707R.id.body), this.b.getString(i2));
        b2.a();
    }

    private void l(boolean z, b bVar) {
        i(C0707R.string.terms_and_conditions_title_terms_and_conditions, this.d.d() ? C0707R.string.terms_and_conditions_text_terms_and_conditions_specific : z ? C0707R.string.terms_and_conditions_plus_privacy_policy : C0707R.string.terms_and_conditions_text_terms_and_conditions, bVar);
    }

    public /* synthetic */ void c(b bVar, DialogInterface dialogInterface, int i) {
        k(this.d, bVar);
    }

    public /* synthetic */ void d(b bVar, DialogInterface dialogInterface, int i) {
        h(bVar);
    }

    public /* synthetic */ void e(b bVar, DialogInterface dialogInterface) {
        h(bVar);
    }

    public void f(b bVar) {
        this.e = bVar;
    }

    public void g(k kVar) {
        this.a.b(kVar);
    }

    public void j(com.spotify.termsandconditions.model.b bVar) {
        k(bVar, this.e);
    }

    public void k(com.spotify.termsandconditions.model.b bVar, b bVar2) {
        this.d = bVar;
        if (bVar.b()) {
            bVar2.b();
        } else if (bVar.a()) {
            l(true, bVar2);
        } else if (this.c) {
            i(C0707R.string.terms_and_conditions_title_privacy_policy, C0707R.string.terms_and_conditions_text_privacy_policy, bVar2);
        } else {
            l(false, new m(this, bVar2));
        }
    }
}
