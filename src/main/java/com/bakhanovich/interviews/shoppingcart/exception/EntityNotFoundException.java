package com.bakhanovich.interviews.shoppingcart.exception;

/**
 * Exception: Thrown if an entity was not found.
 *
 * @author Ihar Bakhanovich.
 */
public class EntityNotFoundException extends AppException{
    /**
     * Constructs a new EntityNotFoundException.
     *
     * @param errorCode    is the code of an error.
     * @param errorMessage is the message of an error.
     */
    public EntityNotFoundException(String errorCode, Object errorMessage) {
        super(errorCode, errorMessage);
    }
}
