package com.spotify.music.libs.fullscreen.story.domain;

import com.spotify.mobile.android.video.exception.BetamaxException;

public abstract class h {

    public static final class a extends h {
        private final p a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(null);
            kotlin.jvm.internal.h.e(pVar, "story");
            this.a = pVar;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && kotlin.jvm.internal.h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            p pVar = this.a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmptyChapter(story=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends h {
        private final p a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(null);
            kotlin.jvm.internal.h.e(pVar, "story");
            this.a = pVar;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            p pVar = this.a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("EmptyStory(story=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends h {
        private final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(null);
            kotlin.jvm.internal.h.e(th, "throwable");
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FollowArtistFailed(throwable=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class d extends h {
        private final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(null);
            kotlin.jvm.internal.h.e(th, "throwable");
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ObserveCollectionStateFailed(throwable=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class e extends h {
        private final BetamaxException a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BetamaxException betamaxException) {
            super(null);
            kotlin.jvm.internal.h.e(betamaxException, "exception");
            this.a = betamaxException;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            BetamaxException betamaxException = this.a;
            if (betamaxException != null) {
                return betamaxException.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlaybackError(exception=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class f extends h {
        private final Throwable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(null);
            kotlin.jvm.internal.h.e(th, "throwable");
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("StoryFetchingFailed(throwable=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public h(kotlin.jvm.internal.f fVar) {
    }
}
