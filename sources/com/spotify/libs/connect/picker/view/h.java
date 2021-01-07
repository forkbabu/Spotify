package com.spotify.libs.connect.picker.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class h {
    private final Context a;

    public h(Context context) {
        this.a = context;
    }

    public static SpotifyIconV2 a(DeviceType deviceType, boolean z) {
        if (deviceType.equals(DeviceType.GaiaTypes.UNKNOWN)) {
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
        if (deviceType.equals(DeviceType.GaiaTypes.COMPUTER) || deviceType.equals(DeviceType.GaiaTypes.CHROMEBOOK)) {
            return SpotifyIconV2.DEVICE_COMPUTER;
        }
        if (deviceType.equals(DeviceType.GaiaTypes.TABLET)) {
            return SpotifyIconV2.DEVICE_TABLET;
        }
        if (deviceType.equals(DeviceType.GaiaTypes.SMARTPHONE)) {
            return SpotifyIconV2.DEVICE_MOBILE;
        }
        if (deviceType.equals(DeviceType.GaiaTypes.SPEAKER) || deviceType.equals(DeviceType.GaiaTypes.CAST_AUDIO)) {
            if (z) {
                return SpotifyIconV2.DEVICE_MULTISPEAKER;
            }
            return SpotifyIconV2.DEVICE_SPEAKER;
        } else if (deviceType.equals(DeviceType.GaiaTypes.TV)) {
            return SpotifyIconV2.DEVICE_TV;
        } else {
            if (deviceType.equals(DeviceType.GaiaTypes.AVR)) {
                return SpotifyIconV2.DEVICE_ARM;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.STB)) {
                return SpotifyIconV2.DEVICE_TV;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.AUDIO_DONGLE)) {
                return SpotifyIconV2.DEVICE_SPEAKER;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.GAME_CONSOLE)) {
                return SpotifyIconV2.GAMES_CONSOLE;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.CAST_VIDEO)) {
                return SpotifyIconV2.DEVICE_TV;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.SMARTWATCH)) {
                return SpotifyIconV2.WATCH;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.CARTHING)) {
                return SpotifyIconV2.DEVICE_CAR;
            }
            if (deviceType.equals(DeviceType.GaiaTypes.HOMETHING)) {
                return SpotifyIconV2.DEVICE_SPEAKER;
            }
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
    }

    public Drawable b(GaiaDevice gaiaDevice, int i, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, a(gaiaDevice.getType(), gaiaDevice.isGrouped()), f);
        spotifyIconDrawable.r(i);
        return spotifyIconDrawable;
    }
}
