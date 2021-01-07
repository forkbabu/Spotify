package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.d;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: cl8  reason: default package */
public abstract class cl8 extends d<e<TasteOnboardingItem>, TasteOnboardingItem> {
    private e.a<TasteOnboardingItem> n;
    private PickerViewType o;

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b, androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        e eVar = (e) b0Var;
        eVar.m0();
        eVar.a.setTag(C0707R.id.item_impression, null);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b
    /* renamed from: X */
    public void P(e<TasteOnboardingItem> eVar) {
        eVar.l0();
        int w = eVar.w();
        if (w > -1 && eVar.a.getTag(C0707R.id.item_impression) == null) {
            eVar.a.setTag(C0707R.id.item_impression, "impression_log_tag");
            k0(w);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b
    public void Y(e<TasteOnboardingItem> eVar) {
        eVar.m0();
        eVar.a.setTag(C0707R.id.item_impression, null);
    }

    public e.a<TasteOnboardingItem> i0() {
        return this.n;
    }

    public PickerViewType j0() {
        PickerViewType pickerViewType = this.o;
        pickerViewType.getClass();
        return pickerViewType;
    }

    /* access modifiers changed from: package-private */
    public abstract void k0(int i);

    public void l0(e.a<TasteOnboardingItem> aVar) {
        this.n = aVar;
    }

    public void m0(PickerViewType pickerViewType) {
        this.o = pickerViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) ((TasteOnboardingItem) Z(i)).id().hashCode();
    }
}
