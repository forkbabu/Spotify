package com.spotify.music.features.creatorartist.model;

import com.google.common.base.Optional;
import com.spotify.music.features.creatorartist.model.CreatorAboutModel;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.spotify.music.features.creatorartist.model.$AutoValue_CreatorAboutModel  reason: invalid class name */
public abstract class C$AutoValue_CreatorAboutModel extends CreatorAboutModel {
    private final Autobiography autobiography;
    private final String biography;
    private final int globalChartPosition;
    private final List<ImageModel> images;
    private final String mainImageUrl;
    private final int monthlyListeners;
    private final String name;

    /* renamed from: com.spotify.music.features.creatorartist.model.$AutoValue_CreatorAboutModel$Builder */
    static class Builder extends CreatorAboutModel.Builder {
        private Autobiography autobiography;
        private String biography;
        private Integer globalChartPosition;
        private List<ImageModel> images;
        private String mainImageUrl;
        private Integer monthlyListeners;
        private String name;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel autoBuild() {
            String str = this.monthlyListeners == null ? " monthlyListeners" : "";
            if (this.globalChartPosition == null) {
                str = je.x0(str, " globalChartPosition");
            }
            if (this.images == null) {
                str = je.x0(str, " images");
            }
            if (str.isEmpty()) {
                return new AutoValue_CreatorAboutModel(this.monthlyListeners.intValue(), this.globalChartPosition.intValue(), this.biography, this.name, this.mainImageUrl, this.autobiography, this.images);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder autobiography(Autobiography autobiography2) {
            this.autobiography = autobiography2;
            return this;
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder biography(String str) {
            this.biography = str;
            return this;
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder globalChartPosition(int i) {
            this.globalChartPosition = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder images(List<ImageModel> list) {
            if (list != null) {
                this.images = list;
                return this;
            }
            throw new NullPointerException("Null images");
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder mainImageUrl(String str) {
            this.mainImageUrl = str;
            return this;
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder monthlyListeners(int i) {
            this.monthlyListeners = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public CreatorAboutModel.Builder name(String str) {
            this.name = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public Optional<Integer> globalChartPosition() {
            Integer num = this.globalChartPosition;
            if (num == null) {
                return Optional.absent();
            }
            return Optional.of(num);
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public Optional<Integer> monthlyListeners() {
            Integer num = this.monthlyListeners;
            if (num == null) {
                return Optional.absent();
            }
            return Optional.of(num);
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel.Builder
        public Optional<List<ImageModel>> images() {
            List<ImageModel> list = this.images;
            if (list == null) {
                return Optional.absent();
            }
            return Optional.of(list);
        }
    }

    C$AutoValue_CreatorAboutModel(int i, int i2, String str, String str2, String str3, Autobiography autobiography2, List<ImageModel> list) {
        this.monthlyListeners = i;
        this.globalChartPosition = i2;
        this.biography = str;
        this.name = str2;
        this.mainImageUrl = str3;
        this.autobiography = autobiography2;
        if (list != null) {
            this.images = list;
            return;
        }
        throw new NullPointerException("Null images");
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public Autobiography autobiography() {
        return this.autobiography;
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public String biography() {
        return this.biography;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Autobiography autobiography2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatorAboutModel)) {
            return false;
        }
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) obj;
        if (this.monthlyListeners != creatorAboutModel.monthlyListeners() || this.globalChartPosition != creatorAboutModel.globalChartPosition() || ((str = this.biography) != null ? !str.equals(creatorAboutModel.biography()) : creatorAboutModel.biography() != null) || ((str2 = this.name) != null ? !str2.equals(creatorAboutModel.name()) : creatorAboutModel.name() != null) || ((str3 = this.mainImageUrl) != null ? !str3.equals(creatorAboutModel.mainImageUrl()) : creatorAboutModel.mainImageUrl() != null) || ((autobiography2 = this.autobiography) != null ? !autobiography2.equals(creatorAboutModel.autobiography()) : creatorAboutModel.autobiography() != null) || !this.images.equals(creatorAboutModel.images())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public int globalChartPosition() {
        return this.globalChartPosition;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (((this.monthlyListeners ^ 1000003) * 1000003) ^ this.globalChartPosition) * 1000003;
        String str = this.biography;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.name;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mainImageUrl;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Autobiography autobiography2 = this.autobiography;
        if (autobiography2 != null) {
            i2 = autobiography2.hashCode();
        }
        return ((hashCode3 ^ i2) * 1000003) ^ this.images.hashCode();
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public List<ImageModel> images() {
        return this.images;
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public String mainImageUrl() {
        return this.mainImageUrl;
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public int monthlyListeners() {
        return this.monthlyListeners;
    }

    @Override // com.spotify.music.features.creatorartist.model.CreatorAboutModel
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CreatorAboutModel{monthlyListeners=");
        V0.append(this.monthlyListeners);
        V0.append(", globalChartPosition=");
        V0.append(this.globalChartPosition);
        V0.append(", biography=");
        V0.append(this.biography);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", mainImageUrl=");
        V0.append(this.mainImageUrl);
        V0.append(", autobiography=");
        V0.append(this.autobiography);
        V0.append(", images=");
        return je.L0(V0, this.images, "}");
    }
}
