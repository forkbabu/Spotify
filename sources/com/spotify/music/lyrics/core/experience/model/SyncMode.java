package com.spotify.music.lyrics.core.experience.model;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class SyncMode extends Enum<SyncMode> {
    public static final SyncMode a;
    private static final /* synthetic */ SyncMode[] b;
    private final String mode;

    static {
        SyncMode syncMode = new SyncMode("TEXT", 2, "TEXT");
        a = syncMode;
        b = new SyncMode[]{new SyncMode("LINE", 0, "LINE"), new SyncMode("SYLLABLE", 1, "SYLLABLE"), syncMode};
    }

    private SyncMode(String str, int i, String str2) {
        this.mode = str2;
    }

    public static SyncMode valueOf(String str) {
        return (SyncMode) Enum.valueOf(SyncMode.class, str);
    }

    public static SyncMode[] values() {
        return (SyncMode[]) b.clone();
    }
}
