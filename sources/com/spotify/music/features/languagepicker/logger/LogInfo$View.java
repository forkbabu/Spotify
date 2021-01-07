package com.spotify.music.features.languagepicker.logger;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
enum LogInfo$View {
    LOADING("loading", ImpressionLogger.ImpressionType.PROGRESS_BAR, "language-picker"),
    LANGUAGES("languages", r1, "language-picker"),
    ERROR(AppProtocol.LogMessage.SEVERITY_ERROR, ImpressionLogger.ImpressionType.ERROR, "language-picker"),
    NO_CONNECTION("no-connection", r1, "language-picker");
    
    private final ImpressionLogger.ImpressionType mImpressionType;
    private final String mItemUri;
    private final String mSectionId;

    static {
        ImpressionLogger.ImpressionType impressionType = ImpressionLogger.ImpressionType.ITEM;
    }

    private LogInfo$View(String str, ImpressionLogger.ImpressionType impressionType, String str2) {
        this.mItemUri = str;
        this.mImpressionType = impressionType;
        this.mSectionId = str2;
    }

    /* access modifiers changed from: package-private */
    public void d(InteractionLogger interactionLogger) {
        interactionLogger.a(this.mItemUri, this.mSectionId, 0, InteractionLogger.InteractionType.HIT, LogInfo$UserIntent.BACK_BUTTON.toString());
    }

    /* access modifiers changed from: package-private */
    public void g(ImpressionLogger impressionLogger) {
        impressionLogger.a(this.mItemUri, this.mSectionId, 0, this.mImpressionType, ImpressionLogger.RenderType.PAGE);
    }

    /* access modifiers changed from: package-private */
    public void h(InteractionLogger interactionLogger) {
        interactionLogger.a(this.mItemUri, this.mSectionId, 0, InteractionLogger.InteractionType.SCROLL, LogInfo$UserIntent.SCROLL.toString());
    }
}
