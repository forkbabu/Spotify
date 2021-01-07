package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((InetSocketAddress) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        WritableTypeId typeId = typeSerializer.typeId(inetSocketAddress, JsonToken.VALUE_STRING);
        typeId.forValueType = InetSocketAddress.class;
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeId);
        serialize(inetSocketAddress, jsonGenerator);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator) {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    StringBuilder V0 = je.V0("[");
                    V0.append(hostName.substring(1));
                    V0.append("]");
                    str = V0.toString();
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        StringBuilder Z0 = je.Z0(hostName, ":");
        Z0.append(inetSocketAddress.getPort());
        jsonGenerator.writeString(Z0.toString());
    }
}
