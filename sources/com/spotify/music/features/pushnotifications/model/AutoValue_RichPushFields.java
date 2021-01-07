package com.spotify.music.features.pushnotifications.model;

final class AutoValue_RichPushFields extends RichPushFields {
    private final String imageUrl;
    private final String subTitle;
    private final String title;

    AutoValue_RichPushFields(String str, String str2, String str3) {
        this.imageUrl = str;
        this.title = str2;
        this.subTitle = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RichPushFields)) {
            return false;
        }
        RichPushFields richPushFields = (RichPushFields) obj;
        String str = this.imageUrl;
        if (str != null ? str.equals(richPushFields.getImageUrl()) : richPushFields.getImageUrl() == null) {
            String str2 = this.title;
            if (str2 != null ? str2.equals(richPushFields.getTitle()) : richPushFields.getTitle() == null) {
                String str3 = this.subTitle;
                if (str3 == null) {
                    if (richPushFields.getSubTitle() == null) {
                        return true;
                    }
                } else if (str3.equals(richPushFields.getSubTitle())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushFields
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushFields
    public String getSubTitle() {
        return this.subTitle;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushFields
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.title;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.subTitle;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RichPushFields{imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", subTitle=");
        return je.I0(V0, this.subTitle, "}");
    }
}
