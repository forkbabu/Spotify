package com.spotify.music.features.connectui.picker.contextmenu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.u;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.legacy.ui.c;

public class DeviceContextMenuFragment extends DialogFragment {
    private a u0;
    n v0;
    u w0;

    public interface a {
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        Bundle k4 = k4();
        Parcelable parcelable = k4.getParcelable("CONTEXT_MENU_DEVICE");
        parcelable.getClass();
        int i = k4.getInt("KEY_DEVICE_POSITION_IN_PICKER");
        this.v0.a((GaiaDevice) parcelable, i);
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.DeviceContextMenuDialogTheme;
    }

    /* access modifiers changed from: package-private */
    public void a5(int i) {
        a aVar;
        if (!(i == 0 || (aVar = this.u0) == null)) {
            ((c) aVar).a(i);
        }
        N4();
    }

    public void b5(a aVar) {
        this.u0 = aVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((!this.w0.a() || !k4().getBoolean("KEY_MINI_PICKER_COLLAPSED", false)) ? C0707R.layout.picker_device_menu_fragment : C0707R.layout.picker_mini_device_menu_fragment, viewGroup, false);
    }
}
