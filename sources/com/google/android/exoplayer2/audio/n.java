package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.f0;

/* access modifiers changed from: package-private */
public final class n {
    private final a a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    /* access modifiers changed from: private */
    public static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public n(AudioTrack audioTrack) {
        if (f0.a >= 19) {
            this.a = new a(audioTrack);
            h();
            return;
        }
        this.a = null;
        i(3);
    }

    private void i(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
            this.d = 5000;
        } else if (i == 1) {
            this.d = 5000;
        } else if (i == 2 || i == 3) {
            this.d = 10000000;
        } else if (i == 4) {
            this.d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public boolean e() {
        return this.b == 2;
    }

    public boolean f(long j) {
        a aVar = this.a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean c2 = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c2) {
                        h();
                    }
                } else if (!c2) {
                    h();
                }
            } else if (!c2) {
                h();
            } else if (this.a.a() > this.f) {
                i(2);
            }
        } else if (c2) {
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            i(1);
        } else if (j - this.c > 500000) {
            i(3);
        }
        return c2;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }
}
