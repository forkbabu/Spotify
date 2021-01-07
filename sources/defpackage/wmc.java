package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: wmc  reason: default package */
public class wmc extends qk9<a> {
    private final Picasso a;
    private final w50 b;

    /* renamed from: wmc$a */
    static class a extends s51.c.a<View> {
        private final qrc b;
        private final Picasso c;
        private final w50 f;

        a(qrc qrc, Picasso picasso, w50 w50) {
            super(qrc.getView());
            this.b = qrc;
            this.c = picasso;
            this.f = w50;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        public /* synthetic */ void B(s81 s81) {
            this.f.a(s81, this.a, h60.a);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            w81 text = s81.text();
            this.b.J(text.title(), text.accessory());
            x81 main = s81.images().main();
            String str = null;
            if (main != null) {
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 17 && this.b.getView().getResources().getConfiguration().getLayoutDirection() != 0) {
                    z = false;
                }
                if (z && !TextUtils.isEmpty(main.uri())) {
                    str = main.uri();
                }
            }
            this.c.m(str).o(this.b.w());
            this.b.E(new vmc(w51, s81));
            n4.a(this.a, new umc(this, s81));
        }
    }

    public wmc(Picasso picasso, w50 w50) {
        this.a = picasso;
        this.b = w50;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(qrc.g(viewGroup, rrc.b(viewGroup.getResources())), this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.onboarding_call_to_action;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }
}
