package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.base.MoreObjects;
import com.spotify.music.libs.assistedcuration.model.e;
import java.util.Set;

final class CardAction {
    private final Action a;
    private final e b;
    private final String c;
    private final Set<String> d;

    enum Action {
        INITIALIZE,
        EXPAND_TRACK,
        EXPAND_CARD,
        ADD_CARDS_BASED_ON_TRACK,
        REMOVE_TRACKS_IN_SET,
        JUST
    }

    private CardAction(String str, Action action, e eVar, Set<String> set) {
        this.c = str;
        this.a = action;
        this.b = eVar;
        this.d = set;
    }

    static CardAction a(e eVar, Set<String> set) {
        return new CardAction(null, Action.ADD_CARDS_BASED_ON_TRACK, eVar, set);
    }

    static CardAction b(String str, Set<String> set) {
        return new CardAction(str, Action.EXPAND_CARD, null, set);
    }

    static CardAction c(String str, e eVar, Set<String> set) {
        return new CardAction(str, Action.EXPAND_TRACK, eVar, set);
    }

    static CardAction h() {
        return new CardAction(null, Action.INITIALIZE, null, null);
    }

    static CardAction i() {
        return new CardAction(null, Action.JUST, null, null);
    }

    static CardAction j(Set<String> set) {
        return new CardAction(null, Action.REMOVE_TRACKS_IN_SET, null, set);
    }

    /* access modifiers changed from: package-private */
    public Action d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.c;
    }

    public e f() {
        Action action = this.a;
        MoreObjects.checkArgument(action == Action.EXPAND_TRACK || action == Action.ADD_CARDS_BASED_ON_TRACK, "Action is not EXPAND_TRACK or ADD_CARDS_BASED_ON_TRACK. Is: %s", action);
        return this.b;
    }

    public Set<String> g() {
        Action action = this.a;
        MoreObjects.checkArgument(action == Action.EXPAND_TRACK || action == Action.EXPAND_CARD || action == Action.ADD_CARDS_BASED_ON_TRACK || action == Action.REMOVE_TRACKS_IN_SET, "Action is not supported. Is: %s", action);
        return this.d;
    }
}
