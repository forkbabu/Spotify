package com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a implements Object<View>, pk9 {
    private final com.spotify.music.libs.freetiertrackpreview.listeners.a a;
    private final e b;

    /* renamed from: com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class View$OnClickListenerC0284a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object f;

        public View$OnClickListenerC0284a(int i, Object obj, Object obj2, Object obj3) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
            this.f = obj3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((a) this.b).a.b((rfa) this.c, ((s81) this.f).logging());
            } else if (i == 1) {
                ((a) this.b).a.c((rfa) this.c, ((s81) this.f).logging());
            } else if (i == 2) {
                ((a) this.b).a.a((rfa) this.c, ((s81) this.f).logging());
            } else {
                throw null;
            }
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ s81 b;

        b(a aVar, s81 s81) {
            this.a = aVar;
            this.b = s81;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a.d(this.b.logging());
        }
    }

    public a(com.spotify.music.libs.freetiertrackpreview.listeners.a aVar, e eVar) {
        h.e(aVar, "rowInteractionListener");
        h.e(eVar, "viewBinder");
        this.a = aVar;
        this.b = eVar;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        String str;
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        boolean boolValue = s81.metadata().boolValue("explicit", false);
        boolean boolValue2 = s81.metadata().boolValue("hearted", false);
        boolean boolValue3 = s81.metadata().boolValue("banned", false);
        boolean boolValue4 = s81.metadata().boolValue("disabled", false);
        boolean boolValue5 = s81.metadata().boolValue("is_currently_playing", false);
        boolean z = boolValue3 || boolValue3;
        String string = s81.metadata().string("uri", "");
        String title = s81.text().title();
        if (title != null) {
            str = title;
        } else {
            str = "";
        }
        rfa rfa = new rfa(string, str, s81.metadata().string("preview_id", ""), boolValue, boolValue3, boolValue2);
        View$OnClickListenerC0284a aVar = new View$OnClickListenerC0284a(2, this, rfa, s81);
        View$OnClickListenerC0284a aVar2 = new View$OnClickListenerC0284a(1, this, rfa, s81);
        b bVar2 = new b(this, s81);
        e eVar = this.b;
        eVar.e(view, PreviewPage.ALBUM);
        String title2 = s81.text().title();
        String subtitle = s81.text().subtitle();
        Context context = view.getContext();
        h.d(context, "view.context");
        eVar.g(title2, subtitle, boolValue, context);
        x81 main = s81.images().main();
        p81 p81 = null;
        String uri = main != null ? main.uri() : null;
        Context context2 = view.getContext();
        h.d(context2, "view.context");
        eVar.f(uri, context2, boolValue4, z, rfa);
        Resources resources = view.getResources();
        h.d(resources, "view.resources");
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), C0707R.anim.slide_in_from_top);
        h.d(loadAnimation, "AnimationUtils.loadAnima…R.anim.slide_in_from_top)");
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), C0707R.anim.slide_out_from_top);
        h.d(loadAnimation2, "AnimationUtils.loadAnima….anim.slide_out_from_top)");
        s81 s812 = (s81) d.l(s81.children());
        if (s812 != null) {
            p81 = s812.logging();
        }
        eVar.d(boolValue5, resources, loadAnimation, loadAnimation2, p81);
        eVar.c(rfa, aVar, aVar2, bVar2);
        ((ConstraintLayout) view.findViewById(C0707R.id.track_preview_row_area)).setOnClickListener(new View$OnClickListenerC0284a(0, this, rfa, s81));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_track_preview_album_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.track_preview_row_album, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…row_album, parent, false)");
        return inflate;
    }
}
