package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: ip9  reason: default package */
public class ip9 implements Object<View>, pk9 {
    public static final q81 a = z81.d("home:sectionHeader", HubsComponentCategory.SECTION_HEADER.d());

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        np9 np9 = (np9) l70.o(view, np9.class);
        np9.setTitle(s81.text().title());
        np9.setSubtitle(s81.text().subtitle());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_section_header;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.SPACED_VERTICALLY);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        mp9 mp9 = new mp9(viewGroup.getContext(), viewGroup);
        mp9.getView().setTag(C0707R.id.glue_viewholder_tag, mp9);
        return mp9.getView();
    }
}
