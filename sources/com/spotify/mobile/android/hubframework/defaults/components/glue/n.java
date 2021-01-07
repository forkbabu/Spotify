package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.C0707R;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;
import java.util.List;

public abstract class n<H extends GlueHeaderView> implements com.spotify.mobile.android.hubframework.defaults.d<H> {
    private final HubsGlueImageDelegate a;

    public static final class b extends n<GlueHeaderView> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue.n$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s51
        public void c(View view, s81 s81, w51 w51, s51.b bVar) {
            GlueHeaderView glueHeaderView = (GlueHeaderView) view;
            n.super.f(glueHeaderView, s81, w51, bVar);
            x81 main = s81.images().main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            qc0 contentViewBinder = glueHeaderView.getContentViewBinder();
            contentViewBinder.getClass();
            List<ub0> l0 = ((oc0) contentViewBinder).l0();
            MoreObjects.checkArgument(!l0.isEmpty());
            ImageView imageView = ((sb0) l0.get(0)).getImageView();
            i().a(imageView);
            if (uri != null) {
                if (!rw.equal(uri, glueHeaderView.getView().getTag(C0707R.id.hub_glue_internal_tag_cover_art))) {
                    glueHeaderView.setColor(0);
                }
                Drawable a = n.a(glueHeaderView.getContext(), str);
                z m = i().f().m(uri);
                m.t(a);
                m.o(rwd.h(imageView, new o(this, glueHeaderView)));
            } else if (main != null) {
                glueHeaderView.setColor(0);
                i().g(imageView, str);
            }
            glueHeaderView.getView().setTag(C0707R.id.hub_glue_internal_tag_cover_art, uri);
            t51.a(w51, imageView, s81);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.n
        public ub0 g(GlueHeaderView glueHeaderView, s81 s81) {
            yb0 yb0;
            ac0 ac0;
            n.super.g(glueHeaderView, s81);
            String title = s81.text().title();
            String subtitle = s81.text().subtitle();
            String accessory = s81.text().accessory();
            String description = s81.text().description();
            if (title != null) {
                if (subtitle != null) {
                    if (accessory != null) {
                        ac0 c = tb0.c(glueHeaderView);
                        c.e(accessory);
                        ac0 = c;
                    } else {
                        ac0 = tb0.b(glueHeaderView);
                    }
                    ac0.f(subtitle);
                    yb0 = ac0;
                } else {
                    yb0 = tb0.d(glueHeaderView);
                }
                yb0.setTitle(title);
                return yb0;
            } else if (description != null) {
                cc0 e = tb0.e(glueHeaderView);
                e.setTitle(description);
                return e;
            } else {
                yb0 b = tb0.b(glueHeaderView);
                b.setTitle(null);
                b.f(null);
                return b;
            }
        }

        @Override // defpackage.s51
        public View h(ViewGroup viewGroup, w51 w51) {
            GlueHeaderView.c d = GlueHeaderView.d();
            d.c(HeaderGenericBackground.VisualStyle.COLOR_ONLY);
            return d.a(viewGroup.getContext());
        }
    }

    static final class c extends n<GlueHeaderView> {
        c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue.n$c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s51
        public void c(View view, s81 s81, w51 w51, s51.b bVar) {
            GlueHeaderView glueHeaderView = (GlueHeaderView) view;
            n.super.f(glueHeaderView, s81, w51, bVar);
            x81 background = s81.images().background();
            String uri = background != null ? background.uri() : null;
            String placeholder = background != null ? background.placeholder() : null;
            String string = s81.custom().string("backgroundColor");
            glueHeaderView.e(new p(this, string != null ? Integer.valueOf(Color.parseColor(string)) : null, glueHeaderView, uri, placeholder, background));
        }

        @Override // defpackage.s51
        public View h(ViewGroup viewGroup, w51 w51) {
            GlueHeaderView.c d = GlueHeaderView.d();
            d.b();
            GlueHeaderView a = d.a(viewGroup.getContext());
            a.setTopOffset(com.spotify.android.goldenpath.a.d(viewGroup.getContext()) + nud.l(viewGroup.getContext(), 16843499));
            return a;
        }
    }

    public static final class d extends n<GlueHeaderView> {
        public d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue.n$d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s51
        public void c(View view, s81 s81, w51 w51, s51.b bVar) {
            GlueHeaderView glueHeaderView = (GlueHeaderView) view;
            n.super.f(glueHeaderView, s81, w51, bVar);
            x81 background = s81.images().background();
            ImageView backgroundImageView = glueHeaderView.getBackgroundImageView();
            Uri parse = background != null ? Uri.parse(background.uri()) : Uri.EMPTY;
            Context context = backgroundImageView.getContext();
            int i = R.color.black_40;
            backgroundImageView.setColorFilter(androidx.core.content.a.b(context, i));
            if (!Uri.EMPTY.equals(parse)) {
                z l = i().f().l(parse);
                l.s(i);
                l.f(i);
                l.m(backgroundImageView);
                return;
            }
            i().f().b(backgroundImageView);
        }

        @Override // defpackage.s51
        public View h(ViewGroup viewGroup, w51 w51) {
            return GlueHeaderView.d().a(viewGroup.getContext());
        }
    }

    n(HubsGlueImageDelegate hubsGlueImageDelegate, a aVar) {
        hubsGlueImageDelegate.getClass();
        this.a = hubsGlueImageDelegate;
    }

    static Drawable a(Context context, String str) {
        if (str == null) {
            return null;
        }
        return yc0.d(context, n71.a(str).or((Optional<SpotifyIconV2>) SpotifyIconV2.TRACK), (float) nud.g(64.0f, context.getResources()));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.noneOf(GlueLayoutTraits.Trait.class);
    }

    public void f(H h, s81 s81, w51 w51, s51.b bVar) {
        rc0.a(h, g(h, s81));
        h.setGlueToolbar(l70.c(h.getContext(), h));
    }

    /* access modifiers changed from: protected */
    public ub0 g(H h, s81 s81) {
        cc0 cc0;
        ec0 ec0;
        fc0 fc0;
        String title = s81.text().title();
        String subtitle = s81.text().subtitle();
        String accessory = s81.text().accessory();
        String description = s81.text().description();
        if (title != null) {
            if (subtitle != null) {
                if (accessory != null) {
                    fc0 g = tb0.g(h);
                    g.e(accessory);
                    fc0 = g;
                } else {
                    fc0 = tb0.f(h);
                }
                fc0.f(subtitle);
                ec0 = fc0;
            } else if (description != null) {
                cc0 e = tb0.e(h);
                e.C(description);
                ec0 = e;
            } else {
                ec0 = tb0.a(h);
            }
            ec0.setTitle(title);
            cc0 = ec0;
        } else if (description != null) {
            cc0 e2 = tb0.e(h);
            e2.setTitle(description);
            cc0 = e2;
        } else {
            ec0 f = tb0.f(h);
            f.setTitle(null);
            f.f(null);
            cc0 = f;
        }
        com.spotify.android.glue.components.toolbar.c glueToolbar = h.getGlueToolbar();
        if (glueToolbar != null) {
            glueToolbar.setTitle(title);
        }
        return cc0;
    }

    /* access modifiers changed from: protected */
    public HubsGlueImageDelegate i() {
        return this.a;
    }

    /* renamed from: j */
    public void b(H h, s81 s81, s51.a<View> aVar, int... iArr) {
        if (iArr.length == 0) {
            g91.a(h, s81, aVar, iArr);
            return;
        }
        throw new UnsupportedOperationException("Actions on header children not yet implemented!");
    }
}
