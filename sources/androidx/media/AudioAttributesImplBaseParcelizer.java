package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.n(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.n(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.n(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.n(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.C(audioAttributesImplBase.a, 1);
        versionedParcel.C(audioAttributesImplBase.b, 2);
        versionedParcel.C(audioAttributesImplBase.c, 3);
        versionedParcel.C(audioAttributesImplBase.d, 4);
    }
}
