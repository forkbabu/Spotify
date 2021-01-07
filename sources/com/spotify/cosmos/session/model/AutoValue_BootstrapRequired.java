package com.spotify.cosmos.session.model;

final class AutoValue_BootstrapRequired extends BootstrapRequired {
    private final String accessToken;

    AutoValue_BootstrapRequired(String str) {
        if (str != null) {
            this.accessToken = str;
            return;
        }
        throw new NullPointerException("Null accessToken");
    }

    @Override // com.spotify.cosmos.session.model.BootstrapRequired
    public String accessToken() {
        return this.accessToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BootstrapRequired) {
            return this.accessToken.equals(((BootstrapRequired) obj).accessToken());
        }
        return false;
    }

    public int hashCode() {
        return this.accessToken.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("BootstrapRequired{accessToken="), this.accessToken, "}");
    }
}
