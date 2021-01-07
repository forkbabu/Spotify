package com.spotify.music.features.pushnotifications.model;

final class AutoValue_QuickAction extends QuickAction {
    private final String actionData;
    private final String actionIdentifier;
    private final String actionTitle;

    AutoValue_QuickAction(String str, String str2, String str3) {
        if (str != null) {
            this.actionIdentifier = str;
            if (str2 != null) {
                this.actionTitle = str2;
                if (str3 != null) {
                    this.actionData = str3;
                    return;
                }
                throw new NullPointerException("Null actionData");
            }
            throw new NullPointerException("Null actionTitle");
        }
        throw new NullPointerException("Null actionIdentifier");
    }

    @Override // com.spotify.music.features.pushnotifications.model.QuickAction
    public String actionData() {
        return this.actionData;
    }

    @Override // com.spotify.music.features.pushnotifications.model.QuickAction
    public String actionIdentifier() {
        return this.actionIdentifier;
    }

    @Override // com.spotify.music.features.pushnotifications.model.QuickAction
    public String actionTitle() {
        return this.actionTitle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) obj;
        if (!this.actionIdentifier.equals(quickAction.actionIdentifier()) || !this.actionTitle.equals(quickAction.actionTitle()) || !this.actionData.equals(quickAction.actionData())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.actionIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.actionTitle.hashCode()) * 1000003) ^ this.actionData.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("QuickAction{actionIdentifier=");
        V0.append(this.actionIdentifier);
        V0.append(", actionTitle=");
        V0.append(this.actionTitle);
        V0.append(", actionData=");
        return je.I0(V0, this.actionData, "}");
    }
}
