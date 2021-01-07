package com.spotify.music.superbird.setup.domain;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class SetupSubscriptionEvent extends Enum<SetupSubscriptionEvent> {
    public static final SetupSubscriptionEvent a;
    public static final SetupSubscriptionEvent b;
    public static final SetupSubscriptionEvent c;
    public static final SetupSubscriptionEvent f;
    public static final SetupSubscriptionEvent n;
    public static final SetupSubscriptionEvent o;
    public static final SetupSubscriptionEvent p;
    public static final SetupSubscriptionEvent q;
    public static final SetupSubscriptionEvent r;
    public static final SetupSubscriptionEvent s;
    public static final SetupSubscriptionEvent t;
    public static final SetupSubscriptionEvent u;
    private static final /* synthetic */ SetupSubscriptionEvent[] v;
    private final String event;

    static {
        SetupSubscriptionEvent setupSubscriptionEvent = new SetupSubscriptionEvent("CANCEL", 0, "cancel");
        a = setupSubscriptionEvent;
        SetupSubscriptionEvent setupSubscriptionEvent2 = new SetupSubscriptionEvent("FINISH", 1, "finish");
        b = setupSubscriptionEvent2;
        SetupSubscriptionEvent setupSubscriptionEvent3 = new SetupSubscriptionEvent("NAVIGATE_TO_WELCOME", 2, "navigate_to_welcome");
        c = setupSubscriptionEvent3;
        SetupSubscriptionEvent setupSubscriptionEvent4 = new SetupSubscriptionEvent("NAVIGATE_TO_SEARCHING", 3, "navigate_to_searching");
        f = setupSubscriptionEvent4;
        SetupSubscriptionEvent setupSubscriptionEvent5 = new SetupSubscriptionEvent("NAVIGATE_TO_CONNECTED", 4, "navigate_to_connected");
        n = setupSubscriptionEvent5;
        SetupSubscriptionEvent setupSubscriptionEvent6 = new SetupSubscriptionEvent("NAVIGATE_TO_EVERYTHING_CONNECTED", 5, "navigate_to_everything_connected");
        o = setupSubscriptionEvent6;
        SetupSubscriptionEvent setupSubscriptionEvent7 = new SetupSubscriptionEvent("NAVIGATE_TO_CONNECT_TO_CAR", 6, "navigate_to_connect_to_car");
        p = setupSubscriptionEvent7;
        SetupSubscriptionEvent setupSubscriptionEvent8 = new SetupSubscriptionEvent("NAVIGATE_TO_CHECK_FOR_UPDATES", 7, "navigate_to_check_for_updates");
        q = setupSubscriptionEvent8;
        SetupSubscriptionEvent setupSubscriptionEvent9 = new SetupSubscriptionEvent("NAVIGATE_TO_TEST_SOUND", 8, "navigate_to_test_sound");
        r = setupSubscriptionEvent9;
        SetupSubscriptionEvent setupSubscriptionEvent10 = new SetupSubscriptionEvent("NAVIGATE_TO_READY", 9, "navigate_to_ready");
        s = setupSubscriptionEvent10;
        SetupSubscriptionEvent setupSubscriptionEvent11 = new SetupSubscriptionEvent("NAVIGATE_TO_MOUNT_SELECTION", 11, "navigate_to_mount_selection");
        t = setupSubscriptionEvent11;
        SetupSubscriptionEvent setupSubscriptionEvent12 = new SetupSubscriptionEvent("NAVIGATE_TO_MOUNT_INSTRUCTIONS", 12, "navigate_to_mount_instructions");
        u = setupSubscriptionEvent12;
        v = new SetupSubscriptionEvent[]{setupSubscriptionEvent, setupSubscriptionEvent2, setupSubscriptionEvent3, setupSubscriptionEvent4, setupSubscriptionEvent5, setupSubscriptionEvent6, setupSubscriptionEvent7, setupSubscriptionEvent8, setupSubscriptionEvent9, setupSubscriptionEvent10, new SetupSubscriptionEvent("NAVIGATE_TO_READY_WITH_UPDATE", 10, "navigate_to_ready_with_update"), setupSubscriptionEvent11, setupSubscriptionEvent12};
    }

    private SetupSubscriptionEvent(String str, int i, String str2) {
        this.event = str2;
    }

    public static SetupSubscriptionEvent valueOf(String str) {
        return (SetupSubscriptionEvent) Enum.valueOf(SetupSubscriptionEvent.class, str);
    }

    public static SetupSubscriptionEvent[] values() {
        return (SetupSubscriptionEvent[]) v.clone();
    }

    public final String d() {
        return this.event;
    }
}
