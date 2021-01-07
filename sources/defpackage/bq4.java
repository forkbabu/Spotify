package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.a;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bq4  reason: default package */
public class bq4 {
    private final Context a;
    private final zp4 b;
    final Map<DeviceType, SpotifyIconV2> c;

    public bq4(Context context, zp4 zp4) {
        this.a = context;
        this.b = zp4;
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
        this.c = hashMap;
    }

    public Drawable a(a aVar) {
        SpotifyIconV2 spotifyIconV2 = this.c.get(aVar.getType());
        if (spotifyIconV2 == null) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_SPEAKER;
        }
        if (SpotifyIconV2.DEVICE_SPEAKER == spotifyIconV2 && aVar.isGrouped()) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_MULTISPEAKER;
        }
        return d(spotifyIconV2);
    }

    public Drawable b() {
        SpotifyIconV2 spotifyIconV2 = this.c.get(this.b.a());
        if (spotifyIconV2 == null) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_MOBILE;
        }
        return d(spotifyIconV2);
    }

    public Drawable c(View view, a aVar) {
        char c2;
        int g = nud.g(12.0f, this.a.getResources());
        zp4 zp4 = this.b;
        zp4.getClass();
        if (aVar.isDisabled()) {
            c2 = 0;
        } else if (zp4.b(aVar)) {
            c2 = aVar.getState() == DeviceState.GaiaDeviceState.CONNECTING ? 3 : aVar.isActive() ? (char) 4 : 2;
        } else {
            c2 = aVar.getType() == DeviceType.BluetoothTypes.BLUETOOTH ? (char) 5 : 1;
        }
        if (c2 == 1) {
            return e(SpotifyIconV2.SPOTIFY_CONNECT, g, C0707R.color.txt_connect_picker_subtitle);
        }
        if (c2 == 2) {
            return e(SpotifyIconV2.CHROMECAST_DISCONNECTED, g, C0707R.color.txt_connect_picker_subtitle);
        }
        if (c2 == 3) {
            Drawable e = e(SpotifyIconV2.CHROMECAST_DISCONNECTED, g, C0707R.color.txt_connect_picker_subtitle);
            e.setAlpha(128);
            AnimationDrawable animationDrawable = new AnimationDrawable();
            Drawable e2 = e(SpotifyIconV2.CHROMECAST_CONNECTING_ONE, g, C0707R.color.txt_connect_picker_subtitle);
            Drawable e3 = e(SpotifyIconV2.CHROMECAST_CONNECTING_TWO, g, C0707R.color.txt_connect_picker_subtitle);
            Drawable e4 = e(SpotifyIconV2.CHROMECAST_CONNECTING_THREE, g, C0707R.color.txt_connect_picker_subtitle);
            animationDrawable.addFrame(e2, 500);
            animationDrawable.addFrame(e3, 500);
            animationDrawable.addFrame(e4, 500);
            animationDrawable.addFrame(e3, 500);
            animationDrawable.setOneShot(false);
            animationDrawable.setBounds(g, g, g, g);
            view.post(new yp4(animationDrawable));
            return new LayerDrawable(new Drawable[]{animationDrawable, e});
        } else if (c2 == 4) {
            return e(SpotifyIconV2.CHROMECAST_CONNECTED, g, C0707R.color.txt_connect_picker_subtitle);
        } else {
            if (c2 != 5) {
                return null;
            }
            return e(SpotifyIconV2.BLUETOOTH, g, C0707R.color.txt_connect_picker_subtitle);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable d(SpotifyIconV2 spotifyIconV2) {
        int g = nud.g(32.0f, this.a.getResources());
        ColorStateList c2 = androidx.core.content.a.c(this.a, C0707R.color.icn_connect_device);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) g);
        spotifyIconDrawable.s(c2);
        return spotifyIconDrawable;
    }

    /* access modifiers changed from: package-private */
    public Drawable e(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        ColorStateList c2 = androidx.core.content.a.c(this.a, i2);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) nud.g(32.0f, this.a.getResources()));
        spotifyIconDrawable.s(c2);
        spotifyIconDrawable.w((float) i);
        return spotifyIconDrawable;
    }

    public int f() {
        return (int) TypedValue.applyDimension(1, 12.0f, this.a.getResources().getDisplayMetrics());
    }
}
