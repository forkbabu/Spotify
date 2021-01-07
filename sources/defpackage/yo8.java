package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import java.util.Map;

/* renamed from: yo8  reason: default package */
public final class yo8 implements fjf<xo8> {
    private final wlf<Map<PickerViewType, wlf<sl8>>> a;
    private final wlf<Map<PickerViewType, wlf<cl8>>> b;

    public yo8(wlf<Map<PickerViewType, wlf<sl8>>> wlf, wlf<Map<PickerViewType, wlf<cl8>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xo8(this.a.get(), this.b.get());
    }
}
