package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;
import defpackage.sba;

/* renamed from: xa3  reason: default package */
public final /* synthetic */ class xa3 implements sba.a {
    public static final /* synthetic */ xa3 a = new xa3();

    private /* synthetic */ xa3() {
    }

    @Override // defpackage.sba.a
    public final Intent a(Context context) {
        int i = DevicePickerActivity.V;
        return new Intent(context, DevicePickerActivity.class);
    }
}
