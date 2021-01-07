package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzig extends IOException {
    public static final /* synthetic */ int a = 0;
    private l5 zza = null;

    public zzig(String str) {
        super(str);
    }

    static zzig a() {
        return new zzig("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzig b() {
        return new zzig("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzig c() {
        return new zzig("Protocol message contained an invalid tag (zero).");
    }

    static zzig d() {
        return new zzig("Failed to parse the message.");
    }

    static zzig e() {
        return new zzig("Protocol message had invalid UTF-8.");
    }
}
