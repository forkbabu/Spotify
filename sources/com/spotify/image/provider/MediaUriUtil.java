package com.spotify.image.provider;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MediaUriUtil {
    private static final Pattern b = Pattern.compile(".scdn.co", 16);
    private final String a;

    public enum ImageDimension {
        LARGE(640),
        NORMAL(320),
        SMALL(160);
        
        private final int mValue;

        private ImageDimension(int i) {
            this.mValue = i;
        }

        public int d() {
            return this.mValue;
        }
    }

    public enum Transformation {
        CIRCULAR,
        ROUNDED_CORNER,
        NONE
    }

    public MediaUriUtil(String str, Context context) {
        this.a = str;
    }

    private Uri d(String str, List<String> list, Transformation transformation) {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority(this.a);
        for (String str2 : list) {
            authority.appendPath(str2);
        }
        if (str != null) {
            authority.appendQueryParameter("cdn", str);
        }
        authority.appendQueryParameter("transformation", transformation.name());
        return authority.build();
    }

    public Uri a(Uri uri, Transformation transformation) {
        if (uri.toString().startsWith("android.resource")) {
            return uri;
        }
        if (uri.toString().startsWith("spotify:")) {
            return d(null, Collections.singletonList(uri.toString()), transformation);
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            return Uri.EMPTY;
        }
        return d(b.matcher(authority).replaceAll(Matcher.quoteReplacement("")), uri.getPathSegments(), transformation);
    }

    public Uri b(Uri uri, Transformation transformation, ImageDimension imageDimension) {
        if (uri.toString().startsWith("android.resource")) {
            return uri;
        }
        return a(uri, transformation).buildUpon().appendQueryParameter("dimension", imageDimension.name()).build();
    }

    public Uri c(String str, Transformation transformation) {
        if (str == null || str.isEmpty()) {
            return Uri.EMPTY;
        }
        return a(Uri.parse(str), transformation);
    }
}
