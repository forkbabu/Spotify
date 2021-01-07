package com.spotify.music.features.connectui.picker.legacy.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

public class d {
    private final Context a;
    final Map<DeviceType, SpotifyIconV2> b;

    public d(Context context) {
        this.a = context;
        HashMap hashMap = new HashMap();
        DeviceType.GaiaTypes gaiaTypes = DeviceType.GaiaTypes.UNKNOWN;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DEVICE_SPEAKER;
        hashMap.put(gaiaTypes, spotifyIconV2);
        DeviceType.GaiaTypes gaiaTypes2 = DeviceType.GaiaTypes.COMPUTER;
        SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.DEVICE_COMPUTER;
        hashMap.put(gaiaTypes2, spotifyIconV22);
        hashMap.put(DeviceType.GaiaTypes.CHROMEBOOK, spotifyIconV22);
        hashMap.put(DeviceType.GaiaTypes.TABLET, SpotifyIconV2.DEVICE_TABLET);
        hashMap.put(DeviceType.GaiaTypes.SMARTPHONE, SpotifyIconV2.DEVICE_MOBILE);
        hashMap.put(DeviceType.GaiaTypes.SPEAKER, spotifyIconV2);
        DeviceType.GaiaTypes gaiaTypes3 = DeviceType.GaiaTypes.TV;
        SpotifyIconV2 spotifyIconV23 = SpotifyIconV2.DEVICE_TV;
        hashMap.put(gaiaTypes3, spotifyIconV23);
        hashMap.put(DeviceType.GaiaTypes.AVR, SpotifyIconV2.DEVICE_ARM);
        hashMap.put(DeviceType.GaiaTypes.STB, spotifyIconV23);
        hashMap.put(DeviceType.GaiaTypes.AUDIO_DONGLE, spotifyIconV2);
        DeviceType.GaiaTypes gaiaTypes4 = DeviceType.GaiaTypes.GAME_CONSOLE;
        SpotifyIconV2 spotifyIconV24 = SpotifyIconV2.GAMES_CONSOLE;
        hashMap.put(gaiaTypes4, spotifyIconV24);
        hashMap.put(DeviceType.GaiaTypes.CAST_VIDEO, spotifyIconV23);
        hashMap.put(DeviceType.GaiaTypes.CAST_AUDIO, spotifyIconV2);
        hashMap.put(DeviceType.GaiaTypes.SMARTWATCH, SpotifyIconV2.WATCH);
        hashMap.put(DeviceType.GaiaTypes.CARTHING, spotifyIconV24);
        this.b = hashMap;
    }

    private Drawable g(GaiaDevice gaiaDevice, int i) {
        SpotifyIconV2 spotifyIconV2 = this.b.get(gaiaDevice.getType());
        if (spotifyIconV2 == null) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_SPEAKER;
        }
        if (SpotifyIconV2.DEVICE_SPEAKER == spotifyIconV2 && gaiaDevice.isGrouped()) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_MULTISPEAKER;
        }
        return h(spotifyIconV2, i);
    }

    public Drawable a() {
        int g = nud.g(12.0f, this.a.getResources());
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.CHROMECAST_DISCONNECTED;
        ColorStateList c = a.c(this.a, C0707R.color.picker_device_subtitle_selector);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) nud.g(32.0f, this.a.getResources()));
        spotifyIconDrawable.s(c);
        spotifyIconDrawable.w((float) g);
        return spotifyIconDrawable;
    }

    public Drawable b(SpotifyIconV2 spotifyIconV2) {
        return h(spotifyIconV2, 24);
    }

    public Drawable c() {
        return h(SpotifyIconV2.MORE_ANDROID, 24);
    }

    public Drawable d(GaiaDevice gaiaDevice) {
        return g(gaiaDevice, 64);
    }

    public Drawable e() {
        return h(SpotifyIconV2.X, 19);
    }

    public Drawable f(GaiaDevice gaiaDevice) {
        return g(gaiaDevice, 32);
    }

    /* access modifiers changed from: package-private */
    public Drawable h(SpotifyIconV2 spotifyIconV2, int i) {
        int g = nud.g((float) i, this.a.getResources());
        ColorStateList c = a.c(this.a, C0707R.color.picker_device_icon_selector);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) g);
        spotifyIconDrawable.s(c);
        return spotifyIconDrawable;
    }
}
