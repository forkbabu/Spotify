package com.spotify.music.sociallistening.models;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class AvailableSessionType extends Enum<AvailableSessionType> {
    private static final /* synthetic */ AvailableSessionType[] a = {new AvailableSessionType("UNDEFINED_SESSION_TYPE", 0), new AvailableSessionType("TRUSTED_USER", 1), new AvailableSessionType("DISCOVERED_DEVICE", 2)};

    private AvailableSessionType(String str, int i) {
    }

    public static AvailableSessionType valueOf(String str) {
        return (AvailableSessionType) Enum.valueOf(AvailableSessionType.class, str);
    }

    public static AvailableSessionType[] values() {
        return (AvailableSessionType[]) a.clone();
    }
}
