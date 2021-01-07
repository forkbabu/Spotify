package com.spotify.cosmos.session.model;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class AutoValue_ProductStateWrapper extends ProductStateWrapper {
    private final Map<String, String> productState;

    AutoValue_ProductStateWrapper(Map<String, String> map) {
        if (map != null) {
            this.productState = map;
            return;
        }
        throw new NullPointerException("Null productState");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProductStateWrapper) {
            return this.productState.equals(((ProductStateWrapper) obj).productState());
        }
        return false;
    }

    public int hashCode() {
        return this.productState.hashCode() ^ 1000003;
    }

    @Override // com.spotify.cosmos.session.model.ProductStateWrapper
    public Map<String, String> productState() {
        return this.productState;
    }

    public String toString() {
        return je.M0(je.V0("ProductStateWrapper{productState="), this.productState, "}");
    }
}
