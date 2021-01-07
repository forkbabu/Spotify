package com.spotify.music.libs.search.product.main.util;

import com.google.protobuf.ByteString;

final class AutoValue_SearchResponseSerializable extends SearchResponseSerializable {
    private static final long serialVersionUID = -6549767890637865571L;
    private final ByteString mainViewResponse;
    private final String requestId;

    AutoValue_SearchResponseSerializable(String str, ByteString byteString) {
        if (str != null) {
            this.requestId = str;
            if (byteString != null) {
                this.mainViewResponse = byteString;
                return;
            }
            throw new NullPointerException("Null mainViewResponse");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // com.spotify.music.libs.search.product.main.util.SearchResponseSerializable
    public ByteString a() {
        return this.mainViewResponse;
    }

    @Override // com.spotify.music.libs.search.product.main.util.SearchResponseSerializable
    public String b() {
        return this.requestId;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchResponseSerializable)) {
            return false;
        }
        SearchResponseSerializable searchResponseSerializable = (SearchResponseSerializable) obj;
        if (!this.requestId.equals(searchResponseSerializable.b()) || !this.mainViewResponse.equals(searchResponseSerializable.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.requestId.hashCode() ^ 1000003) * 1000003) ^ this.mainViewResponse.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchResponseSerializable{requestId=");
        V0.append(this.requestId);
        V0.append(", mainViewResponse=");
        V0.append(this.mainViewResponse);
        V0.append("}");
        return V0.toString();
    }
}
