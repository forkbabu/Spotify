package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.UUID;

public class UUIDSerializer extends StdScalarSerializer<UUID> {
    static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    public UUIDSerializer() {
        super(UUID.class);
    }

    private static final void _appendInt(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    private static void _appendShort(int i, char[] cArr, int i2) {
        char[] cArr2 = HEX_CHARS;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return isEmpty((UUID) obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((UUID) obj, jsonGenerator);
    }

    public boolean isEmpty(UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    public void serialize(UUID uuid, JsonGenerator jsonGenerator) {
        if (!jsonGenerator.canWriteBinaryNatively() || (jsonGenerator instanceof TokenBuffer)) {
            char[] cArr = new char[36];
            long mostSignificantBits = uuid.getMostSignificantBits();
            int i = (int) (mostSignificantBits >> 32);
            _appendShort(i >> 16, cArr, 0);
            _appendShort(i, cArr, 4);
            cArr[8] = '-';
            int i2 = (int) mostSignificantBits;
            _appendShort(i2 >>> 16, cArr, 9);
            cArr[13] = '-';
            _appendShort(i2, cArr, 14);
            cArr[18] = '-';
            long leastSignificantBits = uuid.getLeastSignificantBits();
            _appendShort((int) (leastSignificantBits >>> 48), cArr, 19);
            cArr[23] = '-';
            _appendShort((int) (leastSignificantBits >>> 32), cArr, 24);
            int i3 = (int) leastSignificantBits;
            _appendShort(i3 >> 16, cArr, 28);
            _appendShort(i3, cArr, 32);
            jsonGenerator.writeString(cArr, 0, 36);
            return;
        }
        byte[] bArr = new byte[16];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        _appendInt((int) (mostSignificantBits2 >> 32), bArr, 0);
        _appendInt((int) mostSignificantBits2, bArr, 4);
        _appendInt((int) (leastSignificantBits2 >> 32), bArr, 8);
        _appendInt((int) leastSignificantBits2, bArr, 12);
        jsonGenerator.writeBinary(bArr);
    }
}
