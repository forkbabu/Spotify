package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.kqc;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: dw3  reason: default package */
public class dw3 extends qk9<a> {
    private final kqc.a a;

    /* renamed from: dw3$a */
    class a extends s51.c.a<View> {
        private final TextView b;
        private final TextView c;

        protected a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (TextView) view.findViewById(C0707R.id.subtitle);
        }

        static Spannable C(a aVar, Spannable spannable) {
            kqc.a aVar2 = dw3.this.a;
            TextView textView = aVar.c;
            return aVar2.b(textView, textView.getContext().getString(C0707R.string.synopsis_see_more), new bw3(aVar)).b(spannable);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        public void D(CharSequence charSequence) {
            this.c.setText(charSequence, TextView.BufferType.SPANNABLE);
            this.c.setMaxLines(Integer.MAX_VALUE);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String title = s81.text().title();
            String subtitle = s81.text().subtitle();
            this.b.setVisibility(MoreObjects.isNullOrEmpty(title) ? 8 : 0);
            this.b.setText(title);
            Integer intValue = s81.custom().intValue("bollywood-synopsis-number-of-lines");
            if (intValue != null) {
                this.c.setMaxLines(intValue.intValue());
            } else {
                this.c.setMaxLines(3);
            }
            this.c.setText(new SpannableString(subtitle.trim()), TextView.BufferType.SPANNABLE);
            this.c.setMovementMethod(LinkMovementMethod.getInstance());
            this.c.addOnLayoutChangeListener(new cw3(this));
        }
    }

    public dw3(kqc.a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.expandable_text, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.expandable_text_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
