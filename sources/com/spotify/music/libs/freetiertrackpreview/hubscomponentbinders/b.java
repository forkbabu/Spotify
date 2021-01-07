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

public final class b implements Object<View>, pk9 {
    private final com.spotify.music.libs.freetiertrackpreview.listeners.a a;
    private final e b;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object f;

        public a(int i, Object obj, Object obj2, Object obj3) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
            this.f = obj3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((b) this.b).a.b((rfa) this.c, ((s81) this.f).logging());
            } else if (i == 1) {
                ((b) this.b).a.c((rfa) this.c, ((s81) this.f).logging());
            } else if (i == 2) {
                ((b) this.b).a.a((rfa) this.c, ((s81) this.f).logging());
            } else {
                throw null;
            }
        }
    }

    /* renamed from: com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0285b implements View.OnClickListener {
        final /* synthetic */ b a;
        final /* synthetic */ s81 b;

        View$OnClickListenerC0285b(b bVar, s81 s81) {
            this.a = bVar;
            this.b = s81;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a.d(this.b.logging());
        }
    }

    public b(com.spotify.music.libs.freetiertrackpreview.listeners.a aVar, e eVar) {
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
        a aVar = new a(2, this, rfa, s81);
        a aVar2 = new a(1, this, rfa, s81);
        View$OnClickListenerC0285b bVar2 = new View$OnClickListenerC0285b(this, s81);
        Context context = view.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0707R.anim.slide_in_from_top);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C0707R.anim.slide_out_from_top);
        e eVar = this.b;
        eVar.e(view, PreviewPage.ARTIST);
        String title2 = s81.text().title();
        String subtitle = s81.text().subtitle();
        Context context2 = view.getContext();
        h.d(context2, "view.context");
        eVar.g(title2, subtitle, boolValue, context2);
        x81 main = s81.images().main();
        p81 p81 = null;
        String uri = main != null ? main.uri() : null;
        Context context3 = view.getContext();
        h.d(context3, "view.context");
        eVar.f(uri, context3, boolValue4, z, rfa);
        Resources resources = view.getResources();
        h.d(resources, "view.resources");
        h.d(loadAnimation, "slideIn");
        h.d(loadAnimation2, "slideOut");
        s81 s812 = (s81) d.l(s81.children());
        if (s812 != null) {
            p81 = s812.logging();
        }
        eVar.d(boolValue5, resources, loadAnimation, loadAnimation2, p81);
        eVar.c(rfa, aVar, aVar2, bVar2);
        eVar.h(s81.custom().intValue("row_number", -1));
        ((ConstraintLayout) view.findViewById(C0707R.id.track_preview_row_area)).setOnClickListener(new a(0, this, rfa, s81));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_track_preview_component;
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
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.glue_track_preview_row, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…eview_row, parent, false)");
        return inflate;
    }
}
