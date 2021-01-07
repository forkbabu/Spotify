package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.onboarding.allboarding.room.a0;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.z;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: ew0  reason: default package */
public final class ew0 extends RecyclerView.b0 {
    private final TextView C;
    private final ImageView D;
    private final View E;
    private final rmf<j, Integer, f> F;
    private final smf<j, Integer, Boolean, f> G;
    private final Picasso H;

    /* renamed from: ew0$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ ew0 a;
        final /* synthetic */ j b;

        a(ew0 ew0, j jVar) {
            this.a = ew0;
            this.b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.E.setSelected(!this.a.E.isSelected());
            smf smf = this.a.G;
            if (smf != null) {
                f fVar = (f) smf.c(this.b, Integer.valueOf(this.a.w()), Boolean.valueOf(this.a.E.isSelected()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rmf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ew0(View view, rmf<? super j, ? super Integer, f> rmf, smf<? super j, ? super Integer, ? super Boolean, f> smf, Picasso picasso) {
        super(view);
        h.e(view, "view");
        h.e(picasso, "picasso");
        this.E = view;
        this.F = rmf;
        this.G = smf;
        this.H = picasso;
        this.C = (TextView) view.findViewById(C0707R.id.title);
        this.D = (ImageView) view.findViewById(C0707R.id.image);
    }

    public final void l0(j jVar) {
        h.e(jVar, "item");
        rmf<j, Integer, f> rmf = this.F;
        if (rmf != null) {
            rmf.invoke(jVar, Integer.valueOf(w()));
        }
        TextView textView = this.C;
        h.d(textView, "title");
        textView.setText(jVar.h());
        View view = this.E;
        z l = jVar.l();
        h.c(l);
        view.setSelected(l.e());
        Drawable d = androidx.core.content.a.d(this.E.getContext(), C0707R.drawable.allboarding_item_squircle_pillow_placeholder);
        h.c(d);
        h.d(d, "ContextCompat.getDrawabl…w_placeholder\n        )!!");
        a0 m = jVar.m();
        h.c(m);
        String a2 = m.a();
        if (a2 == null || !(!e.n(a2))) {
            this.D.setImageDrawable(d);
        } else {
            com.squareup.picasso.z m2 = this.H.m(a2);
            m2.t(d);
            m2.g(d);
            m2.i();
            m2.a();
            m2.x(new uw0(this.E.getResources().getDimensionPixelSize(C0707R.dimen.allboarding_item_pillow_corner_radius), 0.0f));
            m2.n(this.D, null);
        }
        this.E.setOnClickListener(new a(this, jVar));
    }
}
