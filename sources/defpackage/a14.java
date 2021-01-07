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

/* renamed from: a14  reason: default package */
public class a14 extends qk9<a> {
    private final HubsGlueImageDelegate a;

    /* renamed from: a14$a */
    static class a extends s51.c.a<View> {
        private final y90 b;
        private final ImageView c;
        private final ImageView f;
        private final TextView n;
        private final TextView o;
        private final View p;
        private final View q;
        private final ImageView r;
        private final HubsGlueImageDelegate s;

        protected a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, y90 y90) {
            super(view);
            this.c = (ImageView) view.findViewById(C0707R.id.artistspick_comment_image);
            this.n = (TextView) view.findViewById(C0707R.id.artistspick_comment_text);
            this.p = view.findViewById(C0707R.id.artistspick_comment);
            this.f = (ImageView) view.findViewById(C0707R.id.artistspick_nocomment_image);
            this.o = (TextView) view.findViewById(C0707R.id.artistspick_nocomment_text);
            this.q = view.findViewById(C0707R.id.artistspick_nocomment);
            this.r = (ImageView) view.findViewById(C0707R.id.artistspick_background);
            this.s = hubsGlueImageDelegate;
            this.b = y90;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

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
            this.b.setTitle(title);
            this.b.setSubtitle(str);
            HubsGlueImageDelegate hubsGlueImageDelegate = this.s;
            ImageView imageView2 = this.b.getImageView();
            x81 main = s81.images().main();
            HubsGlueImageConfig hubsGlueImageConfig = HubsGlueImageConfig.THUMBNAIL;
            hubsGlueImageDelegate.d(imageView2, main, hubsGlueImageConfig);
            boolean boolValue = s81.custom().boolValue("artistAddedComment", false);
            String string = s81.custom().string("commentText");
            x81 x81 = (x81) s81.images().custom().get("artistImage");
            if (boolValue) {
                this.p.setVisibility(0);
                this.q.setVisibility(8);
                this.n.setText(string);
                imageView = this.c;
            } else {
                this.p.setVisibility(8);
                this.q.setVisibility(0);
                this.o.setText(string);
                imageView = this.f;
            }
            if (x81 != null) {
                x81 c2 = x81.toBuilder().a(HubsGlueImageSettings.b(HubsGlueImageSettings.Style.CIRCULAR)).c();
                this.s.a(imageView);
                this.s.d(imageView, c2, hubsGlueImageConfig);
            }
            this.s.d(this.r, s81.images().background(), HubsGlueImageConfig.CARD);
        }
    }

    public a14(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = hubsGlueImageDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        ViewGroup viewGroup2 = (ViewGroup) je.G(viewGroup, C0707R.layout.artistspickv2, viewGroup, false);
        y90 i = e90.d().i(viewGroup.getContext(), null);
        ((ViewGroup) viewGroup2.findViewById(C0707R.id.artistspick_description_container)).addView(i.getView());
        return new a(viewGroup2, this.a, i);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_artist_pick_card_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
