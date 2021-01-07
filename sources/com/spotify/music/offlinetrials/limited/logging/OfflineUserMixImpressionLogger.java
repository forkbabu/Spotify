package com.spotify.music.offlinetrials.limited.logging;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

public class OfflineUserMixImpressionLogger {
    private final ImpressionLogger a;

    /* access modifiers changed from: package-private */
    public enum Section {
        TAP_SHUFFLE_TOOLTIP("user-offline-tooltip-tap-shuffle"),
        ADDED_TO_PLAYLIST_TOOLTIP("user-offline-tooltip-added-to-downloads"),
        REMOVED_FROM_PLAYLIST_TOOLTIP("user-offline-tooltip-removed-from-downloads"),
        REMOVE_CONFIRMATION_DIALOG("user-offline-plist-pop-up-confirm-remove-download"),
        MAX_SONG_LIMIT_DIALOG("user-offline-tooltip-download-limit-reached"),
        ERROR_DIALOG("user-offline-plist-pop-up-error-generic-error");
        
        private final String mKey;

        private Section(String str) {
            this.mKey = str;
        }

        public String d() {
            return this.mKey;
        }
    }

    public interface a {
        OfflineUserMixImpressionLogger a(c cVar, com.spotify.instrumentation.a aVar);
    }

    public OfflineUserMixImpressionLogger(jz1 jz1, cqe cqe, c cVar, com.spotify.instrumentation.a aVar) {
        this.a = new ImpressionLogger(jz1, cVar, aVar, cqe);
    }

    public void a() {
        this.a.a("", Section.ERROR_DIALOG.d(), 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }

    public void b() {
        this.a.a("", Section.MAX_SONG_LIMIT_DIALOG.d(), 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }

    public void c() {
        this.a.a("", Section.REMOVE_CONFIRMATION_DIALOG.d(), 0, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }

    public void d() {
        this.a.a("", Section.TAP_SHUFFLE_TOOLTIP.d(), 0, ImpressionLogger.ImpressionType.SNACKBAR, ImpressionLogger.RenderType.SNACKBAR);
    }

    public void e() {
        this.a.a("", Section.ADDED_TO_PLAYLIST_TOOLTIP.d(), 0, ImpressionLogger.ImpressionType.SNACKBAR, ImpressionLogger.RenderType.SNACKBAR);
    }

    public void f() {
        this.a.a("", Section.REMOVED_FROM_PLAYLIST_TOOLTIP.d(), 0, ImpressionLogger.ImpressionType.SNACKBAR, ImpressionLogger.RenderType.SNACKBAR);
    }
}
