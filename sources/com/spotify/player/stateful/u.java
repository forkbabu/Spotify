package com.spotify.player.stateful;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class u {
    private final cqe a;
    private Optional<String> b;
    private Optional<ContextIndex> c;
    private List<ContextTrack> d = new ArrayList(1);
    private Optional<ContextTrack> e = Optional.absent();
    private List<ContextTrack> f = new ArrayList(1);
    private List<ContextTrack> g = new ArrayList(1);
    private int h;
    private int i;
    private Optional<Long> j = Optional.absent();

    public u(cqe cqe) {
        this.a = cqe;
    }

    private void j() {
        int i2 = this.h + this.i;
        MoreObjects.checkPositionIndex(i2, this.g.size());
        this.d = this.g.subList(0, i2);
        this.e = Optional.fromNullable(this.g.get(i2));
        List<ContextTrack> list = this.g;
        this.f = list.subList(i2 + 1, list.size());
    }

    public List<ContextTrack> a() {
        return this.f;
    }

    public Optional<ContextIndex> b() {
        return f() ? this.c : Optional.absent();
    }

    public Optional<String> c() {
        return f() ? this.b : Optional.absent();
    }

    public List<ContextTrack> d() {
        return this.d;
    }

    public Optional<ContextTrack> e() {
        return this.e;
    }

    public boolean f() {
        return !this.j.isPresent();
    }

    public void g(PlayerState playerState, boolean z) {
        boolean z2;
        if (!f()) {
            if (playerState.timestamp() < this.j.get().longValue()) {
                Logger.b("ಠ_ಠ Old state, ignoring.", new Object[0]);
                return;
            }
            Optional<ContextTrack> track = playerState.track();
            String uri = this.e.isPresent() ? this.e.get().uri() : null;
            String uri2 = track.isPresent() ? track.get().uri() : "";
            Optional<ContextTrack> track2 = playerState.track();
            if (track2.isPresent()) {
                String provider = track2.get().provider();
                if ("context".equals(provider) || "queue".equals(provider)) {
                    z2 = false;
                    if (!z && uri != null && !uri.equals(uri2) && playerState.timestamp() < this.j.get().longValue() + 500 && !z2) {
                        Logger.b("ಠ_ಠ Wrong expected track, ignoring.", new Object[0]);
                        return;
                    }
                }
            }
            z2 = true;
            Logger.b("ಠ_ಠ Wrong expected track, ignoring.", new Object[0]);
            return;
        }
        ImmutableList<ContextTrack> prevTracks = playerState.prevTracks();
        Optional<ContextTrack> track3 = playerState.track();
        ImmutableList<ContextTrack> nextTracks = playerState.nextTracks();
        ArrayList arrayList = new ArrayList(nextTracks.size() + prevTracks.size() + 1);
        arrayList.addAll(prevTracks);
        arrayList.add(track3.orNull());
        arrayList.addAll(nextTracks);
        this.g = arrayList;
        this.h = playerState.prevTracks().size();
        this.i = 0;
        this.j = Optional.absent();
        this.b = playerState.playbackId();
        this.c = playerState.index();
        j();
    }

    public void h() {
        if (this.e.isPresent() && this.h + this.i + 1 < this.g.size()) {
            this.i++;
            this.j = Optional.of(Long.valueOf(this.a.d()));
            j();
        }
    }

    public void i() {
        if (this.e.isPresent()) {
            int i2 = this.h;
            int i3 = this.i;
            if (i2 + i3 > 0) {
                this.i = i3 - 1;
                this.j = Optional.of(Long.valueOf(this.a.d()));
                j();
            }
        }
    }
}
