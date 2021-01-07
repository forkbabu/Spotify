package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ArtistView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.squareup.picasso.Picasso;

/* renamed from: hl8  reason: default package */
public class hl8 {
    private final LayoutInflater a;
    private final Picasso b;

    public hl8(LayoutInflater layoutInflater, Picasso picasso) {
        this.a = layoutInflater;
        this.b = picasso;
    }

    /* access modifiers changed from: package-private */
    public e<TasteOnboardingItem> a(ViewGroup viewGroup, int i, e.a<TasteOnboardingItem> aVar, PickerViewType pickerViewType) {
        if (i == 1) {
            ArtistView artistView = (ArtistView) this.a.inflate(C0707R.layout.viewholder_artist_view, viewGroup, false);
            int ordinal = pickerViewType.ordinal();
            if (ordinal == 0) {
                artistView.G();
            } else if (ordinal == 1) {
                artistView.E();
            } else {
                throw new IllegalArgumentException("Unsupported picker view type: " + pickerViewType);
            }
            return new dl8(artistView, aVar, this.b);
        } else if (i == 2) {
            return new el8(C0707R.layout.free_tier_artist_picker_genre_view_sthlm_blk, viewGroup, aVar);
        } else {
            throw new IllegalArgumentException(je.p0("Unsupported view type: ", i));
        }
    }
}
