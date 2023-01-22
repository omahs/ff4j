package org.ff4j.property.exception;

import java.io.Serial;

/**
 * Store could be parameterized to through exception when Property not found.
 */
public class PropertyNotFoundException extends RuntimeException {

	/**
	 * Serial.
	 */
	@Serial
    private static final long serialVersionUID = 1L;

    /** target message. */
    public static final String ERROR_MESSAGE_NAMESPACE = "Property '%s' does not exist in workspace '%s'";

    /** target message. */
    public static final String ERROR_MESSAGE = "Property '%s' has not been found";

    /**
     * Parameterized constructor.
     * 
     * @param workspace
     *           workspace name
     * @param uid
     *           property identifier
     **/
    public PropertyNotFoundException(String workspace, String uid) {
        super(String.format(ERROR_MESSAGE_NAMESPACE, uid, workspace));
    }

    /**
     * Parameterized constructor.
     * @param uid
     *           property identifier
     **/
    public PropertyNotFoundException(String uid) {
        super(String.format(ERROR_MESSAGE, uid));
    }

}
