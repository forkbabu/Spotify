package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: pr8  reason: default package */
public final class pr8 implements d<View> {
    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        rr8 rr8 = (rr8) l70.o(view, rr8.class);
        h.d(rr8, "viewBinder");
        String title = s81.text().title();
        if (!(title == null || title.length() == 0)) {
            rr8.setTitle(title);
        } else {
            Assertion.g("Missing title for topic header");
        }
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.HEADER)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        sr8 sr8 = new sr8(context, viewGroup);
        sr8.getView().setTag(C0707R.id.glue_viewholder_tag, sr8);
        return sr8.getView();
    }
}
