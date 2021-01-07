package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import java.util.Arrays;

final class AutoValue_CollectionStateProvider_Response extends CollectionStateProvider.Response {
    private final boolean[] isBanned;
    private final boolean[] isInCollection;

    AutoValue_CollectionStateProvider_Response(boolean[] zArr, boolean[] zArr2) {
        if (zArr != null) {
            this.isInCollection = zArr;
            if (zArr2 != null) {
                this.isBanned = zArr2;
                return;
            }
            throw new NullPointerException("Null isBanned");
        }
        throw new NullPointerException("Null isInCollection");
    }

    public boolean equals(Object obj) {
        boolean[] zArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionStateProvider.Response)) {
            return false;
        }
        CollectionStateProvider.Response response = (CollectionStateProvider.Response) obj;
        boolean z = response instanceof AutoValue_CollectionStateProvider_Response;
        if (Arrays.equals(this.isInCollection, z ? ((AutoValue_CollectionStateProvider_Response) response).isInCollection : response.isInCollection())) {
            boolean[] zArr2 = this.isBanned;
            if (z) {
                zArr = ((AutoValue_CollectionStateProvider_Response) response).isBanned;
            } else {
                zArr = response.isBanned();
            }
            if (Arrays.equals(zArr2, zArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.isInCollection) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.isBanned);
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response
    public boolean[] isBanned() {
        return this.isBanned;
    }

    @Override // com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response
    public boolean[] isInCollection() {
        return this.isInCollection;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Response{isInCollection=");
        V0.append(Arrays.toString(this.isInCollection));
        V0.append(", isBanned=");
        V0.append(Arrays.toString(this.isBanned));
        V0.append("}");
        return V0.toString();
    }
}
