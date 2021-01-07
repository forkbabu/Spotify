package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.jvm.internal.f;

public abstract class h {

    public static final class a extends h {
        private final int a;
        private final com.spotify.music.features.notificationsettings.common.a b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, com.spotify.music.features.notificationsettings.common.a aVar, boolean z) {
            super(null);
            kotlin.jvm.internal.h.e(aVar, "category");
            this.a = i;
            this.b = aVar;
            this.c = z;
        }

        public final com.spotify.music.features.notificationsettings.common.a a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && kotlin.jvm.internal.h.a(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.a * 31;
            com.spotify.music.features.notificationsettings.common.a aVar = this.b;
            int hashCode = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CategoryToggled(position=");
            V0.append(this.a);
            V0.append(", category=");
            V0.append(this.b);
            V0.append(", enabled=");
            return je.P0(V0, this.c, ")");
        }
    }

    public static abstract class b extends h {

        public static final class a extends b {
            private final com.spotify.music.features.notificationsettings.common.a a;
            private final Channel b;
            private final boolean c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(com.spotify.music.features.notificationsettings.common.a aVar, Channel channel, boolean z) {
                super(null);
                kotlin.jvm.internal.h.e(aVar, "category");
                kotlin.jvm.internal.h.e(channel, "selectedChannel");
                this.a = aVar;
                this.b = channel;
                this.c = z;
            }

            public final com.spotify.music.features.notificationsettings.common.a a() {
                return this.a;
            }

            public final boolean b() {
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
                return kotlin.jvm.internal.h.a(this.a, aVar.a) && kotlin.jvm.internal.h.a(this.b, aVar.b) && this.c == aVar.c;
            }

            public int hashCode() {
                com.spotify.music.features.notificationsettings.common.a aVar = this.a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                Channel channel = this.b;
                if (channel != null) {
                    i = channel.hashCode();
                }
                int i2 = (hashCode + i) * 31;
                boolean z = this.c;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                return i2 + i3;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Failed(category=");
                V0.append(this.a);
                V0.append(", selectedChannel=");
                V0.append(this.b);
                V0.append(", enabled=");
                return je.P0(V0, this.c, ")");
            }
        }

        /* renamed from: com.spotify.music.features.notificationsettings.channeldetails.h$b$b  reason: collision with other inner class name */
        public static final class C0235b extends b {
            private final com.spotify.music.features.notificationsettings.common.a a;
            private final Channel b;
            private final boolean c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0235b(com.spotify.music.features.notificationsettings.common.a aVar, Channel channel, boolean z) {
                super(null);
                kotlin.jvm.internal.h.e(aVar, "category");
                kotlin.jvm.internal.h.e(channel, "selectedChannel");
                this.a = aVar;
                this.b = channel;
                this.c = z;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0235b)) {
                    return false;
                }
                C0235b bVar = (C0235b) obj;
                return kotlin.jvm.internal.h.a(this.a, bVar.a) && kotlin.jvm.internal.h.a(this.b, bVar.b) && this.c == bVar.c;
            }

            public int hashCode() {
                com.spotify.music.features.notificationsettings.common.a aVar = this.a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                Channel channel = this.b;
                if (channel != null) {
                    i = channel.hashCode();
                }
                int i2 = (hashCode + i) * 31;
                boolean z = this.c;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                return i2 + i3;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Success(category=");
                V0.append(this.a);
                V0.append(", selectedChannel=");
                V0.append(this.b);
                V0.append(", enabled=");
                return je.P0(V0, this.c, ")");
            }
        }

        public b(f fVar) {
            super(null);
        }
    }

    private h() {
    }

    public h(f fVar) {
    }
}
