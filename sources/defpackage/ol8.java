package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: ol8  reason: default package */
public class ol8 {
    private final LayoutInflater a;
    private final hl8 b;
    private final vl8 c;
    private final kn8 d;

    public ol8(LayoutInflater layoutInflater, hl8 hl8, vl8 vl8, kn8 kn8) {
        this.a = layoutInflater;
        this.b = hl8;
        this.c = vl8;
        this.d = kn8;
    }

    /* access modifiers changed from: package-private */
    public e<TasteOnboardingItem> a(ViewGroup viewGroup, e.a<TasteOnboardingItem> aVar, PickerViewType pickerViewType, jl8 jl8) {
        ShelfView shelfView = (ShelfView) this.a.inflate(C0707R.layout.viewholder_shelf_view, viewGroup, false);
        fl8 fl8 = new fl8(this.b, this.c);
        fl8.m0(pickerViewType);
        return new nl8(shelfView, aVar, fl8, this.d, jl8);
    }
}
