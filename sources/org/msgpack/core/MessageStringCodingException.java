package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

public class MessageStringCodingException extends MessagePackException {
    public MessageStringCodingException(CharacterCodingException characterCodingException) {
        super(characterCodingException);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return (CharacterCodingException) super.getCause();
    }
}
