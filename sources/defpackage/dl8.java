package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ArtistView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: dl8  reason: default package */
public class dl8 extends e<TasteOnboardingItem> {
    private final ArtistView C;
    private final e.a<TasteOnboardingItem> D;
    private final Picasso E;

    dl8(ArtistView artistView, e.a<TasteOnboardingItem> aVar, Picasso picasso) {
        super(artistView);
        this.C = artistView;
        this.D = aVar;
        this.E = picasso;
        Drawable b = i0.b(artistView.getContext(), C0707R.drawable.taste_onboarding_checkmark_flattened);
        b.getClass();
        artistView.setArtistSelectedIcon(b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(TasteOnboardingItem tasteOnboardingItem, int i) {
        TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
        this.C.setArtistName(tasteOnboardingItem2.name());
        z m = this.E.m(MoreObjects.emptyToNull(tasteOnboardingItem2.image()));
        m.t(yc0.a(this.C.getContext()));
        m.g(yc0.a(this.C.getContext()));
        m.x(new cwd());
        m.m(this.C.getArtistImage());
        this.C.setOnClickListener(new al8(this, tasteOnboardingItem2));
        if (tasteOnboardingItem2.isLiked()) {
            this.C.J();
        } else {
            this.C.C();
        }
    }

    public /* synthetic */ void u0(TasteOnboardingItem tasteOnboardingItem, View view) {
        int w = w();
        e.a<TasteOnboardingItem> aVar = this.D;
        if (aVar != null && w != -1) {
            aVar.c(w, this.C, tasteOnboardingItem);
        }
    }
}
