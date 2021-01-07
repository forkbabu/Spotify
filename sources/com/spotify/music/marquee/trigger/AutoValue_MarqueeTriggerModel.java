package com.spotify.music.marquee.trigger;

import com.spotify.music.marquee.trigger.MarqueeTriggerModel;

/* access modifiers changed from: package-private */
public final class AutoValue_MarqueeTriggerModel extends MarqueeTriggerModel {
    private static final long serialVersionUID = 1471;
    private final String pageUri;
    private final boolean quickSilverDisplayed;

    /* access modifiers changed from: package-private */
    public static final class b implements MarqueeTriggerModel.a {
        private String a;
        private Boolean b;

        b() {
        }

        public MarqueeTriggerModel a() {
            String str = this.b == null ? " quickSilverDisplayed" : "";
            if (str.isEmpty()) {
                return new AutoValue_MarqueeTriggerModel(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public MarqueeTriggerModel.a b(String str) {
            this.a = str;
            return this;
        }

        public MarqueeTriggerModel.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        b(MarqueeTriggerModel marqueeTriggerModel, a aVar) {
            this.a = marqueeTriggerModel.a();
            this.b = Boolean.valueOf(marqueeTriggerModel.b());
        }
    }

    AutoValue_MarqueeTriggerModel(String str, boolean z, a aVar) {
        this.pageUri = str;
        this.quickSilverDisplayed = z;
    }

    @Override // com.spotify.music.marquee.trigger.MarqueeTriggerModel
    public String a() {
        return this.pageUri;
    }

    @Override // com.spotify.music.marquee.trigger.MarqueeTriggerModel
    public boolean b() {
        return this.quickSilverDisplayed;
    }

    @Override // com.spotify.music.marquee.trigger.MarqueeTriggerModel
    public MarqueeTriggerModel.a c() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarqueeTriggerModel)) {
            return false;
        }
        MarqueeTriggerModel marqueeTriggerModel = (MarqueeTriggerModel) obj;
        String str = this.pageUri;
        if (str != null ? str.equals(marqueeTriggerModel.a()) : marqueeTriggerModel.a() == null) {
            if (this.quickSilverDisplayed == marqueeTriggerModel.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.pageUri;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (this.quickSilverDisplayed ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MarqueeTriggerModel{pageUri=");
        V0.append(this.pageUri);
        V0.append(", quickSilverDisplayed=");
        return je.P0(V0, this.quickSilverDisplayed, "}");
    }
}
