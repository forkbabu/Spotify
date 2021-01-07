package com.spotify.music.libs.audio.focus;

import com.spotify.music.libs.audio.focus.MediaFocusManager;

public class z {
    private final MediaFocusManager a;
    private final v b;
    private final MediaFocusManager.d c = new a();

    class a implements MediaFocusManager.d {
        a() {
        }

        @Override // com.spotify.music.libs.audio.focus.MediaFocusManager.d
        public void a() {
            z.this.b.j();
        }

        @Override // com.spotify.music.libs.audio.focus.MediaFocusManager.d
        public void b(boolean z, boolean z2) {
            if (!z || !z2) {
                z.this.b.j();
            } else {
                z.this.b.i();
            }
        }
    }

    public z(MediaFocusManager mediaFocusManager, v vVar) {
        this.a = mediaFocusManager;
        this.b = vVar;
    }

    public void b() {
        this.a.h(this.c);
    }

    public void c() {
        this.a.j(this.c);
    }
}
