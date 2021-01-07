package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: kj7  reason: default package */
public class kj7 implements Object<GlueHeaderViewV2>, pk9 {
    private final wlf<mj7> a;

    public kj7(wlf<mj7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        ((mj7) ((GlueHeaderViewV2) view).getTag()).b(s81);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.header_full_bleed;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(viewGroup.getContext(), null);
        mj7 mj7 = this.a.get();
        mj7.c(viewGroup);
        glueHeaderViewV2.setTag(mj7);
        glueHeaderViewV2.setContentViewBinder(mj7);
        return glueHeaderViewV2;
    }
}
