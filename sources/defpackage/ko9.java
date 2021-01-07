package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: ko9  reason: default package */
public final class ko9 extends qk9<a> {
    private final Component<SectionHeading2.Model, f> a;

    /* renamed from: ko9$a */
    public static final class a extends s51.c.a<View> {
        private final Component<SectionHeading2.Model, f> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Component<SectionHeading2.Model, f> component) {
            super(component.getView());
            h.e(component, "sectionHeading2");
            this.b = component;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            String title = s81.text().title();
            String str = "";
            if (title == null) {
                title = str;
            }
            String subtitle = s81.text().subtitle();
            if (subtitle != null) {
                str = subtitle;
            }
            this.b.render(new SectionHeading2.Model(title, str));
        }
    }

    public ko9(Component<SectionHeading2.Model, f> component) {
        h.e(component, "sectionHeading2Component");
        this.a = component;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new a(this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_home_section_heading_2;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.SPACED_VERTICALLY);
        h.d(of, "EnumSet.of(GlueLayoutTra….Trait.SPACED_VERTICALLY)");
        return of;
    }
}
