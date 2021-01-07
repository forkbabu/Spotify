package com.spotify.music.features.premiumdestination.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.pk9;
import defpackage.s51;

public class b0 extends pk9.a<a> {
    private final HubsGlueImageDelegate a;
    private final h b;

    static class a extends s51.c.a<ViewGroup> {
        private final ImageView b;
        private final ViewGroup c;
        private final h f;
        private final HubsGlueImageDelegate n;

        /* renamed from: com.spotify.music.features.premiumdestination.view.b0$a$a  reason: collision with other inner class name */
        static class View$OnLayoutChangeListenerC0248a implements View.OnLayoutChangeListener {
            private final ImageView a;
            private final s81 b;
            private final Handler c = new Handler(Looper.getMainLooper());
            private final HubsGlueImageDelegate f;

            public View$OnLayoutChangeListenerC0248a(s81 s81, ImageView imageView, HubsGlueImageDelegate hubsGlueImageDelegate) {
                this.b = s81;
                this.a = imageView;
                this.f = hubsGlueImageDelegate;
            }

            public void a(int i, int i2) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.a.setLayoutParams(layoutParams);
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                int i10 = i3 - i;
                x81 main = this.b.images().main();
                Assertion.l(main != null, "main image missing");
                p81 bundle = this.b.custom().bundle("imageSize");
                if (bundle != null) {
                    Integer intValue = bundle.intValue("width");
                    Integer intValue2 = bundle.intValue("height");
                    if (intValue == null || intValue2 == null) {
                        throw new IllegalArgumentException("Missing required fields from Hubs JSON: 'width' or 'height'");
                    }
                    double d = (double) i10;
                    double intValue3 = (double) intValue.intValue();
                    Double.isNaN(d);
                    Double.isNaN(intValue3);
                    double d2 = d / intValue3;
                    double intValue4 = (double) intValue2.intValue();
                    Double.isNaN(intValue4);
                    int max = Math.max((int) (d2 * intValue4), i9);
                    this.c.post(new a(this, i10, max));
                    ImageView imageView = this.a;
                    Picasso f2 = this.f.f();
                    if (main != null) {
                        bwd bwd = new bwd(i10, max);
                        z l = f2.l(this.f.b(main.uri()));
                        l.x(bwd);
                        l.n(imageView, null);
                    } else {
                        f2.b(imageView);
                        imageView.setImageDrawable(null);
                    }
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                throw new IllegalArgumentException("Missing required fields from Hubs JSON: 'imageSize'");
            }
        }

        protected a(ViewGroup viewGroup, HubsGlueImageDelegate hubsGlueImageDelegate, h hVar) {
            super(viewGroup);
            this.b = (ImageView) viewGroup.findViewById(C0707R.id.image);
            this.c = (ViewGroup) viewGroup.findViewById(C0707R.id.content);
            this.n = hubsGlueImageDelegate;
            this.f = hVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            ((ViewGroup) this.a).addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0248a(s81, this.b, this.n));
            this.c.removeAllViews();
            h hVar = this.f;
            V v = this.a;
            hVar.b(s81, (ViewGroup) v, ((ViewGroup) v).getResources().getDisplayMetrics());
            for (s81 s812 : s81.children()) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                ViewGroup viewGroup = this.c;
                if (a != null) {
                    View h = a.h(viewGroup, w51);
                    a.c(h, s812, w51, bVar);
                    viewGroup.addView(h);
                }
            }
        }
    }

    public b0(HubsGlueImageDelegate hubsGlueImageDelegate, h hVar) {
        this.a = hubsGlueImageDelegate;
        this.b = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.image_container, viewGroup, false), this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_image;
    }
}
