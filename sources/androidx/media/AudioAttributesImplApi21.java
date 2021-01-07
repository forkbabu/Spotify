package androidx.media;

import android.media.AudioAttributes;
import androidx.media.a;

public class AudioAttributesImplApi21 implements a {
    public AudioAttributes a;
    public int b = -1;

    /* access modifiers changed from: package-private */
    public static class a implements a.AbstractC0033a {
        final AudioAttributes.Builder a = new AudioAttributes.Builder();

        a() {
        }

        @Override // androidx.media.a.AbstractC0033a
        public a.AbstractC0033a a(int i) {
            this.a.setLegacyStreamType(i);
            return this;
        }

        @Override // androidx.media.a.AbstractC0033a
        public a build() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioAttributesCompat: audioattributes=");
        V0.append(this.a);
        return V0.toString();
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.a = audioAttributes;
        this.b = i;
    }
}
