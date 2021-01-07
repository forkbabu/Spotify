package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import defpackage.p90;
import defpackage.s51;
import java.util.EnumSet;

abstract class v<T extends p90> extends h<T> {
    private final HubsGlueImageDelegate c;
    private final cqe f = fqe.a;

    /* access modifiers changed from: package-private */
    public static class b extends c {

        static final class a extends b {
            a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.b, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
            /* renamed from: k */
            public void i(t90 t90, s81 s81) {
                ((r90) t90).I(s81.custom().intValue("hubs:linecap", 2));
                super.i(t90, s81);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.b, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
            public /* bridge */ /* synthetic */ p90 l(Context context, ViewGroup viewGroup) {
                return l(context, viewGroup);
            }
        }

        b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
        /* renamed from: k */
        public void i(t90 t90, s81 s81) {
            CharSequence d = HubsGlueCard.Settings.d(s81);
            CharSequence b = HubsGlueCard.Settings.b(s81);
            if (!TextUtils.isEmpty(d)) {
                t90.setText(d);
            } else if (!TextUtils.isEmpty(b)) {
                t90.setText(b);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
        /* renamed from: m */
        public t90 l(Context context, ViewGroup viewGroup) {
            return e90.d().b(context, viewGroup, Integer.MAX_VALUE);
        }
    }

    static class c extends v<t90> {

        static class a extends c {

            /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.v$c$a$a  reason: collision with other inner class name */
            static final class C0177a extends a {
                C0177a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    super(hubsGlueImageDelegate);
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
                public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                    j((t90) g90, s81, w51);
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
                public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                    return l(context, viewGroup);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.v
                public /* bridge */ /* synthetic */ void i(t90 t90, s81 s81) {
                    i(t90, s81);
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
                /* renamed from: m */
                public t90 l(Context context, ViewGroup viewGroup) {
                    return e90.d().e(context, viewGroup);
                }
            }

            a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                j((t90) g90, s81, w51);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                return l(context, viewGroup);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.v
            public /* bridge */ /* synthetic */ void i(t90 t90, s81 s81) {
                i(t90, s81);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
            /* renamed from: m */
            public t90 l(Context context, ViewGroup viewGroup) {
                return e90.d().f(context, viewGroup);
            }
        }

        static final class b extends c {
            b(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                j((t90) g90, s81, w51);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                return l(context, viewGroup);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c, com.spotify.mobile.android.hubframework.defaults.components.glue.v
            public /* bridge */ /* synthetic */ void i(t90 t90, s81 s81) {
                i(t90, s81);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
            public p90 l(Context context, ViewGroup viewGroup) {
                return e90.d().d(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.c
            public t90 m(Context context, ViewGroup viewGroup) {
                return e90.d().d(context, viewGroup);
            }
        }

        c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, t90.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            j((t90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return l(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void i(t90 t90, s81 s81) {
            t90.setText(HubsGlueCard.Settings.d(s81));
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public t90 l(Context context, ViewGroup viewGroup) {
            return e90.d().c(context, viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends v<x90> {
        final boolean n;

        static class a extends d {

            /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.v$d$a$a  reason: collision with other inner class name */
            static final class C0178a extends a {
                C0178a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                    super(hubsGlueImageDelegate, z);
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
                public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                    j((x90) g90, s81, w51);
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
                public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                    return l(context, viewGroup);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.v
                public void i(x90 x90, s81 s81) {
                    x90 x902 = x90;
                    super.i(x902, s81);
                    CharSequence a = HubsGlueCard.Settings.a(s81);
                    if (!TextUtils.isEmpty(a)) {
                        ((ba0) x902).H(a);
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
                public void k(x90 x90, s81 s81) {
                    super.i(x90, s81);
                    CharSequence a = HubsGlueCard.Settings.a(s81);
                    if (!TextUtils.isEmpty(a)) {
                        ((ba0) x90).H(a);
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d.a, com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
                /* renamed from: m */
                public x90 l(Context context, ViewGroup viewGroup) {
                    e90.d().getClass();
                    ca0 ca0 = new ca0(l70.l(context, viewGroup, C0707R.layout.glue_listtile_2_landscape_image));
                    ca0.getView().setTag(C0707R.id.glue_viewholder_tag, ca0);
                    return ca0;
                }
            }

            a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                j((x90) g90, s81, w51);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                return l(context, viewGroup);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.v
            public /* bridge */ /* synthetic */ void i(x90 x90, s81 s81) {
                super.i(x90, s81);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
            /* renamed from: m */
            public x90 l(Context context, ViewGroup viewGroup) {
                return e90.d().j(context, viewGroup, this.n);
            }
        }

        static final class b extends d {
            b(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
                j((x90) g90, s81, w51);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.h
            public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
                return l(context, viewGroup);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [p90, s81] */
            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d, com.spotify.mobile.android.hubframework.defaults.components.glue.v
            public void i(x90 x90, s81 s81) {
                x90 x902 = x90;
                super.i(x902, s81);
                ((da0) x902).X(s81.custom().intValue("row_number", 0));
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
            public void k(x90 x90, s81 s81) {
                super.i(x90, s81);
                ((da0) x90).X(s81.custom().intValue("row_number", 0));
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
            public p90 l(Context context, ViewGroup viewGroup) {
                return e90.d().k(context, viewGroup, this.n);
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.v.d
            public x90 m(Context context, ViewGroup viewGroup) {
                return e90.d().k(context, viewGroup, this.n);
            }
        }

        d(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
            super(hubsGlueImageDelegate, x90.class, null);
            this.n = z;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            j((x90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return l(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void i(x90 x90, s81 s81) {
            x90.setTitle(HubsGlueCard.Settings.d(s81));
            CharSequence c = HubsGlueCard.Settings.c(s81);
            if (!TextUtils.isEmpty(c)) {
                String str = "";
                if (rw.equal(s81.custom().string("glue:subtitleStyle", str), "metadata")) {
                    x90.e(c);
                } else {
                    x90.setSubtitle(c);
                }
                TextView subtitleView = x90.getSubtitleView();
                String string = s81.custom().string("label");
                Context context = subtitleView.getContext();
                if (string != null) {
                    str = string;
                }
                TextLabelUtil.d(context, subtitleView, str);
                return;
            }
            x90.setSubtitle(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public x90 l(Context context, ViewGroup viewGroup) {
            return e90.d().h(context, viewGroup, this.n);
        }
    }

    v(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, a aVar) {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), cls);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* access modifiers changed from: protected */
    public abstract void i(T t, s81 s81);

    /* JADX WARN: Incorrect args count in method signature: (TT;Ls81;Lw51;Ls51$b;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: p90 */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void j(p90 p90, s81 s81, w51 w51) {
        Enum r0;
        i(p90, s81);
        i91.a(p90.getView());
        t51.a(w51, p90.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(p90.getView()).b();
        }
        if (p90 instanceof fa0) {
            HubsGlueCard.Settings.j((fa0) p90, s81, this.c, this.f);
        }
        Object obj = s81.custom().get("secondary_icon");
        kg0 a2 = u.a();
        Class e = a2.e();
        if (e.isInstance(obj)) {
            r0 = (Enum) e.cast(obj);
        } else {
            r0 = obj instanceof String ? (Enum) a2.c((String) obj).orNull() : null;
        }
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) r0;
        if (spotifyIconV2 == null && s81.events().containsKey("rightAccessoryClick")) {
            spotifyIconV2 = SpotifyIconV2.MORE_ANDROID;
        }
        if (spotifyIconV2 != null) {
            View k = z42.k(p90.getView().getContext(), spotifyIconV2);
            k.setContentDescription(s81.custom().string("accessoryContentDesc"));
            if (s81.events().containsKey("rightAccessoryClick")) {
                i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(k).a();
            }
            p90.z0(k);
        } else {
            p90.z0(null);
        }
        int i = w.c;
        p90.setAppearsDisabled(s81.custom().boolValue("appearDisabled", false));
    }
}
