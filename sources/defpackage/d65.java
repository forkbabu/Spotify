package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.discographysortandfilter.FilterChipStateListAnimatorButton;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: d65  reason: default package */
public final class d65 implements Object<View>, pk9 {
    private final com.spotify.music.features.freetierartist.discographysortandfilter.a a;

    /* renamed from: d65$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ FilterChipStateListAnimatorButton a;
        final /* synthetic */ int b;
        final /* synthetic */ HubsImmutableComponentBundle c;
        final /* synthetic */ d65 f;
        final /* synthetic */ c55 n;

        a(FilterChipStateListAnimatorButton filterChipStateListAnimatorButton, int i, HubsImmutableComponentBundle hubsImmutableComponentBundle, d65 d65, c55 c55, View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.a = filterChipStateListAnimatorButton;
            this.b = i;
            this.c = hubsImmutableComponentBundle;
            this.f = d65;
            this.n = c55;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!this.a.isChecked()) {
                com.spotify.music.features.freetierartist.discographysortandfilter.a aVar = this.f.a;
                LinearLayout linearLayout = this.n.a;
                h.d(linearLayout, "binding.filterBarChipGroup");
                aVar.b(linearLayout, this.b + 1, this.c.string("key"));
            }
        }
    }

    public d65(com.spotify.music.features.freetierartist.discographysortandfilter.a aVar) {
        h.e(aVar, "chipItemClickListener");
        this.a = aVar;
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
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        c55 a2 = c55.a(view);
        h.d(a2, "DiscographyFilterBarBinding.bind(view)");
        Object obj = s81.custom().get("items");
        if (obj != null) {
            HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) obj;
            Context context = view.getContext();
            h.d(context, "view.context");
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            boolean z = false;
            marginLayoutParams.setMargins(0, 0, nud.g(8.0f, context.getResources()), 0);
            marginLayoutParams.height = nud.g(32.0f, context.getResources());
            a2.a.removeAllViews();
            int length = hubsImmutableComponentBundleArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                HubsImmutableComponentBundle hubsImmutableComponentBundle = hubsImmutableComponentBundleArr[i2];
                int i3 = i + 1;
                if (h.a(hubsImmutableComponentBundle.string("key"), "cancel")) {
                    LinearLayout linearLayout = a2.a;
                    Context context2 = view.getContext();
                    h.d(context2, "view.context");
                    LinearLayout linearLayout2 = a2.a;
                    h.d(linearLayout2, "binding.filterBarChipGroup");
                    SpotifyIconView spotifyIconView = new SpotifyIconView(context2, null);
                    spotifyIconView.setIcon(SpotifyIconV2.X);
                    spotifyIconView.setBackgroundResource(C0707R.drawable.chip_cancel_item_bg);
                    spotifyIconView.setOnClickListener(new e65(this, linearLayout2));
                    linearLayout.addView(spotifyIconView, marginLayoutParams);
                } else {
                    View inflate = LayoutInflater.from(view.getContext()).inflate(C0707R.layout.chip_item, a2.a, z);
                    if (inflate != null) {
                        FilterChipStateListAnimatorButton filterChipStateListAnimatorButton = (FilterChipStateListAnimatorButton) inflate;
                        filterChipStateListAnimatorButton.setText(hubsImmutableComponentBundle.string("label"));
                        filterChipStateListAnimatorButton.setFilterSelected(hubsImmutableComponentBundle.boolValue("is_selected", z));
                        filterChipStateListAnimatorButton.setOnClickListener(new a(filterChipStateListAnimatorButton, i, hubsImmutableComponentBundle, this, a2, view, marginLayoutParams));
                        a2.a.addView(filterChipStateListAnimatorButton, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.freetierartist.discographysortandfilter.FilterChipStateListAnimatorButton");
                    }
                }
                i2++;
                i = i3;
                z = false;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle>");
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.discography_filter_bar;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.discography_filter_bar, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…ilter_bar, parent, false)");
        return inflate;
    }
}
