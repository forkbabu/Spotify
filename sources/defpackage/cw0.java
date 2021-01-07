package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.onboarding.allboarding.room.d;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.z;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: cw0  reason: default package */
public final class cw0 extends RecyclerView.b0 {
    private final TextView C;
    private final View D;
    private final rmf<j, Integer, f> E;
    private final smf<j, Integer, Boolean, f> F;
    private final Picasso G;

    /* renamed from: cw0$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ cw0 a;
        final /* synthetic */ j b;

        a(cw0 cw0, j jVar) {
            this.a = cw0;
            this.b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.D.setSelected(!this.a.D.isSelected());
            smf smf = this.a.F;
            if (smf != null) {
                f fVar = (f) smf.c(this.b, Integer.valueOf(this.a.w()), Boolean.valueOf(this.a.D.isSelected()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rmf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw0(View view, rmf<? super j, ? super Integer, f> rmf, smf<? super j, ? super Integer, ? super Boolean, f> smf, Picasso picasso) {
        super(view);
        h.e(view, "view");
        h.e(picasso, "picasso");
        this.D = view;
        this.E = rmf;
        this.F = smf;
        this.G = picasso;
        this.C = (TextView) view.findViewById(C0707R.id.title);
    }

    public final void l0(j jVar) {
        h.e(jVar, "item");
        rmf<j, Integer, f> rmf = this.E;
        if (rmf != null) {
            rmf.invoke(jVar, Integer.valueOf(w()));
        }
        TextView textView = this.C;
        h.d(textView, "title");
        textView.setText(jVar.h());
        View view = this.D;
        z l = jVar.l();
        h.c(l);
        view.setSelected(l.e());
        Drawable d = androidx.core.content.a.d(this.D.getContext(), C0707R.drawable.allboarding_item_banner_placeholder);
        Picasso picasso = this.G;
        d e = jVar.e();
        h.c(e);
        com.squareup.picasso.z m = picasso.m(e.a());
        if (d != null) {
            m.t(d);
            m.g(d);
        } else {
            m.q();
        }
        m.i();
        m.a();
        m.x(new uw0((int) this.D.getResources().getDimension(C0707R.dimen.allboarding_item_banner_radius), this.D.getResources().getDimension(C0707R.dimen.allboarding_item_banner_margin)));
        m.n((ImageView) this.D.findViewById(C0707R.id.image), null);
        this.D.setOnClickListener(new a(this, jVar));
    }
}
