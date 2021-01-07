package com.spotify.music.features.payfail;

import com.spotify.music.features.payfail.BannerModel;

/* access modifiers changed from: package-private */
public final class q extends BannerModel {
    private final BannerModel.Content a;
    private final int b;

    q(BannerModel.Content content, int i) {
        if (content != null) {
            this.a = content;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null content");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.payfail.BannerModel
    public BannerModel.Content a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.features.payfail.BannerModel
    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerModel)) {
            return false;
        }
        BannerModel bannerModel = (BannerModel) obj;
        if (!this.a.equals(bannerModel.a()) || this.b != bannerModel.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BannerModel{content=");
        V0.append(this.a);
        V0.append(", downloadedContentCount=");
        return je.B0(V0, this.b, "}");
    }
}
