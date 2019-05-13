package testutil;

import java.util.Objects;

public class Assert {
    public static void equals(Object value, Object expected) {
        if (!Objects.equals( value, expected )) {
            throw new AssertionError( "Expected - " + expected + " was - " + value );
        }
    }
}
