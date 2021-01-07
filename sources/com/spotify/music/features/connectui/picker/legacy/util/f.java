package com.spotify.music.features.connectui.picker.legacy.util;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.d;
import java.util.List;

public class f {
    private final Context a;
    private final b b;

    public f(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    private String e(GaiaDevice gaiaDevice) {
        DeviceType type = gaiaDevice.getType();
        if (type == DeviceType.GaiaTypes.UNKNOWN) {
            return this.a.getString(C0707R.string.accessibility_device_type_unknown);
        }
        if (type == DeviceType.GaiaTypes.COMPUTER) {
            return this.a.getString(C0707R.string.accessibility_device_type_computer);
        }
        if (type == DeviceType.GaiaTypes.TABLET) {
            return this.a.getString(C0707R.string.accessibility_device_type_tablet);
        }
        if (type == DeviceType.GaiaTypes.SMARTPHONE) {
            return this.a.getString(C0707R.string.accessibility_device_type_smartphone);
        }
        if (type == DeviceType.GaiaTypes.SPEAKER) {
            return this.a.getString(C0707R.string.accessibility_device_type_speaker);
        }
        if (type == DeviceType.GaiaTypes.TV) {
            return this.a.getString(C0707R.string.accessibility_device_type_tv);
        }
        if (type == DeviceType.GaiaTypes.AVR) {
            return this.a.getString(C0707R.string.accessibility_device_type_avr);
        }
        if (type == DeviceType.GaiaTypes.STB) {
            return this.a.getString(C0707R.string.accessibility_device_type_stb);
        }
        if (type == DeviceType.GaiaTypes.AUDIO_DONGLE) {
            return this.a.getString(C0707R.string.accessibility_device_type_audio_dongle);
        }
        if (type == DeviceType.GaiaTypes.GAME_CONSOLE) {
            return this.a.getString(C0707R.string.accessibility_device_type_game_console);
        }
        if (type == DeviceType.GaiaTypes.CAST_VIDEO) {
            return this.a.getString(C0707R.string.accessibility_device_type_cast_video);
        }
        if (type == DeviceType.GaiaTypes.CAST_AUDIO) {
            return this.a.getString(C0707R.string.accessibility_device_type_cast_audio);
        }
        if (type == DeviceType.GaiaTypes.AUTOMOBILE) {
            return this.a.getString(C0707R.string.accessibility_device_type_automobile);
        }
        if (type == DeviceType.GaiaTypes.SMARTWATCH) {
            return this.a.getString(C0707R.string.accessibility_device_type_smartwatch);
        }
        if (type == DeviceType.GaiaTypes.CHROMEBOOK) {
            return this.a.getString(C0707R.string.accessibility_device_type_chromebook);
        }
        if (type == DeviceType.GaiaTypes.UNKNOWN_SPOTIFY_HW) {
            return this.a.getString(C0707R.string.accessibility_device_type_unknown_spotify_hw);
        }
        if (type == DeviceType.GaiaTypes.CARTHING) {
            return this.a.getString(C0707R.string.accessibility_device_type_carthing);
        }
        if (type == DeviceType.GaiaTypes.HOMETHING) {
            return this.a.getString(C0707R.string.accessibility_device_type_homething);
        }
        return this.a.getString(C0707R.string.accessibility_device_type_unknown);
    }

    public String a() {
        return this.a.getString(C0707R.string.device_picker_title_group_session_on);
    }

    public String b(boolean z) {
        return this.a.getString(z ? C0707R.string.connect_device_playing_on_video : C0707R.string.connect_device_playing_on_audio);
    }

    public String c(GaiaDevice gaiaDevice) {
        DeviceState state = gaiaDevice.getState();
        if (state == DeviceState.GaiaDeviceState.PREMIUM_REQUIRED) {
            return this.a.getString(C0707R.string.connect_device_premium_only);
        }
        if (state == DeviceState.GaiaDeviceState.INCOMPATIBLE) {
            return this.a.getString(C0707R.string.connect_device_incompatible);
        }
        if (state == DeviceState.GaiaDeviceState.NOT_INSTALLED) {
            return this.a.getString(C0707R.string.connect_device_not_installed);
        }
        if (state == DeviceState.GaiaDeviceState.UNSUPPORTED_URI || state == DeviceState.GaiaDeviceState.NOT_AUTHORIZED) {
            return this.a.getString(C0707R.string.connect_device_unsupported_uri);
        }
        Logger.b("Device disabled and falling back to default with state: %s", state.name());
        return this.a.getString(C0707R.string.connect_device_unavailable_for_playback);
    }

    public String d(GaiaDevice gaiaDevice) {
        return this.a.getString(C0707R.string.accessibility_content_description_connect_device, e(gaiaDevice), gaiaDevice.isSelf() ? h() : gaiaDevice.getName());
    }

    public String f(GaiaDevice gaiaDevice, String str) {
        return this.a.getString(C0707R.string.accessibility_content_description_connect_device_join, e(gaiaDevice), gaiaDevice.isSelf() ? h() : gaiaDevice.getName(), str);
    }

    public String g(String str, String str2) {
        return this.a.getString(C0707R.string.accessibility_listening_on_view_title_template, str, str2);
    }

    public String h() {
        DeviceType a2 = this.b.a();
        if (DeviceType.GaiaTypes.CHROMEBOOK == a2) {
            return this.a.getString(C0707R.string.connect_chromebook_is_self);
        }
        if (DeviceType.GaiaTypes.TABLET == a2) {
            return this.a.getString(C0707R.string.connect_tablet_is_self);
        }
        return this.a.getString(C0707R.string.connect_phone_is_self);
    }

    public String i(int i) {
        if (i > 1) {
            return this.a.getString(C0707R.string.message_leave_group_session_view);
        }
        return this.a.getString(C0707R.string.message_default_group_session);
    }

    public String j(List<d> list) {
        int size = list.size();
        String str = "";
        for (d dVar : list) {
            if (dVar.d()) {
                str = dVar.a();
            }
        }
        if (size < 2) {
            return this.a.getString(C0707R.string.device_picker_available_for_join_subtitle, str);
        }
        int i = size - 1;
        return this.a.getResources().getQuantityString(C0707R.plurals.device_picker_available_for_join_subtitle_others, i, str, Integer.valueOf(i));
    }

    public String k(int i) {
        if (i > 1) {
            return this.a.getResources().getQuantityString(C0707R.plurals.title_group_session_view, i, Integer.valueOf(i));
        }
        return this.a.getString(C0707R.string.allow_group_sessions);
    }
}
