package com.spotify.music.features.blendtastematch.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.d;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.slate.container.view.SlateView;
import com.squareup.picasso.Picasso;
import kotlin.text.e;

public final class c implements Object {
    private final SlateView a;
    private final TextView b;
    private final TextView c;
    private final Button f;
    private final FacePileView n;
    private final int o;
    private final ProgressBar p;
    private final Picasso q;

    static final class a implements a3d {
        public static final a a = new a();

        a() {
        }

        @Override // defpackage.a3d
        public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.blend_taste_match_slate, viewGroup, false);
        }
    }

    public static final class b implements h<w44> {
        final /* synthetic */ c a;
        final /* synthetic */ da2 b;

        b(c cVar, da2 da2) {
            this.a = cVar;
            this.b = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            w44 w44 = (w44) obj;
            kotlin.jvm.internal.h.e(w44, "model");
            this.a.e().setInteractionListener(new f(this.b));
            if (w44.a() instanceof c54) {
                c.a(this.a, (c54) w44.a(), this.b);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.e().setInteractionListener(null);
            this.a.f.setOnClickListener(null);
        }
    }

    public c(LayoutInflater layoutInflater, Picasso picasso) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(picasso, "picasso");
        this.q = picasso;
        SlateView slateView = new SlateView(layoutInflater.getContext());
        this.a = slateView;
        slateView.d(a.a);
        View findViewById = slateView.findViewById(C0707R.id.taste_match_score);
        kotlin.jvm.internal.h.d(findViewById, "root.findViewById(R.id.taste_match_score)");
        this.b = (TextView) findViewById;
        View findViewById2 = slateView.findViewById(C0707R.id.description);
        kotlin.jvm.internal.h.d(findViewById2, "root.findViewById(R.id.description)");
        this.c = (TextView) findViewById2;
        View findViewById3 = slateView.findViewById(C0707R.id.button_primary);
        kotlin.jvm.internal.h.d(findViewById3, "root.findViewById(R.id.button_primary)");
        this.f = (Button) findViewById3;
        View findViewById4 = slateView.findViewById(C0707R.id.face_pile);
        kotlin.jvm.internal.h.d(findViewById4, "root.findViewById(R.id.face_pile)");
        this.n = (FacePileView) findViewById4;
        this.o = androidx.core.content.a.b(slateView.getContext(), R.color.gray_30);
        View findViewById5 = slateView.findViewById(C0707R.id.loading);
        kotlin.jvm.internal.h.d(findViewById5, "root.findViewById(R.id.loading)");
        this.p = (ProgressBar) findViewById5;
        slateView.setVisibility(8);
    }

    public static final void a(c cVar, c54 c54, da2 da2) {
        cVar.getClass();
        String c2 = c54.c();
        if (c2 == null || c2.length() == 0) {
            cVar.a.setVisibility(0);
            cVar.b.setText(cVar.d(c54.i()));
            TextView textView = cVar.c;
            String string = cVar.a.getContext().getString(C0707R.string.invitation_description_default);
            kotlin.jvm.internal.h.d(string, "root.context.getString(R…tion_description_default)");
            textView.setText(string);
            if (c54.h() instanceof y44) {
                Button button = cVar.f;
                button.setText("");
                button.setEnabled(false);
                cVar.p.setVisibility(0);
            } else {
                Button button2 = cVar.f;
                button2.setText(cVar.a.getContext().getString(C0707R.string.join));
                button2.setEnabled(true);
                button2.setOnClickListener(new d(cVar, da2));
                cVar.p.setVisibility(4);
            }
            cVar.c(c54);
            return;
        }
        cVar.a.setVisibility(0);
        cVar.b.setText(cVar.d(c54.i()));
        cVar.c.setText(cVar.a.getContext().getString(C0707R.string.invitation_accepted_description));
        cVar.f.setText(cVar.a.getContext().getString(C0707R.string.hear_your_blend));
        cVar.f.setOnClickListener(new e(da2));
        cVar.c(c54);
    }

    private final void c(c54 c54) {
        String g = c54.g();
        String f2 = c54.f();
        String str = "?";
        com.spotify.libs.facepile.c a2 = com.spotify.libs.facepile.c.a(g, f2 != null ? e.B(f2, 1) : str, this.o);
        kotlin.jvm.internal.h.d(a2, "Face.create(invitation.s…1) ?: \"?\", facePileColor)");
        String e = c54.e();
        String d = c54.d();
        if (d != null) {
            str = e.B(d, 1);
        }
        com.spotify.libs.facepile.c a3 = com.spotify.libs.facepile.c.a(e, str, this.o);
        kotlin.jvm.internal.h.d(a3, "Face.create(\n           …cePileColor\n            )");
        this.n.setFacePile(this.q, d.a(kotlin.collections.d.z(a2, a3)));
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x000f: APUT  (r1v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r4v1 java.lang.String) */
    private final String d(String str) {
        Context context = this.a.getContext();
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "47";
        }
        objArr[0] = str;
        String string = context.getString(C0707R.string.taste_match_score, objArr);
        kotlin.jvm.internal.h.d(string, "root.context.getString(R…core, tasteMatch ?: \"47\")");
        return string;
    }

    public final SlateView e() {
        return this.a;
    }

    public h<w44> t(da2<t44> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new b(this, da2);
    }
}
