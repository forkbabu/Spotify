package com.spotify.music.notification;

import java.util.List;

final class AutoValue_CategorySection extends CategorySection {
    private final String name;
    private final List<NotificationV2> preferences;

    AutoValue_CategorySection(String str, List<NotificationV2> list) {
        if (str != null) {
            this.name = str;
            if (list != null) {
                this.preferences = list;
                return;
            }
            throw new NullPointerException("Null preferences");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategorySection)) {
            return false;
        }
        CategorySection categorySection = (CategorySection) obj;
        if (!this.name.equals(categorySection.getName()) || !this.preferences.equals(categorySection.getPreferences())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.notification.CategorySection
    public String getName() {
        return this.name;
    }

    @Override // com.spotify.music.notification.CategorySection
    public List<NotificationV2> getPreferences() {
        return this.preferences;
    }

    public int hashCode() {
        return ((this.name.hashCode() ^ 1000003) * 1000003) ^ this.preferences.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CategorySection{name=");
        V0.append(this.name);
        V0.append(", preferences=");
        return je.L0(V0, this.preferences, "}");
    }
}
