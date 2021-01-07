package com.spotify.music.features.connectui.picker.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.picker.view.h;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;

public class c {
    private final Context a;
    private final int b;
    private final HashMap<String, SpotifyIconDrawable> c = new HashMap<>();
    private final SpotifyIconDrawable d;
    private final int e;
    private final SpotifyIconDrawable f;

    public c(Context context) {
        this.a = context;
        this.b = context.getResources().getDimensionPixelSize(C0707R.dimen.listening_on_device_icon_size);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.listening_on_device_sub_icon_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0707R.dimen.listening_on_device_menu_icon_size);
        int i = R.color.green_light;
        this.e = i;
        this.d = a(SpotifyIconV2.CHROMECAST_DISCONNECTED, i, (float) dimensionPixelSize);
        this.f = a(SpotifyIconV2.MORE_ANDROID, R.color.white, (float) dimensionPixelSize2);
    }

    private SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i, float f2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, f2);
        spotifyIconDrawable.r(a.b(this.a, i));
        spotifyIconDrawable.w(f2);
        return spotifyIconDrawable;
    }

    public Drawable b() {
        return this.d;
    }

    public Drawable c(DeviceType deviceType, boolean z) {
        String name = deviceType.name();
        SpotifyIconDrawable spotifyIconDrawable = this.c.get(name);
        if (spotifyIconDrawable != null) {
            return spotifyIconDrawable;
        }
        SpotifyIconDrawable a2 = a(h.a(deviceType, z), this.e, (float) this.b);
        this.c.put(name, a2);
        return a2;
    }

    public Drawable d() {
        return this.f;
    }
}
