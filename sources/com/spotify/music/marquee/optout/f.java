package com.spotify.music.marquee.optout;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;

public class f {
    private final jjb a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final WeakReference<c> f;
    private final e g;

    public f(jjb jjb, e eVar, String str, String str2, String str3, String str4, c cVar) {
        this.a = jjb;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = new WeakReference<>(cVar);
        this.g = eVar;
    }

    public Drawable a() {
        return new SpotifyIconDrawable(this.f.get(), SpotifyIconV2.BAN, this.f.get().getResources().getDimension(C0707R.dimen.ban_icon_size));
    }

    public String b(int i) {
        if (i == 0) {
            return this.d;
        }
        if (i == 1) {
            return this.e;
        }
        throw new IllegalArgumentException("unsupported view type");
    }

    public void c(int i) {
        if (i == 0) {
            this.a.a(this.b, this.c);
            this.g.z();
            this.g.b0(C0707R.string.marquee_optout_artist_notification_text);
        } else if (i == 1) {
            this.g.e0();
        } else {
            throw new IllegalArgumentException("unsupported view type");
        }
    }
}
