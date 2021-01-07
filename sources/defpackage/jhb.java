package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.stories.view.StoriesProgressView;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.marketingformats.constants.MarketingFormatsComponentId;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: jhb  reason: default package */
public final class jhb implements com.spotify.mobile.android.hubframework.defaults.d<View> {
    private boolean a;
    private ViewPager2 b;
    private StoriesProgressView c;
    private ghb f;
    private SpotifyIconView n;
    private String o;
    private s51.b p;
    private s81 q;
    private final boolean r;
    private final hhb s;
    private final Picasso t;
    private final jzc u;
    private final mhb v;

    /* renamed from: jhb$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0629a();
        private boolean a;

        /* renamed from: jhb$a$a  reason: collision with other inner class name */
        public static class C0629a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.e(parcel, "in");
                return new a(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public a(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        @Override // java.lang.Object
        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return je.P0(je.V0("ProgressState(paused="), this.a, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    /* renamed from: jhb$b */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;

        public b(String str, String str2, String str3, String str4, String str5, String str6) {
            h.e(str, "shareImageUri");
            h.e(str2, "entityUri");
            h.e(str3, "dialogImageUri");
            h.e(str4, "dialogTitle");
            h.e(str5, "dialogSubtitle");
            h.e(str6, "shareMessageText");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && h.a(this.d, bVar.d) && h.a(this.e, bVar.e) && h.a(this.f, bVar.f);
        }

        public final String f() {
            return this.f;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShareData(shareImageUri=");
            V0.append(this.a);
            V0.append(", entityUri=");
            V0.append(this.b);
            V0.append(", dialogImageUri=");
            V0.append(this.c);
            V0.append(", dialogTitle=");
            V0.append(this.d);
            V0.append(", dialogSubtitle=");
            V0.append(this.e);
            V0.append(", shareMessageText=");
            return je.I0(V0, this.f, ")");
        }
    }

    /* renamed from: jhb$c */
    static final class c implements e {
        final /* synthetic */ jhb a;
        final /* synthetic */ Interpolator b;
        final /* synthetic */ Context c;
        final /* synthetic */ View f;

        c(jhb jhb, Interpolator interpolator, Context context, View view) {
            this.a = jhb;
            this.b = interpolator;
            this.c = context;
            this.f = view;
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.e
        public final void a(float f2) {
            float interpolation = this.b.getInterpolation(f2);
            l70.k(this.c).o(interpolation);
            this.f.setAlpha(((float) 1) - interpolation);
            if (f2 > 0.99f) {
                if (!this.a.a) {
                    jhb.n(this.a).setProgressListener(null);
                    jhb.n(this.a).e();
                    jhb.o(this.a).setUserInputEnabled(false);
                    this.a.a = true;
                    jhb.f(this.a).b(jhb.a(this.a), new a(this.a.a));
                }
            } else if (this.a.a) {
                jhb.q(this.a);
                jhb.n(this.a).h();
                jhb.n(this.a).f();
                jhb.o(this.a).setUserInputEnabled(true);
                this.a.a = false;
                jhb.f(this.a).b(jhb.a(this.a), new a(this.a.a));
            }
        }
    }

    /* renamed from: jhb$d */
    public static final class d extends ViewPager2.g {
        private boolean a;
        final /* synthetic */ jhb b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(jhb jhb) {
            this.b = jhb;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void a(int i) {
            if (i == 1) {
                this.a = true;
                jhb.n(this.b).e();
            } else {
                jhb.n(this.b).f();
            }
            if (i == 0) {
                this.a = false;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            Parcelable a2 = jhb.f(this.b).a(jhb.a(this.b));
            if (jhb.n(this.b).getVisibility() == 0) {
                if (!(a2 instanceof a) || !((a) a2).a()) {
                    jhb.n(this.b).g(i, true);
                } else {
                    jhb.n(this.b).g(0, false);
                }
            }
            if (this.a) {
                this.b.v.a(jhb.i(this.b), jhb.m(this.b).Z(i), i);
            }
            this.b.v.d(jhb.i(this.b), jhb.m(this.b).Z(i), i);
        }
    }

    public jhb(boolean z, hhb hhb, Picasso picasso, jzc jzc, mhb mhb) {
        h.e(hhb, "slideHeaderAdapterFactory");
        h.e(picasso, "picasso");
        h.e(jzc, "shareFlow");
        h.e(mhb, "logger");
        this.r = z;
        this.s = hhb;
        this.t = picasso;
        this.u = jzc;
        this.v = mhb;
    }

    public static final /* synthetic */ s81 a(jhb jhb) {
        s81 s81 = jhb.q;
        if (s81 != null) {
            return s81;
        }
        h.k("componentModel");
        throw null;
    }

    public static final /* synthetic */ s51.b f(jhb jhb) {
        s51.b bVar = jhb.p;
        if (bVar != null) {
            return bVar;
        }
        h.k("componentState");
        throw null;
    }

    public static final /* synthetic */ String i(jhb jhb) {
        String str = jhb.o;
        if (str != null) {
            return str;
        }
        h.k("pageUri");
        throw null;
    }

    public static final /* synthetic */ ghb m(jhb jhb) {
        ghb ghb = jhb.f;
        if (ghb != null) {
            return ghb;
        }
        h.k("slideHeaderAdapter");
        throw null;
    }

    public static final /* synthetic */ StoriesProgressView n(jhb jhb) {
        StoriesProgressView storiesProgressView = jhb.c;
        if (storiesProgressView != null) {
            return storiesProgressView;
        }
        h.k("storiesProgressView");
        throw null;
    }

    public static final /* synthetic */ ViewPager2 o(jhb jhb) {
        ViewPager2 viewPager2 = jhb.b;
        if (viewPager2 != null) {
            return viewPager2;
        }
        h.k("viewPager2");
        throw null;
    }

    public static final void q(jhb jhb) {
        StoriesProgressView storiesProgressView = jhb.c;
        if (storiesProgressView != null) {
            storiesProgressView.setProgressListener(new lhb(jhb));
        } else {
            h.k("storiesProgressView");
            throw null;
        }
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        T t2;
        String str;
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        if (!this.r) {
            this.q = s81;
            this.p = bVar;
            String string = s81.custom().string(MarketingFormatsCustomKey.KEY_PAGE_URI.d());
            if (string != null) {
                this.o = string;
                List<? extends s81> children = s81.children();
                hhb hhb = this.s;
                String str2 = this.o;
                if (str2 != null) {
                    ghb b2 = hhb.b(children, str2);
                    h.d(b2, "slideHeaderAdapterFactor…create(children, pageUri)");
                    this.f = b2;
                    ViewPager2 viewPager2 = this.b;
                    if (viewPager2 != null) {
                        viewPager2.setAdapter(b2);
                        ghb ghb = this.f;
                        if (ghb != null) {
                            if (ghb.u() > 1) {
                                StoriesProgressView storiesProgressView = this.c;
                                if (storiesProgressView != null) {
                                    storiesProgressView.setVisibility(0);
                                    StoriesProgressView storiesProgressView2 = this.c;
                                    if (storiesProgressView2 != null) {
                                        ghb ghb2 = this.f;
                                        if (ghb2 != null) {
                                            storiesProgressView2.setStoriesCount(ghb2.u());
                                            StoriesProgressView storiesProgressView3 = this.c;
                                            if (storiesProgressView3 != null) {
                                                storiesProgressView3.setStoryDuration(5000);
                                                StoriesProgressView storiesProgressView4 = this.c;
                                                if (storiesProgressView4 != null) {
                                                    storiesProgressView4.h();
                                                } else {
                                                    h.k("storiesProgressView");
                                                    throw null;
                                                }
                                            } else {
                                                h.k("storiesProgressView");
                                                throw null;
                                            }
                                        } else {
                                            h.k("slideHeaderAdapter");
                                            throw null;
                                        }
                                    } else {
                                        h.k("storiesProgressView");
                                        throw null;
                                    }
                                } else {
                                    h.k("storiesProgressView");
                                    throw null;
                                }
                            } else {
                                StoriesProgressView storiesProgressView5 = this.c;
                                if (storiesProgressView5 != null) {
                                    storiesProgressView5.setVisibility(8);
                                } else {
                                    h.k("storiesProgressView");
                                    throw null;
                                }
                            }
                            s51.b bVar2 = this.p;
                            if (bVar2 != null) {
                                s81 s812 = this.q;
                                if (s812 != null) {
                                    Parcelable a2 = bVar2.a(s812);
                                    if (a2 instanceof a) {
                                        this.a = ((a) a2).a();
                                    }
                                    Iterator<T> it = children.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            t2 = null;
                                            break;
                                        }
                                        t2 = it.next();
                                        if (h.a(t2.componentId().id(), MarketingFormatsComponentId.o.d())) {
                                            break;
                                        }
                                    }
                                    T t3 = t2;
                                    if (t3 == null) {
                                        SpotifyIconView spotifyIconView = this.n;
                                        if (spotifyIconView != null) {
                                            spotifyIconView.setVisibility(8);
                                        } else {
                                            h.k("share");
                                            throw null;
                                        }
                                    } else {
                                        SpotifyIconView spotifyIconView2 = this.n;
                                        if (spotifyIconView2 != null) {
                                            spotifyIconView2.setVisibility(0);
                                            w81 text = t3.text();
                                            p81 custom = t3.custom();
                                            String e = SpotifyLocale.e();
                                            h.d(e, "SpotifyLocale.getDefaultLanguage()");
                                            h.e(t3, "data");
                                            h.e(e, "clientLocale");
                                            p81 custom2 = t3.custom();
                                            String string2 = custom2.string(MarketingFormatsCustomKey.KEY_SHARE_IMAGE_URI.d());
                                            if (string2 != null) {
                                                String string3 = custom2.string(MarketingFormatsCustomKey.KEY_SHARE_IMAGE_URI_LOCALES.d());
                                                if (string3 != null) {
                                                    List w = kotlin.text.e.w(string3, new String[]{","}, false, 0, 6, null);
                                                    if (!w.contains(e)) {
                                                        e = (String) w.get(0);
                                                    }
                                                    str = kotlin.text.e.t(string2, "{LOCALE}", e, false, 4, null);
                                                } else {
                                                    str = string2;
                                                }
                                                String string4 = custom.string(MarketingFormatsCustomKey.KEY_ENTITY_URI.d());
                                                if (string4 != null) {
                                                    String string5 = custom.string(MarketingFormatsCustomKey.KEY_DIALOG_IMAGE_URI.d());
                                                    if (string5 != null) {
                                                        String title = text.title();
                                                        if (title != null) {
                                                            String subtitle = text.subtitle();
                                                            if (subtitle != null) {
                                                                String description = text.description();
                                                                if (description != null) {
                                                                    b bVar3 = new b(str, string4, string5, title, subtitle, description);
                                                                    SpotifyIconView spotifyIconView3 = this.n;
                                                                    if (spotifyIconView3 != null) {
                                                                        spotifyIconView3.setOnClickListener(new khb(this, bVar3, custom));
                                                                    } else {
                                                                        h.k("share");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException("Required value was null.".toString());
                                                                }
                                                            } else {
                                                                throw new IllegalStateException("Required value was null.".toString());
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.".toString());
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.".toString());
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.".toString());
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                        } else {
                                            h.k("share");
                                            throw null;
                                        }
                                    }
                                } else {
                                    h.k("componentModel");
                                    throw null;
                                }
                            } else {
                                h.k("componentState");
                                throw null;
                            }
                        } else {
                            h.k("slideHeaderAdapter");
                            throw null;
                        }
                    } else {
                        h.k("viewPager2");
                        throw null;
                    }
                } else {
                    h.k("pageUri");
                    throw null;
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(HEADER)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Context context = viewGroup.getContext();
        if (this.r) {
            View view = new GlueNoHeaderView(context).getView();
            h.d(view, "GlueNoHeaderView(context).view");
            return view;
        }
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.slide_header_component, viewGroup, false);
        if (inflate != null) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) inflate;
            glueHeaderViewV2.setPadding(glueHeaderViewV2.getPaddingLeft(), com.spotify.android.goldenpath.a.d(context), glueHeaderViewV2.getPaddingRight(), glueHeaderViewV2.getPaddingBottom());
            View G = q4.G(glueHeaderViewV2, C0707R.id.container);
            h.d(G, "requireViewById<View>(view, R.id.container)");
            View G2 = q4.G(glueHeaderViewV2, C0707R.id.progress);
            h.d(G2, "requireViewById(view, R.id.progress)");
            this.c = (StoriesProgressView) G2;
            View G3 = q4.G(glueHeaderViewV2, C0707R.id.pager);
            h.d(G3, "requireViewById(view, R.id.pager)");
            this.b = (ViewPager2) G3;
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(2.0f);
            StoriesProgressView storiesProgressView = this.c;
            if (storiesProgressView != null) {
                storiesProgressView.setProgressListener(new lhb(this));
                glueHeaderViewV2.setScrollObserver(new c(this, accelerateInterpolator, context, G));
                View G4 = q4.G(glueHeaderViewV2, C0707R.id.share);
                h.d(G4, "requireViewById(view, R.id.share)");
                this.n = (SpotifyIconView) G4;
                ViewPager2 viewPager2 = this.b;
                if (viewPager2 != null) {
                    viewPager2.e(new d(this));
                    return glueHeaderViewV2;
                }
                h.k("viewPager2");
                throw null;
            }
            h.k("storiesProgressView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2");
    }
}
