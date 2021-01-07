package com.spotify.music.features.languagepicker.logger;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
enum LogInfo$Button {
    NEXT("next-button", r4, "language-picker", r14),
    RETRY("retry-button", LogInfo$UserIntent.RETRY, "language-picker", r14),
    GOT_IT("got-it-button", LogInfo$UserIntent.DISMISS, "language-picker-no-skip-dialog", ImpressionLogger.RenderType.DIALOG);
    
    private final String mItemUri;
    private final ImpressionLogger.RenderType mRenderType;
    private final String mSectionId;
    private final LogInfo$UserIntent mUserIntent;

    static {
        LogInfo$UserIntent logInfo$UserIntent = LogInfo$UserIntent.NAVIGATE_FORWARD;
        ImpressionLogger.RenderType renderType = ImpressionLogger.RenderType.PAGE;
    }

    private LogInfo$Button(String str, LogInfo$UserIntent logInfo$UserIntent, String str2, ImpressionLogger.RenderType renderType) {
        this.mItemUri = str;
        this.mUserIntent = logInfo$UserIntent;
        this.mSectionId = str2;
        this.mRenderType = renderType;
    }

    /* access modifiers changed from: package-private */
    public void d(InteractionLogger interactionLogger) {
        interactionLogger.a(this.mItemUri, this.mSectionId, 0, InteractionLogger.InteractionType.HIT, this.mUserIntent.toString());
    }

    /* access modifiers changed from: package-private */
    public void g(ImpressionLogger impressionLogger) {
        impressionLogger.a(this.mItemUri, this.mSectionId, 0, ImpressionLogger.ImpressionType.BUTTON, this.mRenderType);
    }
}
