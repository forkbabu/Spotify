package com.spotify.music.libs.search.product.main.util;

import com.google.protobuf.ByteString;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public abstract class SearchResponseSerializable implements Serializable {
    private static final long serialVersionUID = -6549767890637865571L;

    SearchResponseSerializable() {
    }

    public abstract ByteString a();

    public abstract String b();
}
