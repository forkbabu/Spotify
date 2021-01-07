package com.spotify.encore.consumer.elements.artwork;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class Placeholder {

    public static final class SpotifyIconPlaceholder extends Placeholder {
        private final SpotifyIconV2 icon;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SpotifyIconPlaceholder(SpotifyIconV2 spotifyIconV2) {
            super(null);
            h.e(spotifyIconV2, "icon");
            this.icon = spotifyIconV2;
        }

        public static /* synthetic */ SpotifyIconPlaceholder copy$default(SpotifyIconPlaceholder spotifyIconPlaceholder, SpotifyIconV2 spotifyIconV2, int i, Object obj) {
            if ((i & 1) != 0) {
                spotifyIconV2 = spotifyIconPlaceholder.icon;
            }
            return spotifyIconPlaceholder.copy(spotifyIconV2);
        }

        public final SpotifyIconV2 component1() {
            return this.icon;
        }

        public final SpotifyIconPlaceholder copy(SpotifyIconV2 spotifyIconV2) {
            h.e(spotifyIconV2, "icon");
            return new SpotifyIconPlaceholder(spotifyIconV2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SpotifyIconPlaceholder) && h.a(this.icon, ((SpotifyIconPlaceholder) obj).icon);
            }
            return true;
        }

        public final SpotifyIconV2 getIcon() {
            return this.icon;
        }

        public int hashCode() {
            SpotifyIconV2 spotifyIconV2 = this.icon;
            if (spotifyIconV2 != null) {
                return spotifyIconV2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SpotifyIconPlaceholder(icon=");
            V0.append(this.icon);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class UserPlaceholder extends Placeholder {
        private final int userColor;
        private final String userInitials;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserPlaceholder(String str, int i) {
            super(null);
            h.e(str, "userInitials");
            this.userInitials = str;
            this.userColor = i;
        }

        public static /* synthetic */ UserPlaceholder copy$default(UserPlaceholder userPlaceholder, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = userPlaceholder.userInitials;
            }
            if ((i2 & 2) != 0) {
                i = userPlaceholder.userColor;
            }
            return userPlaceholder.copy(str, i);
        }

        public final String component1() {
            return this.userInitials;
        }

        public final int component2() {
            return this.userColor;
        }

        public final UserPlaceholder copy(String str, int i) {
            h.e(str, "userInitials");
            return new UserPlaceholder(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserPlaceholder)) {
                return false;
            }
            UserPlaceholder userPlaceholder = (UserPlaceholder) obj;
            return h.a(this.userInitials, userPlaceholder.userInitials) && this.userColor == userPlaceholder.userColor;
        }

        public final int getUserColor() {
            return this.userColor;
        }

        public final String getUserInitials() {
            return this.userInitials;
        }

        public int hashCode() {
            String str = this.userInitials;
            return ((str != null ? str.hashCode() : 0) * 31) + this.userColor;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UserPlaceholder(userInitials=");
            V0.append(this.userInitials);
            V0.append(", userColor=");
            return je.B0(V0, this.userColor, ")");
        }
    }

    private Placeholder() {
    }

    public /* synthetic */ Placeholder(f fVar) {
        this();
    }
}
