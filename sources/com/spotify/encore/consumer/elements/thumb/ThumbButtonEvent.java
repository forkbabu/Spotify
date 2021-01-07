package com.spotify.encore.consumer.elements.thumb;

import kotlin.jvm.internal.h;

public final class ThumbButtonEvent {
    private final ThumbButtonState state;
    private final ThumbButton thumb;
    private final ThumbButtonType type;

    public ThumbButtonEvent(ThumbButton thumbButton, ThumbButtonType thumbButtonType, ThumbButtonState thumbButtonState) {
        h.e(thumbButton, "thumb");
        h.e(thumbButtonType, "type");
        h.e(thumbButtonState, "state");
        this.thumb = thumbButton;
        this.type = thumbButtonType;
        this.state = thumbButtonState;
    }

    public static /* synthetic */ ThumbButtonEvent copy$default(ThumbButtonEvent thumbButtonEvent, ThumbButton thumbButton, ThumbButtonType thumbButtonType, ThumbButtonState thumbButtonState, int i, Object obj) {
        if ((i & 1) != 0) {
            thumbButton = thumbButtonEvent.thumb;
        }
        if ((i & 2) != 0) {
            thumbButtonType = thumbButtonEvent.type;
        }
        if ((i & 4) != 0) {
            thumbButtonState = thumbButtonEvent.state;
        }
        return thumbButtonEvent.copy(thumbButton, thumbButtonType, thumbButtonState);
    }

    public final ThumbButton component1() {
        return this.thumb;
    }

    public final ThumbButtonType component2() {
        return this.type;
    }

    public final ThumbButtonState component3() {
        return this.state;
    }

    public final ThumbButtonEvent copy(ThumbButton thumbButton, ThumbButtonType thumbButtonType, ThumbButtonState thumbButtonState) {
        h.e(thumbButton, "thumb");
        h.e(thumbButtonType, "type");
        h.e(thumbButtonState, "state");
        return new ThumbButtonEvent(thumbButton, thumbButtonType, thumbButtonState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbButtonEvent)) {
            return false;
        }
        ThumbButtonEvent thumbButtonEvent = (ThumbButtonEvent) obj;
        return h.a(this.thumb, thumbButtonEvent.thumb) && h.a(this.type, thumbButtonEvent.type) && h.a(this.state, thumbButtonEvent.state);
    }

    public final ThumbButtonState getState() {
        return this.state;
    }

    public final ThumbButton getThumb() {
        return this.thumb;
    }

    public final ThumbButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        ThumbButton thumbButton = this.thumb;
        int i = 0;
        int hashCode = (thumbButton != null ? thumbButton.hashCode() : 0) * 31;
        ThumbButtonType thumbButtonType = this.type;
        int hashCode2 = (hashCode + (thumbButtonType != null ? thumbButtonType.hashCode() : 0)) * 31;
        ThumbButtonState thumbButtonState = this.state;
        if (thumbButtonState != null) {
            i = thumbButtonState.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ThumbButtonEvent(thumb=");
        V0.append(this.thumb);
        V0.append(", type=");
        V0.append(this.type);
        V0.append(", state=");
        V0.append(this.state);
        V0.append(")");
        return V0.toString();
    }
}
