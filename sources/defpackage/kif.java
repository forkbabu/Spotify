package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: kif  reason: default package */
public final class kif {
    private static final String f = TextUtils.join(",", Arrays.asList("album", "artist", "playlist", AppProtocol.TrackData.TYPE_TRACK, "episode", "show"));
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public kif(String str, Bundle bundle) {
        String string = bundle.getString("android.intent.extra.artist");
        String string2 = bundle.getString("android.intent.extra.album");
        String string3 = bundle.getString("android.intent.extra.title");
        String string4 = bundle.getString("android.intent.extra.genre");
        String string5 = bundle.getString("android.intent.extra.playlist");
        String string6 = bundle.getString("android.intent.extra.focus");
        if ("vnd.android.cursor.item/artist".equals(string6) && !MoreObjects.isNullOrEmpty(string)) {
            this.a = "track,artist";
            this.c = string;
            this.d = string4;
        } else if ("vnd.android.cursor.item/album".equals(string6) && !MoreObjects.isNullOrEmpty(string2)) {
            this.a = "album";
            this.d = string4;
            this.b = string2;
            this.c = string;
        } else if ("vnd.android.cursor.item/audio".equals(string6) && !MoreObjects.isNullOrEmpty(string3)) {
            this.a = f;
            this.d = string4;
            this.c = string;
            this.e = string3;
        } else if ("vnd.android.cursor.item/genre".equals(string6) && !MoreObjects.isNullOrEmpty(string4)) {
            this.a = AppProtocol.TrackData.TYPE_TRACK;
            this.d = string4;
        } else if (!"vnd.android.cursor.item/playlist".equals(string6) || MoreObjects.isNullOrEmpty(string5)) {
            this.a = f;
            this.e = str;
        } else {
            this.a = "playlist";
            this.e = str;
        }
        Logger.b("Build a search query with type = \"%s\", query = \"%s\".", this.a, a());
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        if (!MoreObjects.isNullOrEmpty(this.e)) {
            if (this.e.contains("*")) {
                sb.append(this.e);
            } else {
                sb.append(String.format(Locale.US, "\"%s\"", this.e));
            }
        }
        if (!MoreObjects.isNullOrEmpty(this.c)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "artist:\"%s\"", this.c));
        }
        if (!MoreObjects.isNullOrEmpty(this.b)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "album:\"%s\"", this.b));
        }
        if (!MoreObjects.isNullOrEmpty(this.d)) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(String.format(Locale.US, "genre:\"%s\"", this.d));
        }
        return sb.toString();
    }

    public String b() {
        return this.a;
    }
}
