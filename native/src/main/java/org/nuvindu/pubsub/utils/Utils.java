package org.nuvindu.pubsub.utils;

import io.ballerina.runtime.api.creators.ErrorCreator;
import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BError;

import static org.nuvindu.pubsub.utils.ModuleUtils.getModule;

/**
 *  This class contains utility methods for the PubSub module.
 */
public class Utils {

    private Utils() {
    }

    // Internal type names
    public static final String ERROR_TYPE = "Error";

    public static BError createError(String message) {
        return ErrorCreator.createError(getModule(), ERROR_TYPE, StringUtils.fromString(message), null, null);
    }

    public static BError createError(String message, BError cause) {
        return ErrorCreator.createError(getModule(), ERROR_TYPE, StringUtils.fromString(message), cause, null);
    }
}
