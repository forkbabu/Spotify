package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.c;
import com.spotify.libs.facepile.d;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.text.e;

/* renamed from: p44  reason: default package */
public final class p44 implements Object {
    private final View a;
    private final Button b;
    private final FacePileView c;
    private final int f;
    private final c n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final Picasso r;

    /* renamed from: p44$a */
    public static final class a implements h<x34> {
        final /* synthetic */ p44 a;
        final /* synthetic */ da2 b;

        a(p44 p44, da2 da2) {
            this.a = p44;
            this.b = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            x34 x34 = (x34) obj;
            kotlin.jvm.internal.h.e(x34, "model");
            this.a.b.setOnClickListener(new o44(0, this));
            this.a.c.setOnClickListener(new o44(1, this));
            p44.e(this.a, x34);
            if (x34.b()) {
                p44.b(this.a);
            } else {
                p44.a(this.a);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public p44(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(picasso, "picasso");
        this.r = picasso;
        View inflate = layoutInflater.inflate(C0707R.layout.blend_invitation_fragment, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…_fragment, parent, false)");
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.invite_button);
        kotlin.jvm.internal.h.d(findViewById, "root.findViewById(R.id.invite_button)");
        this.b = (Button) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.face_pile);
        kotlin.jvm.internal.h.d(findViewById2, "root.findViewById(R.id.face_pile)");
        this.c = (FacePileView) findViewById2;
        int b2 = androidx.core.content.a.b(inflate.getContext(), R.color.gray_30);
        this.f = b2;
        c a2 = c.a(null, "＋", b2);
        kotlin.jvm.internal.h.d(a2, "Face.create(null, \"＋\", facePileColor)");
        this.n = a2;
        View findViewById3 = inflate.findViewById(C0707R.id.invitation_title);
        kotlin.jvm.internal.h.d(findViewById3, "root.findViewById(R.id.invitation_title)");
        this.o = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.invitation_body);
        kotlin.jvm.internal.h.d(findViewById4, "root.findViewById(R.id.invitation_body)");
        this.p = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.invitation_note);
        kotlin.jvm.internal.h.d(findViewById5, "root.findViewById(R.id.invitation_note)");
        this.q = (TextView) findViewById5;
    }

    public static final void a(p44 p44) {
        TextView textView = p44.o;
        textView.setVisibility(0);
        textView.setText(textView.getResources().getString(C0707R.string.invite_a_friend));
        TextView textView2 = p44.p;
        textView2.setVisibility(0);
        textView2.setText(textView2.getResources().getString(C0707R.string.blend_instructions));
        TextView textView3 = p44.q;
        textView3.setVisibility(0);
        textView3.setText(textView3.getResources().getString(C0707R.string.blend_note));
    }

    public static final void b(p44 p44) {
        TextView textView = p44.o;
        textView.setVisibility(0);
        textView.setText(textView.getResources().getString(C0707R.string.link_expired));
        TextView textView2 = p44.p;
        textView2.setVisibility(0);
        textView2.setText(textView2.getResources().getString(C0707R.string.link_expired_explanation));
        p44.q.setVisibility(8);
    }

    public static final void e(p44 p44, x34 x34) {
        String b2;
        p44.getClass();
        h44 c2 = x34.c();
        String a2 = c2 != null ? c2.a() : null;
        h44 c3 = x34.c();
        p44.c.setFacePile(p44.r, d.a(kotlin.collections.d.u(c.a(a2, (c3 == null || (b2 = c3.b()) == null) ? "" : e.B(b2, 1), p44.f), p44.n)));
    }

    public final View f() {
        return this.a;
    }

    public h<x34> t(da2<v34> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new a(this, da2);
    }
}
