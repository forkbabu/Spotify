package com.spotify.music.features.assistedcuration.search;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.SimpleNavigationManager;
import com.spotify.music.navigation.z;
import com.spotify.player.model.Context;

public class AssistedCurationSearchLogger implements z {
    private static final a c = PageIdentifiers.ASSISTED_CURATION_SEARCH;
    private static final c d = ViewUris.G;
    private final jz1 a;
    private final cqe b;

    /* access modifiers changed from: private */
    public enum InteractionType {
        HIT("hit");
        
        private final String mStrValue;

        private InteractionType(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        ADD_TRACK("add_track"),
        NAVIGATE_FORWARD("navigate-forward"),
        NAVIGATE_BACK("nav-back-hardware-back-button"),
        NAVIGATE_UP("nav-back-up-toolbar-button");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public AssistedCurationSearchLogger(jz1 jz1, cqe cqe) {
        this.a = jz1;
        this.b = cqe;
    }

    private void c(String str, String str2, String str3, String str4, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(new fa1(null, c.path(), str2, str4, (long) i, str3, interactionType.toString(), userIntent.toString(), (double) this.b.d()));
    }

    @Override // com.spotify.music.navigation.z
    public void a(String str, String str2, SimpleNavigationManager.NavigationType navigationType) {
        c(null, str, str2, null, -1, InteractionType.HIT, navigationType == SimpleNavigationManager.NavigationType.UP ? UserIntent.NAVIGATE_UP : UserIntent.NAVIGATE_BACK);
    }

    public void b(String str) {
        c(null, d.toString(), str, null, -1, InteractionType.HIT, UserIntent.ADD_TRACK);
    }

    public void d(String str, int i) {
        c(null, d.toString(), str, Context.Metadata.SHUFFLE_ALGORITHM_HISTORY, i, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
    }
}
