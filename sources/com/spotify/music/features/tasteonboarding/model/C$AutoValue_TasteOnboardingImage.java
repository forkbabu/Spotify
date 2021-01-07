package com.spotify.music.features.tasteonboarding.model;

/* renamed from: com.spotify.music.features.tasteonboarding.model.$AutoValue_TasteOnboardingImage  reason: invalid class name */
abstract class C$AutoValue_TasteOnboardingImage extends TasteOnboardingImage {
    private final int height;
    private final String uri;
    private final int width;

    C$AutoValue_TasteOnboardingImage(String str, int i, int i2) {
        if (str != null) {
            this.uri = str;
            this.height = i;
            this.width = i2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TasteOnboardingImage)) {
            return false;
        }
        TasteOnboardingImage tasteOnboardingImage = (TasteOnboardingImage) obj;
        if (this.uri.equals(tasteOnboardingImage.uri()) && this.height == tasteOnboardingImage.height() && this.width == tasteOnboardingImage.width()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage
    public int height() {
        return this.height;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TasteOnboardingImage{uri=");
        V0.append(this.uri);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", width=");
        return je.B0(V0, this.width, "}");
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage
    public String uri() {
        return this.uri;
    }

    @Override // com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage
    public int width() {
        return this.width;
    }
}
