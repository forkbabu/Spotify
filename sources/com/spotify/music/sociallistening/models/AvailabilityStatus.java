package com.spotify.music.sociallistening.models;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class AvailabilityStatus extends Enum<AvailabilityStatus> {
    private static final /* synthetic */ AvailabilityStatus[] a = {new AvailabilityStatus("AVAILABLE", 0), new AvailabilityStatus("REQUIRES_PUSH_CONFIRMATION", 1)};

    private AvailabilityStatus(String str, int i) {
    }

    public static AvailabilityStatus valueOf(String str) {
        return (AvailabilityStatus) Enum.valueOf(AvailabilityStatus.class, str);
    }

    public static AvailabilityStatus[] values() {
        return (AvailabilityStatus[]) a.clone();
    }
}
