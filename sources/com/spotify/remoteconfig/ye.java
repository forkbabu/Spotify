package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAllboardingProperties;

/* access modifiers changed from: package-private */
public final class ye extends AndroidLibsAllboardingProperties {
    private final AndroidLibsAllboardingProperties.LoadingAnimation a;

    static final class b extends AndroidLibsAllboardingProperties.a {
        private AndroidLibsAllboardingProperties.LoadingAnimation a;

        b() {
        }

        public AndroidLibsAllboardingProperties a() {
            String str = this.a == null ? " loadingAnimation" : "";
            if (str.isEmpty()) {
                return new ye(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsAllboardingProperties.a b(AndroidLibsAllboardingProperties.LoadingAnimation loadingAnimation) {
            if (loadingAnimation != null) {
                this.a = loadingAnimation;
                return this;
            }
            throw new NullPointerException("Null loadingAnimation");
        }
    }

    ye(AndroidLibsAllboardingProperties.LoadingAnimation loadingAnimation, a aVar) {
        this.a = loadingAnimation;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAllboardingProperties
    public AndroidLibsAllboardingProperties.LoadingAnimation a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsAllboardingProperties) {
            return this.a.equals(((AndroidLibsAllboardingProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsAllboardingProperties{loadingAnimation=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
