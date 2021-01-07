package com.spotify.music.offlinetrials.limited.logging;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;

public class OfflineUserMixInteractionLogger {
    private final InteractionLogger a;

    /* access modifiers changed from: package-private */
    public enum Section {
        ADD_SONGS_BUTTON("user-offline-plist-add-songs-button"),
        DOWNLOAD_BUTTON("user-offline-plist-download"),
        PLAY_PREVIEW("user-offline-plist-preview-play"),
        PLAY_PREVIEW_UNAVAILABLE("user-offline-plist-preview-play-unavailable"),
        CANCEL_REMOVE_DIALOG("user-offline-plist-decline-remove"),
        CONFIRM_REMOVE_DIALOG("user-offline-plist-confirm-remove");
        
        private final String mKey;

        private Section(String str) {
            this.mKey = str;
        }

        public String d() {
            return this.mKey;
        }
    }

    public OfflineUserMixInteractionLogger(jz1 jz1, cqe cqe, c cVar, a aVar) {
        this.a = new InteractionLogger(jz1, cVar, aVar, cqe);
    }

    public void a(String str) {
        this.a.a(str, Section.ADD_SONGS_BUTTON.d(), 0, InteractionLogger.InteractionType.HIT, "add-songs");
    }

    public void b() {
        this.a.a("", Section.CANCEL_REMOVE_DIALOG.d(), -1, InteractionLogger.InteractionType.HIT, "cancel-remove-dialog");
    }

    public void c() {
        this.a.a("", Section.CONFIRM_REMOVE_DIALOG.d(), -1, InteractionLogger.InteractionType.HIT, "confirm-remove-dialog");
    }

    public void d(String str, int i, boolean z) {
        this.a.a(str, Section.DOWNLOAD_BUTTON.d(), i, InteractionLogger.InteractionType.HIT, z ? "mark-download" : "unmark-download");
    }

    public void e(String str, int i, boolean z) {
        Section section;
        InteractionLogger interactionLogger = this.a;
        if (z) {
            section = Section.PLAY_PREVIEW;
        } else {
            section = Section.PLAY_PREVIEW_UNAVAILABLE;
        }
        interactionLogger.a(str, section.d(), i, InteractionLogger.InteractionType.HIT, "play-preview");
    }
}
