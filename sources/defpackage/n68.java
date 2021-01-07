package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.s51;

/* renamed from: n68  reason: default package */
public class n68 extends s51.c<a> {

    /* renamed from: n68$a */
    static class a extends s51.c.a<View> {
        final t90 b;
        final TextView c;

        a(View view) {
            super(view);
            int i = e90.i;
            t90 t90 = (t90) l70.o(view, t90.class);
            this.b = t90;
            TextView Z = t90.Z();
            this.c = Z;
            Z.setTextColor(androidx.core.content.a.b(Z.getContext(), C0707R.color.glue_row_subtitle_color));
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            t51.a(w51, this.a, s81);
            TextView textView = this.c;
            textView.setText(textView.getContext().getString(C0707R.string.cosmos_search_clear_recents));
        }
    }

    /* Return type fixed from 's51$c$a' to match base method */
    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public a a(ViewGroup viewGroup, w51 w51) {
        return new a(e90.d().f(viewGroup.getContext(), viewGroup).getView());
    }
}
