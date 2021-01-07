package com.spotify.music.features.pushnotifications.model;

import java.util.List;

final class AutoValue_QuickActions extends QuickActions {
    private final List<QuickAction> actions;
    private final String category;

    AutoValue_QuickActions(String str, List<QuickAction> list) {
        if (str != null) {
            this.category = str;
            if (list != null) {
                this.actions = list;
                return;
            }
            throw new NullPointerException("Null actions");
        }
        throw new NullPointerException("Null category");
    }

    @Override // com.spotify.music.features.pushnotifications.model.QuickActions
    public List<QuickAction> actions() {
        return this.actions;
    }

    @Override // com.spotify.music.features.pushnotifications.model.QuickActions
    public String category() {
        return this.category;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickActions)) {
            return false;
        }
        QuickActions quickActions = (QuickActions) obj;
        if (!this.category.equals(quickActions.category()) || !this.actions.equals(quickActions.actions())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.category.hashCode() ^ 1000003) * 1000003) ^ this.actions.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("QuickActions{category=");
        V0.append(this.category);
        V0.append(", actions=");
        return je.L0(V0, this.actions, "}");
    }
}
