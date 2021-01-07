package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;
import java.util.Map;

/* renamed from: xo8  reason: default package */
public class xo8 {
    private final Map<PickerViewType, wlf<sl8>> a;
    private final Map<PickerViewType, wlf<cl8>> b;

    public xo8(Map<PickerViewType, wlf<sl8>> map, Map<PickerViewType, wlf<cl8>> map2) {
        this.a = map;
        this.b = map2;
    }

    public sl8 a(List<TasteOnboardingItem> list, PickerViewType pickerViewType) {
        sl8 sl8 = this.a.get(pickerViewType).get();
        cl8 cl8 = this.b.get(pickerViewType).get();
        cl8.f0(list);
        sl8.setTastePickerAdapter(cl8);
        cl8.m0(pickerViewType);
        return sl8;
    }
}
