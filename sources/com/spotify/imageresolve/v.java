package com.spotify.imageresolve;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class v {
    private static final Pattern b = Pattern.compile("(.+/image/|spotify:image:)([0-9a-f]{40})$");
    private static final BaseEncoding c = BaseEncoding.base16().lowerCase();
    private final ByteString a;

    v(ByteString byteString) {
        this.a = byteString;
        MoreObjects.checkState(byteString.size() == 20);
    }

    public static Optional<v> b(Uri uri) {
        Matcher matcher = b.matcher(uri.toString());
        if (!matcher.matches()) {
            return Optional.absent();
        }
        String group = matcher.group(2);
        if (group.length() != 40) {
            return Optional.absent();
        }
        BaseEncoding baseEncoding = c;
        if (!baseEncoding.canDecode(group)) {
            return Optional.absent();
        }
        return Optional.of(new v(ByteString.h(baseEncoding.decode(group))));
    }

    public ByteString a() {
        return this.a.z(0, 4);
    }

    public ByteString c() {
        return this.a.z(4, 8);
    }

    public v d(ByteString byteString) {
        return new v(this.a.z(0, 4).f(byteString).f(this.a.z(8, 20)));
    }

    public String e() {
        return c.encode(this.a.A());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.a.equals(((v) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
