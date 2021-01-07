package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;

public class d2 {
    public Uri a(String str) {
        if (str == null) {
            return Uri.EMPTY;
        }
        if (str.startsWith("spotify:")) {
            if (str.startsWith("spotify:mosaic:")) {
                Uri.Builder buildUpon = Uri.parse("https://mosaic.scdn.co/").buildUpon();
                buildUpon.appendPath("640");
                String[] split = str.substring(15).split(":");
                StringBuilder sb = new StringBuilder();
                for (String str2 : split) {
                    sb.append(str2);
                }
                buildUpon.appendPath(sb.toString());
                return Uri.parse(buildUpon.toString());
            } else if (!str.startsWith("spotify:image:")) {
                return Uri.EMPTY;
            } else {
                String[] split2 = str.split(":");
                if (split2.length != 3) {
                    return Uri.EMPTY;
                }
                StringBuilder V0 = je.V0("https://i.scdn.co/image/");
                V0.append(split2[2]);
                return Uri.parse(V0.toString());
            }
        } else if (str.startsWith("https://")) {
            return Uri.parse(str);
        } else {
            return Uri.EMPTY;
        }
    }
}
