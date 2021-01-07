package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.model.g;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: hm5  reason: default package */
public class hm5 extends em5 {
    private final Picasso D;
    private final TextView E;
    private final ImageView F = ((ImageView) this.a.findViewById(C0707R.id.image));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hm5(android.view.ViewGroup r2, defpackage.dm5.a r3, com.squareup.picasso.Picasso r4) {
        /*
            r1 = this;
            r0 = 2131624029(0x7f0e005d, float:1.8875226E38)
            android.view.View r2 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r0, r2)
            r1.<init>(r2, r3)
            r1.D = r4
            r3 = 2131431668(0x7f0b10f4, float:1.8485072E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.E = r2
            android.view.View r2 = r1.a
            r3 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.F = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm5.<init>(android.view.ViewGroup, dm5$a, com.squareup.picasso.Picasso):void");
    }

    @Override // defpackage.em5
    /* renamed from: u0 */
    public void h0(g gVar, int i) {
        this.a.setOnClickListener(new am5(this));
        this.E.setText(gVar.e());
        ImageView imageView = this.F;
        String c = gVar.c();
        Drawable d = a.d(imageView.getContext(), C0707R.drawable.allboarding_item_banner_placeholder);
        z m = this.D.m(c);
        if (d != null) {
            m.t(d);
            m.g(d);
        } else {
            m.q();
        }
        m.i();
        m.a();
        m.x(new uw0(nud.f(8.0f, this.a.getResources()), 0.0f));
        m.m(imageView);
        this.a.setSelected(gVar.f());
    }
}
