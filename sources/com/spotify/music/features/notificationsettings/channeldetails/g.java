package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class g {

    public static final class a extends g {
        private final int a;
        private final com.spotify.music.features.notificationsettings.common.a b;
        private final Channel c;
        private final boolean d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, com.spotify.music.features.notificationsettings.common.a aVar, Channel channel, boolean z) {
            super(null);
            h.e(aVar, "category");
            h.e(channel, "selectedChannel");
            this.a = i;
            this.b = aVar;
            this.c = channel;
            this.d = z;
        }

        public final com.spotify.music.features.notificationsettings.common.a a() {
            return this.b;
        }

        public final boolean b() {
            return this.d;
        }

        public final Channel c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && this.d == aVar.d;
        }

        public int hashCode() {
            int i = this.a * 31;
            com.spotify.music.features.notificationsettings.common.a aVar = this.b;
            int i2 = 0;
            int hashCode = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
            Channel channel = this.c;
            if (channel != null) {
                i2 = channel.hashCode();
            }
            int i3 = (hashCode + i2) * 31;
            boolean z = this.d;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LogUBI(position=");
            V0.append(this.a);
            V0.append(", category=");
            V0.append(this.b);
            V0.append(", selectedChannel=");
            V0.append(this.c);
            V0.append(", enabled=");
            return je.P0(V0, this.d, ")");
        }
    }

    public static final class b extends g {
        private final com.spotify.music.features.notificationsettings.common.a a;
        private final Channel b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.spotify.music.features.notificationsettings.common.a aVar, Channel channel) {
            super(null);
            h.e(aVar, "category");
            h.e(channel, "selectedChannel");
            this.a = aVar;
            this.b = channel;
        }

        public final com.spotify.music.features.notificationsettings.common.a a() {
            return this.a;
        }

        public final Channel b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            com.spotify.music.features.notificationsettings.common.a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            Channel channel = this.b;
            if (channel != null) {
                i = channel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SubscribeToChannel(category=");
            V0.append(this.a);
            V0.append(", selectedChannel=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends g {
        private final com.spotify.music.features.notificationsettings.common.a a;
        private final Channel b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.spotify.music.features.notificationsettings.common.a aVar, Channel channel) {
            super(null);
            h.e(aVar, "category");
            h.e(channel, "selectedChannel");
            this.a = aVar;
            this.b = channel;
        }

        public final com.spotify.music.features.notificationsettings.common.a a() {
            return this.a;
        }

        public final Channel b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            com.spotify.music.features.notificationsettings.common.a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            Channel channel = this.b;
            if (channel != null) {
                i = channel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UnSubscribeFromChannel(category=");
            V0.append(this.a);
            V0.append(", selectedChannel=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public g(f fVar) {
    }
}
