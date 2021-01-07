package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.connectui.picker.legacy.ui.DevicePickerActivityV2;
import defpackage.sba;

/* renamed from: wa3  reason: default package */
public final /* synthetic */ class wa3 implements sba.a {
    public static final /* synthetic */ wa3 a = new wa3();

    private /* synthetic */ wa3() {
    }

    @Override // defpackage.sba.a
    public final Intent a(Context context) {
        int i = DevicePickerActivityV2.R;
        return new Intent(context, DevicePickerActivityV2.class);
    }
}
