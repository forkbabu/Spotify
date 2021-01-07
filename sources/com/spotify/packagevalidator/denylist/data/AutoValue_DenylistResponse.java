package com.spotify.packagevalidator.denylist.data;

final class AutoValue_DenylistResponse extends DenylistResponse {

    /* renamed from: android  reason: collision with root package name */
    private final AndroidDenylist f4android;

    AutoValue_DenylistResponse(AndroidDenylist androidDenylist) {
        if (androidDenylist != null) {
            this.f4android = androidDenylist;
            return;
        }
        throw new NullPointerException("Null android");
    }

    @Override // com.spotify.packagevalidator.denylist.data.DenylistResponse
    public AndroidDenylist android() {
        return this.f4android;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DenylistResponse) {
            return this.f4android.equals(((DenylistResponse) obj).android());
        }
        return false;
    }

    public int hashCode() {
        return this.f4android.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DenylistResponse{android=");
        V0.append(this.f4android);
        V0.append("}");
        return V0.toString();
    }
}
