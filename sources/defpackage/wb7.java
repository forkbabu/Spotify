package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import defpackage.kqc;
import defpackage.oqc;
import defpackage.rqc;
import defpackage.vb7;

/* renamed from: wb7  reason: default package */
public class wb7 implements vb7 {
    private final vb7.a a;
    private final kqc.a b;
    private final rqc.a c;
    private final oqc.a d;
    private final eoa e;
    private TextView f;

    /* renamed from: wb7$a */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            wb7.this.f.removeOnLayoutChangeListener(this);
            wb7 wb7 = wb7.this;
            wb7.this.f.setText(wb7.d(wb7, (Spannable) wb7.f.getText()), TextView.BufferType.SPANNABLE);
        }
    }

    public wb7(vb7.a aVar, kqc.a aVar2, rqc.a aVar3, oqc.a aVar4, eoa eoa) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = eoa;
    }

    static Spannable d(wb7 wb7, Spannable spannable) {
        kqc.a aVar = wb7.b;
        TextView textView = wb7.f;
        return aVar.b(textView, textView.getContext().getString(C0707R.string.episode_description_see_more), new rb7(wb7)).b(spannable);
    }

    @Override // defpackage.vb7
    public void a(g77 g77) {
        SpannableString spannableString;
        boolean z = true;
        if (MoreObjects.isNullOrEmpty(g77.d()) && MoreObjects.isNullOrEmpty(g77.k())) {
            this.f.setVisibility(8);
            return;
        }
        boolean z2 = Build.VERSION.SDK_INT > 23;
        this.f.setVisibility(0);
        if (g77.k() == null || g77.k().isEmpty()) {
            z = false;
        }
        if (z) {
            spannableString = this.e.a(g77.k());
        } else {
            SpannableString spannableString2 = new SpannableString(g77.d());
            rqc.a aVar = this.c;
            vb7.a aVar2 = this.a;
            aVar2.getClass();
            sb7 sb7 = new sb7(aVar2);
            aVar.getClass();
            new rqc(sb7).a(spannableString2);
            spannableString = spannableString2;
        }
        SpannableString spannableString3 = new SpannableString(spannableString);
        String r = g77.r();
        long p = g77.p();
        boolean l = g77.l();
        oqc.a aVar3 = this.d;
        qb7 qb7 = new qb7(this, r, l);
        aVar3.getClass();
        new oqc(p, qb7).b(spannableString3);
        this.f.setContentDescription(g77.d());
        this.f.setTextIsSelectable(z2);
        this.f.setText(spannableString3, TextView.BufferType.SPANNABLE);
        this.f.setMovementMethod(LinkMovementMethod.getInstance());
        this.f.addOnLayoutChangeListener(new a());
    }

    @Override // defpackage.vb7
    public void b(TextView textView) {
        textView.getClass();
        this.f = textView;
        yoa.a(textView);
    }

    public /* synthetic */ void e(CharSequence charSequence) {
        this.f.setText(charSequence, TextView.BufferType.SPANNABLE);
        this.f.setMaxLines(Integer.MAX_VALUE);
        this.a.a();
    }

    public /* synthetic */ void f(String str, boolean z, long j) {
        this.a.b(str, j, z);
    }
}
