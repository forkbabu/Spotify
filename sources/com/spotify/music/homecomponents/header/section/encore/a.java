package com.spotify.music.homecomponents.header.section.encore;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading1;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a extends qk9<C0277a> {
    private final ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration> a;

    /* renamed from: com.spotify.music.homecomponents.header.section.encore.a$a  reason: collision with other inner class name */
    public static final class C0277a extends s51.c.a<View> {
        private final Component<SectionHeading1.Model, f> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0277a(Component<SectionHeading1.Model, f> component) {
            super(component.getView());
            h.e(component, "header");
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
            Component<SectionHeading1.Model, f> component = this.b;
            String title = s81.text().title();
            if (title == null) {
                title = "";
            }
            component.render(new SectionHeading1.Model(title));
        }
    }

    public a(ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration> componentFactory) {
        h.e(componentFactory, "headerFactory");
        this.a = componentFactory;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new C0277a(this.a.make());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_home_section_header;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.SPACED_VERTICALLY);
        h.d(of, "EnumSet.of(GlueLayoutTra….Trait.SPACED_VERTICALLY)");
        return of;
    }
}
