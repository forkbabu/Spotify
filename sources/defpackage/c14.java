package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: c14  reason: default package */
public class c14 extends qk9<a> {
    private final HubsGlueImageDelegate a;

    /* renamed from: c14$a */
    static class a extends s51.c.a<View> {
        private final TextView b;
        private final TextView c;
        private final ImageView f;
        private final ImageView n;
        private final TextView o;
        private final View p;
        private final HubsGlueImageDelegate q;
        private final ImageView r;
        private final TextView s;
        private final View t;
        private final z04 u;

        protected a(View view, HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(view);
            TextView textView = (TextView) view.findViewById(16908308);
            this.b = textView;
            TextView textView2 = (TextView) view.findViewById(16908309);
            this.c = textView2;
            ImageView imageView = (ImageView) view.findViewById(16908294);
            this.f = imageView;
            this.n = (ImageView) view.findViewById(C0707R.id.artistspick_comment_image);
            this.o = (TextView) view.findViewById(C0707R.id.artistspick_comment_text);
            this.p = view.findViewById(C0707R.id.artistspick_comment);
            this.r = (ImageView) view.findViewById(C0707R.id.artistspick_nocomment_image);
            this.s = (TextView) view.findViewById(C0707R.id.artistspick_nocomment_text);
            this.t = view.findViewById(C0707R.id.artistspick_nocomment);
            this.u = new z04(view.findViewById(C0707R.id.artistspick_comment_container));
            this.q = hubsGlueImageDelegate;
            bvd c2 = dvd.c(view);
            c2.f(imageView);
            c2.g(textView, textView2);
            c2.a();
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            ImageView imageView;
            t51.a(w51, this.a, s81);
            String title = s81.text().title();
            String str = "";
            if (MoreObjects.isNullOrEmpty(title)) {
                title = str;
            }
            String subtitle = s81.text().subtitle();
            if (!MoreObjects.isNullOrEmpty(subtitle)) {
                str = subtitle;
            }
            this.b.setText(title);
            this.c.setText(str);
            boolean boolValue = s81.custom().boolValue("artistAddedComment", false);
            String string = s81.custom().string("commentText");
            x81 x81 = (x81) s81.images().custom().get("artistImage");
            if (boolValue) {
                this.p.setVisibility(0);
                this.t.setVisibility(8);
                this.o.setText(string);
                this.u.b();
                imageView = this.n;
            } else {
                this.p.setVisibility(8);
                this.t.setVisibility(0);
                this.s.setText(string);
                imageView = this.r;
            }
            if (x81 != null) {
                x81 c2 = x81.toBuilder().a(HubsGlueImageSettings.b(HubsGlueImageSettings.Style.CIRCULAR)).c();
                this.q.a(imageView);
                this.q.d(imageView, c2, HubsGlueImageConfig.THUMBNAIL);
            }
            this.q.a(this.f);
            this.q.d(this.f, s81.images().main(), HubsGlueImageConfig.THUMBNAIL);
        }
    }

    public c14(HubsGlueImageDelegate hubsGlueImageDelegate) {
        hubsGlueImageDelegate.getClass();
        this.a = hubsGlueImageDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.artistspick_row, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_artist_pick_row_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
