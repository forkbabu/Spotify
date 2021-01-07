package com.spotify.player.controls;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;

public abstract class c {

    public static final class a extends c {
        a() {
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti03.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si03.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Pause{}";
        }
    }

    public static final class b extends c {
        private final PauseCommand a;

        b(PauseCommand pauseCommand) {
            pauseCommand.getClass();
            this.a = pauseCommand;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti04.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si04.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final PauseCommand m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PauseWithCommand{command=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.player.controls.c$c  reason: collision with other inner class name */
    public static final class C0365c extends c {
        C0365c() {
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti0.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si0.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof C0365c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Resume{}";
        }
    }

    public static final class d extends c {
        private final ResumeCommand a;

        d(ResumeCommand resumeCommand) {
            resumeCommand.getClass();
            this.a = resumeCommand;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti02.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si02.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final ResumeCommand m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ResumeWithCommand{command=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class e extends c {
        private final long a;

        e(long j) {
            this.a = j;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti09.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si09.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof e) && ((e) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return je.r0(this.a, 0);
        }

        public final long m() {
            return this.a;
        }

        public String toString() {
            return je.D0(je.V0("SeekTo{ms="), this.a, '}');
        }
    }

    public static final class f extends c {
        private final SeekToCommand a;

        f(SeekToCommand seekToCommand) {
            seekToCommand.getClass();
            this.a = seekToCommand;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti010.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si010.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final SeekToCommand m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SeekToWithCommand{command=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class g extends c {
        g() {
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti05.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si05.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SkipToNextTrack{}";
        }
    }

    public static final class h extends c {
        private final SkipToNextTrackCommand a;

        h(SkipToNextTrackCommand skipToNextTrackCommand) {
            skipToNextTrackCommand.getClass();
            this.a = skipToNextTrackCommand;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti06.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si06.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final SkipToNextTrackCommand m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SkipToNextTrackWithCommand{command=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class i extends c {
        i() {
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti07.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si07.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof i;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SkipToPrevTrack{}";
        }
    }

    public static final class j extends c {
        private final SkipToPrevTrackCommand a;

        j(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            skipToPrevTrackCommand.getClass();
            this.a = skipToPrevTrackCommand;
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti08.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si08.accept(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return ((j) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final SkipToPrevTrackCommand m() {
            return this.a;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SkipToPrevTrackWithCommand{command=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    public static final class k extends c {
        k() {
        }

        @Override // com.spotify.player.controls.c
        public final <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011) {
            return ti011.apply(this);
        }

        @Override // com.spotify.player.controls.c
        public final void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011) {
            si011.accept(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof k;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Stop{}";
        }
    }

    c() {
    }

    public static c c() {
        return new a();
    }

    public static c d(PauseCommand pauseCommand) {
        return new b(pauseCommand);
    }

    public static c e() {
        return new C0365c();
    }

    public static c f(ResumeCommand resumeCommand) {
        return new d(resumeCommand);
    }

    public static c g(long j2) {
        return new e(j2);
    }

    public static c h(SeekToCommand seekToCommand) {
        return new f(seekToCommand);
    }

    public static c i() {
        return new g();
    }

    public static c j(SkipToNextTrackCommand skipToNextTrackCommand) {
        return new h(skipToNextTrackCommand);
    }

    public static c k() {
        return new i();
    }

    public static c l(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        return new j(skipToPrevTrackCommand);
    }

    public abstract <R_> R_ a(ti0<C0365c, R_> ti0, ti0<d, R_> ti02, ti0<a, R_> ti03, ti0<b, R_> ti04, ti0<g, R_> ti05, ti0<h, R_> ti06, ti0<i, R_> ti07, ti0<j, R_> ti08, ti0<e, R_> ti09, ti0<f, R_> ti010, ti0<k, R_> ti011);

    public abstract void b(si0<C0365c> si0, si0<d> si02, si0<a> si03, si0<b> si04, si0<g> si05, si0<h> si06, si0<i> si07, si0<j> si08, si0<e> si09, si0<f> si010, si0<k> si011);
}
