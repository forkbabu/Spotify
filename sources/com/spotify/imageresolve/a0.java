package com.spotify.imageresolve;

import android.net.Uri;
import com.google.protobuf.ByteString;
import com.spotify.imageresolve.proto.ProjectionMetadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class a0 {
    private static final Pattern a = Pattern.compile("{file_id}", 16);
    public static final /* synthetic */ int b = 0;

    interface a {
    }

    public Uri a(v vVar) {
        return Uri.parse(a.matcher(d()).replaceAll(Matcher.quoteReplacement(vVar.d(b()).e())));
    }

    public abstract ByteString b();

    public abstract ProjectionMetadata c();

    public abstract String d();
}
