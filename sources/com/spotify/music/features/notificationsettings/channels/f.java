package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.jvm.internal.h;

public abstract class f {

    public static final class a extends f {
        private final Channel a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Channel channel, int i) {
            super(null);
            h.e(channel, "channel");
            this.a = channel;
            this.b = i;
        }

        public final Channel a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            Channel channel = this.a;
            return ((channel != null ? channel.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ChannelClicked(channel=");
            V0.append(this.a);
            V0.append(", position=");
            return je.B0(V0, this.b, ")");
        }
    }

    private f() {
    }

    public f(kotlin.jvm.internal.f fVar) {
    }
}
