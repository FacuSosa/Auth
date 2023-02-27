package com.aplication.auth

enum class AuthEvent {
    //success
    USER_EXIST,
    //fail
    LENGTH_PASSWORD,
    NOT_USER_EXIST,
    EMPTY_EMAIL,
    EMPTY_PASSWORD,
    EMPTY_FORM,
    INVALID_EMAIL,
    INVALID_PASSWORD,
    INVALID_USER,
    //Exceptions
    NULL_EMAIL,
    NULL_PASSWORD,
    NULL_FORM
}