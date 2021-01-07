package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;

/* access modifiers changed from: package-private */
public final class ff extends AndroidLibsContextMenuPlaylistProperties {
    private final AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour a;

    static final class b extends AndroidLibsContextMenuPlaylistProperties.a {
        private AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour a;

        b() {
        }

        public AndroidLibsContextMenuPlaylistProperties a() {
            String str = this.a == null ? " editPlaylistOptionNftBehaviour" : "";
            if (str.isEmpty()) {
                return new ff(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsContextMenuPlaylistProperties.a b(AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour editPlaylistOptionNftBehaviour) {
            if (editPlaylistOptionNftBehaviour != null) {
                this.a = editPlaylistOptionNftBehaviour;
                return this;
            }
            throw new NullPointerException("Null editPlaylistOptionNftBehaviour");
        }
    }

    ff(AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour editPlaylistOptionNftBehaviour, a aVar) {
        this.a = editPlaylistOptionNftBehaviour;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties
    public AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsContextMenuPlaylistProperties) {
            return this.a.equals(((AndroidLibsContextMenuPlaylistProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsContextMenuPlaylistProperties{editPlaylistOptionNftBehaviour=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
