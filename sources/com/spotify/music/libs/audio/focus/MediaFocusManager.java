package com.spotify.music.libs.audio.focus;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.AudioStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MediaFocusManager {
    private final List<d> a = new CopyOnWriteArrayList();
    private final AudioManager b;
    private final Handler c;
    private final c d;
    private final Runnable e = new a();
    private final AudioManager.OnAudioFocusChangeListener f;

    public enum ContentType {
        DEFAULT,
        SPEECH
    }

    class a implements Runnable {
        a() {
        }

        private int a() {
            return MediaFocusManager.this.d.c() == AudioStream.ALARM ? 2 : 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2 = 4;
            if (Build.VERSION.SDK_INT >= 26) {
                ContentType d = MediaFocusManager.this.d.d();
                d.getClass();
                int i3 = d == ContentType.SPEECH ? 1 : 2;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                if (MediaFocusManager.this.d.c() != AudioStream.ALARM) {
                    i2 = 1;
                }
                AudioFocusRequest build = new AudioFocusRequest.Builder(a()).setAudioAttributes(builder.setUsage(i2).setContentType(i3).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(MediaFocusManager.this.d.e()).setWillPauseWhenDucked(MediaFocusManager.f(MediaFocusManager.this)).build();
                MediaFocusManager.this.d.h(build);
                i = MediaFocusManager.this.b.requestAudioFocus(build);
            } else {
                AudioManager audioManager = MediaFocusManager.this.b;
                AudioManager.OnAudioFocusChangeListener e = MediaFocusManager.this.d.e();
                if (MediaFocusManager.this.d.c() != AudioStream.ALARM) {
                    i2 = 3;
                }
                i = audioManager.requestAudioFocus(e, i2, a());
            }
            boolean z = i == 1;
            Logger.n("Request audio focus result: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(z), MediaFocusManager.this.d.c());
            MediaFocusManager.this.d.k(z);
            if (z) {
                for (d dVar : MediaFocusManager.this.a) {
                    dVar.a();
                }
            } else if (i == 0) {
                MediaFocusManager.this.c.postDelayed(this, 5000);
            }
        }
    }

    class b implements AudioManager.OnAudioFocusChangeListener {
        b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3) {
                MediaFocusManager.this.d.k(false);
                boolean z = !MediaFocusManager.f(MediaFocusManager.this);
                for (d dVar : MediaFocusManager.this.a) {
                    dVar.b(true, z);
                }
            } else if (i == -2) {
                MediaFocusManager.this.d.k(false);
                for (d dVar2 : MediaFocusManager.this.a) {
                    dVar2.b(true, false);
                }
            } else if (i == -1) {
                MediaFocusManager.this.d.k(false);
                for (d dVar3 : MediaFocusManager.this.a) {
                    dVar3.b(false, false);
                }
            } else if (i == 1) {
                MediaFocusManager.this.d.k(true);
                for (d dVar4 : MediaFocusManager.this.a) {
                    dVar4.a();
                }
            }
            Logger.n("Audio focus change: %d, HasAudioFocus = %b for AudioStreamType %s", Integer.valueOf(i), Boolean.valueOf(MediaFocusManager.this.i()), MediaFocusManager.this.d.c());
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        private AudioStream a;
        private ContentType b = ContentType.DEFAULT;
        private final AudioManager.OnAudioFocusChangeListener c;
        private AudioFocusRequest d;
        private boolean e;

        c(AudioStream audioStream, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, a aVar) {
            this.a = audioStream;
            this.c = onAudioFocusChangeListener;
        }

        public void a() {
            this.e = false;
        }

        public AudioFocusRequest b() {
            return this.d;
        }

        public AudioStream c() {
            return this.a;
        }

        public ContentType d() {
            return this.b;
        }

        public AudioManager.OnAudioFocusChangeListener e() {
            return this.c;
        }

        public boolean f() {
            return this.e;
        }

        public boolean g(AudioStream audioStream, ContentType contentType) {
            return this.a == audioStream && this.e && this.b == contentType;
        }

        public void h(AudioFocusRequest audioFocusRequest) {
            this.d = audioFocusRequest;
        }

        public void i(AudioStream audioStream) {
            this.a = audioStream;
        }

        public void j(ContentType contentType) {
            this.b = contentType;
        }

        public void k(boolean z) {
            this.e = z;
        }
    }

    public interface d {
        void a();

        void b(boolean z, boolean z2);
    }

    public MediaFocusManager(Context context) {
        b bVar = new b();
        this.f = bVar;
        context.getClass();
        z42.a("Not called on main looper");
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = new Handler();
        this.d = new c(AudioStream.DEFAULT, bVar, null);
    }

    private void b() {
        Logger.n("Abandon audio focus: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(i()), this.d.c());
        this.c.removeCallbacks(this.e);
        this.d.a();
        if (Build.VERSION.SDK_INT < 26 || this.d.b() == null) {
            this.b.abandonAudioFocus(this.d.e());
        } else {
            this.b.abandonAudioFocusRequest(this.d.b());
        }
    }

    static boolean f(MediaFocusManager mediaFocusManager) {
        return mediaFocusManager.d.d() == ContentType.SPEECH;
    }

    public void a() {
        b();
        for (d dVar : this.a) {
            dVar.b(false, false);
        }
    }

    public void h(d dVar) {
        dVar.getClass();
        this.a.add(dVar);
    }

    public boolean i() {
        return this.d.f();
    }

    public void j(d dVar) {
        dVar.getClass();
        this.a.remove(dVar);
    }

    public void k(AudioStream audioStream, ContentType contentType) {
        Logger.n("Request audio focus: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(this.d.g(audioStream, contentType)), audioStream);
        if (!this.d.g(audioStream, contentType)) {
            if (!(this.d.c() == audioStream && this.d.d() == contentType)) {
                b();
                this.d.i(audioStream);
                this.d.j(contentType);
            }
            this.c.removeCallbacks(this.e);
            this.c.post(this.e);
        }
    }
}
