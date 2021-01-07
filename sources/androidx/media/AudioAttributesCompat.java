package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import androidx.media.a;
import androidx.versionedparcelable.c;

public class AudioAttributesCompat implements c {
    private static final SparseIntArray b;
    public static final /* synthetic */ int c = 0;
    public a a;

    public static class a {
        final a.AbstractC0033a a;

        public a() {
            int i = AudioAttributesCompat.c;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                this.a = new AudioAttributesImplApi26.a();
            } else if (i2 >= 21) {
                this.a = new AudioAttributesImplApi21.a();
            } else {
                this.a = new AudioAttributesImplBase.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.a.build());
        }

        public a b(int i) {
            this.a.a(i);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    public static AudioAttributesCompat a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        a aVar = this.a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.a);
        }
        if (audioAttributesCompat.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    AudioAttributesCompat(a aVar) {
        this.a = aVar;
    }
}
